package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import negocio.ControladorCliente;
import negocio.ControladorOrdemServico;
import negocio.entidades.Cliente;
import negocio.entidades.Colaborador;
import negocio.entidades.OrdemServico;
import negocio.entidades.Peca;
import negocio.entidades.Servico;
import negocio.entidades.enums.StatusServico;

public class TelaOS extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodOS;
	private JTextField txtColaborador;
	private JTextField txtCodPeca;
	private JTextField txtTipoServico;
	private JTextField txtValorServico;
	private JTextField txtValorTotal;
	private JTextField txtAdiantamento;
	private JTextField txtCPF;

	private static Cliente cliente;

	JDateChooser dataEntrada;
	JDateChooser dataSaida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaOS dialog = new TelaOS();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaOS() {

		setModal(true);
		setBounds(100, 100, 729, 729);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 713, 320);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 79, 713, 106);
		contentPanel.add(panel);
		panel.setLayout(null);
		JLabel lblCodOS = new JLabel("Cod. Ordem de Servi\u00E7o:");
		lblCodOS.setBounds(20, 11, 135, 14);
		panel.add(lblCodOS);

		txtCodOS = new JTextField();
		txtCodOS.setBounds(162, 5, 166, 20);
		panel.add(txtCodOS);
		txtCodOS.setColumns(10);

		JLabel lblDataEntrada = new JLabel("Data de entrada:");
		lblDataEntrada.setBounds(20, 42, 132, 14);
		panel.add(lblDataEntrada);

		JLabel lblDataSaida = new JLabel("Data de saida:");
		lblDataSaida.setBounds(20, 76, 135, 14);
		panel.add(lblDataSaida);

		JLabel lblColaborador = new JLabel("Colaborador:");
		lblColaborador.setBounds(409, 11, 79, 14);
		panel.add(lblColaborador);

		txtColaborador = new JTextField();
		txtColaborador.setColumns(10);
		txtColaborador.setBounds(498, 8, 166, 20);
		panel.add(txtColaborador);

		/*
		 * Combobox Status
		 */
		JComboBox comboBoxStatus = new JComboBox();
		comboBoxStatus.setBounds(498, 34, 166, 22);
		panel.add(comboBoxStatus);
		comboBoxStatus.setModel(new DefaultComboBoxModel<>(StatusServico.values()));

		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setBounds(409, 42, 70, 14);
		panel.add(lblStatus);

		dataEntrada = new JDateChooser();
		dataEntrada.setBounds(162, 36, 166, 20);
		panel.add(dataEntrada);

		dataSaida = new JDateChooser();
		dataSaida.setBounds(162, 70, 166, 20);
		panel.add(dataSaida);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 92, 713, 20);
		panel.add(separator);

		JLabel lblOS = new JLabel("Ordem de Servi\u00E7o");
		lblOS.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblOS.setBounds(265, 11, 190, 29);
		contentPanel.add(lblOS);

		JLabel lblNomeCliente = new JLabel("Nome:");
		lblNomeCliente.setBounds(17, 220, 80, 14);
		contentPanel.add(lblNomeCliente);

		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(17, 254, 80, 14);
		contentPanel.add(lblEndereco);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(17, 282, 80, 14);
		contentPanel.add(lblEmail);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 319, 713, 20);
		contentPanel.add(separator_1);

		JLabel lblCPD = new JLabel("CPF:");
		lblCPD.setBounds(17, 189, 80, 14);
		contentPanel.add(lblCPD);

		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(161, 189, 166, 20);
		contentPanel.add(txtCPF);

		JButton btnBuscarCpf = new JButton("Buscar CPF");
		btnBuscarCpf.setActionCommand("OK");
		btnBuscarCpf.setBounds(337, 182, 118, 23);
		contentPanel.add(btnBuscarCpf);

		JLabel lblResultNome = new JLabel("[Nome do cliente]");
		lblResultNome.setBounds(161, 220, 166, 14);
		contentPanel.add(lblResultNome);

		JLabel lblResultEndereco = new JLabel("[Endereco do cliente]");
		lblResultEndereco.setBounds(161, 251, 166, 14);
		contentPanel.add(lblResultEndereco);

		JLabel lbleResultEmailDoCliente = new JLabel("[Email do cliente]");
		lbleResultEmailDoCliente.setBounds(161, 285, 166, 14);
		contentPanel.add(lbleResultEmailDoCliente);

		// Buscar o CPF e preencher os campos com dados do cliente
		btnBuscarCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				cliente = ControladorCliente.getInstancia().localizar(txtCPF.getText());
				lblResultNome.setText(cliente.getNome());
				lblResultEndereco.setText(cliente.getEndereco());
				lbleResultEmailDoCliente.setText(cliente.getEmail());
			}

		});

		JLabel lblCodPeca = new JLabel("Cod. pe\u00E7a:");
		lblCodPeca.setBounds(20, 346, 80, 14);
		getContentPane().add(lblCodPeca);

		txtCodPeca = new JTextField();
		txtCodPeca.setColumns(10);
		txtCodPeca.setBounds(162, 343, 166, 20);
		getContentPane().add(txtCodPeca);

		JLabel lblTipoServico = new JLabel("Tipo de servi\u00E7o:");
		lblTipoServico.setBounds(20, 377, 132, 14);
		getContentPane().add(lblTipoServico);

		txtTipoServico = new JTextField();
		txtTipoServico.setColumns(10);
		txtTipoServico.setBounds(162, 374, 166, 20);
		getContentPane().add(txtTipoServico);

		JLabel lblDescricao = new JLabel("Descricao do servi\u00E7o:");
		lblDescricao.setBounds(20, 405, 132, 14);
		getContentPane().add(lblDescricao);

		JTextArea txtAreaServico = new JTextArea();
		txtAreaServico.setWrapStyleWord(true);
		txtAreaServico.setBounds(162, 408, 346, 100);
		getContentPane().add(txtAreaServico);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(0, 550, 713, 20);
		getContentPane().add(separator_1_1);

		JLabel lblPrecoServico = new JLabel("Valor do Servi\u00E7o:");
		lblPrecoServico.setBounds(20, 522, 102, 14);
		getContentPane().add(lblPrecoServico);

		txtValorServico = new JTextField();
		txtValorServico.setColumns(10);
		txtValorServico.setBounds(162, 519, 166, 20);
		getContentPane().add(txtValorServico);

		txtValorTotal = new JTextField();
		txtValorTotal.setColumns(10);
		txtValorTotal.setBounds(162, 569, 166, 20);
		getContentPane().add(txtValorTotal);

		JLabel lblValorTotal = new JLabel("Valor total:");
		lblValorTotal.setBounds(20, 572, 102, 14);
		getContentPane().add(lblValorTotal);

		txtAdiantamento = new JTextField();
		txtAdiantamento.setColumns(10);
		txtAdiantamento.setBounds(162, 609, 166, 20);
		getContentPane().add(txtAdiantamento);

		JLabel lblAdiantamento = new JLabel("Adiantamento:");
		lblAdiantamento.setBounds(20, 612, 102, 14);
		getContentPane().add(lblAdiantamento);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 657, 713, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton btnSalva = new JButton("Salvar");
				btnSalva.addActionListener(new ActionListener() {
					
					// Salvar no RepositorioOrdemServico
					public void actionPerformed(ActionEvent e) {
						
						Colaborador colaborador = new Colaborador();
						colaborador.setMatricula(txtColaborador.getText());
						
						Peca peca = new Peca();
						peca.setCodigo(txtCodPeca.getText());
						
						Servico servico = new Servico();
						servico.setTipoServico(txtTipoServico.getText());
						servico.setDescricaoServico(txtAreaServico.getText());
						
						OrdemServico ordemServico = new OrdemServico();
						//ordemServico.setStatusServico(comboBoxStatus.getItemListeners();
						OrdemServico status = new OrdemServico();
						//status.setStatusServico(comboBoxStatus.getText());

						OrdemServico ordemS = new OrdemServico();
						ordemS.setCliente(cliente);
						ordemS.setColaborador(colaborador);
						ordemS.setDataEntrada(dataEntrada.getDate());
						ordemS.setDataEntrada(dataSaida.getDate());

						// Verifica se os campos existe vazio, se existir emite um alerta
						if (cliente == null || dataEntrada.getDate() == null || dataSaida.getDate() == null
								|| txtColaborador.getText() == null || "".equals(txtColaborador.getText())
								|| txtCPF.getText() == null || "".equals(txtCPF.getText())
								|| txtCodPeca.getText() == null || "".equals(txtTipoServico.getText())
								|| "".equals(txtAreaServico.getText()) || "".equals(txtValorTotal.getText())
								|| "".equals(txtAdiantamento.getText())) {// arrumar

							JOptionPane.showMessageDialog(null, "Prencha todos os campos");
						} else {
							if (ControladorOrdemServico.getInstancia().inserir(ordemS)) {
								JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
								txtCPF.setText("");
								lblResultNome.setText("[Nome do cliente]");
								lblResultEndereco.setText("[Endereco do cliente]");
								lbleResultEmailDoCliente.setText("[Email do cliente]");
								cliente = null;

							}
						}

//						if ( ControladorOrdemServico.getInstancia().inserir(ordemS)) {
//							JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
//							txtCPF.setText("");
//							txtNomeCliente.setText("");
//							txtEnderecoCliente.setText("");
//							txtEmailCliente.setText("");
//							cliente=null;
//							
//						}
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

//	public Cliente getCliente() {
//		return cliente;
//	}
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}
}
