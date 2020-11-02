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

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(76, 56, 595, 279);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnCadastroClientes = new JButton("Clientes");
		btnCadastroClientes.setBounds(67, 111, 165, 52);
		panel.add(btnCadastroClientes);
		
		JButton btnCadastroPeca = new JButton("Pe\u00E7as");
		btnCadastroPeca.setBounds(370, 111, 165, 52);
		panel.add(btnCadastroPeca);
		
		JButton btnEmitirOS = new JButton("Emitir OS");
		btnEmitirOS.setBounds(228, 193, 149, 47);
		panel.add(btnEmitirOS);
		btnEmitirOS.setForeground(Color.BLACK);
		btnEmitirOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaOS os = new TelaOS();
				os.setVisible(true);
				
			}
		});
		btnEmitirOS.setBackground(Color.RED);
		btnEmitirOS.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(268, 11, 94, 37);
		panel.add(lblNewLabel);
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
		
		frame.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}

