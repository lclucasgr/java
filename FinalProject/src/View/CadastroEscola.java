package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroEscola extends JPanel implements VisualWindow {

	private JLabel cadastro, endereco, telefone, nome, email, bairro;
	private JTextField nomeText, enderecoText, emailText, telefoneText;
	private JButton cadastrar, voltar;
	//private JButton btName;

	public CadastroEscola() {
		setupLayout();
		setupComponents();
		setupEvents();
	}
	

	@Override
	public void setupLayout() {
		setLayout(null);
		setBackground(Color.WHITE);
		setVisible(true);
		setSize(800, 550);

	}

	@Override
	public void setupComponents() {
		
		cadastro = new JLabel("Formulario de Cadastro de escolas");
		nome = new JLabel("Nome");
		endereco = new JLabel("Endereco");
		telefone = new JLabel("Telefone");
		email = new JLabel("Email");
		nomeText = new JTextField(100);
		enderecoText = new JTextField(100);
		telefoneText = new JTextField(100);
		emailText = new JTextField(100);
		cadastrar = new JButton("Cadastrar");
		voltar = new JButton("Voltar");
		
		//Labels
		cadastro.setBounds(364, 10, 500, 100);
		nome.setBounds(200, 40, 100, 170);
		endereco.setBounds(180, 60, 160, 210);
		telefone.setBounds(180, 110, 160, 210);
		email.setBounds(185, 160, 160, 210);
		
		//Texto
		nomeText.setBounds(244, 110, 230, 30);
		enderecoText.setBounds(244, 155, 230, 30);
		telefoneText.setBounds(244, 200, 230, 30);
		emailText.setBounds(244, 245, 230, 30);
		
		//Botoes
		cadastrar.setBounds(370, 400, 120, 30);
		voltar.setBounds(230, 400,120, 30);
		
		//Labels
		add(cadastro);
        add(nome);
        add(endereco);
        add(telefone);
        add(email);
        
        //Texto
        add(nomeText);
        add(enderecoText);
        add(telefoneText);
        add(emailText);
        
        //Botoes
        add(cadastrar);
        add(voltar);
	}

	 @Override
	 public void setupEvents() {
	     
	
	 }

	
}