package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrincipalAdmin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalAdmin window = new PrincipalAdmin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrincipalAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 767, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClientes_1 = new JLabel("MENU - ADMIN");
		lblClientes_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblClientes_1.setBounds(311, 11, 124, 39);
		frame.getContentPane().add(lblClientes_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(51, 78, 688, 269);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnTelaColaborador = new JButton("Menu Colaborador");
		btnTelaColaborador.setBounds(32, 166, 168, 55);
		panel.add(btnTelaColaborador);
		
		JButton btnCadastroClientes = new JButton("Clientes");
		btnCadastroClientes.setBounds(32, 100, 168, 55);
		panel.add(btnCadastroClientes);
		
		JButton btnCadastroPeca = new JButton("Pecas");
		btnCadastroPeca.setBounds(32, 30, 168, 55);
		panel.add(btnCadastroPeca);
		
		JButton btnEmitirOS = new JButton("Emitir OS");
		btnEmitirOS.setBounds(390, 103, 149, 47);
		panel.add(btnEmitirOS);
		btnEmitirOS.setForeground(Color.BLACK);
		btnEmitirOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Mudar para tela da ordem de servico
				TelaOS telaOS = new TelaOS();
				telaOS.setVisible(true); ;
			}
		});
		btnEmitirOS.setBackground(Color.RED);
		btnEmitirOS.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		btnCadastroPeca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroPeca manutencaoPeca= new CadastroPeca();
				manutencaoPeca.setVisible(true);
				
			}
		});
		
		
		btnCadastroClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroCliente cadCliente = new CadastroCliente();
				cadCliente.setVisible(true);
			}
		});
		btnTelaColaborador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroColaborador telaColab = new CadastroColaborador();
				telaColab.setVisible(true);
			}
		});
		btnCadastroClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroCliente cadCliente = new CadastroCliente();
				cadCliente.setVisible(true);
			}
		});
		
		frame.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}

