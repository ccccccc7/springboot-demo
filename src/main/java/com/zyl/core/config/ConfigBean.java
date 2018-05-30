package com.zyl.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 加载配置文件
 *
 * @PerpertySource注解只可以加载properties文件，无法加载yml文件
 * @author zyl
 */
@Component
//@ConfigurationProperties(locations = {"classpath:config.yml"},prefix = "config")
@ConfigurationProperties(prefix = "config")
public class ConfigBean {

    private String name;

    private String password;

    private String uuid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
