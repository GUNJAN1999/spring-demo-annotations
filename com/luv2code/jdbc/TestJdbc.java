package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args)
	{
		try {
			String jdbsUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimerzone=UTC";
			String user="hbstudent";
			String pass="hbstudent";
			System.out.println("connecting to db "+jdbsUrl);
			Connection myConn=DriverManager.getConnection(jdbsUrl,user,pass);
			System.out.println("done!!!!-----");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
