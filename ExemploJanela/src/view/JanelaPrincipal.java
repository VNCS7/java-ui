package view;

import java.awt.Container;

/*IMPORTS*/
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class JanelaPrincipal extends JFrame {
	
	JLabel lblTexto			= new JLabel("Preencha os campos e clique em Gravar Dados");
	JLabel lblNome 			= new JLabel("Nome: ");
	JLabel lblEndereco 		= new JLabel("Endereço: ");
	JLabel lblBairro 		= new JLabel("Bairro: ");
	JLabel lblEstado 		= new JLabel("Estado: ");
	JLabel lblTelefone 		= new JLabel("Telefone: ");
	JLabel lblCelular 		= new JLabel("Celular: ");
	JLabel lblEmail 		= new JLabel("Email: ");
	
	JTextField txtNome		= new JTextField();
	JTextField txtEndereco 	= new JTextField();
	JTextField txtBairro 	= new JTextField();
	JTextField txtTelefone 	= new JTextField();
	JTextField txtCelular 	= new JTextField();
	JTextField txtEmail 	= new JTextField();
	
	JComboBox cmbEstado 	= new JComboBox();
	
	JButton gravarCadastro 	= new JButton("Gravar Dados");
	JButton novoCadastro 	= new JButton("Novo Cadastro");
	JButton verCadastro 	= new JButton("Ver Cadastro");
	

	public JanelaPrincipal() {
		super("Cadastro");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblTexto.setBounds(125, 15, 300, 25);
		paine.add(lblTexto);
		
		lblNome.setBounds(40, 60, 250, 25);
		paine.add(lblNome);
		
		lblEndereco.setBounds(40, 90, 250, 25);
		paine.add(lblEndereco);
		
		lblBairro.setBounds(40, 120, 250, 25);
		paine.add(lblBairro);
		
		lblEstado.setBounds(40, 150, 250, 25);
		paine.add(lblEstado);
		
		lblTelefone.setBounds(40, 180, 250, 25);
		paine.add(lblTelefone);
		
		lblCelular.setBounds(40, 210, 250, 25);
		paine.add(lblCelular);
		
		lblEmail.setBounds(40, 240, 250, 25);
		paine.add(lblEmail);
		
		
		txtNome.setBounds(150, 60, 200, 25);
		paine.add(txtNome);
		
		txtEndereco.setBounds(150, 90, 200, 25);
		paine.add(txtEndereco);
		
		txtBairro.setBounds(150, 120, 200, 25);
		paine.add(txtBairro);
		
		cmbEstado.setBounds(150, 150, 50, 25);
		paine.add(cmbEstado);
		cmbEstado.addItem("SP");
		cmbEstado.addItem("RJ");
		cmbEstado.addItem("ES");
		cmbEstado.addItem("MG");
		
		txtTelefone.setBounds(150, 180, 100, 25);
		paine.add(txtTelefone);
		
		txtCelular.setBounds(150, 210, 100, 25);
		paine.add(txtCelular);
		
		txtEmail.setBounds(150, 240, 200, 25);
		paine.add(txtEmail);
		
		gravarCadastro.setBounds(60,280,130,30);
		paine.add(gravarCadastro);
		
		novoCadastro.setBounds(195, 280, 130, 30);
		paine.add(novoCadastro);
		
		verCadastro.setBounds(330, 280, 130, 30);
		paine.add(verCadastro);
		
		this.setResizable(false); //NÃO PERMITE O REDIMENSIONAMENTO DA JANELA
		this.setVisible(true); //SETA A VISIBILIDADE OU NÃO DA JANELA
		this.setSize(520, 355); //SET O TAMANHO DA JANELA
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //DEFINE A OPERAÇÃO QUE SERÁ EXECUTADA AO SELECIONAR O 'X'

	}
	
	public static void main(String[] args) {
		JanelaPrincipal janela = new JanelaPrincipal();
		
	}

}
