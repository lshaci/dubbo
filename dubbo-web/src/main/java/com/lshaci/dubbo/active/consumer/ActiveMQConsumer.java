package com.lshaci.dubbo.active.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQConsumer {

	// 接收消息监听
	@JmsListener(destination = "${activemq.queue.name.test}")
	// 回复消息
	@SendTo("${activemq.queue.name.reply}")
	public String receiveAndReplyQueue(String msg) {
		System.out.println("ActiveMQConsumer收到的消息为:" + msg);
		return "ActiveMQConsumer回复的消息" + msg;
	}

}
