package pg_83;

import java.util.Scanner;

public class Quest_18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, qtd = 0;
        
        System.out.println("Informe o número: ");
        num = ler.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                qtd = qtd + 1;
            }
        }
        if(qtd > 2){
            System.out.println("Não é primos!"); 
        }else{
            System.out.println("É primo!");
        }
    } 
}
