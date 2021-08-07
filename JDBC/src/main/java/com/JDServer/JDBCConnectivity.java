package com.JDServer;
import java.sql.*;

public class JDBCConnectivity {
	public static void main (String [] args) {
		try{
			//loading driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// creating connection
		String url ="jdbc:mysql://localhost:3306/userslogin";
		String username ="root";
		String password="root";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		if(con.isClosed()) {
			System.out.println("Connection is closed");
		}else {
			System.out.println("Connection established");
		}
	
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	
	}

}
