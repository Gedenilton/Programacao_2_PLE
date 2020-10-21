package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Gedenilton
 */
public class AtualizarPecasController implements Initializable {

	@FXML // fx:id="TextFieldCodigoPeca"
	private TextField TextFieldCodigoPeca;
	@FXML // fx:id="TextFieldDescricaoPeca"
	private TextField TextFieldDescricaoPeca;

	@FXML // fx:id="TextFieldPre�oPeca"
	private TextField TextFieldPrecoPeca;

	@FXML // fx:id="TextFieldQtdEstoquePeca"
	private TextField TextFieldQtdEstoquePeca;

	@FXML // fx:id="btnCancelar"
	private Button btnCancelar;

	@FXML // fx:id="btnOK"
	private Button btnOK;

	@FXML
	void opcoesPecas(ActionEvent event) {

	}
	
	/*
	 * Ao apertar o bot�o cancelar o codigo deve voltar para a TelaColaborador
	 * falta consertar essa funcionalidade
	 * */
	@FXML
    void Cancelar(ActionEvent e) {
    	System.out.println("testando no console!");
    	JavaFXApplication.MudarTela("telaPrincipal");
    	    	
    }

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

}
