package bpmlab.exercicio;

import java.util.Scanner;

/**
 * Verificar se três valores quaisquer (A,B, C) que serão digitados formam ou
 * não um triângulo retângulo. Lembre-se que o quadrado da hipotenusa é igual a
 * soma dos quadrados dos catetos.
 */
public class Exerc27 {

    public static void main(String[] args) {
        System.out.println("Digite o primeiro numero:");
        System.out.print(">> ");
        Scanner lerEntrada = new Scanner(System.in);
        int a = lerEntrada.nextInt();
        System.out.println("Digite o segundo numero:");
        System.out.print(">> ");
        int b = lerEntrada.nextInt();
        System.out.println("Digite o terceiro numero:");
        System.out.print(">> ");
        int c = lerEntrada.nextInt();

        //a2 = b2 + c2
        float resul1, resul2, resul3;
        resul1 = (float) (Math.pow(a, 2) + Math.pow(c, 2));
        resul2 = (float) (Math.pow(b, 2) + Math.pow(c, 2));
        resul3 = (float) (Math.pow(a, 2) + Math.pow(b, 2));

        if (Math.pow(b, 2) == resul1) {
            System.out.println("sim1:");
        } else if (Math.pow(a, 2) == resul2) {
            System.out.println("sim2:");
        } else if (Math.pow(c, 2) == resul3) {
            System.out.println("sim3:");
        } else {
            System.out.println("nao:");
        }

    }

}
