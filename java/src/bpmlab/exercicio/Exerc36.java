/*
36. Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores
positivos. Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.
 */
package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc36 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a = 0;
        while (a <= 1) {
            System.out.println("Digite um numero positivo");
            System.out.print(">>");
            a = entrada.nextInt();

        }
        System.out.println("VALOR " + a);

        for (int x = 1; x <= 10; x++) {
            int b = a * x;
            System.out.println(a + " x " + x + " = " + b);
        }
    }
}
