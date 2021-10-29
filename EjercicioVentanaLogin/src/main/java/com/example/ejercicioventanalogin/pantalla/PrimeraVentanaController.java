package com.example.ejercicioventanalogin.pantalla;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


public class PrimeraVentanaController {

    @FXML
    protected void empieza(ActionEvent actionEvent) throws IOException {
        Stage primeraPantalla = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Pantalla.fxml"));
        Scene scene = new Scene(root, 600, 400);
        primeraPantalla.setTitle ("Inicio de Sesión");
        primeraPantalla.setScene(scene);
        primeraPantalla.show();
    }

    @FXML private Text actiontarget;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }
}

