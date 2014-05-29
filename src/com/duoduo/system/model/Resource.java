package com.duoduo.system.model;

import com.duoduo.core.model.IdEntity;

/**
 * TODO
 * @author chengesheng@gmail.com
 * @date 2014-5-30 上午12:47:45
 * @version 1.0.0
 */
public class Resource extends IdEntity {

	private static final long serialVersionUID = -8619608370246744651L;

	private String name;
	private String type;
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
