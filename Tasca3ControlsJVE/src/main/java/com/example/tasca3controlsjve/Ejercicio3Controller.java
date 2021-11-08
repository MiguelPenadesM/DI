package com.example.tasca3controlsjve;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;

public class Ejercicio3Controller {

    @FXML
    private ChoiceBox<String> choiseBoxCiudad;
    @FXML
    private ChoiceBox<String> choiseBoxSO;
    @FXML
    private DatePicker datePickerFechaCreacion;
    @FXML
    private Slider sliderHoras;
    @FXML
    private TextField fieldNombre;
    @FXML
    private TextField fieldApellidos;
    @FXML
    private TextArea txtAreaComentario;
    @FXML
    private RadioButton radioBtnM;
    @FXML
    private RadioButton radioBtnF;
    @FXML
    private RadioButton radioBtnO;

    private ObservableList<String> ciudadesLista, soLista;

    private final HashMap<String, String> datosEnviarForm = new HashMap<>();

    private String checkSelected;

    @FXML
    private void initialize() {
        crearListaEjer3();
        choiseBoxCiudad.setItems(ciudadesLista);
        choiseBoxSO.setItems(soLista);

    }

    public void crearListaEjer3() {

        ciudadesLista = FXCollections.observableArrayList("Alcoy", "Muro", "Cocentaina", "Banyeres de Mariola", "Ibi", "Onil", "Xixona");
        soLista = FXCollections.observableArrayList("Linux", "Windows", "Mac");

    }


    public void OnClickRadioBtnEjer3(ActionEvent actionEvent) {
        //Obtenemos el checbox pulsado
        RadioButton pulsado = (RadioButton) actionEvent.getSource();
        //Borramos todos los check para añadir solo el pulsado
        radioBtnM.setSelected(false);
        radioBtnF.setSelected(false);
        radioBtnO.setSelected(false);
        //Activamos el pulsado
        pulsado.setSelected(true);
        checkSelected = pulsado.getText();
    }
    public void OnClickEnviarEjer3(ActionEvent actionEvent) throws IOException {
        NumberFormat formatoSlide = new DecimalFormat("##");
        datosEnviarForm.put("Nombre", fieldNombre.getText());
        datosEnviarForm.put("Apellidos", fieldApellidos.getText());
        datosEnviarForm.put("Comentario", txtAreaComentario.getText());
        datosEnviarForm.put("Genero", checkSelected);
        datosEnviarForm.put("Ciudad", choiseBoxCiudad.getValue());
        datosEnviarForm.put("SO", choiseBoxSO.getValue());
        datosEnviarForm.put("HorasOrdenador", formatoSlide.format(sliderHoras.getValue()));
        datosEnviarForm.put("Fecha", datePickerFechaCreacion.getValue().toString());
        cambiarVentanaEjer3(actionEvent);
    }
    public void cambiarVentanaEjer3(ActionEvent actionEvent) throws IOException {
        System.out.println("Formulario Enviado");
        Stage stage1= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(JVEApplication.class.getResource("FormularioEjer.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage1.setTitle("Formulario Enviado");
        stage1.setScene(scene);
        stage1.show();
        Ejercicio3ControllerFormEnvio Ejercicio3ControllerFormEnvio = fxmlLoader.getController();
        Ejercicio3ControllerFormEnvio.cargar(datosEnviarForm);
        Node source = (Node) actionEvent.getSource();
        Stage stage2 = (Stage) source.getScene().getWindow();
        stage2.showAndWait();
    }
}