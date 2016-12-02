package application;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
public class DBConnect 
{
	
private static Connection conn;


DBConnect(String dbURL, String user, String password) throws SQLException
	{
	conn = java.sql.DriverManager.getConnection(dbURL, user, password);
	}

	
	public void CreateOrder() 
	{
		Date date = new Date();
		Statement myStmt = null;
		try {
			myStmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("the Create Order Connection failed");
			e.printStackTrace();
		}

		String sql = "insert into invoice (time_created) values (\"" + date.toString() + "\")";
		
		try {
			myStmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("the Create Order Statement failed");
			e.printStackTrace();
		}
	}
	
	public int OrderNumReturn()
	{
		Statement myStmt = null; 
		ResultSet  myRs = null; 
		int OrderID = 0;
		
		try {
			myStmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("the OrderNumReturn Connection failed");
			e.printStackTrace();
		}
		
		String sql = "select * from  invoice order by order_id desc limit 1";
		
		try {
			myRs = myStmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("the OrderNumReturn Statement failed");
			e.printStackTrace();
		} 
		
		try {
			if(myRs.next())
					{try {
				OrderID = myRs.getInt("order_ID");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("the OrderNumReturn getInt failed");
				e.printStackTrace();
			}}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return OrderID; 
	}
	public void InsertIntoOrderId(int UniqueItemId, double ItemPrice)
	{
		Statement myStmt = null; 
		int myRs = 0; 
		
		int OrderId = OrderNumReturn();
		int ItemID = UniqueItemId; //needs to be changed for each item 
		double ItemP = ItemPrice;
		
		try {
			myStmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("the OrderNumReturn Connection failed");
			e.printStackTrace();
		}
		
		String sql = "insert into ordered_item (Items_item_ID, Order_order_ID , item_price) values (" + ItemID  + " , " + OrderId + " , " 
				+ ItemP + ")";
		//insert into ordered_item (Order_Item_ID, Items_item_ID, Order_order_ID) Values ( 5, 215, 3); #some arbitary number from java 

		try {
			myRs = myStmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("the InsertIntoOrderId Function failed");
			e.printStackTrace();
		} 

	}
	public String DisplayOrder()
	{
		int CurrentOrderId = 0; 
		CurrentOrderId = OrderNumReturn(); 
		
		Statement myStmt = null; 
		ResultSet myRs = null; 
		StringBuilder StringPrint = new StringBuilder();
		
		String sql = "select * from ordered_item where Order_order_ID =" + CurrentOrderId;
		
		try {
			myStmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("the DisplayOrder Connection failed");
			e.printStackTrace();
		}
		
		try {
			myRs = myStmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("the DisplayOrder Statement failed");
			e.printStackTrace();
		}
		
		try {
			while(myRs.next())
			{
				StringPrint.append((myRs.getString("Items_item_ID")));
				StringPrint.append(" \n ");
				StringPrint.append((myRs.getString("item_price")));
			}
				
		} catch (SQLException e) {
			System.out.println("The Print statement for the order Id did not work");
			e.printStackTrace();
		}
		
		return StringPrint.toString();
	}
}


