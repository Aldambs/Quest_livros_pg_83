package pg_83;

import java.util.Scanner;

public class Quest_31 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m, n, soma;
        System.out.println("Informe o valor de m: ");
        m = ler.nextInt();
        System.out.println("Informe o número: ");
        n = ler.nextInt();
        while(m < n){
            soma = 0;
            for (int j = m; j < n; j++) {
                soma = soma + 1;
            }
            System.out.println("Soma: " +soma);
            System.out.println("Informe o valor de m: ");
            m = ler.nextInt();
            System.out.println("Informe o número: ");
            n = ler.nextInt();
        }
    }
    
}
