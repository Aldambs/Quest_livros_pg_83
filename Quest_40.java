package pg_83;

import java.util.Scanner;

public class Quest_40 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       char meioTransp, carga;
       double preco, imp, transp = 0, seguro, total = 0, fim;
       int origem;
       
        System.out.println("Digite o preço: ");
        preco = ler.nextDouble();
        while(preco > 0){
            System.out.println("Escolha um país:\n "
                    + "1.EUA\n 2.México\n 3.Outros");
            origem = ler.nextInt();
            System.out.println("Escolha um meio de trasporte:\n "
                    + "T.Terrestre\n F.Fluvial\n A.Aerea");
            meioTransp = ler.next().charAt(0);
            System.out.println("Informe se a carga é perigosa: S.Sim ou N.Não");
            carga = ler.next().charAt(0);
            if(preco <= 100){
                imp = (preco * 5) / 100;
            }else{
                imp = (preco * 10) / 100;
            }
            if((carga == 's' || carga == 'S')){
                if(origem == 1){
                    transp = 50;
                }else{
                    if(origem == 2){
                        transp = 35;
                    }else{
                        if(origem == 3){
                            transp = 24;
                        }
                    }
                }
            }
            if((carga == 'n' || carga == 'N')){
                if(origem == 1){
                    transp = 12;
                }else{
                    if(origem == 2){
                        transp = 35;
                    }else{
                        if(origem == 3){
                            transp = 60;
                        }
                    }
                }
            }
            if((origem == 2) || ((meioTransp == 'a')||meioTransp == 'A')){
                seguro = preco/2;
            }else{
                seguro = 0;
            }
            fim = preco + imp + transp + seguro;
            total = total + imp;
            System.out.printf("O imposto é = %.2f" ,imp);
            System.out.printf("\nO trabsporte é = %.2f" ,transp);
            System.out.printf("\nO seguro é = %.2f" ,seguro);
            System.out.printf("\nO final é = %.2f" ,fim);
            System.out.println("\nDigite o preço: ");
            preco = ler.nextDouble();
        }
        System.out.printf("O total do imposto é = %.2f" ,total);
    }
    
}
