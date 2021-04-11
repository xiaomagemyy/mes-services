package com.unilever.hefei.mes.dao;

import com.unilever.hefei.mes.common.entity.Menu;
import com.unilever.hefei.mes.common.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {

	/**
	 * 根据角色获取菜单列表
	 * @param roles
	 * @return
	 */
	List<Menu> getRoleMenuByRoles(@Param("roles") List<Role> roles);

}
