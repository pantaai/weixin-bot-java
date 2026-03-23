package com.weixin.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeixinMessage {

    private Long seq;
    private Long messageId;
    private String fromUserId;
    private String toUserId;
    private String clientId;
    private Long createTimeMs;
    private Long updateTimeMs;
    private Long deleteTimeMs;
    private String sessionId;
    private String groupId;
    private Integer messageType;
    private Integer messageState;
    private List<MessageItem> itemList;
    private String contextToken;
}