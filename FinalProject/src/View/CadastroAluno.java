package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroAluno extends JPanel implements VisualWindow{

	private JLabel cadastro, nome, data, endereco, telefone, email;
	private JTextField nameText, dataText, enderecoText, telefoneText, emailText;
	private JButton cadastrar, voltar;
	private TelaBase base;
	private CardLayout cl;
	
	
	public CadastroAluno() 
	{
		setupLayout();
		setupComponents();
		setupEvents();
	}

	@Override
	public void setupLayout() 
	{
		setLayout(null);
		setBackground(Color.WHITE);
		setVisible(true);
		setSize(800, 550);
	}

	@Override
	public void setupComponents() 
	{
		cadastro = new JLabel("Formulario de Cadastro de alunos");
		nome = new JLabel("Nome");
		data = new JLabel("Data de Nascimento");
		endereco = new JLabel("Endereco");
		telefone = new JLabel("Telefone");
		email = new JLabel("Email");
		nameText = new JTextField(100);
		dataText = new JTextField(100);
		enderecoText = new JTextField(100);
		telefoneText = new JTextField(100);
		emailText = new JTextField(100);
		cadastrar = new JButton("Cadastrar");
		voltar = new JButton("Voltar");
		
		// inserindo os componentes no JPanel Register
		
		//Labels
		cadastro.setBounds(364, 10, 500, 100);
		nome.setBounds(200, 40, 100, 170);
		data.setBounds(119, 60, 160, 210);
		endereco.setBounds(180, 110, 160, 210);
		telefone.setBounds(185, 160, 160, 210); // x = largura e y = altura
		email.setBounds(195, 210, 160, 210);
		//Texto
		nameText.setBounds(244, 110, 230, 30);
		dataText.setBounds(244, 155, 230, 30);
		enderecoText.setBounds(244, 200, 230, 30);
		telefoneText.setBounds(244, 245, 230, 30);
		emailText.setBounds(244, 300, 230, 30);
		//Botoes
		cadastrar.setBounds(370, 400, 120, 30);
		voltar.setBounds(230, 400,120, 30);

		//Labels
		add(nome);
		add(data);
		add(cadastro);
		add(endereco);
		add(telefone);
		add(email);
		//Texto
		add(nameText);
		add(dataText);
		add(enderecoText);
		add(telefoneText);
		add(emailText);
		//Botoes
		add(cadastrar);
		add(voltar);
		
		
	}

	@Override
	public void setupEvents() {
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(base, "escola");
				
			}
		});
		
	}
	
}
