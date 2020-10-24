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
import negocio.entidades.ControladorCliente;
import negocio.entidades.ControladorPeca;
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
		panel.setBounds(0, 51, 713, 106);
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
		cbxLista.setBounds(20, 217, 667, 27);
		contentPanel.add(cbxLista);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(265, 11, 190, 29);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 320, 713, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton btnSalva = new JButton("Salvar");
				btnSalva.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
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
				btnSalva.setActionCommand("OK");
				buttonPane.add(btnSalva);
				getRootPane().setDefaultButton(btnSalva);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				
			}
		}
	}
}
