/*
34. Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas
válidas.
 */
package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc34 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu sexo “F” para Feminino ou “M” para Masculino");
        String sexo = entrada.next();
        while (!sexo.equals("M") && !sexo.equals("F")) {
            System.out.println("Valor inserido invalido! tente novamente");
            sexo = entrada.next();
        }
        System.out.println("Sexo: " + sexo);
    }
}
