package gui;

import java.util.ArrayList;

import database.Book;

public class DisplayBook {
	
	private ArrayList<Book> bookList;
	private String bookName;
	
	public DisplayBook(ArrayList<Book> bookList, String bookName) {
		super();
		this.bookList = bookList;
		this.bookName = bookName;
	}

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "DisplayBook [bookList=" + bookList + ", bookName=" + bookName + "]";
	}
	
	public void display(ArrayList<Book> bookList){
		
	}
	
	public void accept(String bookName){
		
	}
	
	public void deny(String bookName){
		
	}

	

}
