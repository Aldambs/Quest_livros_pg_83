package pg_83;

import java.util.Scanner;

public class Quest_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, num, fat;
        System.out.println("DIGITE O NUMERO:");
        n = ler.nextInt();
        for(int i = 1; i < n; i++){
            System.out.println("DIGITE QUANTOS VALORES DEVE SER LIDO:");
            num = ler.nextInt();
            fat = 1;
            for(int j = 1; j < num; j++){
                fat = fat * j;
            }
            System.out.println(fat);
        }
    }
    
}
