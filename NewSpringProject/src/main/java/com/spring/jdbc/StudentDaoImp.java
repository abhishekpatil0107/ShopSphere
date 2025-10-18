//package com.spring.jdbc;
//
//public class StudentDaoImp implements StudentDAO
//{
//	private JdbcTemplate jdbcTemplate;
//	
//	
//
//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//
//
//	@Override
//	public int insert(Student student) {
//		String query="insert student(name,address,marks)values(?,?,?)";
//		int r=this.jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getMarks());
//		return 0;
//	}
//	
//
//	
//
//
////	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
////		this.jdbcTemplate = jdbcTemplate;
////	}
////
////
////	@Override
////	public int insert(Student student) 
////	{
////		String query="insert into student(rollno,name,address,marks)value(?,?,?,?)";
////		return 0;
////	}
////	
//	
//	
//	
//	
//}
