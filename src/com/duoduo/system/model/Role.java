package com.duoduo.system.model;

import com.duoduo.core.model.IdEntity;

/**
 * TODO
 * @author chengesheng@gmail.com
 * @date 2014-5-30 上午12:49:29
 * @version 1.0.0
 */
public class Role extends IdEntity {

	private static final long serialVersionUID = 7855793569562605313L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
