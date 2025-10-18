package com.spring.core;

public class Employee 
{
	private int empId;
	private String empName;
	private long empMobno;
	private String empAddress;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpMobno() {
		return empMobno;
	}
	public void setEmpMobno(long empMobno) {
		this.empMobno = empMobno;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empMobno=" + empMobno + ", empAddress="
				+ empAddress + "]";
	}
	
	

}
