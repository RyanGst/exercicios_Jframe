package com.example.elevadorfx;

public class Elevador {
    int totalAndar;
    int capacidade;
    int pessoas;
    int andarAtual;

    public void inicializa(int capacidade, int totalAndar) {
        this.capacidade = capacidade;
        this.totalAndar = totalAndar;
        this.pessoas = 0;
        this.andarAtual = 0;

    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndar() {
        return totalAndar;
    }

    public void setTotalAndar(int totalAndar) {
        this.totalAndar = totalAndar;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }



}
