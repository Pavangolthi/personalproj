package com.mtc.app.view;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.View;

import com.mtc.app.model.Product;

@Controller("sampleView")
public class SampleView implements View{

	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return "application/json";
	}

	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Product product = (Product) model.get("product");
		PrintWriter printWriter = response.getWriter();
		System.out.println("sample view");
		printWriter.println(product);
	}

}
