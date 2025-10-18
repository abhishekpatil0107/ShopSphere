package diwithcollection;

import java.util.Arrays;

//import java.util.List;

public class Company 
{
	private int cid;
	private String cname;
	
//	private List<Employee>elist;
	Employee emp[];
	
	

//	public List<Employee> getElist() {
//		return elist;
//	}
//
//	public void setElist(List<Employee> elist) {
//		this.elist = elist;
//	}
	
	

	public int getCid() {
		return cid;
	}

	public Employee[] getEmp() {
		return emp;
	}

	public void setEmp(Employee[] emp) {
		this.emp = emp;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
//	@Override
//	public String toString() {
//		return "Company [cid=" + cid + ", cname=" + cname + ", elist=" + elist + "]";
//	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", emp=" + Arrays.toString(emp) + "]";
	}


	
	

}
