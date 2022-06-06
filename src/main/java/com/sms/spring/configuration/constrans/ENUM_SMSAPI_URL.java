package com.sms.spring.configuration.constrans;

/**
 * 短信请求API枚举
 *
 * @author Xiang JiangCheng
 */
public enum ENUM_SMSAPI_URL {

    SENDSMS("https://open.ucpaas.com/ol/sms/sendsms"),

    SENDBATCHSMS("https://open.ucpaas.com/ol/sms/sendsms_batch");

    private String url;

    ENUM_SMSAPI_URL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
