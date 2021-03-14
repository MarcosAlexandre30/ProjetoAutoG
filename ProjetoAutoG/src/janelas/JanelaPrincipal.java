package janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Lass eh Guei kkk");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaPrincipal.class.getResource("/imagem/gurps.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel testeLabel = new JLabel("");
		testeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		testeLabel.setBounds(168, 11, 606, 527);
		contentPane.add(testeLabel);
		
		JButton botaoCriarPersonagem = new JButton("Cria\u00E7\u00E3o de Personagem");
		botaoCriarPersonagem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				testeLabel.setText("Criar Personagem");
			}
		});
		botaoCriarPersonagem.setBounds(10, 11, 149, 56);
		contentPane.add(botaoCriarPersonagem);
		
		JButton botaoTemplate = new JButton("Template");
		botaoTemplate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				testeLabel.setText("Selecionar Template");
			}
		});
		botaoTemplate.setBounds(10, 78, 149, 56);
		contentPane.add(botaoTemplate);
		
		JButton botaoAlterarPersonagem = new JButton("Alterar Personagem");
		botaoAlterarPersonagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testeLabel.setText("Alterar Personagem");
			}
		});
		botaoAlterarPersonagem.setBounds(10, 145, 149, 56);
		contentPane.add(botaoAlterarPersonagem);
		
		JButton botaoListarPersonagens = new JButton("Listar Personagem");
		botaoListarPersonagens.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				testeLabel.setText("Listar personagens");
			}
		});
		botaoListarPersonagens.setBounds(10, 212, 149, 56);
		contentPane.add(botaoListarPersonagens);
	}
}
