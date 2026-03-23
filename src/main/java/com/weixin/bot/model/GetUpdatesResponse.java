package com.weixin.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUpdatesResponse {
    private Integer ret;
    private Integer errcode;
    private String errmsg;
    private List<WeixinMessage> msgs;
    private String getUpdatesBuf;
    private Long longpollingTimeoutMs;
}