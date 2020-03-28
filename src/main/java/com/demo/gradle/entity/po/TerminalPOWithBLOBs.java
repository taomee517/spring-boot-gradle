package com.demo.gradle.entity.po;

public class TerminalPOWithBLOBs extends TerminalPO {
    private String installUrl;

    private String vinUrl;

    public String getInstallUrl() {
        return installUrl;
    }

    public void setInstallUrl(String installUrl) {
        this.installUrl = installUrl == null ? null : installUrl.trim();
    }

    public String getVinUrl() {
        return vinUrl;
    }

    public void setVinUrl(String vinUrl) {
        this.vinUrl = vinUrl == null ? null : vinUrl.trim();
    }
}