package calorie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;

public class result extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					result frame = new result();
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
	static int time_result, iconed;
	static double burned_result;
	public static void res(int time, double burned, int icon) {
		time_result = time;
		burned_result = burned;
		iconed = icon;
	}
	
	public result() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 534);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input input = new input();
				input.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(146, 386, 133, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Burned Calories:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel.setBounds(96, 321, 133, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblTime.setBounds(119, 280, 54, 31);
		contentPane.add(lblTime);
		
		JLabel lblExerciseChosen = new JLabel("Exercise Chosen:");
		lblExerciseChosen.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblExerciseChosen.setBounds(146, 82, 145, 31);
		contentPane.add(lblExerciseChosen);
		
		JLabel lblUsername = new JLabel("Here is your result");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblUsername.setBounds(146, 39, 145, 31);
		contentPane.add(lblUsername);
		
		JPanel panel = new JPanel();
		panel.setBounds(99, 123, 220, 136);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 260, 150);
		panel.add(lblNewLabel_1);
		if(iconed == 1) {
			lblNewLabel_1.setIcon(new ImageIcon(result.class.getResource("/calorie/img/running.jpg")));
		}
		else if(iconed == 2) {
			lblNewLabel_1.setIcon(new ImageIcon(result.class.getResource("/calorie/img/cycling.jpg")));
		}
		else lblNewLabel_1.setIcon(new ImageIcon(result.class.getResource("/calorie/img/rope(2).png")));
		
		JLabel lblWaktu = new JLabel("waktu");
		lblWaktu.setText(Integer.toString(time_result)+" minutes");
		lblWaktu.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblWaktu.setBounds(176, 280, 259, 31);
		contentPane.add(lblWaktu);
		
		JLabel lblBurned = new JLabel("burned");
		lblBurned.setText(Double.toString(burned_result)+" kcal");
		lblBurned.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblBurned.setBounds(229, 321, 206, 31);
		contentPane.add(lblBurned);
	}
}