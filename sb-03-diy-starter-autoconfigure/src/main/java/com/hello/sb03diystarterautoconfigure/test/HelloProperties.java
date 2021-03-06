package com.hello.sb03diystarterautoconfigure.test;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 前缀 xiaoming.hello
@ConfigurationProperties(prefix = "xiaoming.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}