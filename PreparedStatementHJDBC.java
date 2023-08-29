package com.learn.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementHJDBC {
	public static void main(String... args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Owner";

		String name = "root";
		String password = "root123";

		Connection con = DriverManager.getConnection(url, name, password);

		String query = "INSERT INTO Details VALUES (?,?)";

		PreparedStatement pstmt = con.prepareStatement(query);

		pstmt.setInt(1, 800000);

		pstmt.setString(2, "Kavi");

		pstmt.setInt(1, 4000000);

		pstmt.setString(2, "John Mathew");

		pstmt.setInt(1, 600000);

		pstmt.setString(2, "Geetha");

		pstmt.setInt(1, 1200000);

		pstmt.setString(2, "Seetha");
		pstmt.setInt(1, 1000000);

		pstmt.setString(2, "Ram");

		int count = pstmt.executeUpdate();

		System.out.println(count + " rows affected");
	}

}
