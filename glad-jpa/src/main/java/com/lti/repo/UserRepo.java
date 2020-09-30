package com.lti.repo;

import java.util.List;


import com.lti.entity.User;

public interface UserRepo {
void save(User user);
	
	User fetch(String uname);
	
	List<User> list();
	
	void update(User user);
	
	List<User> fetchAll();
	
	List<User> fetchIfYes();
}
