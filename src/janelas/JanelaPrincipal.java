package janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JTextField;

import personagem.Atributos;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class JanelaPrincipal {

	private JFrame frmGurpsthEdition;
	private Atributos atributos = new Atributos();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal window = new JanelaPrincipal();
					window.frmGurpsthEdition.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGurpsthEdition = new JFrame();
		frmGurpsthEdition.setTitle("Gurps 4\u00BAth edition character creator");
		frmGurpsthEdition.setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaPrincipal.class.getResource("/imagem/gurps.jpg")));
		frmGurpsthEdition.setBounds(100, 100, 813, 600);
		frmGurpsthEdition.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGurpsthEdition.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel card = new JPanel();
		frmGurpsthEdition.getContentPane().add(card, "name_169057390313713");
		card.setLayout(new CardLayout(0, 0));
		
		JPanel painelInicial = new JPanel();
		painelInicial.setLayout(null);
		card.add(painelInicial, "telaInicial");
		
		JButton btnNewButton = new JButton("Criar Pesonagem");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout) (card.getLayout());
				cl.show(card, "telaCriarPersonagem");
			}
		});
		btnNewButton.setBounds(276, 58, 160, 52);
		painelInicial.add(btnNewButton);
		
		JButton btnTemplate = new JButton("Template");
		btnTemplate.setBounds(276, 131, 160, 52);
		painelInicial.add(btnTemplate);
		
		JButton btnVisualisarPersonagens = new JButton("Visualisar Personagens");
		btnVisualisarPersonagens.setBounds(276, 209, 160, 52);
		painelInicial.add(btnVisualisarPersonagens);
		
		JPanel painelCriarPersonagem = new JPanel();
		card.add(painelCriarPersonagem, "telaCriarPersonagem");
		painelCriarPersonagem.setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(22, 527, 89, 23);
		btnSalvar.setEnabled(false);
		painelCriarPersonagem.add(btnSalvar);
		
		JButton btnRetornar = new JButton("Retornar");
		btnRetornar.setBounds(127, 527, 89, 23);
		btnRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (card.getLayout());
				cl.show(card, "telaInicial");
			}
		});
		painelCriarPersonagem.add(btnRetornar);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 777, 505);
		painelCriarPersonagem.add(tabbedPane);
		
		JPanel painelDadosPersonagem = new JPanel();
		tabbedPane.addTab("DadosPersonagem", null, painelDadosPersonagem, null);
		
		JPanel painelAtributos = new JPanel();
		tabbedPane.addTab("Atributos", null, painelAtributos, null);
		tabbedPane.setEnabledAt(1, true);
		
		JLabel lblForca = new JLabel("For:");
		lblForca.setForeground(Color.BLACK);
		lblForca.setBackground(Color.GRAY);
		lblForca.setBounds(0, 43, 46, 21);
		lblForca.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblDestreza = new JLabel("Des:");
		lblDestreza.setBounds(0, 75, 46, 25);
		lblDestreza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblInt = new JLabel("Int:");
		lblInt.setBounds(0, 111, 46, 25);
		lblInt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblSaude = new JLabel("HT:");
		lblSaude.setBounds(0, 147, 46, 25);
		lblSaude.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNivelFor = new JLabel(Integer.toString(atributos.getForca()));
		lblNivelFor.setBounds(66, 43, 55, 21);
		lblNivelFor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNivelDes = new JLabel(Integer.toString(atributos.getDestreza()));
		lblNivelDes.setBounds(66, 75, 55, 21);
		lblNivelDes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNivelInt = new JLabel(Integer.toString(atributos.getInteligencia()));
		lblNivelInt.setBounds(66, 111, 55, 21);
		lblNivelInt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNivelSaude = new JLabel(Integer.toString(atributos.getSaude()));
		lblNivelSaude.setBounds(66, 147, 55, 21);
		lblNivelSaude.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblPontosGastosFor = new JLabel("0");
		lblPontosGastosFor.setBounds(144, 50, 46, 14);
		lblPontosGastosFor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPontosGastosFor.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPontosGastosDes = new JLabel("0");
		lblPontosGastosDes.setBounds(144, 75, 46, 14);
		lblPontosGastosDes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPontosGastosDes.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPontosGastosInt = new JLabel("0");
		lblPontosGastosInt.setBounds(144, 111, 46, 14);
		lblPontosGastosInt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPontosGastosInt.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPontosGastosSaude = new JLabel("0");
		lblPontosGastosSaude.setBounds(144, 147, 46, 14);
		lblPontosGastosSaude.setBackground(Color.WHITE);
		lblPontosGastosSaude.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPontosGastosSaude.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnDiminuirPontosGastosFor = new JButton("-");
		btnDiminuirPontosGastosFor.setBounds(242, 46, 46, 23);
		btnDiminuirPontosGastosFor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atributos.getForca()>0) {
					atributos.calculoCustoForcaModificadorTamanho();
					int valorGastoFor = Integer.parseInt(lblPontosGastosFor.getText());
					valorGastoFor = valorGastoFor - atributos.getCustoForca();
					atributos.setPontosGastosFor(valorGastoFor);
					atributos.calculoForca();
					lblNivelFor.setText(Integer.toString(atributos.getForca()));
					lblPontosGastosFor.setText(Integer.toString(valorGastoFor));
				}	
			}
		});
		
		JButton btnAumentarPontosGastosFor = new JButton("+");
		btnAumentarPontosGastosFor.setBounds(298, 47, 46, 21);
		btnAumentarPontosGastosFor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				atributos.calculoCustoForcaModificadorTamanho();
				int valorGastoFor = Integer.parseInt(lblPontosGastosFor.getText());
				valorGastoFor = valorGastoFor + atributos.getCustoForca();
				atributos.setPontosGastosFor(valorGastoFor);
				atributos.calculoForca();
				lblNivelFor.setText(Integer.toString(atributos.getForca()));
				lblPontosGastosFor.setText(Integer.toString(valorGastoFor));
			}
		});
		
		JButton btnAumentarPontosGastosDes = new JButton("+");
		btnAumentarPontosGastosDes.setBounds(298, 75, 46, 21);
		btnAumentarPontosGastosDes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorGastoDes = Integer.parseInt(lblPontosGastosDes.getText());
				valorGastoDes = valorGastoDes + 20;
				atributos.setPontosGastosDes(valorGastoDes);
				atributos.calculoDes();
				lblNivelDes.setText(Integer.toString(atributos.getDestreza()));
				lblPontosGastosDes.setText(Integer.toString(valorGastoDes));
			}
		});
		
		JButton btnAumentarPontosGastosInt = new JButton("+");
		btnAumentarPontosGastosInt.setBounds(298, 111, 46, 21);
		btnAumentarPontosGastosInt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

					int valorGastoInt = Integer.parseInt(lblPontosGastosInt.getText());
					valorGastoInt = valorGastoInt + 20;
					atributos.setPontosGastosInt(valorGastoInt);
					atributos.calculoInt();
					lblNivelInt.setText(Integer.toString(atributos.getInteligencia()));
					lblPontosGastosInt.setText(Integer.toString(valorGastoInt));
					
			}
		});
		
		JButton btnAumentarPontosGastosSaude = new JButton("+");
		btnAumentarPontosGastosSaude.setBounds(298, 147, 46, 21);
		btnAumentarPontosGastosSaude.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					int valorGastoSaude = Integer.parseInt(lblPontosGastosSaude.getText());
					valorGastoSaude = valorGastoSaude + 10;
					atributos.setPontosGastosSaude(valorGastoSaude);
					atributos.calculoSaude();
					lblNivelSaude.setText(Integer.toString(atributos.getSaude()));
					lblPontosGastosSaude.setText(Integer.toString(valorGastoSaude));
					
			}
		});
		
		JButton btnDiminuirPontosGastosDes = new JButton("-");
		btnDiminuirPontosGastosDes.setBounds(242, 75, 46, 23);
		btnDiminuirPontosGastosDes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atributos.getDestreza()>0) {
					int valorGastoDes = Integer.parseInt(lblPontosGastosDes.getText());
					valorGastoDes = valorGastoDes - 20;
					atributos.setPontosGastosDes(valorGastoDes);
					atributos.calculoDes();
					lblNivelDes.setText(Integer.toString(atributos.getDestreza()));
					lblPontosGastosDes.setText(Integer.toString(valorGastoDes));
				}	
			}
		});
		
		JButton btnDiminuirPontosGastosInt = new JButton("-");
		btnDiminuirPontosGastosInt.setBounds(242, 111, 46, 23);
		btnDiminuirPontosGastosInt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atributos.getInteligencia()>0) {
					
				
					int valorGastoInt = Integer.parseInt(lblPontosGastosInt.getText());
					valorGastoInt = valorGastoInt - 20;
					atributos.setPontosGastosInt(valorGastoInt);
					atributos.calculoInt();
					lblNivelInt.setText(Integer.toString(atributos.getInteligencia()));
					lblPontosGastosInt.setText(Integer.toString(valorGastoInt));
				
				}
			}
		});
		
		JButton btnDiminuirPontosGastosHT = new JButton("-");
		btnDiminuirPontosGastosHT.setBounds(242, 147, 46, 23);
		btnDiminuirPontosGastosHT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(atributos.getSaude()>0) {
					int valorGastoSaude = Integer.parseInt(lblPontosGastosSaude.getText());
					valorGastoSaude = valorGastoSaude - 10;
					atributos.setPontosGastosSaude(valorGastoSaude);
					atributos.calculoSaude();
					lblNivelSaude.setText(Integer.toString(atributos.getSaude()));
					lblPontosGastosSaude.setText(Integer.toString(valorGastoSaude));
				}
			}
		});
		
		JLabel lblTableNivelForca = new JLabel("Nivel For\u00E7a");
		lblTableNivelForca.setBounds(40, 6, 77, 21);
		lblTableNivelForca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Pontos Gastos");
		lblNewLabel_1.setBounds(123, 6, 94, 21);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		painelAtributos.setLayout(null);
		painelAtributos.add(lblForca);
		painelAtributos.add(lblDestreza);
		painelAtributos.add(lblInt);
		painelAtributos.add(lblSaude);
		painelAtributos.add(lblNivelFor);
		painelAtributos.add(lblNivelDes);
		painelAtributos.add(lblNivelInt);
		painelAtributos.add(lblNivelSaude);
		painelAtributos.add(lblPontosGastosFor);
		painelAtributos.add(lblPontosGastosDes);
		painelAtributos.add(lblPontosGastosInt);
		painelAtributos.add(lblPontosGastosSaude);
		painelAtributos.add(btnDiminuirPontosGastosFor);
		painelAtributos.add(btnAumentarPontosGastosFor);
		painelAtributos.add(btnAumentarPontosGastosDes);
		painelAtributos.add(btnAumentarPontosGastosInt);
		painelAtributos.add(btnAumentarPontosGastosSaude);
		painelAtributos.add(btnDiminuirPontosGastosDes);
		painelAtributos.add(btnDiminuirPontosGastosInt);
		painelAtributos.add(btnDiminuirPontosGastosHT);
		painelAtributos.add(lblTableNivelForca);
		painelAtributos.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(422, 50, 46, 14);
		painelAtributos.add(lblNewLabel);
		
		JPanel painelVantagens = new JPanel();
		tabbedPane.addTab("Vantagens", null, painelVantagens, null);
		
		JPanel painelHabilidades = new JPanel();
		tabbedPane.addTab("Habilidades", null, painelHabilidades, null);
		
		JPanel painelTecnicas = new JPanel();
		tabbedPane.addTab("T\u00E9cnicas", null, painelTecnicas, null);
		
		JPanel painelCombate = new JPanel();
		tabbedPane.addTab("Combate", null, painelCombate, null);
		
		JPanel painelGrimorio = new JPanel();
		tabbedPane.addTab("Grim\u00F3rio", null, painelGrimorio, null);
		
		JPanel painelInventario = new JPanel();
		tabbedPane.addTab("Invent\u00E1rio", null, painelInventario, null);
		
		
	}
}
