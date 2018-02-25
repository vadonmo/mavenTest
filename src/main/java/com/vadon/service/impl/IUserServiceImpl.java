package com.vadon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vadon.dao.IUserDao;
import com.vadon.model.User;
import com.vadon.service.IUserService;

@Service("userService")
public class IUserServiceImpl implements IUserService {

	@Autowired
	public IUserDao uDao;

	public User getUserById(int id) {
		return uDao.selectByPrimaryKey(id);
	}

	public User getUserAllBlog(int id) {
		return uDao.selectUserAllBlog(id);
	}

}
