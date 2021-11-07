package com.example.tasca3controlsjve.ejercicioventanalogin.Formulario.Respuestas;

import com.example.tasca3controlsjve.ejercicioventanalogin.Formulario.Usuario;
import com.example.tasca3controlsjve.ejercicioventanalogin.Formulario.UsuarioHolder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class RespuestasController implements Initializable {

    @FXML
    public AnchorPane raiz;

    @FXML
    private Label lblNombre, lblCiudad, lblApellido;

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    @FXML
    public void recuperarDatos(){
        UsuarioHolder holder = UsuarioHolder.getInstance();
        Usuario u = holder.getUsuario();
        lblNombre.setText(String.format("Nombre: %s",u.getNombre()));
        lblApellido.setText(String.format("Apellido: %s", u.getApellido()));
        lblCiudad.setText(String.format("Ciudad: %s", u.getCiudad()));
    }
}