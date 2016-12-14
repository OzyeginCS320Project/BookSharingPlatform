package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import database.user;


public class HomePage {


	private JTextField userId;
	private JPasswordField passcode;

	private JLabel userLabel;
	private JLabel passwordLabel;

	private static String username;
	private String password;

	private JFrame frame;

	static JButton displayBooksButton;

	static JButton displayMessageButton;

	static JButton searchBookButton;

	private JPanel optionPanel;

	private JLabel welcome;

	private JPanel textPanel;


	public void displayLoginPage(){
		
		createLoginPage();
		username=userId.getText();
		password =  new String(passcode.getPassword());
		user user =new user(username,password);
		if(	user.getIsValidUser()) displayHomePage();

	}


	public void createLoginPage() {
		
		userId = new JTextField();
		passcode = new JPasswordField();
		userLabel=new JLabel("Username");
		passwordLabel=new JLabel("Password");
		final JComponent[] components = new JComponent[] {	userLabel,	userId,passwordLabel,passcode	};
		JOptionPane.showMessageDialog(null, components, "Login",  JOptionPane.PLAIN_MESSAGE);

	}


	public void displayHomePage(){

		createHomePage();
		createOptions();
		addOptions();
		textPanel.setBackground(Color.white);
		optionPanel.setBackground(Color.darkGray);
		enableOptions();


	}


	public void addOptions() {
		frame.add(optionPanel,BorderLayout.SOUTH);
		frame.add(textPanel,BorderLayout.CENTER);
		textPanel.add(welcome);

		optionPanel.add(displayBooksButton,new GridLayout());
		optionPanel.add(displayMessageButton);
		optionPanel.add(searchBookButton);

	}


	public void enableOptions() {

		displayBooksButton.addActionListener(new ButtonClicked());
		displayMessageButton.addActionListener(new ButtonClicked());
		searchBookButton.addActionListener(new ButtonClicked());


	}


	public void createOptions() {
		displayBooksButton =new JButton("Display Your Books");
		displayBooksButton.setBackground(Color.PINK);
		displayMessageButton =new JButton("Display Your Messages");
		displayMessageButton.setBackground(Color.pink);
		searchBookButton =new JButton("Search a Book");
		searchBookButton.setBackground(Color.pink);
	}


	public void createHomePage() {

		frame =new JFrame("BOOK SHARING PLATFORM");
		frame.setVisible(true);
		frame.setSize(700, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		optionPanel = new JPanel();
		textPanel=new JPanel();

		welcome=new JLabel("WELCOME "+username.toUpperCase()+" !");
		welcome.setForeground(Color.BLUE);
		welcome.setFont(new Font("Courier New", Font.BOLD, 50));


	}


	public static String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public static JButton getSearchBookButton() {
		// TODO Auto-generated method stub
		return searchBookButton;
	}



	public static JButton getDisplayMessageButton() {
		// TODO Auto-generated method stub
		return displayMessageButton;
	}



	public static JButton getDisplayBookButton() {
		// TODO Auto-generated method stub
		return displayBooksButton;
	}
}
