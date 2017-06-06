package com.lshaci.dubbo.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lshaci.dubbo.SpringTest;
import com.lshaci.dubbo.domain.City;

public class CityServiceImplTest extends SpringTest {
	
	@Autowired
	private CityService citySrevice;
	
	@Test
	public void testSave() {
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
