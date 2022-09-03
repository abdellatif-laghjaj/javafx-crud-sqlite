package com.abdellatif.javafxcrudsqlite.LoginApp;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    LoginModel loginModel = new LoginModel();


    @FXML
    private ComboBox<Option> comboBox;

    @FXML
    private Label dbStatus;

    @FXML
    private Button loginBtn;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (loginModel.isConnected()) {
            dbStatus.setText("connected");
        } else {
            dbStatus.setText("not connected");
            dbStatus.setStyle("-fx-text-fill: red");
            showAlert(Alert.AlertType.ERROR, "Database Connection Error", "Check your database connection");
        }
        comboBox.setItems(FXCollections.observableArrayList(Option.values()));
        System.out.println("initialize");
    }

    public void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }

}