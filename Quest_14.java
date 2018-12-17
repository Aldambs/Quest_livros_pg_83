package pg_83;

public class Quest_14 {

    public static void main(String[] args) {
        int soma = 0, num = 2;
        
        for (int i = 1; i <= 50; i++) {
            soma = soma + num;
            num = num + 2;
        }
        System.out.println(soma);
    }
    
}
