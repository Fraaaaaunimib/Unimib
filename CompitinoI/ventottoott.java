package CompitinoI;
import java.util.Scanner;
public class ventottoott {

    public static void main (String[]args) {

        final double LANCI = 100;

        //aumentando il valore di lanci, i valori diventano sempre più vicini tra di loro
        Scanner tastiera = new Scanner(System.in);
        int conteggio =1;

    

        //la parte inizializzata può essere anche inizializzata al di fuori del for
        //il valore di aggiornamento può essere messo all'interno del ciclo for
        // possiamo togliere l'espressione booleana, ma la considererebbe sempre vera.
            for(; conteggio <= 10; conteggio++)
            {
                System.out.println(conteggio); // stampa tutti i numeri da 1 a 10
            }

            //stesso modo ma con While
            /*conteggio = 1;
            while (conteggio ==10){
                System.out.println(conteggio);
                conteggio++; */


    // criteri di terminazione
    // contatore -> esempio che simula lancio dado e calcola frequenza di ogni numero

    int uno =0, due=0, tre=0, quattro=0, cinque=0, sei=0; // numeri dei dadi
    int m = 0;
    for(int i = 1; i<= 100; i++){
        m= (int)(Math.random()*6) + 1;
        switch (m){
            case 1:
            uno++;
            break;

            case 2:
            due++;
            break;
            
            case 3:
            tre++;
            break;
            
            case 4:
            quattro++;
            break;
            
            case 5:
            cinque++;
            break;
            
            case 6:
            sei++;
            break;
            
            default:
            System.out.println("That's a very nice error.");
            System.exit(0);

    
        }
    }

    System.out.println("Frequenza di 1: " + uno/LANCI);
    System.out.println("Frequenza di 2: " + due/LANCI);
    System.out.println("Frequenza di 3: " + tre/LANCI);
    System.out.println("Frequenza di 4: " + quattro/LANCI);
    System.out.println("Frequenza di 5: " + cinque/LANCI);
    System.out.println("Frequenza di 6: " + sei/LANCI);


    // secondo criterio: richiesta all'utente
    // scrive una stringa al contrario, fino a quando l'utente vuole
    String parola = "";
    

    System.out.println("");
    System.out.println("Scrivi una stringa. ");
    parola = tastiera.next();

    do{
         // parola al contrario
         int indice = parola.length()-1;
         while (indice>= 0){
            System.out.print(parola.charAt(indice));
            indice--;

        }
        System.out.println("Scrivi ANCORA per continuare, STOP per fermarti");
        parola = tastiera.next();

       
    } while(!parola.equals("STOP"));


    // terzo caso: sentinella
    String testo = "", linea = "";
    final char SENTINELLA = '#';
    linea = tastiera.nextLine();
    System.out.println("Inserisci il testo. Per terminare digita "+ SENTINELLA + " su una nuova linea");

    while (linea.charAt(0) != '#'){
        testo = testo + '\n' + linea;
        linea = tastiera.nextLine();
    }
        System.out.println("Questo è il testo stampato");
        System.out.println(testo);
    tastiera.close();
            }
    }
    
