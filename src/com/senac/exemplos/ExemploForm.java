package com.senac.exemplos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ExemploForm {

	private JFrame frmFormulrioCadastro;
	private JTextField textField;
	private JButton btnAlterarTitulo;
	String titulo = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploForm window = new ExemploForm();
					window.frmFormulrioCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExemploForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormulrioCadastro = new JFrame();
		frmFormulrioCadastro.setResizable(false);
		frmFormulrioCadastro.setTitle("Formul\u00E1rio cadastro");
		frmFormulrioCadastro.setBounds(100, 100, 450, 300);
		frmFormulrioCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormulrioCadastro.getContentPane().setLayout(null);
		
		textField = new JTextField();

		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				//if( !(arg0.getKeyCode()>=48 && arg0.getKeyCode()<=57) ){
				if(arg0.getKeyCode()<48 || arg0.getKeyCode()>57 || arg0.getKeyCode()!=8){
					titulo += String.valueOf(arg0.getKeyChar());
					frmFormulrioCadastro.setTitle(titulo);
				}
				
				if(arg0.getKeyCode()==10){
					frmFormulrioCadastro.setTitle(textField.getText());
				}

				if(arg0.getKeyCode()==8){
					textField.setText("");
				}
				//System.out.println(arg0.getKeyCode());
			}
		});
		textField.setBounds(42, 25, 368, 46);
		frmFormulrioCadastro.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnAlterarTitulo = new JButton("Alterar titulo");
		btnAlterarTitulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmFormulrioCadastro.setTitle( textField.getText() );
			}
		});
		btnAlterarTitulo.setBounds(42, 82, 368, 23);
		frmFormulrioCadastro.getContentPane().add(btnAlterarTitulo);
	}
	public JButton getBtnAlterarTitulo() {
		return btnAlterarTitulo;
	}
}
