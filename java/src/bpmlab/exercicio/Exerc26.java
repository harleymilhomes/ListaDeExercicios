package bpmlab.exercicio;

import java.util.Scanner;

/**
 * A partir de três valores que serão digitados, verificar se formam ou não um
 * triângulo. Em caso positivo, exibir sua classificação: “Isósceles, escaleno
 * ou eqüilátero”. Um triângulo escaleno possui todos os lados diferentes, o
 * isósceles, dois lados iguais e o eqüilátero, todos os lados iguais. Para
 * existir triângulo é necessário que a soma de dois lados quaisquer seja maior
 * que o outro, isto, para os três lados.
 */
public class Exerc26 {

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

        if (a + b > c || b + c > a || a + c > b) {
            //eqüilátero, todos os lados iguais
            if (a == b && a == c && b == c) {
                System.out.println("triangulo eqüilátero");

            } //isósceles, dois lados iguais e o eqüilátero,
            else if (a == b || a == c || c == b) {
                System.out.println("triangulo isósceles");

            } //Um triângulo escaleno possui todos os lados diferentes
            else {
                System.out.println("triangulo escaleno");

            }
        } else {
            System.out.println("não forma um triangulo");
        }

    }

}
