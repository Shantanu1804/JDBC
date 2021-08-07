package com.JDServer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Updatedata {

	public static void main(String[] args) {
		
	
			

				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					String url="jdbc:mysql://localhost:3306/userslogin";
					String name="root";
					String password="root";
					
					Connection con= DriverManager.getConnection(url,name,password);
					
					String a="update table1 set tName = ? , tcity =? where tId =?";
					PreparedStatement pstmt = con.prepareStatement(a);
					
					Scanner sc= new Scanner(System.in);
					//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
					
					System.out.println("What is new name");
					String tname= sc.nextLine();
					//String tname= br.readLine();
					System.out.println("Update City");
					String tcity= sc.nextLine();
					//String tcity= br.readLine();
					
					System.out.println("Enter the id for which update is required");
					int tId = sc.nextInt();
					//int tId = Integer.parseInt(br.readLine());
					
					 	pstmt.setString(1,tname);
					 	pstmt.setString(2, tcity);
					 	pstmt.setInt(3,tId);
					 	pstmt.executeUpdate();
					 	
					
					
					System.out.println("data inserted");
					
					
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			



	}


