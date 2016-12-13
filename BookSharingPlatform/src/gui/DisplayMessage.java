package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import database.Message;

public class DisplayMessage {

	private ArrayList <Message> messageList;
	private JFrame messageFrame;
	private JPanel messagePanel;
	private JPanel buttonPanel;
	private static JButton accept;
	private static JButton deny;


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
		messageFrame = new JFrame("MESSAGES");
		messagePanel= new JPanel();

		messageFrame.setVisible(true);
		messageFrame .add(messagePanel);
		messageFrame .setSize(500, 500);

		buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		messageFrame.getContentPane().add(messagePanel, BorderLayout.NORTH);
		messageFrame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);


		 accept = new JButton("ACCEPT");
		deny = new JButton("DENY");

		buttonPanel.add(accept);
		buttonPanel.add(deny);

	}

	public static JButton getDeny() {
		// TODO Auto-generated method stub
		return deny;
	}
	public static JButton getAccept() {
		// TODO Auto-generated method stub
		return accept;
	}

}
