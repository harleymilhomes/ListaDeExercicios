/*
Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o
valor correspondente em Reais (R$).
 */
package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {
        System.out.println("Digite a cotação do Dolar atual");
        System.out.print(">> ");
        Scanner lerValor = new Scanner(System.in);
        float cotacao = lerValor.nextFloat();
        System.out.println("Digite o valor em Dolar para converter em Reais");
        System.out.print(">> ");
        new Scanner(System.in);
        float dolar = lerValor.nextFloat();

        float real = dolar * cotacao;

        System.out.println("Dolar em Reais: " + real);

    }

}
