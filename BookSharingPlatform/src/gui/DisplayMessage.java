package gui;

import java.util.ArrayList;

import database.Message;

public class DisplayMessage {
	
	private ArrayList <Message> messageList;

		
	public DisplayMessage(ArrayList<Message> messageList) {
	
		this.messageList = messageList;
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
	
	

}
