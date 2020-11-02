package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import negocio.entidades.Cliente;
import negocio.entidades.Colaborador;
import negocio.ControladorCliente;
import negocio.ControladorColaborador;
import negocio.ControladorPeca;
import negocio.entidades.Peca;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JTextPane;

public class CadastroColaborador extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNome;
	private JTextField txtRG;
	private JComboBox cbxLista;
	private JTextField txtCPF;
	private JTextField txtMatricula;
	private JTextField txtLogin;
	private JTextField txtSenha;
	private JTextField textPesquisarCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CadastroColaborador dialog = new CadastroColaborador();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CadastroColaborador() {
		setResizable(false);
		setBounds(100, 100, 729, 392);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 713, 320);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 94, 713, 106);
		contentPanel.add(panel);
		panel.setLayout(null);
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(20, 11, 80, 14);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(120, 8, 166, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblRG = new JLabel("RG:");
		lblRG.setBounds(20, 76, 80, 14);
		panel.add(lblRG);
		
		txtRG = new JTextField();
		txtRG.setBounds(120, 73, 166, 20);
		panel.add(txtRG);
		txtRG.setColumns(10);
		
		JLabel lblCPF_1 = new JLabel("CPF:");
		lblCPF_1.setBounds(20, 42, 80, 14);
		panel.add(lblCPF_1);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(120, 39, 166, 20);
		panel.add(txtCPF);
		
		JLabel lblTelefone = new JLabel("Matr\u00EDcula:");
		lblTelefone.setBounds(398, 8, 80, 14);
		panel.add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Login:");
		lblEndereco.setBounds(398, 39, 80, 14);
		panel.add(lblEndereco);
		
		JLabel lblEmail = new JLabel("Senha:");
		lblEmail.setBounds(398, 73, 80, 14);
		panel.add(lblEmail);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(498, 8, 166, 20);
		panel.add(txtMatricula);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(498, 36, 166, 20);
		panel.add(txtLogin);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(498, 70, 166, 20);
		panel.add(txtSenha);
		
		cbxLista = new JComboBox();
		cbxLista.setBounds(23, 211, 667, 27);
		contentPanel.add(cbxLista);
		
		JLabel lblNewLabel = new JLabel("Colaboradores");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(295, 0, 190, 29);
		contentPanel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(23, 252, 667, 57);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Deletar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Colaborador colab= new Colaborador();
			ControladorColaborador.getInstancia().deletar(textPesquisarCPF.getText());
			
			
			if ( ControladorColaborador.getInstancia().deletar(textPesquisarCPF.getText())) {
				JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
				txtNome.setText("");
				txtCPF.setText("");
				txtRG.setText("");
				txtLogin.setText("");
				txtSenha.setText("");
				txtMatricula.setText("");
				
			}
			
			cbxLista.removeAllItems();
			for (Colaborador entity : ControladorColaborador.getInstancia().localizarTodos()) {
				cbxLista.removeItem(entity);
				
			}
		}});
		btnNewButton.setBounds(10, 11, 116, 32);
		panel_1.add(btnNewButton);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Colaborador colab= new Colaborador();
				colab.setNome(txtNome.getText());
				colab.setCpf(txtCPF.getText());
				colab.setRg(txtRG.getText());
				colab.setLogin(txtLogin.getText());
				
				
				if ( ControladorColaborador.getInstancia().atualizar(textPesquisarCPF.getText(), colab)) {
					JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
					txtNome.setText("");
					txtCPF.setText("");
					txtRG.setText("");
					txtLogin.setText("");
					txtSenha.setText("");
					txtMatricula.setText("");
					
				}
				
				cbxLista.removeAllItems();
				for (Colaborador entity : ControladorColaborador.getInstancia().localizarTodos()) {
					cbxLista.addItem(entity);
				}
				
				
			}
		});
		btnAtualizar.setBounds(256, 11, 116, 32);
		panel_1.add(btnAtualizar);
		
		JButton btnNewButton_1_1 = new JButton("Cadastrar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Colaborador colab= new Colaborador();
				colab.setNome(txtNome.getText());
				colab.setCpf(txtCPF.getText());
				colab.setRg(txtRG.getText());
				colab.setLogin(txtLogin.getText());
				
				
				if ( ControladorColaborador.getInstancia().inserir(colab) ) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					txtNome.setText("");
					txtCPF.setText("");
					txtRG.setText("");
					txtLogin.setText("");
					txtSenha.setText("");
					txtMatricula.setText("");
					
				}
				
				cbxLista.removeAllItems();
				for (Colaborador entity : ControladorColaborador.getInstancia().localizarTodos()) {
					cbxLista.addItem(entity);
				}
				
				
			}
		});
		btnNewButton_1_1.setBounds(510, 11, 116, 32);
		panel_1.add(btnNewButton_1_1);
		
		textPesquisarCPF = new JTextField();
		textPesquisarCPF.setText("Digite o CPF");
		textPesquisarCPF.setColumns(10);
		textPesquisarCPF.setBounds(238, 40, 279, 29);
		contentPanel.add(textPesquisarCPF);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Colaborador colab= ControladorColaborador.getInstancia().localizar(textPesquisarCPF.getText());
				if ( colab != null ) {
					txtRG.setText(colab.getRg());
					txtCPF.setText(colab.getCpf());
					txtNome.setText(colab.getNome());
					txtLogin.setText(colab.getLogin());
					txtMatricula.setText(colab.getMatricula());
					
				} else {
					JOptionPane.showMessageDialog(null, "Colaborador com CPF "+txtCPF.getText()+  " não localizado.");
				}
				
				}
				
		
		});
		btnPesquisar.setActionCommand("OK");
		btnPesquisar.setBounds(556, 43, 117, 23);
		contentPanel.add(btnPesquisar);
		
		JLabel lblNewLabel_1 = new JLabel("Localizar CPF:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(67, 41, 157, 22);
		contentPanel.add(lblNewLabel_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 320, 713, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				
			}
		}
	}
}