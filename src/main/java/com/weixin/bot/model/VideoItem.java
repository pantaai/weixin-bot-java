package com.weixin.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoItem {
    private CDNMedia media;
    private Long videoSize;
    private Integer playLength;
    private String videoMd5;
    private CDNMedia thumbMedia;
    private Long thumbSize;
    private Integer thumbHeight;
    private Integer thumbWidth;
}