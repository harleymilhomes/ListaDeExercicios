package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {
        /*
        A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
        A = 3,14 * r²
         */
        System.out.println("Digite o valor do diâmetro de um círculo:");
        System.out.print(">> ");
        Scanner lerValor = new Scanner(System.in);
        int r = lerValor.nextInt();

        r /= 2;

        float A = (float) (3.14 * Math.pow(r, 2));

        System.out.println("Área do circulo de é igual " + A);
    }

}
