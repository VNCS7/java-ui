package view;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LayoutGrid extends JFrame{

	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	
	JLabel lblEndereco = new JLabel("Endereco: ");
	JTextField txtEndereco = new JTextField();
	
	JTextField txtCEP = new JTextField();
	JLabel lblCEP = new JLabel("CEP: ");
	
	JTextField txtBairro = new JTextField();
	JLabel lblBairro = new JLabel("Bairro: ");
	
	JTextField txtRG = new JTextField();
	JLabel lblRG = new JLabel("RG: ");
	
	JTextField txtCPF = new JTextField();
	JLabel lblCPF = new JLabel("CPF: ");
	
	//JTextField txtEndereco = new JTextField();
	
	
	
	public LayoutGrid() {
		super("Screen com Novo Layout");
		
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(20, 1));
		
		pane.add(lblNome);
		pane.add(txtNome);
		
		pane.add(lblEndereco);
		pane.add(txtEndereco);
		
		pane.add(lblCEP);
		pane.add(txtCEP);
	
		pane.add(lblBairro);
		pane.add(txtBairro);
	
		pane.add(lblRG);
		pane.add(txtRG);
	
		pane.add(lblCPF);
		pane.add(txtCPF);
	
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600
				);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LayoutGrid Screen = new LayoutGrid();
	}

}
