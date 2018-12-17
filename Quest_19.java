package pg_83;

import java.util.Scanner;

public class Quest_19 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double altura, media = 0, maior = 0, menor = 0, soma = 0;
        int cf = 0, cm = 0;
        char sexo, maiorS = 0;
        int qtd;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Informe a altura: ");
            altura = ler.nextDouble();
            System.out.println("Informe o sexo F ou M: ");
            sexo = ler.next().charAt(0);
            
            if (i == 1) {
                maior = altura;
                maiorS = sexo;
                menor = altura;
            } else {
                if (altura > maior) {
                    maior = altura;
                    maiorS = sexo;
                }
                if (altura < menor) {
                    menor = altura;
                }
                if (sexo == 'F') {
                    soma = soma + altura;
                    cf = cf + 1;
                } else {
                    cm = cm + 1;
                }
                
                if (cf == 0) {
                    media = 0;
                } else {
                    media = soma / cf;
                }
            }

        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);
        System.out.println("Masculino: " + cm);
        System.out.println("Maior sexo: " + maiorS);
    }

}
