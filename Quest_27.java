package pg_83;

import java.util.Scanner;

public class Quest_27 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float altura, base, area;
        do{
            System.out.println("Digite a base: ");
            base = read.nextFloat();
            System.out.println("Digite a altura: ");
            altura = read.nextFloat();
            if (base <= 0 || altura <= 0) {
                System.out.println("ENTRADA INVÁLIDA!");
            }
        } while (base <= 0 || altura <= 0);
        area = (base * altura) / 2;
        System.out.println("A área é = " + area);
    }
    
}
