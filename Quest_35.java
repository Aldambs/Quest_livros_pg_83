package pg_83;

import java.util.Scanner;

public class Quest_35 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, soma = 0, qtd = 0, maior = 0, menor = 0, qtdP = 0,
                somaP = 0, qtdI = 0;
        double med = 0, medP = 0, porc = 0;
        System.out.println("Informe o número: ");
        num = ler.nextInt();      
        while (num != 30000) {
            
            if(qtd == 0){
                maior = num;
                menor = num;
            }else if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
            soma = soma + num;
            qtd = qtd + 1;
            med = soma / qtd;
            if (num / 2 == 0) {
                somaP = somaP + num;
                qtdP = qtdP + 1;
            } else {
                qtdI = qtdI + 1;  
                porc = (qtdI * 100) / qtd;
            }
            System.out.println("Informe o número: ");
            num = ler.nextInt();
        }
        System.out.println("Soma: " +soma);
        System.out.println("Qtd de números digitados: " +qtd);       
        System.out.println("A média: " +med);
        System.out.println("O maior: " +maior);
        System.out.println("O menor: " +menor); 
        medP = somaP / qtdP;
        System.out.println("A média dos números pares: " +medP);      
        System.out.println("A porcentagem dos nº impares: " +porc);
    }
    
}
