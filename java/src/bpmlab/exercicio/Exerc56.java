package bpmlab.exercicio;

import java.util.Scanner;

/*
Armazenar um máximo de 20 valores em um vetor. A quantidade de valores a serem armazenados será
escolhida pelo usuário. Enviar mensagem de erro, caso a quantidade de valores escolhida esteja fora da
faixa possível e solicitar a quantidade novamente. Após a digitação dos valores, criar uma rotina de
consulta, onde o usuário digita um número e o programa exibe em qual posição do vetor este número está
localizado. Se o número não for encontrado, enviar mensagem “Valor não encontrado!”. Perguntar ao
usuário se deseja ou não fazer uma nova consulta, consistir a resposta e encerrar o programa em caso
negativo.
 */
public class Exerc56 {

    public static void main(String[] args) {
        //vetor dara armazenar valores
        int[] valores;
        int maxValUse = 0;

        Scanner ent = new Scanner(System.in);
        do {
            System.out.println("Digite a quantidade de valores que deseja armazenar:");
            System.out.print(">> ");
            maxValUse = ent.nextInt();

            System.out.println(maxValUse);
        } while (maxValUse > 20);
        
        valores = new int[maxValUse];

        for (int i = 0; i < maxValUse; i++) {
            System.out.println("Digite uma valor para armazenar no Vetor");
            System.out.print(">> ");
            valores[i] = ent.nextInt();

        }
        int opcao = 0;
        do{
            System.out.println("digite um valor para buscar no vetor");
            System.out.print(">> ");
            int pesq = ent.nextInt();
            
            boolean encontrado = false;
            
            for (int i = 0; i < valores.length; i++) {
                if(valores[i] == pesq){
                    System.out.println("Este Valor está na posição: " +i);
                    encontrado = true;
                    
                }
                
                
            }
            if(encontrado == false){
                System.out.println("Valor não encontrado!");
            }
            System.out.println("Deseja pesquisar novamente? ditite: 0 sim");
            opcao = ent.nextInt();
        }while(opcao == 0);
          
        
        /*
        System.out.println("Valores Armazenados:");
        for (int valore : valores) {
            System.out.println(valore);

        }
        */

    }
}
