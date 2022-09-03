package com.abdellatif.javafxcrudsqlite.LoginApp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class loginController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}