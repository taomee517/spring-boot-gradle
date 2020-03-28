package com.demo.gradle.entity.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TerminalVO implements Serializable {
    private Integer id;

    private String imei;

    private String iccid;

    private Integer clientType;

    private String productName;

    private String hardVersion;

    private String softName;

    private String softVersion;

    private String productCode;

    private Integer modelId;

    private Integer vehicleId;

    private String levelCode;

    private Integer terminalStatus;

    private Date stateTime;

    private Boolean updStatus;

    private Boolean online;

    private Date lastMsgTime;

}