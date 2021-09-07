
import javax.swing.JOptionPane;

class Pessoa {

    private String nome;

    private int ano;
    
    private String altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasci() {
        return ano;
    }

    public void setAnoNasci(int anoNsci) {
        this.ano = anoNsci;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

}

public class App {

    public static void main(String[] args) {

        final Pessoa pessoa = new Pessoa();

        pessoa.setNome(JOptionPane.showInputDialog("Seu nome: "));
        pessoa.setAltura(JOptionPane.showInputDialog("Sua altura: "));
        pessoa.setAnoNasci(Integer.parseInt(JOptionPane.showInputDialog("Qual seu ano de nascimento?")));

        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
        int idade = anoAtual - pessoa.getAnoNasci();
        JOptionPane.showMessageDialog(null, "Voce tem: " + idade + " anos.");

    }
}
