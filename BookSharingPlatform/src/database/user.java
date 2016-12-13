package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class user {

	private int user_ID; 
	private String username;
	private String password;

	public int getUserId(){
		return user_ID;	
	}
	public String getUserName(){
		return username;	
	}
	public String getPassword(){
		return password;	
	}

	public int displayUser1(String username,String password ) throws SQLException,ClassNotFoundException{

		try {
			String queryString = "SELECT 'username','password' FROM 'user'";
			ResultSet results =null; // Statement.executeQuery(queryString);

			while (results.next()) {
				username = results.getString(queryString);
				password =  results.getString(queryString);

				if ((username.equals(username)) && (password.equals(password))) {

					JOptionPane.showMessageDialog(null, "Username and Password exist");  
				}else {

					JOptionPane.showMessageDialog(null, "Please Check Username and Password ");
				}
				results.close();
			} 
		}  
		catch (SQLException sql) {

			System.out.println(sql);


		}
		return 0;//////////////Silinicek
	}}
