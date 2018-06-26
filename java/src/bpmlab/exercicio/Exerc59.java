package bpmlab.exercicio;

import java.util.Scanner;

/*
Armazenar o nome, sexo e idade de cem pessoas. Consistir as entradas no sentido de aceitar apenas “F”
ou “M” para o sexo e valores positivos para a idade. Após a digitação, exibir os dados (nome, sexo e
idade) de todas as pessoas com idade superior a dezoito anos. Ao final da lista, exibir a quantidade de
pessoas listadas.
 */
public class Exerc59 {

    public static void main(String[] args) {
        String[][] pessoa = new String[100][3];
        Scanner ent = new Scanner(System.in);
        //System.out.println(pessoa.length);
        String sexo = null;
        int idade = 0;

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Digite nome");
            System.out.print(">> ");
            pessoa[i][0] = ent.next();

            do {
                System.out.println("Digite Sexo");
                System.out.print(">> ");
                sexo = ent.next();
            } while (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M"));
            pessoa[i][1] = sexo;

            do {
                System.out.println("Digite Idade");
                System.out.print(">> ");
                idade = ent.nextInt();
            } while (idade < 0);
            pessoa[i][2] = String.valueOf(idade);

        }

        System.out.println("Dados Armazendados: ");
        int mDezoito = 0;
        for (int i = 0; i < pessoa.length; i++) {

            idade = Integer.parseInt(pessoa[i][2]);
            if (idade > 18) {
                mDezoito++;
                System.out.println("Nome: " + pessoa[i][0]);
                System.out.println("Sexo: " + pessoa[i][1]);
                System.out.println("Idade: " + pessoa[i][2]);
            }
        }
        System.out.println("Quantidade de Pessoas Maiores de 18 anos: " + mDezoito);

    }
}
