package com.iqmsoft.dao;

import java.util.List;

import com.iqmsoft.beans.User;

public interface UserDao {

	void add (User user);
	User find(int id);
	List<User> list();
	
}
