package com.lshaci.dubbo.mapper.base;

import java.io.Serializable;

import com.lshaci.dubbo.domain.base.IDEntity;

/**
 * 
 * @author lshaci
 *
 * @param <T>	实体类型
 * @param <ID>	实体的主键类型
 */
public interface BaseMapper<T extends IDEntity<?>, ID extends Serializable> {
	

}
