package pg_83;

import java.util.Scanner;

public class Quest_22 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char sexo;
        int contM = 0, contF = 0, cont24 = 0, tempo;
        float percM, percF, percV, perc24;
        System.out.println("Informe o número de crianças nascidas: ");
        int num = ler.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Digite o sexo da " + i + "º criança: ");
            sexo = ler.next().charAt(0);
            System.out.println("Digite o tempo em meses da " + i + "º criança: ");
            tempo = ler.nextInt();

            if (sexo == 'M') {
                contM = +1;
            } else {
                if (sexo == 'F') {
                    contF = +1;
                } else {
                    if (tempo <= 24) {
                        cont24 = +1;
                    }
                }
            }
        }
        if (num == 0) {
            System.out.println("Nenhuma criança");
        } else {
            percM = contM * 100 / num;
            percF = contF * 100 / num;
            perc24 = cont24 * 100 / num;
            System.out.println("Percentual de crianças do sexo masculino mortas " + percM);
            System.out.println("Percentual de crianças do sexo femenino mortas " + percF);
            System.out.println("Percentual de crianças com 24 meses ou menos mortas no período " + perc24);
        }

    }

}
