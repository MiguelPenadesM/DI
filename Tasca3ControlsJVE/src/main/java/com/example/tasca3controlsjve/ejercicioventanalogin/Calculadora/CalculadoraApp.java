package com.example.tasca3controlsjve.ejercicioventanalogin.Calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Calculadora.fxml"));
        stage.setTitle ("Calculadora simple");
        stage.setScene(new Scene(root, 257, 361));
        stage.show();

    }
}