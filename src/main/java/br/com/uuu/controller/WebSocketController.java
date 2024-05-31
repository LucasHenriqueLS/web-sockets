package br.com.uuu.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import br.com.uuu.json.TextMessage;

@Controller
public class WebSocketController {

    @MessageMapping("/changeText")
    @SendTo("/topic/updates")
    public TextMessage send(TextMessage message) {
        return new TextMessage(HtmlUtils.htmlEscape(message.getContent()));
    }
}