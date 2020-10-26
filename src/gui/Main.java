package gui;

import java.awt.EventQueue;

import negocio.entidades.Colaborador;
import negocio.entidades.ControladorColaborador;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					//ControladorColaborador.getInstancia().inserir( new Colaborador("Michelle", "rg", "111", null,"222") );
					
					new TelaDeLoginPrincipal();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
