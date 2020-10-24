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

import negocio.entidades.ControladorPeca;
import negocio.entidades.Peca;
import javax.swing.JComboBox;
import javax.swing.JList;

public class CadastroPeca extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtDescricao;
	private JComboBox cbxLista;

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
		panel.setBounds(0, 31, 713, 85);
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
		
		cbxLista = new JComboBox();
		cbxLista.setBounds(20, 143, 667, 27);
		contentPanel.add(cbxLista);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 320, 713, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton btnSalva = new JButton("Salvar");
				btnSalva.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						Peca peca= new Peca();
						peca.setCodigo( txtCodigo.getText() );
						peca.setDescricao( txtDescricao.getText() );
						
						if ( ControladorPeca.getInstancia().inserir(peca) ) {
							JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
							txtCodigo.setText("");
							txtDescricao.setText("");
							
						}
						
						cbxLista.removeAllItems();
						for (Peca entity : ControladorPeca.getInstancia().localizarTodos()) {
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
