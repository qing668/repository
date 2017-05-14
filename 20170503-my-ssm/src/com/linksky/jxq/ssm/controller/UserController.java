package com.linksky.jxq.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.linksky.jxq.ssm.entity.User;
import com.linksky.jxq.ssm.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("add")
	public String addUser(User user){
		user.setName("张三");
		user.setAge(18);
		user.setSex("男");
		userService.addUser(user);
		System.out.println("数据添加成功");
		return "user_list";
	}
	
	@RequestMapping("find")
	public ModelAndView find(){
		ModelAndView mv = new ModelAndView();
		List<User> userList = userService.findAll();
		mv.addObject("userList", userList);
		mv.setViewName("user_list");
		
		return mv;
	}
	
}
