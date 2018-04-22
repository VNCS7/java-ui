package view;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextField;
import m.buttons.BotoesM;
import matematica.Calculos;
	
public class Calculadora extends JFrame{
	
	JMenuBar menuSuperior 	= new JMenuBar();
	JMenu exibir 			= new JMenu("Exibir");
	JMenu editar 			= new JMenu("Editar");
	JMenu ajuda 			= new JMenu("Ajuda");
	
    JMenuItem padrao 		= new JMenuItem("Padrão");
    JMenuItem cientifica 	= new JMenuItem("Científica");
    JMenuItem programador 	= new JMenuItem("Programador");
    JMenuItem estatistica 	= new JMenuItem("Estatística");
    JMenuItem historico 	= new JMenuItem("Histórico");
    JMenuItem agrupamento 	= new JMenuItem("Agrupamento de dígitos");
    JMenuItem basico 		= new JMenuItem("Básico");
    JMenuItem conversao 	= new JMenuItem("Conversão de unidades");
    JMenuItem data 			= new JMenuItem("Cálculo de data");
    JMenuItem hipoteca 		= new JMenuItem("Hipoteca");
    JMenuItem leasing 		= new JMenuItem("Leasing de veículo");
    JMenuItem economia 		= new JMenuItem("Economia de combustível (km/l)");
    JMenuItem economil 		= new JMenuItem("Economia de combustível (l/100 km)");
    JMenu planilha			= new JMenu("Planilhas");
    
    JMenuItem copiar		= new JMenuItem("Copiar");
    JMenuItem colar			= new JMenuItem("Colar");
    JMenuItem cHis			= new JMenuItem ("Copiar histórico");
    JMenuItem edit			= new JMenuItem ("Editar");
    JMenuItem cancel		= new JMenuItem ("Cancelar edição");
    JMenuItem clean			= new JMenuItem ("Limpar");
    JMenu historic 			= new JMenu("Histórico");
	
    JMenuItem exib_a		= new JMenuItem("Exibir Ajuda");
    JMenuItem sobre			= new JMenuItem("Sobre a Calculadora");
	
    JTextField txtVisor 	= new JTextField("0");

	JButton btnMC 					= new JButton("MC");
	JButton btnMR 					= new JButton("MR");
	JButton btnMS 					= new JButton("MS");
	JButton btnMais 				= new JButton("M+");
	JButton btnMenos 				= new JButton("M-");
	
	JButton btnDel					= new JButton("←");
	JButton btnCE					= new JButton("CE");
	JButton btnC					= new JButton("C");
	JButton btnMaisMenos			= new JButton("±");
	JButton btnRaiz					= new JButton("√");
	
	JButton btnSete					= new JButton("7");
	JButton btnOito					= new JButton("8");
	JButton btnNove					= new JButton("9");
	JButton btnDiv					= new JButton("/");
	JButton btnPorc					= new JButton("%");
	
	JButton btnQuatro				= new JButton("4");
	JButton btnCinco				= new JButton("5");
	JButton btnSeis					= new JButton("6");
	JButton btnMult					= new JButton("*");
	JButton btnRecp					= new JButton("1/X");
	
	JButton btnUm					= new JButton("1");
	JButton btnDois					= new JButton("2");
	JButton btnTres					= new JButton("3");
	JButton btnSub					= new JButton("-");
	JButton btnIgual				= new JButton("=");

	JButton btnZero					= new JButton("0");
	JButton btnVirg					= new JButton(",");
	JButton btnSoma					= new JButton("+");
	
	Calculos operacao = new Calculos();
	BotoesM  btnM = new BotoesM();
	
	String sinal = null;
	double valor1= 0, valor2 =0;
	
