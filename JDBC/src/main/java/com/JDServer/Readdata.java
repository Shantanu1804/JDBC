package com.JDServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class Readdata {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/userslogin";
			String name="root";
			String password="root";
			
			Connection con= DriverManager.getConnection(url,name,password);
			
			String a="Select * from table1";
			 				Statement stmt = con.createStatement();
			 				ResultSet set = stmt.executeQuery(a);
			 				while(set.next()){
			 					int id = set.getInt(1);
			 					String tName = set.getString(2);
			 					String tcity= set.getString(3);
			 					System.out.println(id +"-"+ tName+ "-"+ tcity);
			 				}
			
			
			System.out.println("data Extracted");
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
