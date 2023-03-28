package LoginSys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login 
{

	private JFrame frame;
	private JTextField textUserName;
	private JTextField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		frame.setBounds(0, 0, 2450, 1300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 100, 0));
		panel.setBounds(300, 85, 1136, 150);
		frame.getContentPane().add(panel);
		
		JLabel lblLoginSystemIn = new JLabel("Login System in Eclipes");
		lblLoginSystemIn.setForeground(new Color(139, 0, 0));
		lblLoginSystemIn.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		lblLoginSystemIn.setBackground(new Color(255,225, 111,111));
		panel.add(lblLoginSystemIn);
		
		JLabel lblUserName = new JLabel("UserName");
		lblUserName.setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		lblUserName.setForeground(Color.BLUE);
		lblUserName.setBackground(Color.PINK);
		lblUserName.setBounds(223, 261, 186, 58);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setBackground(Color.PINK);
		lblPassword.setBounds(223, 341, 402, 58);
		frame.getContentPane().add(lblPassword);
		
		textUserName = new JTextField();
		textUserName.setForeground(Color.GREEN);
		textUserName.setBackground(Color.GRAY);
		textUserName.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		textUserName.setBounds(445, 261, 1060, 100);
		frame.getContentPane().add(textUserName);
		textUserName.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setForeground(Color.GREEN);
		textPassword.setBackground(Color.GRAY);
		textPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		textPassword.setBounds(445, 341, 1060, 100);
		frame.getContentPane().add(textPassword);
		textPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//@@@@@@@@@@@@@@@@@@@@@@@@@@@
				String Password = textPassword.getText();
				String UserName = textUserName.getText();
				if(Password.contains("Hassn")&& UserName.contains("John"))
				{
					textPassword.setText(null);
					textUserName.setText(null);
				}
				else {
					JOptionPane.showMessageDialog(null, " invaild the Login System", "Erorro the Message",
							JOptionPane.ERROR_MESSAGE);
					//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@22
				}
			}
		});
		btnLogin.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		btnLogin.setBounds(223, 502, 450, 200);
		frame.getContentPane().add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textPassword.setText(null);
				textUserName.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		btnClear.setBounds(672, 504, 440, 200);
		frame.getContentPane().add(btnClear);
		
		
		//##################################################
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				frame = new JFrame(" Exit");
				if(JOptionPane.showConfirmDialog(frame, " Confrim if want to Exit","Or Print System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		btnExit.setBounds(1111, 502, 410, 200);
		frame.getContentPane().add(btnExit);
	}
}
