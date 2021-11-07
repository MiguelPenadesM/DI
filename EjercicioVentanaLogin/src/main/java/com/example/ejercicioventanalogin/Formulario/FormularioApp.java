package com.example.ejercicioventanalogin.Formulario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FormularioApp extends Application {

    public static void main(String... args) throws Exception {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(FormularioApp.class.getClassLoader().getResource("../../../../../resources/com/example/ejercicioventanalogin/Formulario.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Tutorial JavaFX");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}