package com.sms.spring.configuration.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Xiang JiangCheng
 */
@Data
@ConfigurationProperties(prefix = "sms-config")
public class SmsProperties {

    private String appid;
    private String accountSid;
    private String authToken;

}
