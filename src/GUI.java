/**
* Simple login GUI
* @authorLucas Haase
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	
	// component initialization
	// Add items to JPanel -> add to JFrame
	
	public static JPanel panel;
	public static JFrame frame;
	public static JLabel label;
	public static JTextField userText;
	public static JLabel passwordLabel;
	public static JPasswordField passwordText;
	public static JLabel success;
	public static JButton button;
	

	public static void main(String[] args) {
		
		// panel everything will get added to
		panel = new JPanel();
		panel.setLayout(null);
		
		// frame the panel will get added to
		frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		// user name label
		label = new JLabel("User");
		label.setBounds(10, 20, 80, 25);
		panel.add(label);
		
		// user name text field
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165,25);
		panel.add(userText);
		
		// password text label
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		// password text field
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		// login button
		button = new JButton("Login");
		button.setBounds(10, 100, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		// login notification
		success = new JLabel("");
		success.setBounds(10, 120, 150, 25);
		panel.add(success);
		
		
		frame.add(panel);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Clicked");
		
		String user = userText.getText();
		@SuppressWarnings("deprecation")
		String password = passwordText.getText();
		System.out.println(user + ", " + password);
		
		
		if(user.equals("lucas") && password.equals("pass")) {
			success.setText("Login Successful!");
			System.out.println("Success");
		}
		
	}
	
	

}
