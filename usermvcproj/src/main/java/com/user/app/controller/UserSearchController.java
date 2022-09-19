package com.user.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.user.app.dao.IUserDAO;
import com.user.app.model.User;

@Controller
public class UserSearchController {
	
	@Autowired
	IUserDAO userDAO;
	
	@RequestMapping("/usersearch")
	public ModelAndView searchUser(HttpServletRequest request) {
		Integer uid = Integer.parseInt(request.getParameter("userid"));
		User user = userDAO.getUserById(uid);
		ModelAndView modelAndView = new ModelAndView("userView");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}
