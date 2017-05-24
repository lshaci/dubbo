package com.lshaci.dubbo.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lshaci.dubbo.SpringTest;
import com.lshaci.dubbo.domain.City;
import com.lshaci.dubbo.mapper.CityMapper;

public class CityMapperTest extends SpringTest {

	@Autowired
	private CityMapper mapper;
	
	@Test
	public void testSave() throws Exception {
		City city = new City();
		city.setName("成都");
		city.setState("启用");
		
		int save = mapper.save(city);
		System.out.println(save);
	}
	
	@Test
	public void testFindByName() throws Exception {
		City city = mapper.findByName("成都");
		System.out.println(city);
	}
}
