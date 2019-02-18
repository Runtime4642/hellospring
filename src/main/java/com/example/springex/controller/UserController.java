package com.example.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	

	@ResponseBody
	@RequestMapping("/joinform")
	public String joinform() {
		return "UserController:joinform()";
	}
	
	@ResponseBody
	@RequestMapping("/join")
	public String join() {
		return "UserController:join()";
	}
	
	@ResponseBody
	@RequestMapping("/loginform")
	public String loginform() {
		return "UserController:loginform()";
	}

}
