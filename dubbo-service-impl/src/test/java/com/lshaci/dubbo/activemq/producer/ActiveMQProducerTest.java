package com.lshaci.dubbo.activemq.producer;

import javax.jms.Destination;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lshaci.dubbo.SpringTest;

public class ActiveMQProducerTest extends SpringTest {

	@Autowired
	private ActiveMQProducer activeMQProducer;

	@Autowired
	private Destination testQueue;

	@Test
	public void testSendMessage() {
		for (int i = 0; i < 10; i++) {
			activeMQProducer.sendMessage(testQueue, "Test for activemq.");
		}
	}

}
