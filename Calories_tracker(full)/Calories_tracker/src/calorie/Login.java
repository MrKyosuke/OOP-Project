package calorie;

import java.awt.BorderLayout;
import java.io.FileReader;
import java.io.BufferedReader;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usrn = textField.getText();
				String pass = String.valueOf(passwordField.getPassword());
				try {
					BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
					boolean bool = false;
					String line = reader.readLine();
					while(line != null) {
						String check_user = line.split(" ")[0];
						String check_pass = line.split(" ")[1];
						if(usrn.equals(check_user) && pass.equals(check_pass)) {
							bool = true;
							JOptionPane.showMessageDialog(null, "Success");	
							input input = new input();
							input.setVisible(true);
							dispose();
							break;
						}
						line = reader.readLine();
					}
					reader.close();
					if(!bool) {
						JOptionPane.showMessageDialog(null, "Wrong Username or Password","ERROR", JOptionPane.WARNING_MESSAGE);
						dispose();
						new Login().setVisible(true);
					}
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Failed");
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(386, 256, 120, 27);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(412, 84, 192, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel.setBounds(293, 75, 109, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblPassword.setBounds(293, 145, 109, 36);
		contentPane.add(lblPassword);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 260, 363);
		contentPane.add(panel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(412, 154, 192, 27);
		contentPane.add(passwordField);
	}
}