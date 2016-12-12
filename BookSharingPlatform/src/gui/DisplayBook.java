package gui;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import database.Book;

public class DisplayBook {

	private ArrayList<Book> bookList;
	private String bookName;
	private JFrame bookFrame;
	private JPanel bookPanel;

	

	public DisplayBook() {
		// TODO Auto-generated constructor stub
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

	public void createBookFrame() {
		bookFrame = new JFrame("BOOKS");
		bookPanel= new JPanel();

		bookFrame.setVisible(true);
		bookFrame.add(bookPanel);
		bookFrame.setSize(500, 500);
	}



}
