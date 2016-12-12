package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClicked extends HomePage implements ActionListener {

	

	@Override
	public void actionPerformed(ActionEvent event) {
		 
		if(event.getSource()==displayBooksButton) {
			
		//	DisplayBook frame
			DisplayBook books=new DisplayBook();
			books.createBookFrame();
			
		}
		
		if(event.getSource()==displayMessageButton){
					
			DisplayMessage messages = new DisplayMessage();
			messages.createMessageFrame();
			
		}
		if(event.getSource()==searchBookButton){
			
			// Search Book Frame
			
			SearchBook search=new SearchBook();
			search.displaySearchScreen();
					
		
		
		}
	}

	

}
