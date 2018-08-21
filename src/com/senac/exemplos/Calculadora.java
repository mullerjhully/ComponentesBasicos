package com.senac.exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculadora {

	private JFrame frame;
	private JLabel lblCalculadora;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button_1;
	private JButton btnX;
	private JButton button_2;
	private String operador;
	private JLabel lblResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setBounds(12, 12, 100, 15);
		panel.add(lblCalculadora);
		
		textField = new JTextField();
		textField.setBounds(12, 108, 114, 47);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Double valor1 = Double.parseDouble(textField.getText());
				Double valor2 = Double.parseDouble(textField_1.getText());
				Double resultado = null;
				if ("+".equals(operador)) {
					resultado = valor1 + valor2;
				} else if ("-".equals(operador)) {
					resultado = valor1 - valor2;
				} else if ("x".equals(operador)) {
					resultado = valor1 * valor2;
				} else if ("/".equals(operador)) {
					resultado = valor1 / valor2;
				}
				if (resultado != null) {
					lblResposta.setText("Resultado: "+resultado);
				} else {
					lblResposta.setText("Resultado");
				}
			}
		});
		textField_1.setBounds(322, 108, 114, 47);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = "+";
			}
		});
		button.setBounds(138, 85, 60, 25);
		panel.add(button);
		
		button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = "-";
			}
		});
		button_1.setBounds(227, 85, 51, 25);
		panel.add(button_1);
		
		btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = "x";
			}
		});
		btnX.setBounds(138, 150, 51, 25);
		panel.add(btnX);
		
		button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = "/";
			}
		});
		button_2.setBounds(230, 150, 51, 25);
		panel.add(button_2);
		
		lblResposta = new JLabel("Resposta");
		lblResposta.setBounds(138, 234, 217, 15);
		panel.add(lblResposta);
	}

	public void interfCalcu() {
		// TODO Auto-generated method stub
		
	}
	}

