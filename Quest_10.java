package pg_83;

public class Quest_10 {

    public static void main(String[] args) {
        int ant = 0 , at = 1, prx = 1;
        for(int i = 3; i <= 8; i++){
            System.out.print(ant + " , ");
            prx = at + ant;
            ant = at;
            at = prx;
        }  
        System.out.println(prx);    
    }
    
}
