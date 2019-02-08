package pg_83;

import java.util.Scanner;

public class Quest_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        double numA = 1; 
        int cont = 1; 
       System.out.print("Digite um número: "); 
       numA = ler.nextDouble(); 
        while (numA > 0){           
            if (cont == 1 || cont % 5 == 0) {
                System.out.println("|" +numA+ "²| = " +Math.pow(numA, 2)+ "|    |" +numA+
                        "³| = " +Math.pow(numA, 3)+ "|   |" +numA+ "¹/²| = " +Math.sqrt(numA));
                System.out.print("Digite um número: "); 
                numA = ler.nextDouble(); 
                cont++;
            }
        }
    }
    
}
