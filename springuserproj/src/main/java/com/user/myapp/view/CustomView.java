package com.user.myapp.view;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import com.user.myapp.model.User;

@Component("customView")
public class CustomView implements View{

	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return "application/json";
	}

	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		User user = (User) model.get("user");
		PrintWriter printWriter = response.getWriter();
		printWriter.print(user);
	}

}
