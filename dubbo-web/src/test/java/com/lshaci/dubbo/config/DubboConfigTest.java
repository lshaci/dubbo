package com.lshaci.dubbo.config;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

import com.lshaci.dubbo.SpringTest;

public class DubboConfigTest extends SpringTest {

	@Value("${dubbo.application.name}")
	private String appName;
	
	@Test
	public void testAppName() {
		System.out.println(appName);
	}
	
}
