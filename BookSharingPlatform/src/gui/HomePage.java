package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class HomePage {


	private JTextField userId;
	private JPasswordField passcode;

	private JLabel userLabel;
	private JLabel passwordLabel;

	private String username;
	private String password;

	private JFrame frame;

	static JButton displayBooksButton;

	static JButton displayMessageButton;

	static JButton searchBookButton;

	private JPanel optionPanel;

	private JLabel welcome;

	private JPanel textPanel;

	



	public void createLoginPage(){
		userId = new JTextField();
		passcode = new JPasswordField();

		userLabel=new JLabel("Username");
		passwordLabel=new JLabel("Password");
		final JComponent[] components = new JComponent[] {	userLabel,	userId,passwordLabel,passcode	};

		JOptionPane.showMessageDialog(null, components, "Login",  JOptionPane.PLAIN_MESSAGE);

		username=userId.getText();

		password =  new String(passcode.getPassword());
		if(checkValidationOfUser( username, password)) createHomePage();

	}



	//USERNAME AND PASSWORD CHECK-- hangi package?

	public boolean checkValidationOfUser(String username,String password){

		return true;
	}



	public void createHomePage(){

		frame =new JFrame("Book Sharing Platform");
		frame.setVisible(true);
		frame.setSize(700, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		optionPanel = new JPanel();
		textPanel=new JPanel();
		optionPanel.setBackground(Color.GRAY);

		welcome=new JLabel("WELCOME "+username.toUpperCase()+" !");
		welcome.setForeground(Color.PINK);
		welcome.setFont(new Font("Courier New", Font.BOLD, 50));

		displayBooksButton =new JButton("Display Your Books");
		displayBooksButton.setSize(100,100);
		displayMessageButton =new JButton("Display Your Messages");
		searchBookButton =new JButton("Search a Book");
	

		frame.add(optionPanel,BorderLayout.SOUTH);
		frame.add(textPanel,BorderLayout.NORTH);
		textPanel.add(welcome);

		optionPanel.add(displayBooksButton,new GridLayout());
		optionPanel.add(displayMessageButton);
		
		optionPanel.add(searchBookButton);
		
		displayBooksButton.addActionListener(new ButtonClicked());
		displayMessageButton.addActionListener(new ButtonClicked());
		searchBookButton.addActionListener(new ButtonClicked());

		

	}
}
