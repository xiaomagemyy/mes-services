package com.unilever.hefei.mes.service.impl;

import com.unilever.hefei.mes.dao.UserDao;
import com.unilever.hefei.mes.common.entity.UserEntity;
import com.unilever.hefei.mes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	/**
	 * 保存用户
	 */
	@Override
	public void saveUser(UserEntity user) {
		userDao.insertUser(user);
	}

}
