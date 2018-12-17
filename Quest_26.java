package pg_83;

import java.util.Scanner;

public class Quest_26 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       float num = 1;
       int qtd = 0;
       
       while(qtd < 5){
           if(num % 3 == 0){
               System.out.print(num);
               qtd =+ 1;
           }
           num =+ 1;
       }
    }    
}
