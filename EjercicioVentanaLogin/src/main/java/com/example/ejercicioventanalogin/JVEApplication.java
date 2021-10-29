package com.example.ejercicioventanalogin;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class JVEApplication extends Application{

    @FXML
    public void start(Stage primeraVentana) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Pantalla.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),400,400);
        primeraVentana.setTitle ("Introducción");
        primeraVentana.setScene(scene);
        primeraVentana.show();
    }
    public static void main(String[] args){launch();}
}
