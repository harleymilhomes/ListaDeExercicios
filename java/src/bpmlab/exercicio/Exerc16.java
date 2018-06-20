package bpmlab.exercicio;

import java.util.Scanner;
import java.lang.Math;

public class Exerc16 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int angulo;
        double result;

        System.out.println("FUNCOES TRIGONOMETRICAS\n");
        System.out.print("Entre com o valor do angulo: ");
        angulo = ler.nextInt();

        result = Math.sin(angulo);
        System.out.printf("Seno: %.2f\n", result);
        result = Math.cos(angulo);
        System.out.printf("Cosseno: %.2f\n", result);
        result = Math.tan(angulo);
        System.out.printf("Tangente: %.2f\n", result);
        result = 1 / (Math.cos(angulo));
        System.out.printf("Secante: %.2f", result);
    }
}
