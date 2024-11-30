/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.com.fatec.controllers;

import br.com.fatec.dao.GerenteDAO;
import br.com.fatec.model.Gerente;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author win
 */
public class CriarContaController implements Initializable {
    
    @FXML
    private TextField txt_email;
    
    @FXML
    private TextField txt_cpf;
    
    @FXML
    private TextField txt_cnpj;
    
    @FXML
    private TextField txt_telefone;
    
    @FXML
    private TextField txt_senha;
    
    private GerenteDAO gerenteDAO = new GerenteDAO();
    private Gerente gerente;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void criar(MouseEvent event) {
        gerente = new Gerente();
        gerente.setCpf(txt_cpf.getText());
        gerente.setEmail(txt_email.getText());
        gerente.setCnpj(txt_cnpj.getText());
        gerente.setTelefone(txt_telefone.getText());
        gerente.setSenha(txt_senha.getText());
 
        
        try {
            // Verificando se gerente já existe
            if(gerenteDAO.buscaID(gerente) == null) {
               
                // Criar conta do gerente
                if(gerenteDAO.insere(gerente)){
                    mensagem("Sua conta foi criada com sucesso!");
                    fechar();
                } else {
                    mensagem("Não foi possível criar a conta");
                    return;
                }
                
            } else {
                mensagem("Este gerente já está cadastrado.");
            }
            
        } catch(SQLException e){
            mensagem("Erro no cadastro do gerente: " + e.getMessage());
        }
    }
    
    private void mensagem(String msg) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        
        alerta.setTitle("Mensagem");
        alerta.setHeaderText(msg);
        alerta.setContentText("");
        alerta.showAndWait();
    }
    
    private void fechar() {
        Stage st = (Stage) txt_cpf.getScene().getWindow();
        st.close();
    }
    
    @FXML
    private void voltar(MouseEvent event) {
        Stage st = (Stage) txt_cpf.getScene().getWindow();
        st.close();
    }
}
