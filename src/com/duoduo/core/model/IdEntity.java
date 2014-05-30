package com.duoduo.core.model;

import java.io.Serializable;

import net.sf.json.JSONObject;

/**
 * Id模型
 * @author chengesheng@gmail.com
 * @date 2014-5-6 上午1:04:55
 * @version 1.0.0
 */
@SuppressWarnings("serial")
public class IdEntity implements Serializable {

	/** 自增ID */
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return getId() != null ? getId().hashCode() : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || !getClass().getName().equals(obj.getClass().getName())) return false;

		IdEntity entity = (IdEntity) obj;
		return (hashCode() != 0 && entity.hashCode() != 0) ? hashCode() == entity.hashCode() : false;
	}

	@Override
	public String toString() {
		return JSONObject.fromObject(this).toString();
	}
}
