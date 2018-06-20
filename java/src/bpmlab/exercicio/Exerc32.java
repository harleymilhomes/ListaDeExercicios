/*
Criar uma rotina de entrada que aceite somente um valor positivo..
 */
package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = 0;
        while (a <= 1) {
            System.out.println("Digite um numero positivo");
            a = entrada.nextInt();

        }
        System.out.println("VALOR " + a);
    }
}
