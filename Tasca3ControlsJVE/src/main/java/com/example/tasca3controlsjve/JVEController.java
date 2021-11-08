package com.example.tasca3controlsjve;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class JVEController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onJVEButtonClick() {
        welcomeText.setText("Empezamos!");
    }
}
