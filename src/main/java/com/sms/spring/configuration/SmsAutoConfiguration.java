package com.sms.spring.configuration;

import com.sms.spring.configuration.config.RestTemplateConfig;
import com.sms.spring.configuration.config.SmsProperties;
import com.sms.spring.configuration.service.SmsService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Xiang JiangCheng
 */
@Import(RestTemplateConfig.class)
@Configuration
@EnableConfigurationProperties(SmsProperties.class)//使@ConfigurationProperties注解生效
public class SmsAutoConfiguration {

    @Bean
    public SmsService smsService(SmsProperties smsProperties) {
        return new SmsService(smsProperties);
    }

}
