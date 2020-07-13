package com.chandan;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String password ="hbstudent";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			if(con != null) {
				System.out.println("connected");
			}
			con.close();
		} catch(Exception ex){
			ex.printStackTrace();
		}
		

	}

}
