package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ButtonClicked extends HomePage implements ActionListener {

	
	private JTextField bookNameText;
	private JLabel bookLabel;
	private String bookName;

	@Override
	public void actionPerformed(ActionEvent event) {
		 
		if(event.getSource()==displayBookButton) {
		//	DisplayBook frame
		}
		
		if(event.getSource()==displayMessageButton){
					
			DisplayMessage messages = new DisplayMessage();
			messages.createMessageFrame();
			
		}
		if(event.getSource()==searchBookButton){
			
			// Search Book Frame
			
			bookNameText = new JTextField();
			
			bookLabel=new JLabel("Which book whould you like to look for");
	
			final JComponent[] components = new JComponent[] {	bookLabel,bookNameText};

			JOptionPane.showMessageDialog(null, components, "Search For A Book",  JOptionPane.PLAIN_MESSAGE);

			bookName=bookNameText.getText();

			
			SearchBook search=new SearchBook(bookName);
	
				
		
			
		
		
		}
	}

}
