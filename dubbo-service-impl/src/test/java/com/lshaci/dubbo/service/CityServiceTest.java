package com.lshaci.dubbo.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lshaci.dubbo.SpringTest;
import com.lshaci.dubbo.domain.City;

public class CityServiceTest extends SpringTest {
	
	@Autowired
	private CityService citySrevice;

	@Test
	public void testSave() {
		City city = new City();
		city.setName("杭州");
		city.setState("启用");
		
		int save = citySrevice.save(city);
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
