package database;

public class Book {

	private String title;
	private String author;
	private String userId;
	private int page;


	public Book(String title, String author, String userId, int page) {
		
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

  public void addBook(Book b){
	  
  }
  
  public void removeBook(Book b){
	  
  }
  
  public void displayBooks(){
	  
  }

}
