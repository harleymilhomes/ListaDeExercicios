package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int x, y;
        double result;

        System.out.println("'X' ELEVADO A 'Y'\n");
        System.out.print("Digite o valor de X: ");
        x = ler.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = ler.nextInt();
        result = Math.pow(x, y);
        System.out.println("Resultado: " + result);

    }

}
