package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainSQLite {
	public static Connection Connector(){
		try{
			//connects to sqlite
			Class.forName("org.sqlite.JDBC");
			Connection conn =DriverManager.getConnection("jdbc:sqlite:/test.sqlite");
			return conn;
		} 
		catch (Exception e) { 
			System.out.println(e);
			return null;
		}
		
	}

}
