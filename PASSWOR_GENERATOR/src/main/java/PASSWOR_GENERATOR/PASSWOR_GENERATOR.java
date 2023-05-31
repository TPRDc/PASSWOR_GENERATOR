package PASSWOR_GENERATOR;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class PASSWOR_GENERATOR {

	private JFrame frame;
	private JTextField txtResult;
	
	/**
	 * Create the application.
	 */
	public PASSWOR_GENERATOR() {
		initialize();
	}
	
	public void passgenerator(int length) {
		String validChar="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder st =new StringBuilder();
		Random rand =new Random();
		while(0<length--) {
			st.append(validChar.charAt(rand.nextInt(validChar.length())));
		}
		txtResult.setText(st.toString());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setTitle("Password Generator");
		frame.setBounds(100, 100, 308, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password Generator");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(46, 11, 210, 52);
		frame.getContentPane().add(lblNewLabel);
		
		txtResult = new JTextField();
		txtResult.setForeground(new Color(0, 255, 0));
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtResult.setBounds(30, 86, 239, 35);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JCheckBox chckbx6Character = new JCheckBox("6 Character Password");
		chckbx6Character.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbx6Character.setForeground(new Color(255, 255, 255));
		chckbx6Character.setBackground(new Color(0, 0, 128));
		chckbx6Character.setToolTipText("Generae A Password 6 Character Long");
		chckbx6Character.setBounds(63, 144, 162, 23);
		frame.getContentPane().add(chckbx6Character);
		
		JCheckBox chckbx10Character = new JCheckBox("10 Character Password");
		chckbx10Character.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbx10Character.setBackground(new Color(0, 0, 128));
		chckbx10Character.setForeground(new Color(255, 255, 255));
		chckbx10Character.setToolTipText("Generae A Password 10 Character Long");
		chckbx10Character.setBounds(63, 181, 162, 23);
		frame.getContentPane().add(chckbx10Character);
		
		JCheckBox chckbx12Character = new JCheckBox("12 Character Password");
		chckbx12Character.setBackground(new Color(0, 0, 128));
		chckbx12Character.setForeground(new Color(255, 255, 255));
		chckbx12Character.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbx12Character.setToolTipText("Generae A Password 12 Character Long");
		chckbx12Character.setBounds(63, 218, 162, 23);
		frame.getContentPane().add(chckbx12Character);
		
		JButton btnNewButton = new JButton("Generate");
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setToolTipText("Generate");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbx6Character.isSelected()) {
					passgenerator(6);
					chckbx6Character.setSelected(false);
				}else if(chckbx10Character.isSelected()) {
					passgenerator(10);
					chckbx10Character.setSelected(false);
				}else if(chckbx12Character.isSelected()) {;
					passgenerator(12);
					chckbx12Character.setSelected(false);
				}else {
					passgenerator(8);
					chckbx6Character.setSelected(false);
					chckbx10Character.setSelected(false);
					chckbx12Character.setSelected(false);
				}
			}
		});
		btnNewButton.setBounds(93, 265, 104, 35);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 272, 52);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		}
	
		/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PASSWOR_GENERATOR window = new PASSWOR_GENERATOR();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	}



