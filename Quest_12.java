package pg_83;

import java.util.Scanner;

public class Quest_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int expoente, fim, num_termos, den, denominador;
        double s, fat;
        System.out.print("Digite o número de termos da seqüência: ");
        num_termos = ler.nextInt();
        System.out.print("Digite o valor de X: ");
        int x = ler.nextInt();
        s = 0;
        den = 1;
        denominador = 1;
        for (int i = 1; i <= num_termos; i++) {
            fim = denominador;
            fat = 1;
            for (int j = 1; j <= fim; j++) {
                fat = fat * j;
            }
            expoente = i + 1;
            if (expoente % 2 == 0) {
                s = s + (Math.pow(x, expoente) / fat);
            } else {
                s = s - (Math.pow(x, expoente) / fat);
            }
            if (denominador == 4) {
                den = -1;
            }
            if (denominador == 1) {
                den = 1;
            }
            if (den == 1) {
                denominador = denominador + 1;
            } else {
                denominador = denominador - 1;
            }
        }
        System.out.println("Valor de S: " + s);
    }
}
