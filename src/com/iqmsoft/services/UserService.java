package com.iqmsoft.services;

import java.util.List;

import com.iqmsoft.beans.User;

public interface UserService {

	public void add (User user);
	public User find(int id);
	public List<User> list();
	
}
