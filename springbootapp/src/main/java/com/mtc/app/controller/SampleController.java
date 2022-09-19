package com.mtc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	
	@RequestMapping("/get")
	public @ResponseBody String getMessage() {
		return "Welcome to SprinBoot Framework";
	}

}
