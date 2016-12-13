package gui;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClicked implements ActionListener {

	

	@Override
	public void actionPerformed(ActionEvent event) {
		 		
		
		if(event.getSource()==HomePage.getDisplayBookButton()) {
			
		//	DisplayBook frame
		DisplayBook books=new DisplayBook();
			books.createBookFrame(HomePage.getUsername());
			
		}
		
		if(event.getSource()==HomePage.getDisplayMessageButton()){
					
	DisplayMessage messages = new DisplayMessage();
			messages.createMessageFrame(HomePage.getUsername());
			
		}
		if(event.getSource()==HomePage.getSearchBookButton()){
			
			// Search Book Frame
			
			SearchBook search=new SearchBook();
			search.displaySearchScreen();
									
		}
		
		if(event.getSource()==DisplayMessage.getAcceptButton()){
		
	
			// if user accepts
		}
		
		if(event.getSource()==DisplayMessage.getDenyButton()){

			// if user denies
		}
		
				
		
		if(event.getSource()==DisplayBook.getAddBook()){
			//if user wants to add new book
			
			DisplayBook book=new DisplayBook();
			book.createAddBookFrame();
		}
		
		if(event.getSource()==DisplayBook.getRemoveBook()){
			//if user wants to remove book
			
			DisplayBook book=new DisplayBook();
			book.createRemoveBookFrame();
		}
	}
	
	
	
	

	
}
