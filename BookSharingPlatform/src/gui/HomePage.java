package gui;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class HomePage {
	
		private JTextField userId;
		private JPasswordField passcode;
		
		private JLabel userLabel;
		private JLabel passwordLabel;
		
		private String username;
		private String password;
		
		

	public String getUsername() {
			return username;
		}



		public void setUsername(String username) {
			this.username = username;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



	public void createLoginFrame(){
		userId = new JTextField();
		passcode = new JPasswordField();

		userLabel=new JLabel("Username");
		passwordLabel=new JLabel("Password");
		final JComponent[] components = new JComponent[] {	userLabel,	userId,passwordLabel,passcode	};

		JOptionPane.showMessageDialog(null, components, "Login",  JOptionPane.PLAIN_MESSAGE);

		username=userId.getText();

		password =  new String(passcode.getPassword());
	
		
	}
	
	
	
	//USERNAME AND PASSWORD CHECK-- hangi package?
	
	public boolean isValidUser(String username,String password){
		
		return false;
	}

}
