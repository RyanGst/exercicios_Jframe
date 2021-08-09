import java.util.Scanner;

class App {
    public static void main(String[] args) {

        /*
         * 1. Fazer um algoritmo que leia um número inteiro e escreva o seu antecessor e
         * o seu sucessor.
         */

        Scanner x = new Scanner(System.in);
        System.out.println("Entre com número:");

        int number = x.nextInt();
        System.out.println("O antecessor e sucessor desses números são, respectivamente: " + (number - 1) + " e "
                + (number + 1) + "");

        System.out.println("-------------------------------------------------------------");

        /*
         * 2. Ler uma medida em polegadas e imprimir a equivalente em centímetros,
         * sabendo que 2.54 cm equivale a 1 polegada.
         */

        Scanner y = new Scanner(System.in);
        System.out.println("Entre com número em polegadas:");

        float cm = y.nextFloat();
        System.out.println("O resultado da conversão é: " + (cm * 2.54));

        System.out.println("-------------------------------------------------------------");

        /*
         * 3. O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
         * porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
         * Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
         * escrever um algoritmo para ler o custo de fábrica de um carro, calcular e
         * escrever o custo final ao consumidor.
         */

        Scanner z = new Scanner(System.in);
        System.out.println("Entre com o custo de fábrica:");

        double custoDeFabrica = z.nextDouble();
        double distribuidor = custoDeFabrica + (custoDeFabrica * 0.28);
        System.out.println("O valor final é: " + (distribuidor + (distribuidor * 0.45)));

        System.out.println("-------------------------------------------------------------");
    }
}