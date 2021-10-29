package com.example.ejercicioventanalogin.InicioSesion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


public class InicioSesionController {

    @FXML
    protected void start(ActionEvent actionEvent) throws IOException {
        Stage primeraPantalla = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("InicioSesion.fxml"));
        Scene scene = new Scene(root, 600, 400);
        primeraPantalla.setTitle ("Inicio de Sesión");
        primeraPantalla.setScene(scene);
        primeraPantalla.show();
    }

    @FXML private Text actiontarget;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Usuario o contraseña incorrecta.");
    }
}

