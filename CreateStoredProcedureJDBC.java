package com.learn.statement;

public class CreateStoredProcedureJDBC {

	/*
	 * DELIMITER //
	 * 
	 * CREATE PROCEDURE procedure_name(parameter1 datatype, parameter2 datatype,
	 * ...) BEGIN -- Procedure body (SQL statements) -- You can use the parameters
	 * in your SQL logic
	 * 
	 * -- Example: Select statement using a parameter SELECT column_name FROM
	 * table_name WHERE column_name = parameter1;
	 * 
	 * -- Example: Insert statement using parameters INSERT INTO table_name
	 * (column1, column2) VALUES (parameter1, parameter2);
	 * 
	 * -- Additional SQL statements
	 * 
	 * END //DELIMITER ;
	 * 
	 * 
	 * -------------------------------------------------------
	 *
	 * 
	 * 
	 * DELIMITER //
	 *  CREATE PROCEDURE GreatRevenue(IN rev INT) 
	 *  BEGIN 
	 *  SELECT * From details where revenue >rev;
	 * END//
	 * 
	 * HOW TO CALL THE STORED PROCEDURE IN MYSQL
	 * 
	 * CALL GreatRevenue(80000);
	 * 
	 * 
	 */

}
