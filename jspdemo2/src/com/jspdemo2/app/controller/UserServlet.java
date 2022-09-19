package com.jspdemo2.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspdemo2.app.bo.User;
import com.jspdemo2.app.dao.IUserDao;
import com.jspdemo2.app.dao.UserDaoImp;


@WebServlet("/allusers")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IUserDao dao;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		dao = new UserDaoImp();
	}
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> userList = dao.getAllUsers();
		System.out.println(userList);
		  RequestDispatcher dispatcher = request.getRequestDispatcher("allusers.jsp");
		  request.setAttribute("ulist", userList); dispatcher.forward(request,response);
		 
	}

}
