package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;


public class ColaboradorController {	
	
	@FXML // fx:id="comboBoxPecas"
    private ComboBox<String> comboBoxPecas; 

    @FXML // fx:id="comboBoxClientes"
    private ComboBox<String> comboBoxClientes; 

    @FXML // fx:id="comboBoxServicos"
    private ComboBox<String> comboBoxServicos; 

    @FXML
    void opcoesClientes(ActionEvent event) {

    }

    @FXML
    void opcoesPecas(ActionEvent event) {

    }

    @FXML
    void opcoesServicos(ActionEvent event) {

    }
    
    public void initialize(URL url, ResourceBundle rb) {
    	ObservableList<String> listaPecas = FXCollections.observableArrayList(
    			"Listar pe�as","Cadastrar pe�as", "Atualizar pe�as", "Excluir pe�as");
    	comboBoxPecas.setItems(listaPecas);
    	
    	ObservableList<String> listaClientes = FXCollections.observableArrayList(
    			"Listar clientes","Cadastrar clientes", "Atualizar clientes", "Excluir clientes");
    	comboBoxPecas.setItems(listaClientes);
    	
    	ObservableList<String> listaServicos = FXCollections.observableArrayList(
    			"Listar servi�os","Cadastrar servi�os", "Atualizar servi�os", "Excluir servi�os");
    	comboBoxPecas.setItems(listaServicos);
    }
}































