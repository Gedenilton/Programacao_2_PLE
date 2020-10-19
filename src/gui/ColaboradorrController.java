/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    void opcoesPecas(ActionEvent event){
        comboBoxPecas.getSelectionModel().getSelectedItem().toString();
    }
    
    /*
     * Pe�as
     * */
    @FXML
    void ProsseguirPecas(ActionEvent e) {
    	System.out.println("Testando no console!");
    	JavaFXApplication.MudarTela("Cadastrar peças");
    	
    }
    
    @FXML
    void opcoesClientes(ActionEvent event){
        comboBoxPecas.getSelectionModel().getSelectedItem().toString();
    }
    
    @FXML
    void opcoesServicoss(ActionEvent event){
        comboBoxPecas.getSelectionModel().getSelectedItem().toString();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> listaPecas = FXCollections.observableArrayList(" ",
        		"Listar pe�as", "Cadastrar peças", "Atualizar peças", "Excluir peças");
        comboBoxPecas.setItems(listaPecas);
        
//        ObservableList<String> listaClientes = FXCollections.observableArrayList(" ",
//    			"Listar clientes","Cadastrar clientes", "Atualizar clientes", "Excluir clientes");
//    	comboBoxPecas.setItems(listaClientes);
//    	
//    	ObservableList<String> listaServicos = FXCollections.observableArrayList(" ",
//    			"Listar serviços","Cadastrar servi�os", "Atualizar servi�os", "Excluir servi�os");
//    	comboBoxPecas.setItems(listaServicos);
    } 
    
    
}

































