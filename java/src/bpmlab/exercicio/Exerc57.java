package bpmlab.exercicio;

import java.util.Scanner;

/*
Armazenar o nome e idade de cem pessoas. Após a digitação, exibir os dados (nome e idade) de todas as
pessoas.
 */
public class Exerc57 {

    public static void main(String[] args) {
        String[][] pessoa = new String[100][2];
        Scanner ent = new Scanner(System.in);
        System.out.println(pessoa.length);

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Digite nome");
            System.out.print(">> ");
            pessoa[i][0] = ent.next();
            System.out.println("Digite Idade");
            System.out.print(">> ");
            pessoa[i][1] = ent.next();

        }

        System.out.println("Dados Armazendados: ");
        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("nome: " + pessoa[i][0]);
            System.out.println("idade: " + pessoa[i][1]);
        }

    }

}
