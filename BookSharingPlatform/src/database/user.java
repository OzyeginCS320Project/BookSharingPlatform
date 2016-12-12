package database;

import java.sql.SQLException;

public class user {
	
	public int user_ID; 
	public String username;
	public String password;



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
        ResultSet results = Statement.executeQuery(queryString);

        while (results.nthext()) {
        String username = results.getString();
        String password =  results.getString();

           if ((username.equals(username)) && (password.equals(password))) {

              JOptionPane.showMessageDialog(null, "Username and Password exist");  
        }else {

         JOptionPane.showMessageDialog(null, "Please Check Username and Password ");
        }
        results.close();
    } 
	}  
        catch (SQLException sql) {

        out.println(sql);
	
	
}
    
	
}