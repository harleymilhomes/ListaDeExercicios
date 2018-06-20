/*
 Uma escola com cursos em regime semestral, realiza duas avaliações durante o semestre e calcula a
média do aluno, da seguinte maneira:
MEDIA = (P1 + 2P2) / 3
 */
package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc30 {

    public static void main(String[] args) {
        Scanner lerEntrada = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota: ");
        System.out.print(">> ");
        float p1 = lerEntrada.nextFloat();
        System.out.println("Digite o valor da Segunda nota:");
        System.out.print(">>");
        float p2 = lerEntrada.nextFloat();

        float media = (p1 + 2 * p2) / 3;

        if (media > 4) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }

        //System.out.println("Resultado: "+ media);
    }

}
