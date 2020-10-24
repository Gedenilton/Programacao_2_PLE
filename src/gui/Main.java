package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnManutenoDePeas = new JButton("Manuten\u00E7\u00E3o de Pe\u00E7as");
		btnManutenoDePeas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManutencaoPeca manutencaoPeca= new ManutencaoPeca();
				manutencaoPeca.setVisible(true);
				
			}
		});
		btnManutenoDePeas.setBounds(42, 107, 178, 57);
		frame.getContentPane().add(btnManutenoDePeas);
	}
}
