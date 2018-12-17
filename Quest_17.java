package pg_83;

import java.util.Scanner;

public class Quest_17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtd = 0, qtdp = 0;
        double n1, n2, soma = 0, media;

        System.out.println("1º número: ");
        n1 = ler.nextDouble();
        System.out.println("2º número: ");
        n2 = ler.nextDouble();

        if (n1 == n2) {
            System.out.println("São números iguais!");
        }
        
        if (n1 < n2) {
            for (double i = n1; i <= n2; i++) {
                soma = soma + i;
                qtd = qtd + 1;
            }
            media = soma / qtd;
            System.out.println("A média é = " + media);
        }
        
        if(n1 > n2){
            for(double i = n2; i <= n1; i++){
                if(i / 2 == 0){
                    qtdp = qtdp + 1;
                }              
            }
            System.out.println("Quantidade de pares = " +qtdp);
        }
    }

}
