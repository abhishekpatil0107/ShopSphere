package database_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDStatements 
{
	public void connection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");  //register driver class here
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/fullstack","root","root");
		Statement ps=con.createStatement();
		String s1="select * from workers";
		ResultSet rs=ps.executeQuery(s1);
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
	}
	public void InsertData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");  //register driver class here
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/fullstack","root","root");
		PreparedStatement ps=con.prepareStatement("insert into workers values(?,?,?,?)");   //'?,?' encypted form
		ps.setInt(1,105);
		ps.setString(2,"Shreyash");
		ps.setString(3,"Speaker");
		ps.setInt(4,700000);
		ps.executeUpdate();
		System.out.println("Data Inserted Successfullly");
		
	}
	
	public void Update() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");  //register driver class here
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/fullstack","root","root");
		PreparedStatement ps=con.prepareStatement("update workers set empid=?, ename=?,dept=? where esal=?");   //'?,?' encypted form
		ps.setInt(1,103);
		ps.setString(2,"Aditya");
		ps.setString(3,"Jr_Eng.");
		ps.setInt(4,740000);
		ps.executeUpdate();
		System.out.println("Update Successfullly");
	}
	
	public void DeleteData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");  //register driver class here
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/fullstack","root","root");
		PreparedStatement ps=con.prepareStatement("Delete from workers where empid=?");
		ps.setInt(1,103);
		ps.executeUpdate();
		System.out.println("Delete Successfullly");
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		CRUDStatements c1=new CRUDStatements ();
		c1.connection();
		c1.InsertData();
		c1.Update();
		//c1.DeleteData();
	}

}
