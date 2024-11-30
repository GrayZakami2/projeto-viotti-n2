/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.com.fatec.controllers;

import br.com.fatec.CriarContaLoader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author win
 */
public class CadastroController implements Initializable {

    @FXML
    private TextField txt_email;
    @FXML
    private TextField txt_senha;
    @FXML
    private Button btn_entrar;
    @FXML
    private Button btn_criar_conta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void entrar(MouseEvent event){
        
    }
    
    @FXML
    public void criarConta(MouseEvent event) throws IOException{
        CriarContaLoader criarContaLoader = new CriarContaLoader();
        criarContaLoader.start(new Stage());
    }
    
}
