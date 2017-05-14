package com.linksky.jxq.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linksky.jxq.ssm.entity.User;
import com.linksky.jxq.ssm.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void addUser(User user){
		userMapper.addUser(user);
	}
	
	public List<User> findAll(){
		return userMapper.findAll();
	}
}
