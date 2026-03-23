package com.weixin.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageItem {
    private CDNMedia media;
    private CDNMedia thumbMedia;
    private String aeskey;
    private String url;
    private Long midSize;
    private Long thumbSize;
    private Integer thumbHeight;
    private Integer thumbWidth;
    private Long hdSize;
}