package br.com.uuu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import br.com.uuu.json.TextMessage;

@Controller
public class DocumentController {

	@Autowired
    private SimpMessagingTemplate messagingTemplate;

	@MessageMapping("/changeText/{documentId}")
    public void changeText(@Payload TextMessage message, @DestinationVariable String documentId) {
    	System.out.println("Received message: " + message + " for documentId: " + documentId);
        messagingTemplate.convertAndSend("/topic/updates/" + documentId, new TextMessage(HtmlUtils.htmlEscape(message.getContent())));
        System.out.println("Sent message to /topic/updates/" + documentId);
    }
}