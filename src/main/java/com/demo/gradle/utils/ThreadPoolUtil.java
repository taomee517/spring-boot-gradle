package com.demo.gradle.utils;

import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolUtil {
    /**
     * 创建了一个最大容量为20的线程池，其中有两个参数需要注意一下:
     *  1. 我们使用了了零容量的SynchronousQueue，一进一出，避免队列里缓冲数据，这样在系统异常关闭时，就能排除因为阻塞队列丢消息的可能。
     *  2. 然后使用了CallerRunsPolicy饱和策略，使得多线程处理不过来的时候，能够阻塞在kafka的消费线程上。
     * 然后，我们将真正处理业务的逻辑放在任务中多线程执行，每次执行完毕，我们都手工的commit一次ack，表明这条消息我已经处理了。
     * 由于是线程池认领了这些任务，顺序性是无法保证的，可能有些任务没有执行完毕，后面的任务就已经把它的offset给提交了。
     *
     */
    public static ThreadPoolExecutor neverQueueExecutor = new ThreadPoolExecutor(
            5,
            20,
            10,
            TimeUnit.SECONDS,
            new SynchronousQueue<>(),
            new CustomizableThreadFactory("NEVER-QUEUE-POOL"),
            new ThreadPoolExecutor.CallerRunsPolicy()
    );
}
