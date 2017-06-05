package com.lshaci.dubbo.domain.base;

import java.io.Serializable;

/**
 * 公共的ID实体
 * 
 * @author lshaci
 *
 * @param <ID>		实体主键的类型
 */
public abstract class IDEntity<ID extends Serializable> implements Serializable  {

	private static final long serialVersionUID = -2044745800861094697L;
	
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
	
	
}
