package pg_83;

import java.util.Scanner;

public class Quest_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int mes = 0;
        double salCarlos, salJoao;
        System.out.println("Informe o salário de Carlos: ");
        salCarlos = read.nextDouble();
        salJoao = salCarlos /3;
        while(salJoao < salCarlos){           
            salCarlos = salCarlos + (salCarlos * 2)/100;
            salJoao = salJoao + (salJoao * 5)/100;
            mes = mes + 1;
            //System.out.printf("Salário de Carlos = %.2f\n" ,salCarlos);
           // System.out.printf("Salário de João = %.2f\n" ,salJoao);          
        }
        System.out.println("Meses: " +mes);
    }
    
}
