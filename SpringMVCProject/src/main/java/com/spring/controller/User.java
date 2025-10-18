package com.spring.controller;

public class User 
{
	private int uid;
	private String uname;
	private String uemail;
	private String upass;
	private String umobno;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUmobno() {
		return umobno;
	}
	public void setUmobno(String umobno) {
		this.umobno = umobno;
	}
	@Override
	public String toString() {
		return "UserBean [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", upass=" + upass + ", umobno="
				+ umobno + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
