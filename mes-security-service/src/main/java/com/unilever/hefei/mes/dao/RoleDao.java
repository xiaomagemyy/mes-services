package com.unilever.hefei.mes.dao;

import com.unilever.hefei.mes.common.entity.Role;

import java.util.List;


public interface RoleDao {
	/**
	 * 根据用户id获取用户
	 * @param id
	 * @return
	 */
	List<Role> getUserRoleByUserId(Long id);

}
