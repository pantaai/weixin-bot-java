package com.weixin.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageItem {

    private Integer type;
    private Long createTimeMs;
    private Long updateTimeMs;
    private Boolean isCompleted;
    private String msgId;
    private RefMessage refMsg;
    private TextItem textItem;
    private ImageItem imageItem;
    private VoiceItem voiceItem;
    private FileItem fileItem;
    private VideoItem videoItem;
}