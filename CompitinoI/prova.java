package CompitinoI;
import java.util.Scanner;
public class prova {
    
    public static void main (String[] Args){
        Scanner tastiera = new Scanner(System.in);

        String messaggio;
        int posizione;
        String stringa;

        System.out.println("a");
        messaggio=tastiera.nextLine();

        System.out.println("b");
        posizione = tastiera.nextInt();

        System.out.println("c");
        tastiera.nextLine();
        stringa = tastiera.nextLine();

        String nuovastringauno = messaggio.substring(0,posizione);
        String nuovastringadue = messaggio.substring(posizione, messaggio.length());

        System.out.println(nuovastringauno + stringa + nuovastringadue);

        tastiera.close();
    }
}
