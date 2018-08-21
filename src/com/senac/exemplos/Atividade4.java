package com.senac.exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Atividade4 {

	private JFrame frmBoletim;
	private JTextField nota1;
	private JTextField nota2;
	private JTextField nota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade4 window = new Atividade4();
					window.frmBoletim.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Atividade4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBoletim = new JFrame();
		frmBoletim.setTitle("Boletim");
		frmBoletim.setBounds(100, 100, 450, 300);
		frmBoletim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBoletim.getContentPane().setLayout(null);
		
		JLabel lblBoletim = new JLabel("Boletim");
		lblBoletim.setBounds(0, 0, 448, 15);
		frmBoletim.getContentPane().add(lblBoletim);
		
		JLabel lblNota = new JLabel("Nota 1");
		lblNota.setBounds(12, 54, 70, 15);
		frmBoletim.getContentPane().add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setBounds(139, 54, 70, 15);
		frmBoletim.getContentPane().add(lblNota_1);
		
		JLabel lblNota_2 = new JLabel("Nota 3");
		lblNota_2.setBounds(311, 54, 70, 15);
		frmBoletim.getContentPane().add(lblNota_2);
		
		nota1 = new JTextField();
		nota1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		nota1.setBounds(12, 96, 58, 19);
		frmBoletim.getContentPane().add(nota1);
		nota1.setColumns(10);
		
		nota2 = new JTextField();
		nota2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		nota2.setBounds(138, 96, 83, 19);
		frmBoletim.getContentPane().add(nota2);
		nota2.setColumns(10);
		
		nota3 = new JTextField();
		nota3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		nota3.setBounds(311, 96, 70, 19);
		frmBoletim.getContentPane().add(nota3);
		nota3.setColumns(10);
		
		JLabel lblMedia = new JLabel("Media");
		lblMedia.setBounds(151, 193, 197, 15);
		frmBoletim.getContentPane().add(lblMedia);
		
		JLabel lblResultadoFinal = new JLabel("Resultado Final");
		lblResultadoFinal.setBounds(139, 232, 286, 15);
		frmBoletim.getContentPane().add(lblResultadoFinal);
		
		JButton Media = new JButton("Media");
		Media.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(nota1.getText());
				double n2 = Double.parseDouble(nota2.getText());
				double n3 = Double.parseDouble(nota3.getText());
				double mediafinal = (n1 + n2+ n3)/ 3;
				lblMedia.setText("Media: "+ mediafinal);
				if (mediafinal >= 7.0d) {
					lblResultadoFinal.setText("Aprovado");
					lblResultadoFinal.setForeground(Color.GREEN);
				}else {
					lblResultadoFinal.setText("Reprovado");
					lblResultadoFinal.setForeground(Color.RED);
				}

			}
		});
		Media.setBounds(139, 153, 117, 25);
		frmBoletim.getContentPane().add(Media);
	}
}
