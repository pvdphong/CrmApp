package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.java.connection.MysqlConnection;
import com.java.model.Job;

public class JobDao {
	public List<Job> findAll(){
		List<Job> models = new LinkedList<Job>();
		try {
			
			Connection connection = MysqlConnection.getConnection(); 
			String query = "SELECT * FROM crm_app.Jobs"; 
		
			PreparedStatement statement = connection.prepareStatement(query); 
		
			ResultSet resultSet = statement.executeQuery(); 
			
			while(resultSet.next()) {
				Job model = new Job(); 	
				model.setId(resultSet.getInt("id"));
				model.setName(resultSet.getString("name"));
				model.setStart_date(resultSet.getDate("start_date"));
				model.setEnd_date(resultSet.getDate("end_date"));
				
				models.add(model); 
			}
			
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return models;
	}
}
