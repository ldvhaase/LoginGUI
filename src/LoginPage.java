import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	
	JTextField userIdField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JLabel userIDLbl = new JLabel("User");
	JLabel passwordLbl = new JLabel("Password");
	
	JLabel message = new JLabel("");	
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	LoginPage(HashMap<String, String> loginInfoOriginal){
		loginInfo = loginInfoOriginal;		
		
		userIDLbl.setBounds(50, 100, 75, 25);		
		passwordLbl.setBounds(50, 150, 75, 25);
		
		message.setBounds(125, 250, 250, 35);
		message.setFont(new Font(null, Font.ITALIC, 25));
		
		userIdField.setBounds(125, 100, 200, 25);
		userIdField.addActionListener(this);
		passwordField.setBounds(125, 150, 200, 25);
		passwordField.addActionListener(this);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.addActionListener(this);
		loginButton.setFocusable(false);
		
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.addActionListener(this);
		resetButton.setFocusable(false);
		
		frame.add(userIDLbl);
		frame.add(passwordLbl);
		frame.add(message);
		frame.add(userIdField);
		frame.add(passwordField);
		frame.add(loginButton);
		frame.add(resetButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// reset button pressed
		if (e.getSource() == resetButton) {
			userIdField.setText("");
			passwordField.setText("");
		}
		
		// login button pressed
		if(e.getSource() == loginButton || e.getSource() == userIdField || e.getSource() == passwordField) {
			String userID = userIdField.getText();
			String password = String.valueOf(passwordField.getPassword());
			
			// correct pass
			if(loginInfo.containsKey(userID)) {
				if (loginInfo.get(userID).equals(password)) {
					message.setForeground(Color.green);
					message.setText("Success!");
					frame.dispose();
					WelcomePage  wp = new WelcomePage(userIdField.getText());
				}
				else {
					message.setForeground(Color.red);
					message.setText("Wrong Password");
				}
			}
			else {
				message.setForeground(Color.red);
				message.setText("Username not found");
			}
		}
		
	}
	
}
