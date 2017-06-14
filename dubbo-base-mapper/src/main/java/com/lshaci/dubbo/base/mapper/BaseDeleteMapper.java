package com.lshaci.dubbo.base.mapper;

import java.io.Serializable;

import com.lshaci.dubbo.base.domain.IDEntity;

/**
 * 
 * @author lshaci
 *
 * @param <T>	实体类型
 * @param <ID>	实体的主键类型
 */
public interface BaseDeleteMapper<T extends IDEntity<ID>, ID extends Serializable> extends BaseMapper<T, ID> {
	
	/**
	 * 根据主键删除一个对象
	 * 
	 * @param id	需要删除对象的主键id
	 */
	int delete(ID id);
	
}
