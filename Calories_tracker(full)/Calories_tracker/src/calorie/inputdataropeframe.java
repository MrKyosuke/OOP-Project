package calorie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class inputdataropeframe extends input {

	public static int time, h, m, s, distance, icon = 3;
	public static double burned;
	public inputdataropeframe(String age, String gender, String height, String weight){
		super(age, gender, height, weight);

    }
	
	private JPanel contentPane;
	private static JTextField txtExerciseChosen;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	
	static int temp_weight;
    public static void go(ArrayList<input> data_user) {
		int temp_age = Integer.parseInt(data_user.get(0).age);
		String temp_gender = data_user.get(0).gender;
		int temp_height = Integer.parseInt(data_user.get(0).height);
		temp_weight = Integer.parseInt(data_user.get(0).weight);
		System.out.println(temp_age);
		System.out.println(temp_gender);
		int BMR;
		if(temp_gender.equals("Male")) {
			BMR = (10*temp_weight)+(6*temp_height)-(5*temp_age)+5;
		}else BMR = (10*temp_weight)+(6*temp_height)-(5*temp_age)-161;
		
	}
    public static void ahay() {
    	h = Integer.parseInt(textField.getText())*60;
    	m = Integer.parseInt(textField_1.getText());
    	s = Integer.parseInt(textField_2.getText())/60;
    	time = h+m+s;
    	distance = Integer.parseInt(txtExerciseChosen.getText());
    	burned = (time*(10*3.5*temp_weight)/200);
    	System.out.println(burned);
    }

	/**
	 * Launch the application.
	 */
	JFrame frame = new JFrame();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inputdatarunframe frame = new inputdatarunframe();
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
	public inputdataropeframe() {
		setTitle("Input Data");
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 604);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtExerciseChosen = new JTextField();
		txtExerciseChosen.setBounds(182, 395, 280, 42);
		contentPane.add(txtExerciseChosen);
		txtExerciseChosen.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Exercise Chosen :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(29, 24, 165, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblDistancemeter = new JLabel("Jump (Count) :");
		lblDistancemeter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDistancemeter.setBounds(29, 394, 165, 36);
		contentPane.add(lblDistancemeter);
		
		JLabel lblTimehourminutesecond = new JLabel("Time (Hour/Minute/Second) :");
		lblTimehourminutesecond.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTimehourminutesecond.setBounds(29, 282, 269, 36);
		contentPane.add(lblTimehourminutesecond);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(39, 329, 81, 42);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 329, 81, 42);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(237, 329, 81, 42);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(125, 329, 7, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(222, 328, 7, 36);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(29, 64, 200, 210);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(-13, -45, 365, 312);
		lblNewLabel_3.setIcon(new ImageIcon(inputdataropeframe.class.getResource("/calorie/img/rope(2).png")));
		panel.add(lblNewLabel_3);
		
		JLabel label = new JLabel("New label");
		label.setBounds(130, 104, 49, 14);
		panel.add(label);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ahay();
				result.res(time, burned, icon);
				result result = new result();
				result.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(174, 468, 180, 64);
		contentPane.add(btnNewButton);
	}
}
