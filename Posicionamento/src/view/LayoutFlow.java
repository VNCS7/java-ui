package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LayoutFlow extends JFrame{

	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField(42);
	JLabel lblEndereco = new JLabel("Endereco: ");
	JTextField txtEndereco = new JTextField(42);
	
	JLabel lblCEP = new JLabel("CEP: ");
	JTextField txtCEP = new JTextField(42);
	
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField(42);
	
	JLabel lblRG = new JLabel("RG: ");
	JTextField txtRG = new JTextField(42);
	
	JLabel lblCPF = new JLabel("CPF: ");
	JTextField txtCPF = new JTextField(42);

	public LayoutFlow() {
		super("LayoutFlow");
		
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
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
		this.setSize(500, 500);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LayoutFlow LayoutFlow = new LayoutFlow();
	}

}
