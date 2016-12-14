package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import database.Message;

public class DisplayMessage {

	private ArrayList <Message> messageList=null;
	private JFrame messageFrame;
	private JPanel messagePanel;
	private JPanel buttonPanel;
	private JLabel emptyLabel;
	private JLabel messageLabel;
	private static JButton acceptButton;
	private static JButton denyButton;
	private static String username;

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

	public void displayMessageFrame(String user){
		username=user;
		messageFrame = new JFrame(username.toUpperCase()+" - MESSAGES");
		messagePanel= new JPanel();

		if(messageList==null){

			emptyLabel =new JLabel("<html>YOU DO NOT <br> HAVE ANY<br> MESSAGES YET,<br> SO YOU CANNOT <br>ACCEPT OR DENY <br>ANY REQUESTS.<html>");
			emptyLabel.setForeground(Color.black);
			emptyLabel.setFont(new Font("Courier New", Font.BOLD, 50));
			messagePanel.add(emptyLabel);
		}
		else {
			for (int i=0;i<messageList.size();i++){
				messageLabel =new JLabel(messageList.get(i).toString());	
				messagePanel.add(messageLabel);
			}
		}


		messageFrame.setVisible(true);
		messageFrame .add(messagePanel);
		messageFrame .setSize(500, 500);


		buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		messageFrame.getContentPane().add(messagePanel, BorderLayout.CENTER);
		messageFrame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

addOptions();
		
		messagePanel.setBackground(Color.MAGENTA);
		buttonPanel.setBackground(Color.darkGray);

	}

	public void addOptions() {

		acceptButton = new JButton("ACCEPT BOOK REQUEST");
		denyButton = new JButton("DENY BOOK REQUEST");

		acceptButton.addActionListener(new ButtonClicked());
		denyButton.addActionListener(new ButtonClicked());


		buttonPanel.add(acceptButton);
		buttonPanel.add(denyButton);
		
	}

	public static JButton getDenyButton() {
		// TODO Auto-generated method stub
		return denyButton;
	}
	public static JButton getAcceptButton() {
		// TODO Auto-generated method stub
		return acceptButton;
	}


}
