package com.senac.exemplos;

	import java.awt.BorderLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;
	import javax.swing.*;
	public class ExemploCalculo extends JFrame {
		//Declaração dos botões 
	JButton botao1,botao2,botao3,botao4,botao5,botao6,botao7,botao8,botao9,botao0;
	JButton botaoSom, botaoSub, botaoMult, botaoDiv,botaoIgual,botaoApag;
	//Criando a janela onde sera inserido o painel
	JFrame janela = new JFrame();
	//Criando o espaço de texto que sera o "visor" da calculadora
	JTextField texto=new JTextField() ;
	//Declarando a Sting que vai carregar todos os numeros vindo dos botões que irão estar sendo apertados 
	String acm = "";
	//Declarando Os inteiros que registraram os dois numeros pra realizar a operação desejada
	int reg,reg2,indc;
	//Metodo principal que instancia a classe Calculadora e chama o metodo da interface 
	public static void main(String args[]){
		ExemploCalculo calc = new ExemploCalculo();
		calc.interfCalcu();
	}
	//Método responsável pela interface da calculadora
	public void interfCalcu (){
		//Instanciando os botões que serão usados
		botao1=new JButton("1");botao2=new JButton("2");botao3=new JButton("3");botao4=new JButton("4");botao5=new JButton("5");
		botao6=new JButton("6");botao7=new JButton("7");botao8=new JButton("8");botao9=new JButton("9");botao0=new JButton("0");
		botaoSom=new JButton("Somar");botaoSub=new JButton("Subtrair");botaoMult=new JButton("Multiplicar");botaoDiv=new JButton("Dividir");
	    botaoIgual= new JButton("="); botaoApag= new JButton("CE");
	    //Registrando os eventos que serão utilizados no seus respectivos botões
		botao1.addActionListener(new Manipular1 ());
		botao2.addActionListener(new Manipular2 ());
		botaoSom.addActionListener(new ManipularSoma ());
		botaoIgual.addActionListener(new ManipularIgual ());
		botao3.addActionListener(new Manipular3 ());
		botao4.addActionListener(new Manipular4 ());
		botao5.addActionListener(new Manipular5 ());
		botao6.addActionListener(new Manipular6 ());
		botao7.addActionListener(new Manipular7 ());
		botao8.addActionListener(new Manipular8 ());
		botao9.addActionListener(new Manipular9 ());
		botao0.addActionListener(new Manipular0 ());
		botaoDiv.addActionListener(new ManipularDiv ());
		botaoSub.addActionListener(new ManipularSub ());
		botaoMult.addActionListener(new ManipularMult());
//		botaoApag.addActionListener(new ManipularApag());
		//Criando um painel para inserir os botões
	JPanel painel = new JPanel();
	//Adicionando os botões no painel
	painel.add(botao1);painel.add(botao2);painel.add(botao3);painel.add(botao4);painel.add(botao5);painel.add(botao6);
	painel.add(botao7);painel.add(botao8);painel.add(botao9);painel.add(botao0);painel.add(botaoSom);painel.add(botaoSub);
	painel.add(botaoMult);painel.add(botaoDiv);painel.add(botaoIgual);painel.add(botaoApag);
	//Adicionando o painel e o "visor" na janela
	janela.getContentPane().add(BorderLayout.CENTER,painel);
	janela.getContentPane().add(BorderLayout.NORTH,texto);
	//Dimensionando a janela e deixando ela visivel
	janela.setSize(300,300);
	janela.setVisible(true);
	//Termina o aplicativo quando fechar a janela
	janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
	}
	//Todas as classes de manipulação dos botões numéricos fazem uma concatenação onde a String acumula os números que o usuário digitar.
	//Nas classes de manipulação dos botões de operação há um inteiro recebendo o valor da String transformada em inteiro
	//Na classe de manipulação do botão "Igual" tem se um outro inteiro recebendo um valor da String transformada em inteiro. 
	//Logo após receber tal valor a manipulação fará uma operação a qual dependera de um indicador que vai dizer qual operação deve ser feita. 
	//Há uma exceção pro caso da operação de dividir que se usa 3 variaveis locais.
	//Duas variaveis são pra transformar as variaveis inteiro em float e a outra pra transformar o resultado em String para ser mostrado.
	//Classe responsavel para manipular evento do botao "1"
	 public class Manipular1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
	      acm= acm+1;
	      texto.setText(acm);
			}
		 }
	//Classe responsavel para manipular evento do botao "2"
	 public class Manipular2 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				acm= acm+2;
				texto.setText(acm);
				}
			 }
	//Classe responsavel para manipular evento do botao "3"
	 public class Manipular3 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				acm= acm+3;
				texto.setText(acm);
				}
			 }
	//Classe responsavel para manipular evento do botao "4"
	public class Manipular4 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				acm= acm+4;
				texto.setText(acm);
				}
			 }
	//Classe responsavel para manipular evento do botao "5"
	public class Manipular5 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				acm= acm+5;
				texto.setText(acm);
				}
			 }
	//Classe responsavel para manipular evento do botao "6"
	public class Manipular6 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				acm= acm+6;
				texto.setText(acm);
				}
			 }
	//Classe responsavel para manipular evento do botao "7"
	public class Manipular7 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			acm= acm+7;
			texto.setText(acm);
			}
		 }
	//Classe responsavel para manipular evento do botao "8"
	public class Manipular8 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			acm= acm+8;
			texto.setText(acm);
			}
		 }
	//Classe responsavel para manipular evento do botao "9"
	public class Manipular9 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			acm= acm+9;
			texto.setText(acm);
			}
		 }
	//Classe responsavel para manipular evento do botao "0"
	public class Manipular0 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			acm= acm+0;
			texto.setText(acm);
			}
		 }
	//Classe responsavel para manipular evento do botao "Somar"
	 public class ManipularSoma implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				reg = Integer.parseInt(acm);
				texto.setText("");
				acm="";
				indc=1;
			}
	 }
	//Classe responsavel para manipular evento do botao "Subtrair"
	 public class ManipularSub implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				reg = Integer.parseInt(acm);
				texto.setText("");
				acm="";
				indc=2;
			}
	}
	//Classe responsavel para manipular evento do botao "Multiplicar"
	public class ManipularMult implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				reg = Integer.parseInt(acm);
				texto.setText("");
				acm="";
				indc=3;
			}
	}
	//Classe responsavel para manipular evento do botao "Dividir"
	public class ManipularDiv implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				reg = Integer.parseInt(acm);
				texto.setText("");
				acm="";
				indc=4;
			}
	}
	//Classe responsavel para manipular evento do botao "Igual"
	 public class ManipularIgual implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (indc==1){
				reg2=Integer.parseInt(acm);
				String resu=Integer.toString(reg+reg2);
				texto.setText(resu);
				indc=0;
				}
				if (indc==2){
					reg2=Integer.parseInt(acm);
					String resu=Integer.toString(reg-reg2);
					texto.setText(resu);
					indc=0;
					}
				if (indc==3){
					reg2=Integer.parseInt(acm);
					String resu=Integer.toString(reg*reg2);
					texto.setText(resu);
					indc=0;
					}
				if (indc==4){
					float k=Float.parseFloat(acm);
					float q=(float)(reg);
					float queb=q/k;
					String resu = Float.toString(queb);
					texto.setText(resu);
					indc=0;
					}
				reg=0;reg2=0;
			}
	}

}
	
