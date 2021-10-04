package com.example.futebolfx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    Jogador jogador = new Jogador();
    @FXML
    private Label welcomeText;
    @FXML
    TextField nome;
    @FXML
    TextField posicao;
    @FXML
    TextField dataDeNacimento;
    @FXML
    TextField nacionalidade;
    @FXML
    TextField altura;
    @FXML
    TextField peso;

    Alert alert  = new Alert(Alert.AlertType.INFORMATION);

    @FXML
    protected void onHelloButtonClick() {
        alert.setTitle("info do jogador");
        alert.setHeaderText(null);
        alert.setContentText(" Nome: " + jogador.getNome() + "\n Posição: " + jogador.getPosicao() + "\n Data Nasc.: " + jogador.getDataDeNacimento() + "\n Nacionalidade: " + jogador.getNacionalidade() + "\n Altura: " + jogador.getAltura() + "\n Peso: " + jogador.getPeso() + "\n");
        alert.showAndWait();
    }

    @FXML
    protected void onNameChange() {

        jogador.setNome(nome.getText());
    }

    @FXML
    protected void onPosicaoChange() {
        jogador.setPosicao(posicao.getText());

    }

    @FXML
    protected void onDataDeNacimentoChange() {
        jogador.setDataDeNacimento(dataDeNacimento.getText());
    }

    @FXML
    protected void onNacionalidadeChange() {
        jogador.setNacionalidade(nacionalidade.getText());
    }

    @FXML
    protected void onAlturaChange() {
        jogador.setAltura(Float.parseFloat(altura.getText()));
    }

    @FXML
    protected void onPesoChange() {
        jogador.setPeso(Float.parseFloat(peso.getText()));
    }

}