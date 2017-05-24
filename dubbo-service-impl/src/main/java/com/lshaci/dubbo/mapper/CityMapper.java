package com.lshaci.dubbo.mapper;

import org.apache.ibatis.annotations.Select;

import com.lshaci.dubbo.domain.City;
import com.lshaci.dubbo.mapper.base.BaseCrudMapper;


public interface CityMapper extends BaseCrudMapper<City, Long> {

	@Select("select * from city where name = #{_parameter}")
	City findByName(String name);

}
