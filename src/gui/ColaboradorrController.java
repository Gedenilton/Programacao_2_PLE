package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author Gedenilton
 */
public class ColaboradorrController implements Initializable {

	@FXML // fx:id="comboBoxPecas"
	private ComboBox comboBoxPecas;

	@FXML // fx:id="comboBoxClientes"
	private ComboBox comboBoxClientes;

	@FXML // fx:id="comboBoxServicos"
	private ComboBox comboBoxServicos;

	@FXML
	private Button btnEmitirOS;

	@FXML
	private Button btnPecas;

	@FXML
	private Button btnClientes;

	@FXML
	private Button btnServicos;

	@FXML
	void opcoesPecas(ActionEvent event) {
		comboBoxPecas.getSelectionModel().getSelectedItem().toString();
	}

	/*
	 * Pecas
	 */
	@FXML
	void ProsseguirPecas(ActionEvent e) {
		System.out.println("Botão funcionando!");
		JavaFXApplication.MudarTela("Cadastrar pecas");

	}

	@FXML
	void opcoesClientes(ActionEvent event) {
		comboBoxClientes.getSelectionModel().getSelectedItem().toString();
	}

	@FXML
	void opcoesServicoss(ActionEvent event) {
		comboBoxServicos.getSelectionModel().getSelectedItem().toString();

	}
//Exibir os combobox com conteúdo.
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		ObservableList<String> listaPecas = FXCollections.observableArrayList(" ", "Listar pecas", "Cadastrar pecas",
				"Atualizar pecas", "Excluir pecas");
		comboBoxPecas.setItems(listaPecas);

		ObservableList<String> listaClientes = FXCollections.observableArrayList(" ", "Listar clientes",
				"Cadastrar clientes", "Atualizar clientes", "Excluir clientes");
		comboBoxClientes.setItems(listaClientes);

		ObservableList<String> listaServicos = FXCollections.observableArrayList(" ", "Listar servicos",
				"Cadastrar servicos", "Atualizar servicos", "Excluir servicos");
		comboBoxServicos.setItems(listaServicos);
	}

}
