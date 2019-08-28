package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame implements VisualWindow {

	private JMenuBar menuBar;
	private JMenu cadastro, listagem;
	private JMenuItem alunosCadastro, alunosListagem ,escolasCadastro, escolasListagem;
	private CadastroEscola register;
	private TelaBase base;
	private CardLayout cl;
	

	public MainFrame() {
		setupLayout();
		setupComponents();
		setupEvents();
		
	    
	}

	@Override
	public void setupLayout() {
		setSize(800, 600);
		setLayout(new BorderLayout());
		setVisible(true);
		// setdefault encerra a execução do sistema quando fechada a tela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	

	@Override
	public void setupComponents() {

		menuBar = new JMenuBar();
		cadastro = new JMenu("Cadastro");
		listagem = new JMenu("Listagem");
		alunosCadastro = new JMenuItem("Cadastrar Alunos");
		escolasCadastro = new JMenuItem("Cadastrar Escolas");
		alunosListagem = new JMenuItem("Exibir Alunos");
		escolasListagem = new JMenuItem("Exibir Escolas");
		cadastro.add(alunosCadastro);
		cadastro.add(escolasCadastro);
		listagem.add(alunosListagem);
		listagem.add(escolasListagem);
		menuBar.add(cadastro);
		menuBar.add(listagem);
		add(menuBar, BorderLayout.NORTH);


		// ------------------------------------
		register = new CadastroEscola();
		//add(register, BorderLayout.CENTER);
        
		// -------------
		
		base = new TelaBase();
		cl = new CardLayout();
	    cl = (CardLayout)base.getLayout();
	    add(base, BorderLayout.CENTER);
		
	}

	@Override
	public void setupEvents() {
		 alunosCadastro.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cl.show(base, "aluno");
					
				}
			});
		 
		 escolasCadastro.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cl.show(base, "escola");
					
				}
			});
	}
	

	
	private void repaintAll() {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				repaint();

			}
		});
	}

	

}
