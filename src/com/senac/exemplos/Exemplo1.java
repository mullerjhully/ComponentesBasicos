package com.senac.exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exemplo1 {

	private JFrame frmExemplo;
	private JLabel labelFinal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemplo1 window = new Exemplo1();
					window.frmExemplo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exemplo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExemplo = new JFrame();
		frmExemplo.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				JOptionPane.showMessageDialog(null, "Olá");
			}
		});
		frmExemplo.setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		frmExemplo.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Downloads\\imagens\\logo.png"));
		frmExemplo.setTitle("Exemplo 1");
		frmExemplo.setBounds(100, 200, 300, 300);
		frmExemplo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExemplo.getContentPane().setLayout(null);
		
		JButton btnCliqueEmMim = new JButton("Clique em mim!");
		btnCliqueEmMim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Clicou");
				labelFinal.setText("Renato Paranaguá");
				labelFinal.setForeground(Color.BLUE);
				
			}
		});
		btnCliqueEmMim.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				System.out.println(arg0.getX()+" - "+arg0.getY());
				
			}
		});
		btnCliqueEmMim.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent arg0) {
				
			}
		});
		btnCliqueEmMim.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCliqueEmMim.setForeground(Color.RED);
		btnCliqueEmMim.setBackground(Color.ORANGE);
		btnCliqueEmMim.setBounds(0, 0, 284, 61);
		frmExemplo.getContentPane().add(btnCliqueEmMim);
		
		JButton btnTeste = new JButton("Testandoo!");
		btnTeste.setBounds(0, 100, 100, 20);
		frmExemplo.getContentPane().add(btnTeste);
		
		
		
		JLabel lblResposta = new JLabel("Resposta:");
		lblResposta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResposta.setBounds(10, 148, 84, 30);
		frmExemplo.getContentPane().add(lblResposta);
		
		labelFinal = new JLabel("...");
		labelFinal.setForeground(Color.ORANGE);
		labelFinal.setBackground(Color.PINK);
		labelFinal.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelFinal.setBounds(88, 158, 84, 20);
		frmExemplo.getContentPane().add(labelFinal);
	}
}
