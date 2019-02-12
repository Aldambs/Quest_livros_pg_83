package pg_83;

import java.util.Scanner;

public class Quest_38 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       double sal, valorKW, total, totalG = 0, gasto, acresc = 0;
       int qtd, qtdCons = 0, tipo;
        System.out.println("Informe o salário: ");
        sal = ler.nextDouble();
        System.out.println("Informe a qtd de quilowatts: ");
        qtd = ler.nextInt();
        valorKW = sal/8;
        while(qtd != 0){
            gasto = qtd * valorKW;
            System.out.println("Informe o tipo de consumidor:\n "
                    + "1.Residencial\n 2.Comercial\n 3.Industrial\n 0.Sair");
            tipo = ler.nextInt();
            gasto = qtd * valorKW;
            if(tipo == 1){
                acresc = (gasto * 5)/5;
            }
            if(tipo == 2){
                acresc = (gasto * 10)/5;
            }
            if(tipo == 3){
                acresc = (gasto * 15)/5;
            }
            total = gasto * acresc;
            totalG = totalG + total;
            if((total >= 500)&&(total <= 1000)){
                qtdCons = qtdCons + 1;
            }
            System.out.println("O gasto: " +gasto);
            System.out.println("O acrescimo foi: " +acresc);
            System.out.printf("O total é: %.2f \n" ,total);
            System.out.println("Informe a qtd de quilowatts: ");
            qtd = ler.nextInt();
        }
        System.out.printf("Total geral é: %.2f \n" ,totalG);
        System.out.println("Quantidade do consumidor: " +qtdCons);
    }
    
}
