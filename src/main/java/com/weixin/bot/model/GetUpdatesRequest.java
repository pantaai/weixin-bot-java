package com.weixin.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUpdatesRequest {
    private String getUpdatesBuf;
    private BaseInfo baseInfo;

    public GetUpdatesRequest() {
        this.baseInfo = new BaseInfo();
    }

    public GetUpdatesRequest(String getUpdatesBuf) {
        this.getUpdatesBuf = getUpdatesBuf;
        this.baseInfo = new BaseInfo();
    }
}