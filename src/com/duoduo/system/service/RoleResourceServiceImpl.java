package com.duoduo.system.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.duoduo.system.dao.RoleResourceDao;
import com.duoduo.system.model.RoleResource;

/**
 * 角色资源关系实现类
 * @author chengesheng@gmail.com
 * @date 2014-6-3 上午1:54:15
 * @version 1.0.0
 */
@Transactional
@Service("roleResourceService")
public class RoleResourceServiceImpl implements RoleResourceService {

	@Resource
	private RoleResourceDao roleResourceDao;

	@Override
	public boolean saveOrUpdate(String roleId, String resouceIds) {
		if (!StringUtils.hasText(roleId)) {
			return true;
		}

		// 保存或更新前先删除用户原有的角色
		deleteByRoleId(roleId);

		// 保存用户角色信息
		if (resouceIds != null && !"".equals(resouceIds)) {
			String[] ids = resouceIds.split(",");
			for (int i = 0, len = ids.length; i < len; i++) {
				RoleResource roleResource = new RoleResource();
				roleResource.setRoleId(Long.valueOf(roleId));
				roleResource.setResourceId(Long.valueOf(ids[i]));

				roleResourceDao.create(roleResource);
			}
		}

		return true;
	}

	@Override
	public boolean deleteByRoleId(String roleId) {
		return roleResourceDao.deleteByRoleId(roleId);
	}

	@Override
	public boolean deleteByResourceId(String resourceId) {
		return roleResourceDao.deleteByResourceId(resourceId);
	}

}
