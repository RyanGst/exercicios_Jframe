
import javax.swing.JOptionPane;


 class JogadorFut {

    // nome, posi��o, data de nascimento, nacionalidade, altura e peso
    String nome;
    String posicao;
    String nascimento;
    String nacionalidade;
    String altura;
    String peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

}


public class App {

    public static void main(String[] args) {
        final JogadorFut jogador = new JogadorFut();

        jogador.setNome(JOptionPane.showInputDialog("Seu nome: "));

        jogador.setPosicao(JOptionPane.showInputDialog("Informe sua posicao: "));

        jogador.setNascimento(JOptionPane.showInputDialog("Data de nascimento: "));

        jogador.setNacionalidade(JOptionPane.showInputDialog("Nacionalidade: "));

        jogador.setAltura(JOptionPane.showInputDialog("Altura: "));
        
        jogador.setPeso(JOptionPane.showInputDialog("Seu peso: "));

        JOptionPane.showMessageDialog(null, "Nome: " + jogador.getNome() + "\n Peso: " + jogador.getPeso() + "\n Posição: " + jogador.getPosicao()
                + "\n Data de nascimento: " + jogador.getNascimento() + "\n Natural de: " + jogador.getNacionalidade() + "\n Mede " + jogador.getAltura());
    }

}


