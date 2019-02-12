package pg_83;

import java.util.Scanner;

public class Quest_39 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op;
        double sal, imposto = 0, aumento = 0, novoSal;

        do {
            System.out.println("Escolha umas das opções:\n"
                    + " 1.Imposto\n 2.Novo Salário\n 3.Calssificação\n 4.Sair");
            op = ler.nextInt();

            if ((op > 4) || (op < 1)) {
                System.out.println("Opção inválida!");
            } else {
                if (op == 1) {
                    System.out.println("Informe o salário do funcionário:");
                    sal = ler.nextDouble();
                    if (sal < 500) {
                        imposto = (sal * 5) / 100;
                    } else {
                        if ((sal >= 500) && (sal <= 850)) {
                            imposto = (sal * 10) / 100;
                        } else {
                            if (sal > 850) {
                                imposto = (sal * 15) / 100;
                            }
                        }                      
                    }
                    System.out.println("O imposto é: " + imposto);
                }
                if (op == 2) {
                    System.out.println("Informe o salário do funcionário:");
                    sal = ler.nextDouble();
                    if(sal > 1500){
                        aumento = 25;
                    }else{
                        if((sal <= 750)&&(sal <= 1500)){
                            aumento = 50;
                        }else{
                            if((sal >= 450)&&(sal < 750)){
                                aumento = 75;
                            }else{
                                if(sal < 450){
                                    aumento = 100;
                                }
                            }
                        }
                    }
                    novoSal = sal + aumento;
                    System.out.println("Novo salário: " +novoSal);
                }
                if(op == 3){
                    System.out.println("Informe o salário do funcionário:");
                    sal = ler.nextDouble();
                    if(sal <= 700){
                        System.out.println("MAL REMUNERADO!");
                    }else{
                        System.out.println("BEM REMUNERADO!");
                    }
                }

            }

        }while(op != 4);
    }
}
