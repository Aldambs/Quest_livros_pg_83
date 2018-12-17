package pg_83;

import java.util.Scanner;

public class Quest_08{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int codigo;
        float nht, valor, sal_min, sal_inicial, aux, sal_final;
        char turno, categoria;
        sal_min = 150;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o código do " + i + "º funcionário: ");
            codigo = ler.nextInt();
            System.out.println("Digite o número de horas trabalhadas do " + i + "º funcionário: ");
            nht = ler.nextInt();
            System.out.println("Digite o turno de trabalho do " + i + "º funcionário (M, V ou N): ");
            turno = ler.next().charAt(0);
            
            
            while (turno != 'M' && turno != 'V' && turno != 'N') {
                System.out.println("Turno inválido, Digite novamente ");
                turno = ler.next().charAt(0);
            }
            
            System.out.println("Digite a categoria do " + i + "º funcionário (G ou O): ");
            categoria = ler.next().charAt(0);
            while (categoria != 'G' && categoria != 'O') {
                System.out.println("Categoria inválida, digite novamente ");
                categoria = ler.next().charAt(0);
            }
            if (categoria == 'G') {
                if (turno == 'N') {
                    valor = sal_min * 18 / 100;
                } else {
                    valor = sal_min * 15 / 100;
                }
            } else {
                if (turno == 'N') {
                    valor = sal_min * 13 / 100;
                } else {
                    valor = sal_min * 10 / 100;
                }
            }
            sal_inicial = nht * valor;
            if (sal_inicial <= 300) {
                aux = sal_inicial * 20 / 100;
            } else if (sal_inicial < 600) {
                aux = sal_inicial * 15 / 100;
            } else {
                aux = sal_inicial * 5 / 100;
            }
            sal_final = sal_inicial + aux;
            System.out.println("Código = " + codigo);
            System.out.println("Número de horas trabalhadas = " + nht);
            System.out.println("Valor do hora trabalhada = " + valor);
            System.out.println("Salário inicial = " + sal_inicial);
            System.out.println("Auxílio comida = " + aux);
            System.out.println("Salário Final = " + sal_final);
        }
    }
}
