package com.lshaci.dubbo.base.mapper;

import java.io.Serializable;
import java.util.List;

import com.lshaci.dubbo.base.domain.IDEntity;

/**
 * 
 * @author lshaci
 * @param <ID>
 *
 * @param <T>	实体类型
 * @param <ID>	实体的主键类型
 */
public interface BaseFindMapper<T extends IDEntity<ID>, ID extends Serializable> extends BaseMapper<T, ID> {
	
	/**
	 * 根据主键查询一个对象
	 * 
	 * @param id	需要查询对象的主键id
	 * @return		返回查询到的对象
	 */
	T findOne(ID id);
	
	/**
	 * 查询所有的对象
	 * 
	 * @return		返回查询到的对象集合
	 */
	List<T> findAll();

}
