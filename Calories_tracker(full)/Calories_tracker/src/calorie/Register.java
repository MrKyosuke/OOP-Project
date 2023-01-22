package calorie;

import java.awt.EventQueue;
import java.io.FileWriter;
import java.io.Writer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usrn = textField_2.getText();
				String pass = String.valueOf(passwordField.getPassword());
				String conpass = String.valueOf(passwordField_1.getPassword());
				try {
					if(!pass.equals(conpass)){
						JOptionPane.showMessageDialog(null, "Conpass not same, try again","WARNING", JOptionPane.WARNING_MESSAGE);
						dispose();
						new Register().setVisible(true);
					}
					else {
						FileWriter Writer = new FileWriter("test.txt",true);
						Writer.write(""+usrn+" "+pass+" "+conpass);
						Writer.write(System.getProperty("line.separator"));
						Writer.close();
						JOptionPane.showMessageDialog(null, "Success");	
						Login login = new Login();
						login.setVisible(true);
						dispose();
					}
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Failed");
					e1.printStackTrace();
				}
				
			}
		});
		btnRegister.setBounds(386, 258, 136, 28);
		btnRegister.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(btnRegister);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(354, 80, 102, 29);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(354, 133, 97, 29);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		contentPane.add(lblPassword);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 260, 363);
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.BLUE);
		contentPane.add(panel);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblConfirmPassword.setBounds(270, 189, 189, 29);
		contentPane.add(lblConfirmPassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(469, 85, 157, 28);
		contentPane.add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(469, 138, 157, 28);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(469, 190, 157, 28);
		contentPane.add(passwordField_1);
	}
}