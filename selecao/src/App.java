import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * 1. Faça um algoritmo para ler dois números inteiros e informar se estes são
         * iguais ou diferentes.
         */

        Scanner x = new Scanner(System.in);
        System.out.println("Entre com um número:");

        int number = x.nextInt();
        int number2 = x.nextInt();

        if (number == number2) {
            System.out.println("NÚMEROS SÃO IGUAIS");
        } else {
            System.out.println("NÚMEROS SÃO DIFERENTES");

        }

        System.out.println("-------------------------------------------------------------");

        /*
         * 2. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$
         * 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o número
         * de maçãs compradas, calcule e escreva o custo total da compra.
         */

        Scanner y = new Scanner(System.in);
        System.out.println("Entre com a quantidade de maçãs:");

        double qtd = y.nextDouble();

        if (qtd < 12) {
            System.out.println("VALOR TOTAL: " + (qtd * 1.30));
        } else {
            System.out.println("VALOR TOTAL: " + (qtd));
        }

        System.out.println("-------------------------------------------------------------");

        /*
         * 3. Uma loja fornece 10% de desconto para funcionários e 5% de desconto para
         * clientes vips. Faça um programa que calcule o valor total a ser pago por uma
         * pessoa. O programa deverá ler o valor total da compra efetuada e um código
         * que identifique se o comprador é um cliente comum (1), funcionário (2) ou vip
         * (3).
         */

        Scanner z = new Scanner(System.in);
        System.out.println("Entre com o valor da compra e o código do cliente:");

        double amount = z.nextDouble();
        int clientCode = z.nextInt();

        switch (clientCode) {
            case 1:
                System.out.println("Valor total da compra: " + amount);
                break;
            case 2:
                System.out.println("Valor total da compra: " + (amount - (amount * .1)));
                break;
            case 3:
                System.out.println("Valor total da compra: " + (amount - (amount * .05)));
                break;
            default:
                break;
        }

        System.out.println("-------------------------------------------------------------");
    }
}
