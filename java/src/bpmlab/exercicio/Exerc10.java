package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {
        /*
        Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura
        equivalente em Fahrenheit.
        F=1,8C+32
         */

        System.out.println("Digite o valor em Celsius para converter em Fahrenheit:");
        System.out.print(">> ");
        Scanner lerValor = new Scanner(System.in);
        int valor = lerValor.nextInt();

        float F = (float) (1.8 * valor + 32);

        System.out.println(valor + " Celsius equivale a " + F + " Fahrenheit");

    }

}
