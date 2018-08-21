package com.senac.exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Atividade2 {

	private JFrame frame;
	private JTextField textField_1;
	private JLabel lblDigiteAqui;
	private JLabel lblResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade2 window = new Atividade2();
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
	public Atividade2() {
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
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				lblResposta.setText(textField_1.getText());
			}
		});
		textField_1.setBounds(73, 22, 363, 25);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblDigiteAqui = new JLabel("Nomẹ");
		lblDigiteAqui.setBounds(12, 27, 88, 15);
		frame.getContentPane().add(lblDigiteAqui);
		
		lblResposta = new JLabel("Resposta");
		lblResposta.setBounds(12, 110, 424, 25);
		frame.getContentPane().add(lblResposta);
	}

}
