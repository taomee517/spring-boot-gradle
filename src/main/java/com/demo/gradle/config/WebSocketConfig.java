package com.demo.gradle.config;

import com.demo.gradle.service.EchoService;
import com.demo.gradle.service.impl.DefaultEchoService;
import com.demo.gradle.websocket.EchoHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        String url = "echo";
        registry.addHandler(echoHandler(),url).withSockJS();
    }

    @Bean
    public EchoService echoService(){
        String format = " %s  time: %tT";
        return new DefaultEchoService(format);
    }

    public EchoHandler echoHandler(){
        return new EchoHandler(echoService());
    }
}
