/*
38. Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. Entre as tabuadas, solicitar que o
usuário pressione uma tecla.
 */
package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc38 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            boolean ent = true;
            while (ent == true) {
                System.out.println("Digite uma tecla e aperte Enter: ");
                String valor = entrada.next();
                if (valor != null) {
                    ent = false;
                }

            }
            for (int b = 1; b <= 10; b++) {
                int c = i * b;
                System.out.println(i + " x " + b + " = " + c);
            }
        }
    }
}
