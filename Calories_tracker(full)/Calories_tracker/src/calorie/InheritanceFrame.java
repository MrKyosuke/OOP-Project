package calorie;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class InheritanceFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InheritanceFrame frame = new InheritanceFrame();
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
	public InheritanceFrame() {
		setBackground(new Color(255, 255, 255));
		setTitle("Choose Exercise");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 416);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Running");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputdatarunframe run = new inputdatarunframe();
				run.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(91, 280, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cycling");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputdatacycframe cyc = new inputdatacycframe();
				cyc.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(363, 280, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Rope Jumping");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputdataropeframe rope = new inputdataropeframe();
				rope.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(615, 280, 123, 23);
		contentPane.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(46, 51, 168, 218);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, -47, 185, 265);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(InheritanceFrame.class.getResource("/calorie/img/running.jpg")));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(583, 51, 168, 218);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBackground(SystemColor.textHighlight);
		lblNewLabel_2.setIcon(new ImageIcon(InheritanceFrame.class.getResource("/calorie/img/rope(2).png")));
		lblNewLabel_2.setBounds(-24, -39, 204, 285);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(320, 51, 168, 218);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(InheritanceFrame.class.getResource("/calorie/img/cycling.jpg")));
		lblNewLabel_1.setBounds(-17, -81, 233, 378);
		panel_1.add(lblNewLabel_1);
		
	}
}
