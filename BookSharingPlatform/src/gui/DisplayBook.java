package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import database.Book;



public class DisplayBook {

	private ArrayList<Book> bookList;
	private String bookName;
	private JFrame bookFrame;
	private JPanel bookPanel;
	private JPanel buttonPanel;
	private JTextField bookNameText;
	private JLabel bookLabel;
	private JTextField bookAuthorText;
	private JTextField bookPageText;
	private JLabel bookNameLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookPageLabel;
	private String bookAuthor;
	private int bookPage;
	private static JButton addBook;
	private static JButton removeBook;
	
	final String add ="ADD";

	

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
		
		buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		bookFrame.getContentPane().add(bookPanel, BorderLayout.NORTH);
		bookFrame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		
		 addBook = new JButton("ADD BOOK");
		 removeBook = new JButton("REMOVE BOOK");

		 addBook.addActionListener(new ButtonClicked());
		 removeBook.addActionListener(new ButtonClicked());
		 
		buttonPanel.add(addBook);
		buttonPanel.add(removeBook);

		
	}

	public static JButton getAddBook() {
		// TODO Auto-generated method stub
		return addBook;
	}
	public static JButton getRemoveBook() {
		// TODO Auto-generated method stub
		return removeBook;
		}

	public void createAddBookFrame() {
	
			bookNameText = new JTextField();
			bookAuthorText=new JTextField();
			bookPageText= new JTextField();
			
			bookNameLabel=new JLabel("Book Title");
			bookAuthorLabel=new JLabel("Author Name");
			bookPageLabel=new JLabel("Number of Pages");

			final JComponent[] components = new JComponent[] {	bookNameLabel,bookNameText,bookAuthorLabel,bookAuthorText,bookPageLabel,bookPageText};

			JOptionPane.showMessageDialog(null, components, "Which book whould you like to add?",  JOptionPane.YES_NO_CANCEL_OPTION);

			bookName=bookNameText.getText();
			bookAuthor=bookAuthorText.getText();
			bookPage=Integer.parseInt(bookPageText.getText());
			


		}
		
	}



