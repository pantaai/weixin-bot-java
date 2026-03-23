package com.weixin.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUploadUrlRequest {
    private String filekey;
    private Integer mediaType;
    private String toUserId;
    private Long rawsize;
    private String rawfilemd5;
    private Long filesize;
    private Long thumbRawsize;
    private String thumbRawfilemd5;
    private Long thumbFilesize;
    private Boolean noNeedThumb;
    private String aeskey;
    private BaseInfo baseInfo;

    public GetUploadUrlRequest() {
        this.baseInfo = new BaseInfo();
    }
}