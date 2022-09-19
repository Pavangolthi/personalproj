package com.mtc.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mtc.app.bo.User;
import com.mtc.app.dao.IUserDAO;
import com.mtc.app.dao.UserImplDAO;

@WebServlet("/usernameserv")
public class UserNameSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IUserDAO userDAO;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		userDAO = new UserImplDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("username"));
		User user = userDAO.getUserName(request.getParameter("username"));
		PrintWriter printWriter = response.getWriter();
		if(user == null) {
			printWriter.println("<a>Username available<a>");
		}else {
			printWriter.println("<a>Username already exists</a>");
		}
	}

}
