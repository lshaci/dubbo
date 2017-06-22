package com.lshaci.dubbo.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQConsumer {

	@JmsListener(destination = "${activemq.queue.name.reply}")
	public void receiveAndReplyQueue(String msg) {
		System.out.println("ActiveMQProducer接收的的回复消息:" + msg);
	}

}
