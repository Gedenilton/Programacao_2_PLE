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
import negocio.entidades.Cliente;
import negocio.ControladorCliente;
import negocio.ControladorCliente;
import negocio.ControladorPeca;
import negocio.entidades.Peca;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JTextPane;

public class CadastroCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNome;
	private JTextField txtRG;
	private JComboBox cbxLista;
	private JTextField txtCPF;
	private JTextField txtTelefone;
	private JTextField txtEndereco;
	private JTextField txtEmail;
	private JTextField txtPesquisarCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CadastroCliente dialog = new CadastroCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CadastroCliente() {
		setModal(true);
		setBounds(100, 100, 729, 392);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 713, 320);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 91, 713, 106);
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
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(398, 8, 80, 14);
		panel.add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(398, 39, 80, 14);
		panel.add(lblEndereco);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(398, 73, 80, 14);
		panel.add(lblEmail);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(498, 5, 166, 20);
		panel.add(txtTelefone);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(498, 36, 166, 20);
		panel.add(txtEndereco);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(498, 70, 166, 20);
		panel.add(txtEmail);
		
		cbxLista = new JComboBox();
		cbxLista.setBounds(25, 282, 667, 27);
		contentPanel.add(cbxLista);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(265, 11, 190, 29);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Localizar CPF:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(50, 52, 157, 22);
		contentPanel.add(lblNewLabel_1);
		
		txtPesquisarCPF = new JTextField();
		txtPesquisarCPF.setToolTipText("Digite o CPF");
		txtPesquisarCPF.setColumns(10);
		txtPesquisarCPF.setBounds(221, 51, 279, 29);
		contentPanel.add(txtPesquisarCPF);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				Cliente cliente = ControladorCliente.getInstancia().localizar(txtPesquisarCPF.getText());
				txtRG.setText(cliente.getRg());
				txtCPF.setText(cliente.getCpf());
				txtTelefone.setText(cliente.getTelefone());
				txtEndereco.setText(cliente.getEndereco());
				txtEmail.setText(cliente.getEmail());
				txtNome.setText(cliente.getNome());
			
				}
				
				
			}
		);
		btnPesquisar.setActionCommand("OK");
		btnPesquisar.setBounds(539, 54, 117, 23);
		contentPanel.add(btnPesquisar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(25, 214, 667, 57);
		contentPanel.add(panel_1);
		
		JButton btnNewButton = new JButton("Deletar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Cliente cliente= new Cliente();
				ControladorCliente.getInstancia().deletar(txtPesquisarCPF.getText());
				
				
				if ( ControladorCliente.getInstancia().deletar(txtPesquisarCPF.getText())) {
					JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
					txtNome.setText("");
					txtCPF.setText("");
					txtRG.setText("");
					txtEndereco.setText("");
					txtTelefone.setText("");
					txtEmail.setText("");
					
					
				}
				
				cbxLista.removeAllItems();
				for (Cliente entity : ControladorCliente.getInstancia().localizarTodos()) {
					cbxLista.removeItem(entity);
					
				}
				
				
			}
		});
		btnNewButton.setBounds(10, 11, 116, 32);
		panel_1.add(btnNewButton);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente= new Cliente();
				cliente.setNome(txtNome.getText());
				cliente.setCpf(txtCPF.getText());
				cliente.setRg(txtRG.getText());
				cliente.setEndereco(txtEndereco.getText());
				cliente.setTelefone(txtTelefone.getText());
				cliente.setEmail(txtEmail.getText());
				
				
				if ( ControladorCliente.getInstancia().atualizar(txtPesquisarCPF.getText(), cliente)) {
					JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
					txtNome.setText("");
					txtCPF.setText("");
					txtRG.setText("");
					txtEndereco.setText("");
					txtTelefone.setText("");
					txtEmail.setText("");
					
				}
				
				cbxLista.removeAllItems();
				for (Cliente entity : ControladorCliente.getInstancia().localizarTodos()) {
					cbxLista.addItem(entity);
				}
				
			}
		});
		btnAtualizar.setBounds(256, 11, 116, 32);
		panel_1.add(btnAtualizar);
		
		JButton btnNewButton_1_1 = new JButton("Cadastrar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Cliente cliente= new Cliente();
				cliente.setNome(txtNome.getText());
				cliente.setCpf(txtCPF.getText());
				cliente.setRg(txtRG.getText());
				cliente.setTelefone(txtTelefone.getText());
				cliente.setEndereco(txtEndereco.getText());
				cliente.setEmail(txtEmail.getText());
				
				if ( ControladorCliente.getInstancia().inserir(cliente) ) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					txtNome.setText("");
					txtRG.setText("");
					
				}
				
				cbxLista.removeAllItems();
				for (Cliente entity : ControladorCliente.getInstancia().localizarTodos()) {
					cbxLista.addItem(entity);
				}
				
			}
		});
		btnNewButton_1_1.setBounds(510, 11, 116, 32);
		panel_1.add(btnNewButton_1_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 320, 713, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton btnSalva = new JButton("Salvar");
				btnSalva.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
					}
				});
				btnSalva.setActionCommand("OK");
				buttonPane.add(btnSalva);
				getRootPane().setDefaultButton(btnSalva);
			}
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
