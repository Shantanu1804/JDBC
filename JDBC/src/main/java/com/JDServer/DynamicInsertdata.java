package com.JDServer;
import java.sql.*;
import java.util.Scanner;

public class DynamicInsertdata {
	public static void main(String [] args) {
		String tname;
		String tcity;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/userslogin";
			String name="root";
			String password="root";
			
			Connection con= DriverManager.getConnection(url,name,password);
			
			String a="insert into table1(tName,tcity) values (?,?)";
			PreparedStatement pstmt = con.prepareStatement(a);
			
			Scanner sc= new Scanner(System.in);
			System.out.println("What is name");
			tname= sc.nextLine();
			System.out.println("Enter City");
			tcity= sc.nextLine();
			
			 	pstmt.setString(2,tname);
			 	pstmt.setString(3, tcity);
			 	pstmt.executeUpdate();
			 	
			
			
			System.out.println("data inserted");
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
