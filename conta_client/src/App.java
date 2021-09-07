

import java.io.Serializable;

class ContaCliente implements Serializable {

    private String nome;

    private String cpf;

    private String endereco;

    private double fone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getFone() {
        return fone;
    }

    public void setFone(double fone) {
        this.fone = fone;
    }

}


public class App {
    public static void main(String[] args) throws Exception {
        final ContaCliente cc = new ContaCliente();
    }
}
