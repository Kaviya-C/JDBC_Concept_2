package com.learn.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletePreparestatementJDBC {
	public static void main(String... args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Owner";

		String name = "root";
		String password = "root123";

		Connection con = DriverManager.getConnection(url, name, password);

		String query = "Delete From Details where name=?";

		PreparedStatement pstmt = con.prepareStatement(query);

		pstmt.setString(1, "John Mathew");

		int count = pstmt.executeUpdate();

		System.out.println(count + " rows deleted");
	}
}

/*
 * 
 * executeQuery ---> select operations
 * 
 * executeUpdate ---> non-select operations
 * 
 * execute ----> both select and non-select operations
 * 
 * 
 */
