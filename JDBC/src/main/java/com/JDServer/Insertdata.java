package com.JDServer;
import java.sql.*;

public class Insertdata {
	public static void main(String [] args) {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/userslogin";
			String name="root";
			String password="root";
			
			Connection con= DriverManager.getConnection(url,name,password);
			
			String a="insert into table1(tName,tcity) values (?,?)";
			PreparedStatement pstmt = con.prepareStatement(a);
			 	pstmt.setString(1,"ABS");
			 	pstmt.setString(2, "XYW");
			 	pstmt.executeUpdate();
			 	
			
			
			System.out.println("data inserted");
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
