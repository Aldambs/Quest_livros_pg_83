package pg_83;

import java.util.Scanner;

public class Quest_23 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float valor_inicial, juros, valor_parc, total, valor_juros;
        int num_parc, i, lin;
        System.out.println("Digite o valor inicial da dívida: ");
        valor_inicial = ler.nextFloat();
        System.out.println("Valor da dívida | Valor dos juros | QTD de parcelas | Valor da parcela");
        juros = 0;
        num_parc = 1;
        total = valor_inicial;
        valor_parc = valor_inicial;
        System.out.println("  " + total + "               " + juros + "               "
                + "" + num_parc + "            " + valor_parc);
        juros = juros + 10;
        num_parc = num_parc + 2;
        for (i = 1; i <= 4; i++) {
            valor_juros = valor_inicial * juros / 100;
            total = valor_inicial + valor_juros;
            valor_parc = total / num_parc;
             System.out.println("  " + total + "              " + juros + "               "
                + "" + num_parc + "            " + valor_parc);
            juros = juros + 5;
            num_parc = num_parc + 3;
        }
    }

}