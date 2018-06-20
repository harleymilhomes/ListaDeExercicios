package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc28 {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        String sexo = null;

        do {
            System.out.println("Digite H para sexo masculino ou F para Feminino");
            System.out.print(">> ");
            sexo = lerDados.next();
        } while (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("H"));

        System.out.println("Digite o valor do seu peso em Kg");
        System.out.print(">> ");
        float peso = lerDados.nextFloat();

        System.out.println("Digite o valor da sua altura em metros");
        System.out.print(">> ");
        float altura = lerDados.nextFloat();

        float resul = peso / (altura * altura);

        System.out.println(resul);

        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Sexo Feminino");
            if (resul < 19) {
                System.out.println("Abaixo do peso");
            } else if (resul >= 19 && resul < 24) {

                System.out.println("Peso ideal");
            } else {
                System.out.println("Acima do peso");
            }

        } else {
            System.out.println("Sexo Masculino");
            if (resul < 20) {
                System.out.println("Abaixo do peso");
            } else if (resul >= 20 && resul < 25) {

                System.out.println("Peso ideal");
            } else {
                System.out.println("Acima do peso");
            }
        }

    }
}
