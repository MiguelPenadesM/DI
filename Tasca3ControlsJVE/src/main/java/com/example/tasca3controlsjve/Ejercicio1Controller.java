package com.example.tasca3controlsjve;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Ejercicio1Controller {

    @FXML
    private Text loginUser;


    public void cargar(String text){

        loginUser.setText(text);

    }
        @FXML private Text error;
        @FXML private TextField textUser;
        @FXML private  TextField textPass;

        public void enviar(ActionEvent actionEvent) throws IOException {
//Con este condicionante aplicamos en este caso los usuarios y contraseñas
            if (textUser.getText().equalsIgnoreCase("Jordi") && textPass.getText().equalsIgnoreCase("Jordi")  ||  textUser.getText().equalsIgnoreCase("Miguel") && textPass.getText().equalsIgnoreCase("Miguel")){

                System.out.println("Login completado");
                Stage stage= new Stage();
                FXMLLoader fxmlLoader = new FXMLLoader(JVEApplication.class.getResource("Ejercicio1View.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                stage.setTitle("Ejercicio1");
                stage.setScene(scene);
                stage.show();

                Ejercicio1Controller tarea1CompletadoController=(Ejercicio1Controller) fxmlLoader.getController();
                tarea1CompletadoController.cargar(textUser.getText());

                cerrarEscena(actionEvent);
            }else{

                error.setText("ERROR");

            }

        }
        public void cerrarEscena(ActionEvent actionEvent){
            Node source = (Node) actionEvent.getSource();
            Stage stage1 = (Stage) source.getScene().getWindow();
            stage1.close();
        }


    }
