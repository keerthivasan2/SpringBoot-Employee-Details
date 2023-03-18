package com.keerthi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keerthi.dao.UserDAO;
import com.keerthi.model.User;

@Controller
public class UserController {
	@Autowired
	UserDAO userdao;
	
	@RequestMapping("index")
	public String user()
	{
		return"index.jsp";
	}
	@RequestMapping("addUser")
	public String addUser(User user)
	{
		userdao.save(user);
		return "index.jsp";
	}
	
}
