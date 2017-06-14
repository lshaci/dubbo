package com.lshaci.dubbo.base.mapper;

import java.io.Serializable;

import com.lshaci.dubbo.base.domain.IDEntity;


/**
 * 公共的Mapper, 仅含count方法
 * 
 * @author lshaci
 *
 * @param <T>	实体类型
 * @param <ID>	实体的主键类型
 */
public interface BaseMapper<T extends IDEntity<ID>, ID extends Serializable> {
	
	/**
	 * 获取该实体在数据库中的总数
	 * 
	 * @return		返回该实体在数据库中的总数
	 */
	Long count();

}
