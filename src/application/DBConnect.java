package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect 
{
	
private static Connection conn;


DBConnect(String dbURL, String user, String password) throws SQLException
	{
	conn = java.sql.DriverManager.getConnection(dbURL, user, password);
	}
}