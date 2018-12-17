
package pg_83;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE O ANO ATUAL:");
        int ano = input.nextInt();
        //DecimalFormat df = new DecimalFormat("0.0000");
        double salario = 1000;
        double perc = 0.015;
        double novoS = salario + (perc * salario);
        
        for(int i = 1997; i < ano; i++){
            perc = 2 * perc;
            novoS = novoS + (perc * salario);
        }
        System.out.printf("NOVO SALÁRIO É: %.2f" , novoS);
    }
    
}
