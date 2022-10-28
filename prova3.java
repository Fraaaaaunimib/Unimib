import java.util.Scanner;
public class prova3 {
    public static void main (String[]args) {
         // secondo criterio: richiesta all'utente
    // scrive una stringa al contrario, fino a quando l'utente vuole
    String parola = "";
    Scanner tastiera = new Scanner(System.in);
    

    System.out.println("");
    
    do{
        System.out.println("Scrivi una stringa. ");
    parola = tastiera.next();

         // parola al contrario
         int indice = parola.length()-1;
         while (indice>= 0){
            System.out.print(parola.charAt(indice));
            indice--;

        }
        System.out.println("Scrivi ANCORA per continuare, STOP per fermarti");
        parola = tastiera.next();

       
    } while(!parola.equals("STOP"));

    
    }
}
