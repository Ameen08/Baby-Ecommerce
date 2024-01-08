package main;

import java.sql.*;


public class Baby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =
		DriverManager.getConnection("jdbc:mysql://localhost:3306/baby-ecommerce","root","");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from products");

		while(rs.next())
		{
		System.out.println("ID: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Type: "
		+ rs.getString(3));
		}
		con.close();
		} catch(Exception e)
		{
		System.out.println(e);
		}

	}

}
