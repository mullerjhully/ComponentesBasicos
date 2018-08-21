package com.senac.exemplos;

import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Atividade3 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade3 window = new Atividade3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Atividade3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(12, 30, 88, 15);
		frame.getContentPane().add(lblNumero);
		
		JLabel label = new JLabel("Resposta");
		label.setBounds(12, 124, 424, 25);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String resposta = "";
				char[] charArray = textField.getText().toCharArray();
				for (char c : charArray) {
					if (Character.isDigit(c)) {
						resposta += c;
					}
				}
				label.setText(resposta);
			}
		});
		textField.setColumns(10);
		textField.setBounds(36, 67, 363, 25);
		frame.getContentPane().add(textField);
		
		
	}

}
