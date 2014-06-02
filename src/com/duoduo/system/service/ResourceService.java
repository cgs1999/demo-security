package com.duoduo.system.service;

import com.duoduo.core.vo.Page;
import com.duoduo.system.vo.ResourceVO;

/**
 * 资源管理业务处理接口
 * @author chengesheng@gmail.com
 * @date 2014-6-2 下午10:26:09
 * @version 1.0.0
 */
public interface ResourceService {

	/**
	 * 根据Id获取资源
	 * @param id
	 * @return
	 */
	public ResourceVO getById(String id);

	/**
	 * 根据名称获取资源
	 * @param name
	 * @return
	 */
	public ResourceVO getByName(String name);

	/**
	 * 创建资源
	 * @param resourceVO
	 * @return
	 */
	public ResourceVO create(final ResourceVO resourceVO);

	/**
	 * 修改资源
	 * @param resourceVO
	 */
	public void update(ResourceVO resourceVO);

	/**
	 * 删除资源
	 * @param id
	 * @return
	 */
	public boolean delete(String id);

	/**
	 * 分页查询资源列表（模糊查询，条件为：名称）
	 * @param name 名称
	 * @param page
	 * @return
	 */
	public Page<ResourceVO> pagingList(String name, Page<ResourceVO> page);
}
