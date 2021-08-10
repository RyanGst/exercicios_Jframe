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

        /*
         * 4. Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média
         * aritmética simples e escrever uma mensagem que diga se o aluno foi ou não
         * aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
         * Escrever também a média calculada.
         */

        Scanner a = new Scanner(System.in);
        System.out.println("Entre com as notas:");

        double primeiraNota = a.nextDouble();
        double segundaNota = a.nextDouble();

        double media = ((primeiraNota + segundaNota) / 2);
        if (media >= 6) {
            System.out.println("APROVADO: " + media);
        } else {
            System.out.println("REPROVADO: " + media);
        }

        System.out.println("-------------------------------------------------------------");

        /*
         * 5. Elabore um algoritmo que dada a idade de um nadador classifica-o em uma
         * das seguintes categorias: infantil A = 5 - 7 anos infantil B = 8-10 anos
         * juvenil A = 11-13 anos juvenil B = 14-17 anos adulto = maiores de 18 anos
         */

        Scanner b = new Scanner(System.in);
        System.out.println("Entre com a idade:");

        int idade = b.nextInt();

        if ((idade >= 5) && (idade <= 7)) {

            System.out.println("INFANTIL A: ");

        } else if ((idade >= 8) && (idade <= 10)) {

            System.out.println("INFANTIL B: ");

        } else if ((idade >= 11) && (idade <= 13)) {

            System.out.println("JUVENIL A: ");

        } else if ((idade >= 14) && (idade <= 17)) {

            System.out.println("JUVENIL B: ");

        } else if (idade >= 18) {

            System.out.println("ADULTO: ");

        }

        System.out.println("-------------------------------------------------------------");

        /*
         * 6. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
         * Escreva um algoritmo que leia o número de litros vendidos e o tipo de
         * combustível (codificado da seguinte forma: 1-álcool, 2-gasolina), calcule e
         * imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
         * gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
         */

        Scanner c = new Scanner(System.in);
        System.out.println("Entre com o numero de litros e o tipo de combustível:");

        int modalidade = c.nextInt();
        double lts = c.nextDouble();
        double valorLitro;
        switch (modalidade) {
            case 1:
                if (lts > 20) {
                    valorLitro = 2.784;
                } else {
                    valorLitro = 2.813;
                }
                System.out.println("VALOR A SER PAGO: " + (lts * valorLitro));
                break;
            case 2:
                if (lts > 20) {
                    valorLitro = 3.102;
                } else {
                    valorLitro = 3.168;
                }
                System.out.println("VALOR A SER PAGO: " + (lts * valorLitro));

                break;

            default:
                break;
        }

        System.out.println("-------------------------------------------------------------");

    }

}