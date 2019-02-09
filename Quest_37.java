package pg_83;

import java.util.Scanner;

public class Quest_37 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, totF = 0, totM = 0, soma = 0, 
                cont1 = 0, cont2 = 0, cont3 = 0, menor = 0;
        char sexo, exp;
        double porc = 0, medID = 0;
        System.out.println("Digite a idade: ");
        idade = ler.nextInt();
        
        while(idade != 0){
            System.out.println("Digite o sexo (F OU M): ");
            sexo = ler.next().charAt(0);
            System.out.println("Informe se há experiência (S OU N): ");
            exp = ler.next().charAt(0);
            
            if ((sexo == 'f' || sexo == 'F') && (exp == 's' || exp == 'S')) {
                if (totF == 0) {
                    menor = idade;
                } else if (idade < menor) {
                    menor = idade;
                }
            }
            if(sexo == 'm' || sexo == 'M'){
                totM = totM + 1;
            }
            if(sexo == 'f' || sexo == 'F'){
                totF = totF + 1;
            }
            if((sexo == 'f' || sexo == 'F') && (idade < 35 && exp == 'S' || exp == 's')){
                cont1 = cont1 + 1;
            }
            if((sexo == 'm' || sexo == 'M') && (idade > 45)){
                cont2 = cont2 + 1; 
                porc = (cont2 * 100) / totM;
            }
             if((sexo == 'm' || sexo == 'M') && (exp == 's' || exp == 'S')){
                 soma = soma + idade;
                 cont3 = cont3 + 1;
                 medID = soma / cont3;
            }                    
            System.out.println("Digite a idade: ");
            idade = ler.nextInt();
        }
        System.out.println("Nª de canditado feminino: " +totF);
        System.out.println("Nª de candidato masculino: " +totM);     
        System.out.println("Idade media: " +medID);        
        System.out.println("A porcentagem: " +porc);
        System.out.println("Nª de mulheres com idade inferior 35: " +cont1);
        System.out.println("A menor idade entre as mulheres: " +menor);
    }
    
}
