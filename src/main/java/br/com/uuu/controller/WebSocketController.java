//package br.com.uuu.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.util.HtmlUtils;
//
//import br.com.uuu.json.TextMessage;
//
////@Controller
////public class WebSocketController {
////
////    @MessageMapping("/changeText")
////    @SendTo("/topic/updates")
////    public TextMessage send(TextMessage message) {
////        return new TextMessage(HtmlUtils.htmlEscape(message.getContent()));
////    }
////}
//
//@Controller
//public class WebSocketController {
//	
//	@Autowired
//	private SimpMessagingTemplate messagingTemplate;
//
//    @MessageMapping("/changeText")
//    public void send(@Payload TextMessage message) {
//    	messagingTemplate.convertAndSend("/topic/updates", new TextMessage(HtmlUtils.htmlEscape(message.getContent())));
//    }
//}