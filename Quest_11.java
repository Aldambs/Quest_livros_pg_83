package pg_83;

import java.util.Scanner;

public class Quest_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner dado = new Scanner(System.in);
        int i, num_termos, num1, num2, num3;
        
        System.out.print("Digite o número de termos da sequência: ");
        num_termos = dado.nextInt();
        i = 1;
        num1 = 2;
        num2 = 7;
        num3 = 3;
        if (i <= num_termos) {
            System.out.print(num1 + " ");
            i = i + 1;
            if (i <= num_termos) {
                System.out.print(num2 + " ");
                i = i + 1;
                if (i <= num_termos) {
                    System.out.print(num3 + " ");
                    i = i + 1;
                }
            }
        }
        while (i <= num_termos) {
            num1 = num1 * 2;
            System.out.print(num1 + " ");
            i = i + 1;
            if (i <= num_termos) {
                num2 = num2 * 3;
                System.out.print(num2 + " ");
                i = i + 1;
                if (i <= num_termos) {
                    num3 = num3 * 4;
                    System.out.print(num3 + " ");
                    i = i + 1;
                }
            }
        }
    }
}
