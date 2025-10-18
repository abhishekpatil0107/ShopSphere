package database_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionJDBC
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
			System.out.println("Worker ID:-"+rs.getInt(1));
			System.out.println("Worker Name:-"+rs.getString(2));
			System.out.println("Worker Dept:-"+rs.getString(3));
			System.out.println("Worker Salary:-"+rs.getInt(4));
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		ConnectionJDBC c1=new ConnectionJDBC();
		c1.connection();
		
	}

}


/*
  1)Class.forName()---We need to register driver class
  2)Connection Interface---Connection done between database & java
  3)Statement Interface---to fire the query
  4)ResultSet---to store the whole data in query,store the result
  5)loop---
*/