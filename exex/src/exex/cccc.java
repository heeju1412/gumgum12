package exex;

import java.sql.Connection;
import java.sql.DriverManager;

public class cccc {
	private static final String DRIVER_FDBC = "com.mysql.cj.jdbc.Driver";
	private static final String URL_DB = 
		"jdbc:mysql://localhost:3306/hoho2?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
	private static final String USER = "root";
	private static final String PASS = "1234";
	private static Connection conn;
	
	public static Connection getConnection() {
	
		try {
			Class.forName(DRIVER_FDBC);
		
			conn=DriverManager.getConnection(URL_DB, USER, PASS);
			
		}catch(Exception e) {
			System.out.println("err" + e);
		}return conn;
	}
	
	
}
