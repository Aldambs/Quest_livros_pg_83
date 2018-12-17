package pg_83;

import java.util.Scanner;

public class Quest_15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, qtd, qtdp = 0;
        double peso, altura, medID, medAL, porc = 0;
        medAL = 0;
        qtd = 0;
        for (int i = 1; i <= 5; i++) {
            medID = 0;
            for (int j = 1; j <= 11; j++) {
                System.out.println("Informe a idade do jogador: ");
                idade = ler.nextInt();
                System.out.println("Informe o peso do jogador: ");
                peso = ler.nextDouble();
                System.out.println("Informe a altura do jogador: ");
                altura = ler.nextDouble();

                if (idade < 18) {
                    qtd = qtd + 1;
                }

                medID = medID + idade;
                medAL = medAL + altura;

                if (peso > 80) {
                    qtdp = qtdp + 1;
                }
            }
            medID = medID / 11;
            System.out.println("A média das idades é = " + medID);
            medAL = medAL / 55;
            System.out.println("A quantidade de jogadores inferior a 18 = " + qtd);
            System.out.println("A média da altura é = " + medAL);
            porc = qtdp * 100 / 55;
            System.out.println("A porcentagem de jogadores acima de 80 quilos é = " + porc);
        }
    }

}
