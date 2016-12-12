package gui;

import java.util.ArrayList;

import database.Message;

public class DisplayMessage {
	
	private ArrayList <Message> messageList;

		
	public DisplayMessage() {
	
	
	}

	public ArrayList<Message> getMessageList() {
		return messageList;
	}

	public void setMessageList(ArrayList<Message> messageList) {
		this.messageList = messageList;
	}

	@Override
	public String toString() {
		return "DisplayMessage [messageList=" + messageList + "]";
	}
	
	public void createMessageFrame(){
		
	}
	
	

}
