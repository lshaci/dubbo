package com.lshaci.dubbo.service;

import java.util.List;

import com.lshaci.dubbo.domain.City;

public interface CityService {

	/**
	 * 保存一个对象
	 * 
	 * @param city		需要保存的对象
	 * @return		返回受影响的数据条数
	 */
	int save(City city);
	
	/**
	 * 根据主键删除一个对象
	 * 
	 * @param id	需要删除对象的主键id
	 */
	int delete(Long id);
	
	/**
	 * 根据主键修改一个对象
	 * 
	 * @param city		需要修改的对象
	 * @return		返回受影响的数据条数
	 */
	int update(City city);
	
	/**
	 * 根据主键查询一个对象
	 * 
	 * @param id	需要查询对象的主键id
	 * @return		返回查询到的对象
	 */
	City findOne(Long id);
	
	/**
	 * 查询所有的对象
	 * 
	 * @return		返回查询到的对象集合
	 */
	List<City> findAll();
	
	/**
	 * 获取该实体在数据库中的总数
	 * 
	 * @return		返回该实体在数据库中的总数
	 */
	Long count();
	
	City findByName(String name);
}
