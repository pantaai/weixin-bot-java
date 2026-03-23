package com.weixin.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendMessageRequest {
    private WeixinMessage msg;
    private BaseInfo baseInfo;

    public SendMessageRequest() {
        this.baseInfo = new BaseInfo();
    }

    public SendMessageRequest(WeixinMessage msg) {
        this.msg = msg;
        this.baseInfo = new BaseInfo();
    }

    public static SendMessageRequest textMessage(String toUserId, String text, String contextToken) {
        WeixinMessage msg = new WeixinMessage();
        msg.setToUserId(toUserId);
        msg.setContextToken(contextToken);
        
        MessageItem item = new MessageItem();
        item.setType(1); // TEXT
        TextItem textItem = new TextItem();
        textItem.setText(text);
        item.setTextItem(textItem);
        
        msg.setItemList(List.of(item));
        return new SendMessageRequest(msg);
    }
}