package com.codistan.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcMySql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.jdbc.Driver");
		
		String ipAddress = "jdbc:mysql://35.231.69.193:3306/hr_kadir";
		String userName = "codistanUser";
		String passWord = "IBecameACoder";
		
		Connection con = DriverManager.getConnection(ipAddress, userName, passWord);
		//("jdbc:mysql://35.231.69.193:3306/kadir_hr","codistanUser", "IBecameACoder");
		System.out.println("MySql connection is successfull!");
		Statement smt =con.createStatement();
		ResultSet rs =smt.executeQuery("select* from employees");
		while (rs.next()) {
			
			String fst= rs.getString("LastName");
			System.out.println("Database record is" + " " );
	
}
	}
}
