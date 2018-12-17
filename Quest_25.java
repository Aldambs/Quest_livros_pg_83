package pg_83;

import java.util.Scanner;

public class Quest_25 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float num, num1, num2, num3, num4;
        num1 = 0;
        num2 = 0;
        num3 = 0;
        num4 = 0;
        System.out.println("Digite o número: ");
        num = ler.nextFloat();
        while (num >= 0) {
            if ((num >= 0) & (num <= 25)) {
                num1 =+ 1;
            }else if ((num >= 26) & (num <= 50)) {
                num2 =+ 1;
            }else if ((num >= 51) & (num <= 75)) {
                num3 =+ 1;
            }else if ((num >= 76) & (num <= 100)) {
                num4 =+ 1;
            }
            System.out.println("Digite o número: ");
            num = ler.nextFloat();
        }
        System.out.println(num1 + num2 + num3 + num4);

    }

}
