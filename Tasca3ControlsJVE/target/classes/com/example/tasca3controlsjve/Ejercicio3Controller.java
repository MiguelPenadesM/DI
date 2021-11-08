package com.example.tasca3controlsjve.ejercicioventanalogin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;

public class Ejercicio3Controller {

    @FXML
    private ChoiceBox choiseBoxCiudad;
    @FXML
    private ChoiceBox choiseBoxSO;
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

    private HashMap<String, String> datosEnviarForm = new HashMap<>();

    private String checkSelected;

    @FXML
    private void initialize() {
        crearListaEjer3();
        choiseBoxCiudad.setItems(ciudadesLista);
        choiseBoxSO.setItems(soLista);

    }

    public void crearListaEjer3() {

        ciudadesLista = FXCollections.observableArrayList("Alcoy", "Muro", "Cocentaina", "Banyeres", "Ibi");
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
        datosEnviarForm.put("Ciudad", choiseBoxCiudad.getValue().toString());
        datosEnviarForm.put("SO", choiseBoxSO.getValue().toString());
        datosEnviarForm.put("HorasOrdenador", formatoSlide.format(sliderHoras.getValue()));
        datosEnviarForm.put("Fecha", datePickerFechaCreacion.getValue().toString());

        cambiarVentanaEjer3(actionEvent);
    }

    public void cambiarVentanaEjer3(ActionEvent actionEvent) throws IOException {
        System.out.println("Formulario Enviado");
        Stage stage1= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(JVEApplication.class.getResource("form-pasado.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage1.setTitle("Formulario Enviado");
        stage1.setScene(scene);
        stage1.show();

        Ejercicio3Controller tarea3ControllerFormularioEnviado=(Ejercicio3Controller) fxmlLoader.getController();
        tarea3ControllerFormularioEnviado.cargar(datosEnviarForm);


        Node source = (Node) actionEvent.getSource();
        Stage stage2 = (Stage) source.getScene().getWindow();
        stage2.showAndWait();



    }

    public Label labelForm;
    public ImageView windows10;
    public ImageView appleLogo;
    public ImageView linuxLogo;
    private String linea;


    public void cargar(HashMap info){

        info.forEach((k,v) -> {
            linea= k + " : " + v + "\n";

            labelForm.setText(labelForm.getText()+linea);
        });

        String imagen = info.get("SO").toString();
        System.out.println(imagen);

        switch (imagen){
            case "Windows":
                windows10.setVisible(true);
                break;
            case "Mac":
                appleLogo.setVisible(true);
                break;
            case "Linux":
                linuxLogo.setVisible(true);
                break;
        }

    }

}