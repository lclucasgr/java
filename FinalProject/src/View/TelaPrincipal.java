package View;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipal extends JPanel implements VisualWindow{

	private JLabel listagem, cadastro;
	private JButton cadastroEscola, cadastroAluno, listagemEscola, listagemAluno;
	
	public TelaPrincipal() {
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
	public void setupComponents() 
	{
		
		cadastro = new JLabel("Cadastro");
		listagem = new JLabel("Listagem");
		cadastroEscola = new JButton("Cadastrar Escolas");
		listagemEscola = new JButton("Listar Escolas");
		cadastroAluno = new JButton("Cadastrar Alunos");
		listagemAluno = new JButton("Listar Alunos");
		
		cadastro.setBounds(100, 10, 500, 100);
		listagem.setBounds(400, -25, 100, 170);
		cadastroEscola.setBounds(80, 100, 139, 30); //x = largura, y = altura
		listagemEscola.setBounds(370, 100, 120, 30);
		cadastroAluno.setBounds(80, 160, 139, 30);
		listagemAluno.setBounds(370, 160, 120, 30);
		
		add(cadastro);
		add(listagem);
		add(cadastroEscola);
		add(listagemEscola);
		add(cadastroAluno);
		add(listagemAluno);
		
	}

	@Override
	public void setupEvents() {
		// TODO Auto-generated method stub
		
	}
	
}
