package com.golx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.golx.entity.DatabaseParameters;
import com.golx.entity.Inventory;

public class InventoryDaoImpl implements InventoryDao {
	
	 public InventoryDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private DatabaseParameters databaseParameters;
	
	public void setDatabaseParameters(DatabaseParameters databaseParameters) {
		this.databaseParameters = databaseParameters;
	}
	public DatabaseParameters getDatabaseParameters() {
		return databaseParameters;
	}
	
	public Connection openConnection(){
		try {
			
			Class.forName(databaseParameters.getDcn());
			return DriverManager.getConnection(databaseParameters.getUrl(), databaseParameters.getUser(), databaseParameters.getPassword());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public static void closeConnection(Connection connection){
		try{
			if(connection !=null && !connection.isClosed()){
				connection.close();
		} }catch (Exception e) {
			e.printStackTrace();
		}
			
		}
	
public boolean addItem(Inventory inventory){
		

		try {
			Connection connection= openConnection();
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement("insert into inventory values(?,?,?,?,?)");
			preparedStatement.setInt(1, inventory.getUserId());
			preparedStatement.setInt(2, inventory.getItemId());
			preparedStatement.setString(3, inventory.getName());
			preparedStatement.setInt(4, inventory.getCategoryId());
			preparedStatement.setInt(5, inventory.getStatus());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			closeConnection(connection);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	
	}

public void deleteItem(int itemId) {
	try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}

}
