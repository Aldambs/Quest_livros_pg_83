package pg_83;

import java.util.Scanner;

public class Quest_28 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int qtd, cod;
        double valorItem = 0, valorTotal = 0;
        char resp;
        do{          
            System.out.println("Informe o código do pedido: ");
            cod = read.nextInt();
            System.out.println("Informe a qtd de itens: ");
            qtd = read.nextInt();
            if(cod == 100){
                System.out.println("Cachorro Quente");
                valorItem = qtd * 1.20;
            }
            if(cod == 101){
                System.out.println("Bauru Simples");
                valorItem = qtd * 1.30;
            }
            if(cod == 102){
                System.out.println("Bauru com Ovo");
                valorItem = qtd * 1.50;
            }
            if(cod == 103){
                System.out.println("Hambúrguer");
                valorItem = qtd * 1.20;
            }
            if(cod == 104){
                System.out.println("Cheeseburguer");
                valorItem = qtd * 1.30;
            }
            if(cod == 105){
                System.out.println("Refrigerante");
                valorItem = qtd * 1.00;
            }
            System.out.println("Deseja mais alguma coisa (S ou N):");
            resp = read.next().charAt(0);
            valorTotal = valorTotal + valorItem;
            System.out.println("Valor Item: " +valorItem);
        }while(resp != 'n' && resp != 'N');
        
        System.out.println("Valor total: " +valorTotal);
    }
    
}
