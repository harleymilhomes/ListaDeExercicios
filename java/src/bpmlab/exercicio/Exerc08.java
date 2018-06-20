package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc08 {

    public static void main(String[] args) {
        /*
        Sabendo que uma milha marítima equivale a um mil, oitocentos e cinqüenta e dois metros e que um
        quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.
         */
        //uma milha marítima equivale a um mil, oitocentos e cinqüenta e dois metros
        int milha = 1852; // valor em metros
        int kilometro = 1000; // kilometro em metros

        System.out.println("Digite o valor de milhas que deseja converter:");
        System.out.print(">> ");
        Scanner lerValor = new Scanner(System.in);
        int valor = lerValor.nextInt();

        float result = valor * milha;
        result /= kilometro;

        System.out.println(valor + " Milhas equivale a " + result + " kilometros");

    }

}
