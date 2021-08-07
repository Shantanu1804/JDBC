package com.JDServer;

import java.sql.DriverManager;
import java.sql.*;

public class Crttbl {
	public static void main (String [] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/userslogin";
			String name= "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url,name,password);
			
			String S= "create table table1(tId int(20) primary key auto_increment,tName varchar (200) not null , tcity varchar (400))";
			
		// creating stmt
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(S);
			System.out.println("table created in database");
			con.close();
			
			
			
			
			
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}