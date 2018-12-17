package pg_83;

import java.util.Scanner;

public class Quest_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        for (int cont = 1; cont <= 5; cont++) {
            System.out.println("DIGITE O VALOR PARA A:");
            int a = ler.nextInt();
            System.out.println("DIGITE O VALOR PARA B:");
            int b = ler.nextInt();
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
