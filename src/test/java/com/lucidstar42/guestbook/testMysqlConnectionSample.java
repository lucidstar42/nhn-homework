package com.lucidstar42.guestbook;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class testMysqlConnectionSample {
	 private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	 // database url
	 private static final String URL = "";
	 // database user
	 private static final String USER = "";
	 // database password
	 private static final String PW = "";
	
	@Test
	public void test() {
		try {
			Class.forName(DRIVER);		  
			Connection con = DriverManager.getConnection(URL, USER, PW);
			System.out.println(con);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
