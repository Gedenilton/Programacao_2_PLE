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
import javax.swing.JTabbedPane;

public class MainAdmin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainAdmin window = new MainAdmin();
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
	public MainAdmin() {
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
		
		JLabel lblAdmin = new JLabel("Menu Admin");
		lblAdmin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAdmin.setBounds(321, 22, 94, 55);
		frame.getContentPane().add(lblAdmin);
		
		JButton btnCadastroColaborador = new JButton("Cadastro de Colaboradores");
		btnCadastroColaborador.setBounds(51, 122, 168, 35);
		frame.getContentPane().add(btnCadastroColaborador);
		
		JButton btnAtualizarColaboradores = new JButton("Atualizar Colaboradores");
		btnAtualizarColaboradores.setBounds(51, 168, 168, 35);
		frame.getContentPane().add(btnAtualizarColaboradores);
		
		JButton btnDeletarColaboradores = new JButton("Deletar Colaboradores");
		btnDeletarColaboradores.setBounds(51, 214, 168, 35);
		frame.getContentPane().add(btnDeletarColaboradores);
		
		JButton btnListarColaboradores = new JButton("Listar Colaboradores");
		btnListarColaboradores.setBounds(51, 259, 168, 35);
		frame.getContentPane().add(btnListarColaboradores);
		
		JButton btnTelaColaborador = new JButton("Menu Colaborador");
		btnTelaColaborador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main menucolab = new Main().setVisible(true);
			}
		});
		btnTelaColaborador.setBounds(433, 157, 223, 78);
		frame.getContentPane().add(btnTelaColaborador);
	}
}
