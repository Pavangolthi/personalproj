package com.user.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.user.myapp.dao.IUserDAO;
import com.user.myapp.entity.User;



@Controller
public class UserSearchController {
	
	@Autowired
	private IUserDAO userDAO;
	
	@RequestMapping("/usersearch")
	public ModelAndView searchUser(HttpServletRequest request) {
		int uid = Integer.parseInt(request.getParameter("userid"));
		User user = userDAO.getUserById(uid);
		ModelAndView modelAndView = new ModelAndView("customView");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	@RequestMapping("/allusers")
	public String allUser(Model model) {
		List<User> userList = userDAO.getAllUsers();
		model.addAttribute("userList", userList);
		return "pdfView";
	}
}
