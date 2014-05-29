package com.duoduo.core.model;

import java.io.Serializable;

import net.sf.json.JSONObject;

/**
 * Uuid模型
 * @author chengesheng@gmail.com
 * @date 2014-5-6 上午1:08:17
 * @version 1.0.0
 */
@SuppressWarnings("serial")
public class UuidEntity implements Serializable {

	private String uuid;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public int hashCode() {
		return getUuid() != null ? getUuid().hashCode() : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		UuidEntity entity = (UuidEntity) obj;

		if (getUuid() != null ? !getUuid().equals(entity.getUuid()) : entity.getUuid() != null) return false;

		return true;
	}

	@Override
	public String toString() {
		return JSONObject.fromObject(this).toString();
	}

}
