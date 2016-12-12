package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClicked extends HomePage implements ActionListener {

	
	@Override
	public void actionPerformed(ActionEvent event) {
		 
		if(event.getSource()==displayBookButton) {
		//	DisplayBook frame
		}
		
		if(event.getSource()==displayMessageButton){
			//DisplayMessageButton frame
			
		}
		if(event.getSource()==searchBookButton){
			
			// Search Book Frame
			
			searchBookButton.setBackground(Color.MAGENTA);
		
		}
	}

}
