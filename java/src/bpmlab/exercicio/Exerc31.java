/*
Uma escola com cursos em regime semestral realiza duas avaliações durante o semestre e calcula a
média do aluno, da seguinte maneira:
MEDIA = (P1 + 2P2) / 3
Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e o programa deverá
calcular e exibir quanto o aluno precisa tirar na segunda nota (P2) para ser aprovado, sabendo que a
média de aprovação é igual a cinco.
 */
package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc31 {

    public static void main(String[] args) {
        Scanner lerEntrada = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota: ");
        System.out.print(">> ");
        float p1 = lerEntrada.nextFloat();

        float media = (20 - p1) / 3;

        System.out.println("Falta :" + media);

        System.out.println("Digite o valor da Segunda nota:");
        System.out.print(">>");
        float p2 = lerEntrada.nextFloat();

        media = (p1 + 2 * p2) / 3;

        if (media >= 5) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Resultado: " + media);

    }

}
