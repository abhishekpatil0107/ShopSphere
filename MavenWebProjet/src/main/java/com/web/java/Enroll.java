package com.web.java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Enroll 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	
	@ManyToOne
	@JoinColumn(name="sid")
	private Student ss;
	
	@ManyToOne
	@JoinColumn(name="cid")
	private Course cc;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Student getSs() {
		return ss;
	}

	public void setSs(Student ss) {
		this.ss = ss;
	}

	public Course getCc() {
		return cc;
	}

	public void setCc(Course cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Enroll [eid=" + eid + ", ss=" + ss + ", cc=" + cc + "]";
	}

	public Enroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
