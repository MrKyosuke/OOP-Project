//berikut adalah program page untuk memasukan biodata untuk user
package calorie;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class input extends JFrame {

	public ArrayList<input> data_user = new ArrayList<input>();
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
//untuk pemasukan data, terdiri dari age,gender,height dan weight untuk dimasukan oleh user
	public String age = "12";
    public String gender;
    public String height;
    public String weight;
 //apabila user telah memasukan input, user akan dibawa kedalam page inheritance dimana mereka akan memilih sport yang ingin diikuti   
    public void insert(ArrayList<input> data_user) {
    	data_user.clear();
    	age = textField.getText();
    	height = textField_1.getText();
    	weight = textField_2.getText();
    	input data = new input(age, gender, height, weight);
    	data_user.add(data);
		InheritanceFrame inherit = new InheritanceFrame();
		inherit.setVisible(true);
		dispose();
    }
    
    public input(String age, String gender, String height, String weight){
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }
	/**
	 * Launch the application.
	 */
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					input frame = new input();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//----------------------------------------------------------------------------------------------------------------------------------
	/**
	 * Create the frame -> format tampilan untuk user biodata input
	 */
	public input() {
		setTitle("Please input your data !");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
//----------------------------------------------------------------------------------------------------------------------------------
		//Berikut adalah bagian label/word dari input yang perlu diisi oleh user
		
		JLabel lblNewLabel = new JLabel("Age");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 40, 69, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gender");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(10, 99, 69, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Height (cm)");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(10, 160, 92, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Weight (kg)");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_1_2.setBounds(10, 228, 92, 29);
		contentPane.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(112, 46, 109, 23);
		contentPane.add(textField);
		textField.setColumns(10);
//----------------------------------------------------------------------------------------------------------------------------------
		//Berikut adalah bagian untuk menampilkan pilihan gender dari user
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnNewRadioButton.setBounds(112, 104, 69, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnFemale.setBounds(197, 102, 116, 23);
		contentPane.add(rdbtnFemale);
//----------------------------------------------------------------------------------------------------------------------------------
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(112, 160, 109, 23);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(112, 228, 109, 23);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Input");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnFemale.isSelected()) {
					gender = "Female";
				}
				else gender = "Male";
				insert(data_user);
				inputdatarunframe.go(data_user);
				inputdataropeframe.go(data_user);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnNewButton.setBounds(136, 300, 85, 21);
		contentPane.add(btnNewButton);
	}
	

}
