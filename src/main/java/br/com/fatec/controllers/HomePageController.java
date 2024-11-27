/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.com.fatec.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author win
 */
public class HomePageController implements Initializable {

    @FXML
    private Text txt_data;
    @FXML
    private Text txt_hora;
    @FXML
    private Text txt_voltar;
    @FXML
    private TextField txt_id_venda;
    @FXML
    private TextField txt_id_pizza;
    @FXML
    private TextField txt_id_entregador;
    @FXML
    private TextField txt_data_venda;
    @FXML
    private Button btn_busca;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
