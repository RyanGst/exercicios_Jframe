package com.example.elevadorfx;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {

    Elevador elevador = new Elevador();
    Alert alert  = new Alert(Alert.AlertType.CONFIRMATION);
    @FXML
    private Label statusText;

    @FXML
    private TextField inicializaCapacidade;
    @FXML
    private TextField inicializaAndares;

    @FXML
    private Button inicializa;

    @FXML
    private Button entra;

    @FXML
    private Button sai;

    @FXML
    private Button sobe;

    @FXML
    private Button desce;


     void atualizaStatus() {
        statusText.setText(" CAPACIDADE: " + elevador.getCapacidade() + "\n TOTAL ANDARES: " + elevador.getTotalAndar() + "\n ANDAR ATUAL: " + elevador.getAndarAtual() + "\n PESSOAS DENTRO: " + elevador.getPessoas());

    }

    @FXML
    public void setInicializa() {

        elevador.inicializa(Integer.parseInt( inicializaCapacidade.getText()), Integer.parseInt(inicializaAndares.getText()));
        atualizaStatus();

    }

    @FXML
    public void setEntra() {
        if(elevador.getPessoas() < elevador.getCapacidade()) {
            elevador.setPessoas(elevador.getPessoas() + 1);
            atualizaStatus();
        }

    }

    @FXML
    public void setSai() {
        if(elevador.getPessoas() > 0) {
            elevador.setPessoas(elevador.getPessoas() - 1);
            atualizaStatus();
        }
    }

    @FXML
    public void setSobe() {
        if(elevador.getAndarAtual() < elevador.getTotalAndar()) {
            elevador.setAndarAtual(elevador.getAndarAtual()  +1);
        }
        atualizaStatus();

    }

    @FXML
    public void setDesce() {
        if(elevador.getAndarAtual() > 0) {
            elevador.setAndarAtual(elevador.getAndarAtual() - 1);
        }
        atualizaStatus();

    }
}