package com.iqmsoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iqmsoft.beans.User;
import com.iqmsoft.dao.UserDao;

@Component
@Service("userService")
public class UserServiceImp implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public User find(int id) {
		return userDao.find(id);
	}

	@Override
	public List<User> list() {
		return userDao.list();
	}

}
