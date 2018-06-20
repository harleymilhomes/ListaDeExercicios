package bpmlab.exercicio;

import java.util.Scanner;

/**
 * Calcular e exibir a área de um retângulo, a partir dos valores da base e
 * altura que serão digitados. Se a área for maior que 100, exibir a mensagem
 * “Terreno grande”.
 */
public class Exerc22 {

    public static void main(String[] args) {
        System.out.println("Digite o valor da altura do seu Retangulo: ");
        System.out.print(">> ");
        Scanner lerAltura = new Scanner(System.in);
        int h = lerAltura.nextInt();
        System.out.println("Digite o valor da base do seu Retangulo: ");
        System.out.print(">> ");
        new Scanner(System.in);
        int b = lerAltura.nextInt();

        float A;
        A = (b * h) / 2;

        if (A > 100) {
            System.out.println("Terreno grande");
        }
        System.out.println("Área do Trinagulo Retangulo é igual a: " + A);

    }

}
