package pg_83;

import java.util.Scanner;

public class Quest_09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int pont, maior = 0, soma;
        int total, mes;
        float media;
        for (int i = 1; i <= 15; i++) {
            total = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.println("Informe a pontuação para cada mês: ");
                pont = ler.nextInt();
                total = total + pont;
                if(pont > maior){
                    maior = pont;
                }
            }
            media = total / 3;
            System.out.println("Pontuação geral: " + total);
            System.out.println("Média das pontuações: " + media);
        }
        System.out.println("Maior pontuação atingida: " + maior);
    }
}
