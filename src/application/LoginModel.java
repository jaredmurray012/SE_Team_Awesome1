package application;

import java.sql.*;

public class LoginModel {

	//connect to sqlite
	Connection conection;
	public LoginModel (){
		conection = MainSQLite.Connector();
		if (conection == null) System.exit(1);
	}
	
	public boolean isDbConnected(){
		try{
			return !conection.isClosed();
		}
		catch (SQLException e){
			e.printStackTrace();
		
		return false;
	}
	}
	
	public boolean isLogin(String user, String pass) throws SQLException{
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		//database will be pulled from here
		String query = "database goes here";
		try{
			preparedStatement = conection.prepareStatement(query);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pass);
			
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()){
				return true;
			}
			else { 
				return false;
			}
		}
		catch (Exception e){
			return false;
			
		}
		finally {
			preparedStatement.close();
			resultSet.close();
		}
	}
}
