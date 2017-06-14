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
public interface BaseUpdateMapper<T extends IDEntity<ID>, ID extends Serializable> extends BaseMapper<T, ID> {
	
	/**
	 * 根据主键修改一个对象
	 * 
	 * @param t		需要修改的对象
	 * @return		返回受影响的数据条数
	 */
	int update(T t);
	
}
