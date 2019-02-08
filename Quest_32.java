package pg_83;

import java.util.Scanner;

public class Quest_32 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, pot = 1;
        System.out.println("Digite o 1º número: ");
        n1 = ler.nextInt();
        System.out.println("Digite o 2º número: ");
        n2 = ler.nextInt();
        for(int i = 1; i <= n2; i++){
            pot = pot * n1;
        }
        System.out.println("A potência é = " +pot);
    }
    
}
