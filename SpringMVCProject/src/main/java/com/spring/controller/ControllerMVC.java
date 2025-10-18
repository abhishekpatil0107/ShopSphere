package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMVC 
{
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
//	@RequestMapping("/about")
//	public String about()
//	
//		return "about";
//	}
	
	

}
