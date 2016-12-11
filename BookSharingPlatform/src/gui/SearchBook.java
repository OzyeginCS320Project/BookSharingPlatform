package gui;

public class SearchBook {
	String bookName;
	boolean isExist;



	public SearchBook(String bookName, boolean isExist) {
		this.bookName = bookName;
		this.isExist = isExist;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public boolean isExist() {
		return isExist;
	}
	public void setExist(boolean isExist) {
		this.isExist = isExist;
	}

	public String toString() {
		return "SearchBook [bookName=" + bookName + ", isExist=" + isExist + "]";
	}

	public void searchBook(String bookName){

	}
	public void display(){

	}
	public void sendRequest(){

	}

}
