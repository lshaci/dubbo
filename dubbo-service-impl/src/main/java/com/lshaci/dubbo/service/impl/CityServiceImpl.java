package com.lshaci.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lshaci.dubbo.domain.City;
import com.lshaci.dubbo.mapper.CityMapper;
import com.lshaci.dubbo.service.CityService;

@Service("cityService")
@Transactional(readOnly = true, noRollbackFor = Exception.class, propagation = Propagation.SUPPORTS)
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityMapper cityMapper;

	@Override
	@Transactional
	public int save(City city) {
		int i = cityMapper.save(city);
		return i;
	}

	@Override
	@Transactional
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public int update(City city) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public City findOne(Long id) {
		return cityMapper.findOne(id);
	}

	@Override
	public List<City> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City findByName(String name) {
		return cityMapper.findByName(name);
	}

}
