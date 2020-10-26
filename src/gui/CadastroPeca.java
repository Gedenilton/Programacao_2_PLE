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

import negocio.entidades.Colaborador;
import negocio.entidades.ControladorColaborador;
import negocio.entidades.ControladorPeca;
import negocio.entidades.ControladorPeca;
import negocio.entidades.Peca;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.Font;

public class CadastroPeca extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtDescricao;
	private JComboBox cbxLista;
	private JTextField textPreco;
	private JTextField textEstoque;
	private JTextField txtDigiteOCdigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CadastroPeca dialog = new CadastroPeca();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CadastroPeca() {
		setModal(true);
		setBounds(100, 100, 729, 392);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 713, 320);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 117, 713, 85);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setBounds(10, 11, 80, 14);
		panel.add(lblCdigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(120, 8, 166, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(10, 39, 80, 14);
		panel.add(lblDescrio);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(120, 37, 166, 20);
		panel.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblPreco = new JLabel("Pre\u00E7o:");
		lblPreco.setBounds(364, 14, 80, 14);
		panel.add(lblPreco);
		
		JLabel lblEstoque = new JLabel("Quantidade Estoque:");
		lblEstoque.setBounds(364, 42, 126, 14);
		panel.add(lblEstoque);
		
		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(518, 8, 166, 20);
		panel.add(textPreco);
		
		textEstoque = new JTextField();
		textEstoque.setColumns(10);
		textEstoque.setBounds(518, 39, 166, 20);
		panel.add(textEstoque);
		
		cbxLista = new JComboBox();
		cbxLista.setBounds(21, 213, 667, 27);
		contentPanel.add(cbxLista);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(21, 251, 667, 57);
		contentPanel.add(panel_1);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Peca peca= new Peca();
				ControladorPeca.getInstancia().deletar(txtDigiteOCdigo.getText());
				
				
				if ( ControladorPeca.getInstancia().deletar(txtDigiteOCdigo.getText())) {
					JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
					txtCodigo.setText("");
					txtDescricao.setText("");
					textEstoque.setText("");
					textPreco.setText("");
					
					
				}
				
				cbxLista.removeAllItems();
				for (Peca entity : ControladorPeca.getInstancia().localizarTodos()) {
					cbxLista.removeItem(entity);
					
				}
				
				
			}
		});
		btnDeletar.setBounds(10, 11, 116, 32);
		panel_1.add(btnDeletar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Peca peca= new Peca();
				peca.setCodigo( txtCodigo.getText() );
				peca.setDescricao( txtDescricao.getText() );
				peca.setPreco(Double.parseDouble(textPreco.getText()));
				peca.setQtdEstoque(Integer.parseInt(textEstoque.getText()));
				
	
				
				if ( ControladorPeca.getInstancia().atualizar(txtDigiteOCdigo.getText(), peca)) {
					JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
					txtCodigo.setText("");
					txtDescricao.setText("");
					textEstoque.setText("");
					textPreco.setText("");
					
				}
				
				cbxLista.removeAllItems();
				for (Colaborador entity : ControladorColaborador.getInstancia().localizarTodos()) {
					cbxLista.addItem(entity);
				}
				
				
			}
		});
		btnAtualizar.setBounds(255, 11, 116, 32);
		panel_1.add(btnAtualizar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Peca peca= new Peca();
				peca.setCodigo( txtCodigo.getText() );
				peca.setDescricao( txtDescricao.getText() );
				peca.setPreco(Double.parseDouble(textPreco.getText()));
				peca.setQtdEstoque(Integer.parseInt(textEstoque.getText()));
				
				
				if ( ControladorPeca.getInstancia().inserir(peca) ) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
					txtCodigo.setText("");
					txtDescricao.setText("");
					textEstoque.setText("");
					textPreco.setText("");
					
				}
				
				cbxLista.removeAllItems();
				for (Peca entity : ControladorPeca.getInstancia().localizarTodos()) {
					cbxLista.addItem(entity);
				}
				
			}
		});
		btnCadastrar.setBounds(510, 11, 116, 32);
		panel_1.add(btnCadastrar);
		
		txtDigiteOCdigo = new JTextField();
		txtDigiteOCdigo.setText("Digite o c\u00F3digo da pe\u00E7a");
		txtDigiteOCdigo.setColumns(10);
		txtDigiteOCdigo.setBounds(212, 63, 279, 29);
		contentPanel.add(txtDigiteOCdigo);
		
		JLabel lblNewLabel_1 = new JLabel("Localizar Pe\u00E7a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(79, 64, 123, 22);
		contentPanel.add(lblNewLabel_1);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Peca peca = ControladorPeca.getInstancia().localizar(txtDigiteOCdigo.getText());
				if ( peca != null ) {
					txtCodigo.setText(peca.getCodigo());
					txtDescricao.setText(peca.getDescricao());
					textEstoque.setText(Integer.toString(peca.getQtdEstoque()));
					textPreco.setText(peca.getPreco().toString());
					
					
				} else {
					JOptionPane.showMessageDialog(null, "Peça com código "+txtCodigo.getText()+  " não localizado.");
				}
				
				}
				
			});
		{}
		btnPesquisar.setActionCommand("OK");
		btnPesquisar.setBounds(534, 66, 117, 23);
		contentPanel.add(btnPesquisar);
		
		JLabel lblNewLabel = new JLabel("Pe\u00E7as");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(327, 11, 68, 27);
		contentPanel.add(lblNewLabel);
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
