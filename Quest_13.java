package pg_83;

import java.util.Scanner;

public class Quest_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int totalAA = 0, totalAE = 0, totalAR = 0, totalCL = 0;
        double not1, not2, media, mediaClasse;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Informe a 1º nota: ");
            not1 = ler.nextDouble();
            System.out.print("Informe a 2º nota: ");
            not2 = ler.nextDouble();
            media = (not1 + not2) / 2;

            System.out.println("A média do " + i + "º aluno: " + media);

            if (media <= 3) {
                totalAR = totalAR + 1;
                System.out.println("REPROVADO");
            } else {
                if ((media > 3) && (media < 7)) {
                    totalAE = totalAE + 1;
                    System.out.println("EXAME");
                } else {
                    if (media > 7) {
                        totalAA = totalAA + 1;
                        System.out.println("APROVADO");
                    }
                }
                totalCL = (int) (totalCL + media);
            }

        }
        mediaClasse = totalCL / 6;
        System.out.println("Total de aprovado: " + totalAA);
        System.out.println("Total que irá fazer o exame: " + totalAE);
        System.out.println("Total de reprovados: " + totalAR);
        System.out.println("Média da classe: " + mediaClasse);

    }

}
