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

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return getId() != null ? getId().hashCode() : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		IdEntity entity = (IdEntity) obj;

		if (getId() != null ? !getId().equals(entity.getId()) : entity.getId() != null) return false;

		return true;
	}

	@Override
	public String toString() {
		return JSONObject.fromObject(this).toString();
	}
}
