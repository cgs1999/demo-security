package com.duoduo.system.model;

import java.util.Date;

import com.duoduo.core.model.IdEntity;

/**
 * 角色实体
 * @author chengesheng@gmail.com
 * @date 2014-5-30 上午12:49:29
 * @version 1.0.0
 */
public class Role extends IdEntity {

	private static final long serialVersionUID = 7855793569562605313L;

	/** 角色名称 */
	private String name;
	/** 角色类型，系统和自定义 */
	private String type;
	/** 启停状态 */
	private Boolean enable;
	/** 备注 */
	private String memo;
	/** 创建时间 */
	private Date createTime;
	/** 最后更新时间 */
	private Date updateTime;

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

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
