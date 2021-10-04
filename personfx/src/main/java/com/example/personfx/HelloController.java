package com.example.personfx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {

    Person person = new Person();

    Alert alert  = new Alert(Alert.AlertType.INFORMATION);
    @FXML
    private Label welcomeText;
    @FXML
    private TextField name;
    @FXML
    private TextField height;
    @FXML
    private TextField birth;


    @FXML
    protected void onHelloButtonClick() {
        alert.setTitle("Olá " + person.getNome());
        alert.setHeaderText(null);
        alert.setContentText("Sua data de nascimento é " + person.getBirthDate() + " e sua altura é " + person.getAltura());
        alert.showAndWait();
    }

    @FXML
    protected void onNameChange( ) {
        person.setNome(name.getText());
    }
    @FXML
    protected void onHeightChange() {
        person.setAltura(Float.parseFloat(height.getText()));
    }

    @FXML
    protected void onDateChange() {
        person.setBirthDate(birth.getText());
    }
}