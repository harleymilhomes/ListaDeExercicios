package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {
        //Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.
        //V=(3.14 * r² x h)/3

        System.out.println("Digite o valor do raio de um cone:");
        System.out.print(">> ");
        Scanner lerValor = new Scanner(System.in);
        int r = lerValor.nextInt();
        System.out.println("Digite o valor da altura do cone:");
        System.out.print(">> ");
        Scanner lerValor2 = new Scanner(System.in);
        int h = lerValor2.nextInt();

        float A = (float) ((3.14 * Math.pow(r, 2) * h) / 3);

        System.out.println("Área do circulo de é igual " + A);
    }

}
