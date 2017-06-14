package com.lshaci.dubbo.mapper;

import org.apache.ibatis.annotations.Select;

import com.lshaci.dubbo.base.mapper.BaseCrudMapper;
import com.lshaci.dubbo.domain.City;


public interface CityMapper extends BaseCrudMapper<City, Long> {

	@Select("select * from city where name = #{_parameter}")
	City findByName(String name);

}
