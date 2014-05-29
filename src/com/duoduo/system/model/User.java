package com.duoduo.system.model;

import com.duoduo.core.model.IdEntity;

/**
 * TODO
 * @author chengesheng@gmail.com
 * @date 2014-5-30 上午12:34:56
 * @version 1.0.0
 */
public class User extends IdEntity {

	private static final long serialVersionUID = 4419879348130150713L;

	private String account;
	private String password;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
