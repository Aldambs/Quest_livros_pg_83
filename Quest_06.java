package pg_83;

import java.util.Scanner;

public class Quest_06 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cont, cod, numVei, numAcid;
       int maior = 0, menor = 0, cidMaior = 0, cidMenor = 0;
       int mediaVei, mediaAcid, somaVei = 0, somaAcid = 0, contAcid = 0;
       Scanner ler = new Scanner(System.in);
       
        System.out.println("Informe o código:");
        cod = ler.nextInt();
        System.out.println("Informe o número de veículo de passeio:");
        numVei = ler.nextInt();
        System.out.println("Informe o número de acidente de trânsito:");
        numAcid = ler.nextInt();
        
        for(cont = 1; cont <= 5; cont++){
            if(cont == 1){
                maior = numAcid;
                cidMaior = cod;
                menor = numAcid;
            }else{
                if(numAcid > maior){
                    maior = numAcid;
                    cidMaior = cod;
                }
                if(numAcid < menor){
                    menor = numAcid;
                    cidMenor = cod;
                }
            }
            somaVei = somaVei + numVei;
            if(numVei < 2000){
                somaAcid = somaAcid + numAcid;
                contAcid = contAcid + 1;
            }
        }
        System.out.println("Maior indice de acidente é:" +maior+ " , " +cidMaior);
        System.out.println("Menor indice de acidente é:" +menor+ " , " +cidMenor);
        mediaVei = somaVei / 5;
        System.out.println("Média é: " +mediaVei);
        if(contAcid == 0){
            System.out.println("Não foi digitado nenhuma cidade com menos de 2000 veiculo");
        }else{
            mediaAcid = somaAcid / contAcid;
            System.out.println("Média é: " +mediaAcid);
        }
    }
    
}
