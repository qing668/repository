package com.linksky.jxq.ssm.mapper;

import java.util.List;

import com.linksky.jxq.ssm.entity.User;

public interface UserMapper {
	
	public void addUser(User user);
	
	public List<User> findAll();

}
