package gui;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SearchBook {
	String bookName;
	boolean isExist=false;
	private JTextField bookNameText;
	private JLabel bookLabel;

	public SearchBook() {
		
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

	public void displaySearchScreen(){
		bookNameText = new JTextField();
		
		bookLabel=new JLabel("Which book whould you like to look for");

		final JComponent[] components = new JComponent[] {	bookLabel,bookNameText};

		JOptionPane.showMessageDialog(null, components, "Search For A Book",  JOptionPane.PLAIN_MESSAGE);

		bookName=bookNameText.getText();
		
		//display();


	}
	public void display(){
		if (!isExist){
			displayWarningMessage();
		}

	}
	private void displayWarningMessage() {
		displaySearchScreen();
		
	}

	public void sendRequest(){

	}


}
