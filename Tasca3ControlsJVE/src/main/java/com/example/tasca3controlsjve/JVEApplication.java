package com.example.tasca3controlsjve;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class JVEApplication extends Application{

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(JVEApplication.class.getResource("HubInicioView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }
}
