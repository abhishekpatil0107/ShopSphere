package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@Controller
public class UserController
{
	@RequestMapping("/reg")
	public String Register()
	{
		return "regForm";
	}
	
	@RequestMapping("/login")
	public String Login()
	{
		return "loginForm";
	}
	
	@RequestMapping("/ureg")
	public static String userReg(@RequestParam("uname")String uname,@RequestParam("uemail")String uemail,
			@RequestParam("upass")String upass,@RequestParam("umobno")String umobno,Model m)
	{
		
		System.out.println(uname);
		System.out.println(uemail);
		User u=new User();
		u.setUname(uname);u.setUemail(uemail);u.setUpass(upass);u.setUmobno(umobno);
		int result = UserDAO.userSave(u);
		
		if(result>0)
		{
			String msg="Congrats " +uname+ " You have register successfully";
			m.addAttribute("msg",msg);
			return "Success";
		}
		else
		{
			String msg="Error" +uname+ "Try again";
			m.addAttribute("msg",msg);
			return "error";
		}
		
	}
	@RequestMapping("/ulogin")
	public String Ulogin(@RequestParam("uemail")String uemail,@RequestParam("upass")String upass, Model m)
	{
		User uu=new User();
		uu.setUemail(uemail);
		uu.setUpass(upass);
		int r=UserDAO.userSave(uu);
		if(r>0)
		{
			String msg="Congrats Login Successfull";
			m.addAttribute("msg",msg);
			return "userLogin";
		}
		else
		{
			String msg="You got error";
			m.addAttribute("msg", msg);
			return "error";
		}
	
		
	}
}
	

