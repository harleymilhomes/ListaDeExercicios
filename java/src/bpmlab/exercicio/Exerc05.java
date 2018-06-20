package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {
        //Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
        System.out.println("Digite o valor de seu diâmetro de uma esfera:");
        System.out.print(">> ");
        Scanner lerDiametro = new Scanner(System.in);
        int r = (lerDiametro.nextInt()) / 2;
        r = r * r * r;

        double V = (4 * 3.14 * r) / 3;
        System.out.println("O volume da sua Esfera é igual: " + V);
    }

}
