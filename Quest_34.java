package pg_83;

import java.util.Scanner;

public class Quest_34 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, calc;
        System.out.println("Digite um número: ");
        num = ler.nextInt();
        while(num > 0){
            calc = 0;
            if(num / 2 == 0){
                for (int i = 0; i < num; i++) {
                    if(num / i == 0){
                        calc = calc + 1;
                    }
                    System.out.println("O resultado do calculo é: " +calc);
                }
 
            } else {
                for (int i = 0; i < num - 1; i++) {
                    calc = calc + i;
                    System.out.println("O resultado do calculo é: " + calc);
                }
            }
            System.out.println("Digite um número: ");
            num = ler.nextInt();
        }
    }
    
}
