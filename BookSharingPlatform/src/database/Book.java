package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Book {

	private String title;
	private String author;
	private String userId;
	private int page;


	public Book( String userId,String title, String author, int page) {
		
		this.title = title;
		this.author = author;
		this.userId = userId;
		this.page = page;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	  
	public String toString(Book book){
		return "Insert Into booklist Values ( '"+book.getUserId()+"','"+book.getAuthor()+"','"
	+book.getTitle()+"',"+","+book.getPage();
	}

  public void addBook(Book book){
	  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   final String DB_URL = "jdbc:mysql://localhost:3306/booksharingplatform";

	   //  Database credentials 
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL,"root",	"");
	      System.out.println("Connected database successfully...");
	      
	     stmt = conn.createStatement();
	   
	      // write a query //
	      
	     String sql = book.toString();
//	                   
	     stmt.executeUpdate(sql);
	      System.out.println("Done !!");
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	        	 
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Book Inserted !!");
	  }
  
  public void removeBook(Book b){
	  
  }
  
  public void displayBooks(){
	  
  }

}
