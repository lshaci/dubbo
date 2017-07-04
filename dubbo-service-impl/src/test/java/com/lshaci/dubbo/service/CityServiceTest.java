package com.lshaci.dubbo.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lshaci.dubbo.SpringTest;
import com.lshaci.dubbo.domain.City;

public class CityServiceTest extends SpringTest {
	
	private Logger logger = LoggerFactory.getLogger(CityServiceTest.class);
	
	@Autowired
	private CityService citySrevice;
	
	@Test
	public void testLog() {
		for (int i = 0; i < 10; i++) {
			logger.debug("Test debug log --> {}", i);
		}
	}

	@Test
	public void testSave() {
		City city = new City();
		city.setName("杭州");
		city.setState("启用");
		
		citySrevice.save(city);
		System.out.println(city.getId());
	}

	@Test
	public void testDelete() {
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testFindOne() {
		City city = citySrevice.findOne(1L);
		System.out.println(city);
	}
	
	@Test
	public void testFindByName() {
		City city = citySrevice.findByName("成都");
		System.out.println(city);
	}
	@Test
	public void testFindAll() {
	}

	@Test
	public void testCount() {
	}

}
