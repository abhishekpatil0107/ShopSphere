package com.spring.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


public class UserDAO 
{
//	@Autowired
	private static JdbcTemplate template;

	public static JdbcTemplate getTemplate() {
		return template;
	}

	public static void setTemplate(JdbcTemplate template) {
		UserDAO.template = template;
	}
	
	public static int userSave(User u)
	{
		return template.update("insert into user(uname,uemail,upass,umobno)values"
				+ "('"+u.getUname()+"','"+u.getUemail()+"','"+u.getUpass()+"','"+u.getUmobno()+"')");
	}
	
	public int userLogin(String e,String p)
	{
		String q1="select count(*) from where uemail=?,upass=?";
		return this.template.queryForObject(q1,Integer.class, e, p);
		
	}
	

}
