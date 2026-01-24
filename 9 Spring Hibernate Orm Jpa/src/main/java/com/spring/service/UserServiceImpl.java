package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.UserDao;
import com.spring.medel.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	UserDao userDao;
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void addUserService(User user) {
		userDao.addUser(user);
	}

	@Override
	public void updateUserService(User user) {
		userDao.updateUser(user);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteUserService(int id) {
		userDao.deleteUser(id);
	}

	@Override
	@Transactional(readOnly = true)
	public User getUserByIdService(int id) {
		return userDao.getUserById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<User> getAllUserServices() {
		return userDao.getAllUser();
	}

}
