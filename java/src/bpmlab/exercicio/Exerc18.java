/*
Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao
pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.
 */
package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro produto");
        System.out.print(">> ");
        float p1 = lerValor.nextFloat();
        System.out.println("Digite o valor do segundo produto");
        System.out.print(">> ");
        float p2 = lerValor.nextFloat();
        System.out.println("Digite o valor do terceiro produto");
        System.out.print(">> ");
        float p3 = lerValor.nextFloat();
        System.out.println("Digite o valor do quarto produto");
        System.out.print(">> ");
        float p4 = lerValor.nextFloat();
        System.out.println("Digite o valor do quinto produto");
        System.out.print(">> ");
        float p5 = lerValor.nextFloat();

        float total = p1 + p2 + p3 + p4 + p5;

        System.out.println("Valor Total: " + total);

        System.out.println("Digite o valor Recebido");
        System.out.print(">> ");
        float rec = lerValor.nextFloat();

        total = rec - total;

        System.out.println("Troco: " + total);

    }

}