	public Calculadora() {
		super("VNCS 4.0");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
	
		menuSuperior.setFont(new Font("Arial", Font.PLAIN,12));
		menuSuperior.add(exibir);
		menuSuperior.add(editar);
		menuSuperior.add(ajuda);
		super.setJMenuBar(menuSuperior);
		
		exibir.add(padrao);
		exibir.add(cientifica);
		exibir.add(programador);
		exibir.add(estatistica);
		exibir.addSeparator();
		exibir.add(historico);
		exibir.add(agrupamento);
		exibir.addSeparator();
		exibir.add(basico);
		exibir.add(conversao);
		exibir.add(data);
		exibir.add(planilha);
		planilha.add(hipoteca);
		planilha.add(leasing);
		planilha.add(economia);
		planilha.add(economil);
		
		editar.add(copiar);
		editar.add(colar);
		editar.addSeparator();
		editar.add(historic);
		historic.add(cHis);
		historic.add(edit);
		historic.add(cancel);
		historic.add(clean);
		
		ajuda.add(exib_a);
		ajuda.addSeparator();
		ajuda.add(sobre);
		
		txtVisor.setFont(new Font("Arial", Font.PLAIN, 18));
		txtVisor.setFont(new Font("Arial",Font.BOLD, 18));
		txtVisor.setBounds(14, 11, 190, 50);
		txtVisor.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtVisor.setCaretColor(Color.WHITE);
		paine.add(txtVisor);
		
		//PRIMEIRA LINHA
		btnMC.setMargin(new Insets(1,1,1,1));
		btnMC.setFont(new Font("Arial", Font.PLAIN, 12));
		btnMC.setBounds(14, 66, 34, 27);
		paine.add(btnMC);
		
		btnMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnM.MSave = 0;
			}
		});
		
		btnMR.setMargin(new Insets(1,1,1,1));
		btnMR.setFont(new Font("Arial", Font.PLAIN, 12));
		btnMR.setBounds(53, 66, 34, 27);
		paine.add(btnMR);
		
		btnMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(btnM.MSave+"");
			}
		});
		
		
		btnMS.setMargin(new Insets(1,1,1,1));
		btnMS.setFont(new Font("Arial", Font.PLAIN, 12));
		btnMS.setBounds(92, 66, 34, 27);
		paine.add(btnMS);
		
		btnMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnM.MSave = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("0");
			}
		});
		
		btnMais.setMargin(new Insets(1,1,1,1));
		btnMais.setFont(new Font("Arial", Font.PLAIN, 12));
		btnMais.setBounds(131, 66, 34, 27);
		paine.add(btnMais);
		
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnM.MSave = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("0");
			}
		});
		
		btnMenos.setMargin(new Insets(1,1,1,1));
		btnMenos.setFont(new Font("Arial", Font.PLAIN, 12));
		btnMenos.setBounds(170, 66, 34, 27);
		paine.add(btnMenos);
		
		btnMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnM.MSave = 0;
			}
		});
		
		
		
		//SEGUNDA LINHA
		btnDel.setMargin(new Insets(1,1,1,1));
		btnDel.setFont(new Font("Arial",Font.PLAIN,20));
		btnDel.setBounds(14,99,34,27);
		paine.add(btnDel);
		
		btnCE.setMargin(new Insets(1,1,1,1));
		btnCE.setFont(new Font("Arial",Font.PLAIN,12));
		btnCE.setBounds(53,99,34,27);
		paine.add(btnCE);
		
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		
		btnC.setMargin(new Insets(1,1,1,1));
		btnC.setFont(new Font("Arial",Font.PLAIN,12));
		btnC.setBounds(92,99,34,27);
		paine.add(btnC);
		
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		
		btnMaisMenos.setMargin(new Insets(1,1,1,1));
		btnMaisMenos.setFont(new Font("Arial",Font.PLAIN,12));
		btnMaisMenos.setBounds(131,99,34,27);
		paine.add(btnMaisMenos);
		
		btnMaisMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(operacao.inverter(valor1)+"");	
			}
		}
	);
		
		btnRaiz.setMargin(new Insets(1,1,1,1));
		btnRaiz.setFont(new Font("Arial",Font.PLAIN,12));
		btnRaiz.setBounds(170,99,34,27);
		paine.add(btnRaiz);
		
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(txtVisor.getText());
					sinal = "raiz";
					txtVisor.setText(operacao.raizQ(valor1)+"");
				}
			}
		);
		

		//TERCEIRA LINHA
		btnSete.setMargin(new Insets(1,1,1,1));
		btnSete.setFont(new Font("Arial",Font.PLAIN,12));
		btnSete.setBounds(14,132,34,27);
		paine.add(btnSete);
		
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("7");
				}else {
					txtVisor.setText(txtVisor.getText() + "7");
				}
			}
		});
		
		btnOito.setMargin(new Insets(1,1,1,1));
		btnOito.setFont(new Font("Arial",Font.PLAIN,12));
		btnOito.setBounds(53,132,34,27);
		paine.add(btnOito);
		
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("8");
				}else {
					txtVisor.setText(txtVisor.getText() + "8");
				}
			}
		});
		
		btnNove.setMargin(new Insets(1,1,1,1));
		btnNove.setFont(new Font("Arial",Font.PLAIN,12));
		btnNove.setBounds(92,132,34,27);
		paine.add(btnNove);
		
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("9");
				}else {
					txtVisor.setText(txtVisor.getText() + "9");
				}
			}
		});
		
		btnDiv.setMargin(new Insets(1,1,1,1));
		btnDiv.setFont(new Font("Arial",Font.PLAIN,12));
		btnDiv.setBounds(131,132,34,27);
		paine.add(btnDiv);
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "div";
				txtVisor.setText("0");
			}
		});
		
		btnPorc.setMargin(new Insets(1,1,1,1));
		btnPorc.setFont(new Font("Arial",Font.PLAIN,12));
		btnPorc.setBounds(170,132,34,27);
		paine.add(btnPorc);
		
		btnPorc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//valor1 = Double.parseDouble(txtVisor.getText());
				valor2 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(operacao.porcentagem(valor1,valor2)+"");
				System.out.println(txtVisor.getText());
				
			}
		}
	);
		
		//QUARTA LINHA
		btnQuatro.setMargin(new Insets(1,1,1,1));
		btnQuatro.setFont(new Font("Arial",Font.PLAIN,12));
		btnQuatro.setBounds(14,165,34,27);
		paine.add(btnQuatro);
		
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("4");
				}else {
					txtVisor.setText(txtVisor.getText() + "4");
				}
			}
		});

		btnCinco.setMargin(new Insets(1,1,1,1));
		btnCinco.setFont(new Font("Arial",Font.PLAIN,12));
		btnCinco.setBounds(53,165,34,27);
		paine.add(btnCinco);
		
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("5");
				}else {
					txtVisor.setText(txtVisor.getText() + "5");
				}
			}
		});
		
		btnSeis.setMargin(new Insets(1,1,1,1));
		btnSeis.setFont(new Font("Arial",Font.PLAIN,12));
		btnSeis.setBounds(92,165,34,27);
		paine.add(btnSeis);
		
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("6");
				}else {
					txtVisor.setText(txtVisor.getText() + "6");
				}
			}
		});
		
		btnMult.setMargin(new Insets(1,1,1,1));
		btnMult.setFont(new Font("Arial",Font.PLAIN,12));
		btnMult.setBounds(131,165,34,27);
		paine.add(btnMult);
		
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "mult";
				txtVisor.setText("0");
			}
		});
		
		btnRecp.setMargin(new Insets(1,1,1,1));
		btnRecp.setFont(new Font("Arial",Font.PLAIN,12));
		btnRecp.setBounds(170,165,34,27);
		paine.add(btnRecp);
		
		btnRecp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(operacao.reciproco(valor1)+"");
			}
		});
		
		//QUINTA LINHA
		btnUm.setMargin(new Insets(1,1,1,1));
		btnUm.setFont(new Font("Arial",Font.PLAIN,12));
		btnUm.setBounds(14,198,34,27);
		paine.add(btnUm);
		
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("1");
				}else {
					txtVisor.setText(txtVisor.getText() + "1");
				}
			}
		});
		
		btnDois.setMargin(new Insets(1,1,1,1));
		btnDois.setFont(new Font("Arial",Font.PLAIN,12));
		btnDois.setBounds(53,198,34,27);
		paine.add(btnDois);
		
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("2");
				}else {
					txtVisor.setText(txtVisor.getText() + "2");
				}
			}
		});
		
		btnTres.setMargin(new Insets(1,1,1,1));
		btnTres.setFont(new Font("Arial",Font.PLAIN,12));
		btnTres.setBounds(92,198,34,27);
		paine.add(btnTres);
		
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("3");
				}else {
					txtVisor.setText(txtVisor.getText() + "3");
				}
			}
		});
		
		btnSub.setMargin(new Insets(1,1,1,1));
		btnSub.setFont(new Font("Arial",Font.PLAIN,12));
		btnSub.setBounds(131,198,34,27);
		paine.add(btnSub);
		
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(txtVisor.getText());
					sinal = "sub";
					txtVisor.setText("0");
				}
			}
		);
		
		btnIgual.setMargin(new Insets(1,1,1,1));
		btnIgual.setFont(new Font("Arial",Font.PLAIN,20));
		btnIgual.setBounds(170,198,34,59);
		paine.add(btnIgual);
		
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtVisor.getText());
				
				if(sinal.equals("soma")) {
					txtVisor.setText(operacao.somar(valor1, valor2)+"");
				}
				else if(sinal.equals("sub")) {
					txtVisor.setText(operacao.subtrair(valor1, valor2)+"");
				}
				else if(sinal.equals("mult")) {
					txtVisor.setText(operacao.multiplicar(valor1, valor2)+"");
				}
				else if(sinal.equals("div")) {
					txtVisor.setText(operacao.dividir(valor1, valor2)+"");
				}
				else if(sinal.equals("raiz")) {
					txtVisor.setText(operacao.raizQ(valor1)+"");
				}
				else if(sinal.equals("recp")) {
					txtVisor.setText(operacao.reciproco(valor1)+"");
				}
			}
		});
		
		//SEXTA LINHA
		btnZero.setMargin(new Insets(1,1,1,1));
		btnZero.setFont(new Font("Arial",Font.PLAIN,12));
		btnZero.setBounds(14, 231, 73, 27);
		paine.add(btnZero);
		
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("0");
				}else {
					txtVisor.setText(txtVisor.getText() + "0");
				}
			}
		});
		
		btnVirg.setMargin(new Insets(1,1,1,1));
		btnVirg.setFont(new Font("Arial",Font.PLAIN,12));
		btnVirg.setBounds(92, 231, 34, 27);
		paine.add(btnVirg);
	
		btnVirg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!txtVisor.getText().contains(".")) {
					txtVisor.setText(txtVisor.getText()+".");
				}
				else {
					
				}
				
				}
			}
		);
		
		
		btnSoma.setMargin(new Insets(1,1,1,1));
		btnSoma.setFont(new Font("Arial",Font.PLAIN,12));
		btnSoma.setBounds(131, 231, 34, 27);
		paine.add(btnSoma);
		
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(txtVisor.getText());
					sinal = "soma";
					txtVisor.setText("0");
				}
			}
		);
		
		this.setSize(228, 322);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}
	
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
		
	}
}
