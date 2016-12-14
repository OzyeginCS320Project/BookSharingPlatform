package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
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

	private ArrayList<Book> bookList=null;
	private String bookName;
	private JFrame bookFrame;
	private JPanel bookPanel;
	private JPanel buttonPanel;
	private JTextField bookNameText;
	private JTextField bookAuthorText;
	private JTextField bookPageText;
	private JLabel bookNameLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookPageLabel;
	private String bookAuthor;
	private int bookPage;
	private JLabel emptyLabel;
	private JLabel bookLabel;
	private static JButton addBook;
	private static JButton removeBook;
	private static String username;


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

	public void accept(String bookName){

	}

	public void deny(String bookName){

	}

	public void displayBookFrame(String user) {
		username=user;
		bookFrame = new JFrame(username.toUpperCase()+" - BOOKS");
		bookPanel= new JPanel();

		if(bookList==null){

			emptyLabel =new JLabel("<html>YOU DO NOT <br>HAVE ANY BOOKS <br>YET,SO YOU CAN<br> ADD BOOK BUT <br>YOU CANNOT <br>REMOVE ANY<html>");
			emptyLabel.setForeground(Color.black);
			emptyLabel.setFont(new Font("Courier New", Font.BOLD, 50));
			bookPanel.add(emptyLabel);
		}
		else {
			for (int i=0;i<bookList.size();i++){
				bookLabel =new JLabel(bookList.get(i).toString());	
				bookPanel.add(bookLabel);
			}
		}

		bookFrame.setVisible(true);
		bookFrame.add(bookPanel);
		bookFrame.setSize(500, 500);


		buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		bookFrame.getContentPane().add(bookPanel, BorderLayout.CENTER);
		bookFrame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

		addOptions();

		bookPanel.setBackground(Color.MAGENTA);
		buttonPanel.setBackground(Color.darkGray);


	}

	public void addOptions() {

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

		JOptionPane.showMessageDialog(null, components, "ADD BOOK TO YOUR LIST",  JOptionPane.YES_NO_CANCEL_OPTION);

		bookName=bookNameText.getText();
		bookAuthor=bookAuthorText.getText();
		bookPage=Integer.parseInt(bookPageText.getText());

		Book book=new Book(username,bookName,bookAuthor,bookPage);
		book.addBook(book);



	}


	public void createRemoveBookFrame() {

		bookNameText = new JTextField();

		bookNameLabel=new JLabel("Title of the book you want to remove");


		final JComponent[] components = new JComponent[] {	bookNameLabel,bookNameText};

		JOptionPane.showMessageDialog(null, components, "REMOVE BOOK",  JOptionPane.YES_NO_CANCEL_OPTION);

		bookName=bookNameText.getText();
		bookAuthor=bookAuthorText.getText();
		bookPage=Integer.parseInt(bookPageText.getText());

		Book book=new Book(username,bookName);
		book.removeBook(bookName);



	}
}



