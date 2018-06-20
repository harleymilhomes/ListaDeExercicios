package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {
        //Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
        int[] valores = new int[4];
        int i = 0;

        System.out.println("insira 4 valores, sendo um por vez");
        while (i < 4) {
            System.out.print(">> ");
            Scanner lerValor = new Scanner(System.in);
            valores[i] = lerValor.nextInt();
            i++;
        }
        float result = 0;
        int a = 0;
        while (a < 4) {
            result += valores[a];
            a++;
        }
        result = result / 4;
        System.out.println("A média aritmética de quatro valores inseridos: " + result);

    }

}
