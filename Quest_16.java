package pg_83;

import java.util.Scanner;

public class Quest_16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n1, n2, soma, mult;
        soma = 0;
        mult = 1;
        
        System.out.println("Informe o primeiro número: ");
        n1 = ler.nextFloat();
        System.out.println("Informe o segundo número: ");
        n2 = ler.nextFloat();
        
        for(float i = n1; i <= n2; i++){
            if(i % 2 == 0){
                soma =+ i;
            }else{
                if(i % 2 != 0){
                    mult *= i;
                }
            }
            System.out.print(i+ " ");
        }
        System.out.println("\nPares: " +soma);
        System.out.println("Impares: " +mult);
    }
    
}
