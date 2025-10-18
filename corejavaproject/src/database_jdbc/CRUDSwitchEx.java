package database_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDSwitchEx 
{
	public void InsertData() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		int empid=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String emp_name=sc.next();
		System.out.println("Enter Employee Salary:");
		int emp_sal=sc.nextInt();
		System.out.println("Enter Employee Department: ");
		String dept=sc.next();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/fullstack","root","root");
		PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?,?)");
		ps.setInt(1,empid);
		ps.setString(2,emp_name);
		ps.setInt(3,emp_sal);
		ps.setString(4,dept);
		ps.executeUpdate();
		System.out.println("Data Inserted Successfullly: ");
		
	}
	public void UpdateData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/fullstack?useSSL=false","root","root");
		PreparedStatement ps=con.prepareStatement("update employee set emp_name=?,emp_sal=?,dept=? where empid=?");
		ps.setString(1,"Naru");
		ps.setInt(2,64000);
		ps.setString(3,"IT");
		ps.setInt(4,102);
		
		ps.executeUpdate();
		System.out.println("Update Successfully");
		
	}
	public  void DeleteData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");  //register driver class here
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/fullstack","root","root");
		PreparedStatement ps=con.prepareStatement("Delete from employee where empid=? ");
		ps.setInt(1,103);
		ps.executeUpdate();
		System.out.println("Delete Successfullly");
		
	}
	public void viewData() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");  //register driver class here
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/fullstack","root","root");
		Statement ps=con.createStatement();
		String s1="select * from employee";
		ResultSet rs=ps.executeQuery(s1);
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getString(4));
			
		}
	}
	public static void main(String[]args) throws ClassNotFoundException, SQLException
	{
		CRUDSwitchEx j1=new CRUDSwitchEx ();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.InsertData\n2.updateData\n3.deleteData\n4.viewData\n");
		System.out.println("Enter your choice : ");
		int ch= sc.nextInt();
		int i=0;
		
		switch (ch) {
		case 1 : j1.InsertData();
		         j1.viewData();
		         break;
		case 2 : j1.UpdateData();
				j1.viewData();
				break;
		case 3 : j1.DeleteData();
				j1.viewData();
				break;
		case 4 : j1.viewData();
				break;
		default : System.out.println("INVALID CHOICE");
		}
		
	}


}
