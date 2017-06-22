package com.lshaci.dubbo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:config/properties/activemq.properties")
public class ActiveMQConfig {
	
	private Logger logger = LoggerFactory.getLogger(ActiveMQConfig.class);
	

}
