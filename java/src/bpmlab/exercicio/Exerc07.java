package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {
        //Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.

        /*
        Para calcularmos a média geométrica entre números devemos realizar a multiplicação
        entre eles e, logo em seguida, extrair a raiz com índice igual ao número de fatores
        utilizados na multiplicação
         */
        float[] valores = new float[2];
        System.out.println("Digite dois valores, um por vez");
        int i = 0;
        while (i < 2) {
            System.out.print(">> ");
            Scanner lerEntrada = new Scanner(System.in);
            valores[i] = lerEntrada.nextFloat();
            i++;
        }
        // multiplicar os valores de entrada
        int a = 0;
        float result = valores[0] * valores[1];

        // raiz quadrada dos valores inseridos
        result = (float) Math.sqrt(result);
        System.out.println("a média geométrica é :" + result);
    }
}
