package pg_83;

import java.util.Scanner;

public class Quest_05 {

    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         int maior = 0, menor = 0, num_maior = 0, num_menor = 0;
         for(int cont = 1; cont <= 10; cont++){
             System.out.println("DIGITE O NÚMERO DE ALUNOS:");
             int num = ler.nextInt();
             System.out.println("DIGITE A ALTURA:");
             double alt = ler.nextDouble();
             if(cont == 1){
                 maior = (int) alt;
                 num_maior = num;
                 menor = (int) alt;
             }else{
                 if(alt > maior){
                     maior = (int) alt;
                     num_maior = num;
                 }
                 if(alt < menor){
                     menor = (int) alt;
                     num_menor = num;
                 }
             }
         }
         System.out.println(+maior+ "," +num_maior);
         System.out.println(+menor+ "," +num_menor);
    }
    
}
