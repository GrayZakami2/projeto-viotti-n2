/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

import br.com.fatec.controllers.CadastroController;
import br.com.fatec.controllers.HomePageController;
import br.com.fatec.controllers.TelaInicialController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author lucas
 */
public class CadastroLoader extends Application{
    private static Stage tela;

    @Override
    public void start(Stage tela) throws Exception {
        setTela(tela);
        
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/br/com/fatec/view/Cadastro.fxml"));
        Parent root = fxmlLoader.load();
        CadastroController controller = fxmlLoader.getController();
        
        Scene scene = new Scene(root);
        
        tela.setTitle("Login de Usuário");
        tela.setScene(scene);
        tela.show();
    }

    public static void setTela(Stage tela) {
        CadastroLoader.tela = tela;
    }
}
