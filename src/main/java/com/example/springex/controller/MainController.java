package com.example.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	//responsebody -> 바로 화면에 나오기위해 jsp 파일이 아니라 return string이 바로나옴
 	@ResponseBody
	//매서드 단독매핑
	@RequestMapping("/main")
	public String main() {
		return "main()";
	}
	
	
	//responsebody -> 바로 화면에 나오기위해
		@ResponseBody
		//매서드 단독매핑
		@RequestMapping("/main/a/b/c/d")
		public String main2() {
			return "MainController:main2()";
		}
}
