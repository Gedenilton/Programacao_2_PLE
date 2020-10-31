package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import negocio.entidades.Colaborador;
import negocio.ControladorColaborador;

public class TelaDeLoginPrincipal {

	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField passwordLogin;
	private JLabel lblSenha;
	

	/**
	 * Create the application.
	 */
	public TelaDeLoginPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(132, 112, 158, 20);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtLogin.getText().trim().equals("admin") && passwordLogin.getText().trim().equals("admin")) {
					PrincipalAdmin menu = new PrincipalAdmin();
					menu.setVisible(true);
				} else {
				Colaborador colaborador = new Colaborador();
				colaborador.setCpf( txtLogin.getText() );
				colaborador.setSenha( passwordLogin.getText() );
				
				if ( ControladorColaborador.getInstancia().usuarioLogado(colaborador) ) {
					new TelaDeLoginPrincipal();
					frame.setVisible(false);
					Principal menu = new Principal();
					menu.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Senha ou login invalido");
				}
				
			
		}}});
		btnLogin.setBounds(167, 220, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		passwordLogin = new JPasswordField();
		passwordLogin.setToolTipText("");
		passwordLogin.setBounds(132, 168, 158, 20);
		frame.getContentPane().add(passwordLogin);
		
		JLabel lblCPF = new JLabel("Usuario:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCPF.setBounds(132, 81, 106, 20);
		frame.getContentPane().add(lblCPF);
		
		lblSenha = new JLabel("Insira a senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(132, 143, 106, 14);
		frame.getContentPane().add(lblSenha);
		
		frame.setVisible(true);
	}
}
