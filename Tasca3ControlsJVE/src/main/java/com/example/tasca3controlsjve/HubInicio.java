package com.example.tasca3controlsjve;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HubInicio {
    public void Ejercicio1(ActionEvent actionEvent) throws IOException {
        System.out.println("Está entrando al E.1");
        Stage stage= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(JVEApplication.class.getResource("Ejercicio1Scene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Ejer.-1");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }

    public void Ejercicio2(ActionEvent actionEvent) throws IOException {

        System.out.println("Está entrando al E.2");
        Stage stage= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(JVEApplication.class.getResource("Ejercicio2View.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Ejer.-2");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);


    }

    public void Ejercicio3(ActionEvent actionEvent) throws IOException {

        System.out.println("Está entrando al E.3");
        Stage stage= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(JVEApplication.class.getResource("FormularioView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 700);
        stage.setTitle("Ejer.-3");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }
}

