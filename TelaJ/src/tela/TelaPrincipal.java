package tela;

import java.awt.Container;

import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class TelaPrincipal extends JFrame {
	
	JTextArea txtTexto 		= new JTextArea("Digite aqui o seu texto",15,30);
	JScrollPane barra 		= new JScrollPane(txtTexto);
	JLabel lblTitulo 		= new JLabel("O que não funciona?");
	JCheckBox chkJava 		= new JCheckBox("Java");
	JCheckBox chkC  		= new JCheckBox("C#");
	JCheckBox chkWindows 	= new JCheckBox("Windows");
	

	ButtonGroup grupoSexo 	= new ButtonGroup();
	JRadioButton[] sexo 	= new JRadioButton[2];
	
	JLabel lblSexo 			= new JLabel("Selecione o sexo desejado:");
	
	public TelaPrincipal() {
		super("Janela");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		barra.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		barra.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		barra.setBounds(20, 20, 360, 150);
		paine.add(barra);
		
		lblTitulo.setBounds(20, 180, 200, 20);
		paine.add(lblTitulo);
		
		chkJava.setBounds(20, 200, 100, 20);
		paine.add(chkJava);
		
		chkC.setBounds(20, 220, 100, 20);
		paine.add(chkC);
		
		chkWindows.setBounds(20, 240, 100, 20);
		paine.add(chkWindows);
		
		sexo[0] 	= new JRadioButton("Masculino");
		sexo[1] 	= new JRadioButton("Feminino");
		
		sexo[0].setBounds(20, 300, 100, 20);
		sexo[1].setBounds(20, 320, 100, 20);

		for (int i = 0; i < sexo.length; i++){
			grupoSexo.add(sexo[i]);
			paine.add(sexo[i]);
		}
		
		this.setResizable(false); 
		this.setVisible(true); 
		this.setSize(400, 500); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		TelaPrincipal janela = new TelaPrincipal();
		
	}
}
