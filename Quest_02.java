package pg_83;

import java.util.Scanner;

public class Quest_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, e, fat;
        System.out.println("DIGITE UM VALOR:");
        n = ler.nextInt();
        e = 1;
        for(int i = 1; i < n; i++){
            fat = 1;
            for(int j = 1; j < i; j++){
                fat = fat * j;
            }
            e = e + 1/fat;
        }
        System.out.println(e);
    }
    
}
