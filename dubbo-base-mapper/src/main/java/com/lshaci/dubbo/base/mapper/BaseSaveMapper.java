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
public interface BaseSaveMapper<T extends IDEntity<ID>, ID extends Serializable> extends BaseMapper<T, ID> {
	
	/**
	 * 保存一个对象
	 * 
	 * @param t		需要保存的对象
	 * @return		返回受影响的数据条数
	 */
	int save(T t);

}
