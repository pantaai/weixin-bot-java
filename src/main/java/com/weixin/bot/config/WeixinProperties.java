package com.weixin.bot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;

@Data
@Component
@Validated
@ConfigurationProperties(prefix = "weixin")
public class WeixinProperties {

    @NotBlank(message = "API base URL is required")
    private String baseUrl = "https://ilink.weixin.qq.com";

    private String cdnBaseUrl = "https://cdn.weixin.qq.com";

    private int longPollTimeoutMs = 35000;

    private int apiTimeoutMs = 15000;

    private int loginTimeoutMs = 480000;

    private String botType = "3";

    private int maxConsecutiveFailures = 3;

    private int backoffDelayMs = 30000;

    private int retryDelayMs = 2000;

    private String stateDir = System.getProperty("user.home") + "/.weixin-bot";
}