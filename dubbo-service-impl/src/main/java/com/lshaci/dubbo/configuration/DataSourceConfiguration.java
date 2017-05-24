package com.lshaci.dubbo.configuration;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@PropertySource("classpath:config/properties/datasource.properties")
public class DataSourceConfiguration {
	
	private Logger logger = LoggerFactory.getLogger(DataSourceConfiguration.class);
	
	@Bean
	@ConfigurationProperties(prefix = "druid.datasource")
	public DataSource dataSource() {
		logger.debug("Init DataSource use DruidDataSource...");
		
		return new DruidDataSource();
	}

}