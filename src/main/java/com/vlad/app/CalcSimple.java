package com.vlad.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcSimple {

	private JFrame frmCalcsimple;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JButton btnEquals;
	private JTextField textField4;
	


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcSimple window = new CalcSimple();
					window.frmCalcsimple.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcSimple() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalcsimple = new JFrame();
		frmCalcsimple.setTitle("CalcSimple");
		frmCalcsimple.setBounds(100, 100, 298, 364);
		frmCalcsimple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalcsimple.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(106, 46, 166, 32);
		frmCalcsimple.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(106, 102, 166, 32);
		frmCalcsimple.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(106, 159, 166, 32);
		frmCalcsimple.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		btnEquals = new JButton("\u041A\u043B\u0430\u0446");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double firstNum=Double.parseDouble(textField1.getText());
				double secondNum=Double.parseDouble(textField3.getText());
				String operation=textField2.getText().toString();
				
				double res;
				CalcAPI cl = new CalcAPI();
				res=cl.Calc(firstNum, secondNum, operation);
				

				textField4.setText("" +res);

			}
		});
		btnEquals.setBounds(95, 270, 89, 23);
		frmCalcsimple.getContentPane().add(btnEquals);
		
		JLabel label = new JLabel("\u041F\u0435\u0440\u0432\u043E\u0435 \u0447\u0438\u0441\u043B\u043E");
		label.setBounds(10, 51, 86, 23);
		frmCalcsimple.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0412\u0442\u043E\u0440\u043E\u0435 \u0447\u0438\u0441\u043B\u043E");
		label_1.setBounds(10, 168, 86, 14);
		frmCalcsimple.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0417\u043D\u0430\u043A");
		label_2.setBounds(10, 111, 46, 14);
		frmCalcsimple.getContentPane().add(label_2);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(106, 212, 166, 32);
		frmCalcsimple.getContentPane().add(textField4);
		
		JLabel label_3 = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442");
		label_3.setBounds(10, 221, 86, 14);
		frmCalcsimple.getContentPane().add(label_3);
	}
}
