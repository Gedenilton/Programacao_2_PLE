package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
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
		
		JButton btnCadastroPeca = new JButton("Cadastro de Pecas");
		btnCadastroPeca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroPeca manutencaoPeca= new CadastroPeca();
				manutencaoPeca.setVisible(true);
				
			}
		});
		btnCadastroPeca.setBounds(28, 87, 168, 35);
		frame.getContentPane().add(btnCadastroPeca);
		
		JButton btnAtualizarPecas = new JButton("Atualizar Pe\u00E7a");
		btnAtualizarPecas.setBounds(28, 133, 168, 35);
		frame.getContentPane().add(btnAtualizarPecas);
		
		JButton btnDeletar = new JButton("Deletar Pe\u00E7as");
		btnDeletar.setBounds(28, 179, 168, 35);
		frame.getContentPane().add(btnDeletar);
		
		JButton btnListarPecas = new JButton("Listar Pe\u00E7as");
		btnListarPecas.setBounds(28, 224, 168, 35);
		frame.getContentPane().add(btnListarPecas);
		
		JButton btnCadastrarServico = new JButton("Cadastro de Servi\u00E7os");
		btnCadastrarServico.setBounds(286, 87, 168, 35);
		frame.getContentPane().add(btnCadastrarServico);
		
		JButton btnAtualizarServico = new JButton("Atualizar Servi\u00E7os");
		btnAtualizarServico.setBounds(286, 133, 168, 35);
		frame.getContentPane().add(btnAtualizarServico);
		
		JButton btnDeletaServicos = new JButton("Deletar Servi\u00E7os");
		btnDeletaServicos.setBounds(286, 179, 168, 35);
		frame.getContentPane().add(btnDeletaServicos);
		
		JButton btnListarServicos = new JButton("Listar Servi\u00E7os");
		btnListarServicos.setBounds(286, 224, 168, 35);
		frame.getContentPane().add(btnListarServicos);
		
		JButton btnCadastroClientes = new JButton("Cadastro de Clientes");
		btnCadastroClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroCliente cadCliente = new CadastroCliente();
				cadCliente.setVisible(true);
			}
		});
		btnCadastroClientes.setBounds(549, 87, 168, 35);
		frame.getContentPane().add(btnCadastroClientes);
		
		JButton btnAtualizarClientes = new JButton("Atualizar Clientes");
		btnAtualizarClientes.setBounds(549, 133, 168, 35);
		frame.getContentPane().add(btnAtualizarClientes);
		
		JButton btnDeletarClientes = new JButton("Deletar Clientes");
		btnDeletarClientes.setBounds(549, 179, 168, 35);
		frame.getContentPane().add(btnDeletarClientes);
		
		JButton btnListarClientes = new JButton("Listar Clientes");
		btnListarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListarCliente listCliente = new ListarCliente();
				listCliente.setVisible(true);
			}
		});
		btnListarClientes.setBounds(549, 224, 168, 35);
		frame.getContentPane().add(btnListarClientes);
		
		JButton btnEmitirOS = new JButton("Emitir OS");
		btnEmitirOS.setForeground(Color.BLACK);
		btnEmitirOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEmitirOS.setBackground(Color.RED);
		btnEmitirOS.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEmitirOS.setBounds(36, 301, 149, 47);
		frame.getContentPane().add(btnEmitirOS);
		
		JLabel lblNewLabel = new JLabel("Pe\u00E7as");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(84, 52, 75, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblClientes = new JLabel("Servi\u00E7os");
		lblClientes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblClientes.setBounds(332, 52, 122, 24);
		frame.getContentPane().add(lblClientes);
		
		JLabel lblClientes_1 = new JLabel("Clientes");
		lblClientes_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblClientes_1.setBounds(589, 54, 75, 24);
		frame.getContentPane().add(lblClientes_1);
	}
	
	public Main setVisible(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

		
	}

