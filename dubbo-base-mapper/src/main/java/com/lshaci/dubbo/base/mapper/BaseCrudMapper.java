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
public interface BaseCrudMapper<T extends IDEntity<ID>, ID extends Serializable> extends 
		BaseSaveMapper<T, ID>, BaseDeleteMapper<T, ID>,
		BaseUpdateMapper<T, ID>, BaseFindMapper<T, ID> {
	
}
