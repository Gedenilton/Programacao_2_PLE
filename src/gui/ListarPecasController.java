package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import repositorios.RepositorioPecas;

/**
 *
 * @author Gedenilton
 */
public class ListarPecasController implements Initializable {
        
    @FXML // fx:id="comboBoxPecas"
    private ComboBox comboBoxPecas;
    
    @FXML
    void opcoesPecas(ActionEvent event){
        comboBoxPecas.getSelectionModel().getSelectedItem().toString();
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<RepositorioPecas> listaPecas = FXCollections.observableArrayList();
        comboBoxPecas.setItems(listaPecas);
    } 
    
    
}

































