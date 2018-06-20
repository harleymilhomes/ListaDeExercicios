package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {
        //Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
        //Área da do quadrado apartir do teorema de pitágoras
        //A=d²/2
        System.out.println("Digite a diagonal do seu Quadrado:");
        System.out.print(">> ");
        Scanner lerDiagonal = new Scanner(System.in);
        int d = lerDiagonal.nextInt();
        //como eu estava sem a bibliotea Math usei o principio de que d² é o mesmo que dxd
        float A = (d * d) / 2;
        System.out.println("A área do quadrado usando a Digonal de valor " + d + " é igual: " + A);

    }

}
