package View;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class TelaBase extends JPanel{

	TelaPrincipal principal
	;
	CadastroAluno aluno;
	CadastroEscola escola;
	//Login
	
	public TelaBase() {
		setLayout(new CardLayout());
		principal = new TelaPrincipal();
		aluno = new CadastroAluno();
		escola = new CadastroEscola();
		
		add(principal, "principal");
		add(aluno, "aluno");
		add(escola, "escola");
	}
	
}
