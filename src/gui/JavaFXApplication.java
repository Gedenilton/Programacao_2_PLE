/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Gedenilton
 */
public class JavaFXApplication extends Application {
	private static Stage palco;
	private static Scene telaPrincipal;
	private static Scene telaListarPecas;
	private static Scene telaCadastrarPecas;
        private static Scene telaAtualizarPecas;

	@Override
	public void start(Stage stage) throws Exception {
		/* codigos comentados foram gerados automaticamente*/
//        Parent root = FXMLLoader.load(getClass().getResource("TelaColaborador.fxml"));
//        
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();

		palco = stage;
		
		//Codigo para carregar a tela do colaborador
		Parent fxmlPrincipal = FXMLLoader.load(getClass().getResource("TelaColaborador.fxml"));
		telaPrincipal = new Scene(fxmlPrincipal);

		//C�digo para carregar a tela ListarPecas
		Parent fxmlListarPecas = FXMLLoader.load(getClass().getResource("TelaListarPecas.fxml"));
		telaListarPecas = new Scene(fxmlListarPecas);
		
		//C�digo para carregar a tela CadastrarPecas
		Parent fxmlCadastrarPecas = FXMLLoader.load(getClass().getResource("TelaCadastrarPecas.fxml"));
		telaCadastrarPecas = new Scene(fxmlCadastrarPecas);
                
                //C�digo para carregar a tela AtualizarPecas
		Parent fxmlAtualizarPecas = FXMLLoader.load(getClass().getResource("TelaAtualizarPecas.fxml"));
		telaAtualizarPecas = new Scene(fxmlAtualizarPecas);

		//Scene scene = new Scene(fxmlPrincipal);
		stage.setScene(telaPrincipal);
		stage.show();
	}
	
	public static void MudarTela(String opcoes) {
		switch(opcoes) {
		case "Listar pe�as":
			palco.setScene(telaListarPecas);
			break;
			
		case "Cadastrar pe�as":
			palco.setScene(telaCadastrarPecas);
			break;
		
		case "Atualizar pe�as":
			palco.setScene(telaListarPecas);
			break;
		case "Excluir pe�as":
			palco.setScene(telaListarPecas);
			break;
		case " ":
			palco.setScene(telaPrincipal);
			break;
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}






















