package pg_83;

import java.util.Scanner;

public class Quest_36 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, qtd = 0, soma = 0;
        double med = 0;
        System.out.println("Digite a idade: ");
        idade = ler.nextInt();
        while(idade > 0){
            soma = soma + idade;
            qtd = qtd + 1;
            med = soma / qtd;
            System.out.println("Digite a idade: ");
            idade = ler.nextInt();
        }
        System.out.println("Quantidade: " +qtd);
        System.out.println("Soma: " +soma);
        System.out.printf("Média: %.2f" ,med);
    }
    
}
