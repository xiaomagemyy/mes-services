package com.unilever.hefei.mes.dao;


import com.unilever.hefei.mes.common.entity.UserEntity;

public interface UserDao {
	/**
	 * 根据用户名查找用户
	 * @param username
	 * @return
	 */
	UserEntity getUserByUsername(String username);
	/**
	 * 新增用户
	 * @param user
	 */
	void insertUser(UserEntity user);

}
