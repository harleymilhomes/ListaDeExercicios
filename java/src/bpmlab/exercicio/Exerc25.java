package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc25 {

    public static void main(String[] args) {
        System.out.println("Digite o valor do seu peso em Kg");
        System.out.print(">> ");
        Scanner lerDados = new Scanner(System.in);
        float peso = lerDados.nextFloat();
        System.out.println("Digite o valor da sua altura em metros");
        System.out.print(">> ");
        new Scanner(System.in);
        float altura = lerDados.nextFloat();

        float resul = peso / (altura * altura);

        System.out.println(resul);

        if (resul < 20) {
            System.out.println("Abaixo do peso");
        } else if (resul >= 20 && resul < 25) {

            System.out.println("Peso ideal");
        } else {
            System.out.println("Acima do peso");
        }
    }

}
