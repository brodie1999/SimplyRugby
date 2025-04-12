package SimplyRugby;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.Panel;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;
/**
 * The Class LoginHome.
 */
public class LoginHome extends JFrame implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3653406075423810518L;
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The txt password. */
	private JTextField txtPassword;
	
	/** The txt username. */
	private JTextField txtUsername;
	
	/** The my controller. */
	private Controller myController;
	
	/** The my user. */
	UserManager myUser;
	
	/**
	 * Validate input.
	 *
	 * @return true, if successful
	 */
	// Validates login input. Returns Boolean
	private boolean validateInput() {
		boolean retval = true;
		// If nothing is entered display error message
		if(txtUsername.getText().equals("") && txtPassword.getText().equals("")) { 
			 retval = false;
		}
			return retval;
	}
	
	/**
	 * Display message.
	 *
	 * @param message the message
	 */
	private void displayMessage(String message) { 
		JOptionPane.showMessageDialog(this, message);
	}
	
	/**
	 * Instantiates a new login home.
	 *
	 * @param controllerInstance the controller instance
	 */
	public LoginHome(Controller controllerInstance) {
		
	
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				myController.handleWindowClosed("LoginHome");					
			}
		});
		
		myController = controllerInstance; 		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		Panel loginPanel = new Panel();
		loginPanel.setBackground(new Color(0, 0, 102));
		loginPanel.setBounds(0, 0, 349, 453);
		contentPane.setLayout(null);
		contentPane.add(loginPanel);
		loginPanel.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		try { // If a user is not found, NullPointerException can occur. 
			btnLogin.addActionListener(new ActionListener() {				
				public void actionPerformed(ActionEvent e) {
					// Validate user input
					boolean result = validateInput();
					if (result) { // If login is successful, login user 
						boolean retval = myController.performLoginRequest(txtUsername.getText(), txtPassword.getText());						
						if (retval) { 
							dispose();
						} else { // If login failed output error message
							displayMessage("Login failed - try again!");
							txtUsername.setText("");
							txtPassword.setText("");
						}
					} else { // If no data is entered, dispay error message
						displayMessage("Enter a username or password befoe clicking this button");
					}
				}
			});
		} catch(NullPointerException e) { 
			displayMessage("Error - User not found!");
			return;
		}
		btnLogin.setBounds(125, 253, 89, 23);
		loginPanel.add(btnLogin);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(65, 209, 210, 20);
		loginPanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(65, 147, 210, 20);
		loginPanel.add(txtUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblPassword.setBounds(125, 178, 89, 20);
		loginPanel.add(lblPassword);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblUsername.setBounds(125, 121, 89, 20);
		loginPanel.add(lblUsername);
		
		JLabel lblNewLabel_1 = new JLabel("Simply Rugby");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 329, 57);
		loginPanel.add(lblNewLabel_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				dispose();
			}
		});
		btnExit.setBounds(125, 399, 89, 43);
		loginPanel.add(btnExit);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 0, 51));
		panel_1.setBounds(349, -19, 428, 472);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-306, 11, 777, 461);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("images\\800px-New_Zealand_vs_South_Africa_2006_Tri_Nations_Line_Out.jfif"));		
	}
}