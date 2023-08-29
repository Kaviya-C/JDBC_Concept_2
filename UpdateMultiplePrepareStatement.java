package com.learn.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMultiplePrepareStatement 
{
	public static void main(String... args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Owner";

		String name = "root";
		String password = "root123";

		Connection con = DriverManager.getConnection(url, name, password);
		
		String query="UPDATE Details set revenue=? where name=?";
		
		PreparedStatement pstmt= con.prepareStatement(query);
		
		pstmt.setInt(1,2000);
		pstmt.setString(2,"Geetha");
		
		
		int count=pstmt.executeUpdate();
		
		System.out.println(count+ " rows affected");
	}
}
