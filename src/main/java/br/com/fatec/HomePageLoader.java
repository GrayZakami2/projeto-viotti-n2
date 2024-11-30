/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

import br.com.fatec.controllers.HomePageController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Aluno
 */
public class HomePageLoader extends Application {
    private static Stage tela;

    @Override
    public void start(Stage tela) throws IOException {
        setTela(tela);
        
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("HomePage.fxml"));
        Parent root = fxmlLoader.load();
        HomePageController controller = fxmlLoader.getController();
        
        Scene scene = new Scene(root);
        
        tela.setScene(scene);
        tela.show();
    }

    public static void setTela(Stage tela) {
        HomePageLoader.tela = tela;
    }
}
