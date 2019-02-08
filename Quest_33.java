package pg_83;

import java.util.Scanner;

public class Quest_33 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Variaveis
        int cod, contM = 0, contF = 0;
        double salB, salL = 0, medM = 0, medF = 0, numH;
        char sexo;
        
        //Comando while (Logica)
        System.out.println("Digite o código: ");
        cod = ler.nextInt();
        while(cod != 0){
            System.out.println("Qual o sexo: (M OU F)");
            sexo = ler.next().charAt(0);
            System.out.println("Digite o número de horas: ");
            numH = ler.nextDouble();
            salB = numH * 18.50;
            if(sexo == 'm' || sexo == 'M'){
                salL = salB - ((salB * 10)/100);
                medM = medM + salL;
                contM = contM + 1;
            }
            if(sexo == 'f' || sexo == 'F'){
                salL = salB - ((salB * 5)/100);
                medF = medF + salL;
                contF = contF + 1;
            }          
            System.out.println("Salário bruto: " +salB);
            System.out.println("Salário liquido: " +salL);
            System.out.println("Digite o código: ");
            cod = ler.nextInt();
        }
        medM = medM / contM;
        medF = medF / contF;
        System.out.println("Média dos prof. do sexo masculino: " +medM);
        System.out.println("Média dos prof. do sexo feminino: " +medF);
    }
}
