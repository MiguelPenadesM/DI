package com.example.tasca3controlsjve.ejercicioventanalogin.pantalla;
import com.example.tasca3controlsjve.ejercicioventanalogin.JVEApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class PrimeraVentanaController {

    @FXML
    public void empieza(ActionEvent actionEvent) throws IOException {
        Stage primeraPantalla = new Stage();
        FXMLLoader root = new FXMLLoader(JVEApplication.class.getResource("Pantalla.fmxl"));
        Scene scene = new Scene(root.load(), 600, 400);
        primeraPantalla.setTitle ("Inicio de Sesión");
        primeraPantalla.setScene(scene);
        primeraPantalla.show();
    }
}

