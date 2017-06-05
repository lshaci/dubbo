package com.lshaci.dubbo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/properties/dubbo.properties")
@ImportResource("classpath:config/xml/dubbo/dubbo-consumer.xml")
public class DubboConfig {

}
