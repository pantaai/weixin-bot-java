package com.weixin.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VoiceItem {
    private CDNMedia media;
    private Integer encodeType;
    private Integer bitsPerSample;
    private Integer sampleRate;
    private Integer playtime;
    private String text;
}