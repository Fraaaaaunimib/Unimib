
package CompitinoI;
import java.util.Scanner;

public class es_lab_ottonov {
    public static void main (String[]Args) {
        Scanner sc = new Scanner(System.in);

        /* //esercizio 1
        int letto; 
        double potenza = 1;
        double potenza2;
        int maggiore;
        System.out.print("Thou shall write here a number: ");
        letto = sc.nextInt();

        potenza2 = Math.pow(2, potenza);

        while (potenza2 < letto) {
            potenza++;
            potenza2 = Math.pow(2,potenza);
            
        }
        System.out.println(potenza2);

        sc.close();
*/
        //esercizio 2 
        /*
        String stringa1, stringa2, stringacomune = "";

        System.out.print("Thou shall write here a string: ");
        stringa1 = sc.nextLine();

        System.out.print("Thou shall write here a string again: ");
        stringa2 = sc.nextLine();

        int length1 = 0, length2 = 0;
        length1 = stringa1.length();
        length2 = stringa2.length();
        int contatore1 = 0;
        char char1, char2;

        while (length1 > 0 && length2 > 0){

            char1 = stringa1.charAt(contatore1);
            char2 = stringa2.charAt(contatore1);
            contatore1++; //lo devo mettere fuori perchè se fosse stato nell'if non si sarebbe aggiornato
            if (char1 == char2) {
                stringacomune = stringacomune+char1; //i need not to put equals
        }
            length1--;
            length2--;
    }

    if (contatore1 == 1) {
        System.out.println("You have one similarity");
    }

    if (contatore1 > 1) {
        contatore1 = contatore1 - 1;
        System.out.println("You have " + contatore1 + " similarities");
    }

    if (contatore1 == 0) {
        System.out.println("You have no similarities");
    }

    System.out.println("Here's what you have in common: "+stringacomune);
*/

        //esercizio 3
        /*
        int m = 0;
        int n = 2;
        
        
        do{
            System.out.print("Write here a great number: ");
        m = sc.nextInt();

        if (m < 0 || m == 0) {
        System.out.println("You can't have a number less than 0");
        }
        
        } while (m < 0 || m == 0);

        while (m > 0){
            n = 3*n-2;
            m--;
            System.out.println(n);
        }
        */

        //esercizio 3
        /*
        long numero;
		 long residuoDaFattorizzare;
		 long divisore;
		 Scanner lettore = new Scanner(System.in);
		 
		 System.out.print("Quale intero vuoi fattorizzare? ");
		 numero = lettore.nextLong();
		 
		 System.out.print(numero + " =");
		 divisore = 2;
		 residuoDaFattorizzare = numero;
		 while(residuoDaFattorizzare > 1)  // continua se la fattorizzazione non e' completa
		 {
		 	while(residuoDaFattorizzare % divisore == 0)  // ciascun divisore potrebbe essere applicato piu' volte
		 	{
		 		// sicuramente ho trovato un divisore
		 		if(residuoDaFattorizzare == numero)     // in questo caso si tratta del primo fattore
		 			System.out.print(" " + divisore);   // stampo senza il simbolo di moltiplicazione
		 		else
		 			System.out.print(" * " + divisore); // stampo premettendo il simbolo di moltiplicazione
		 			
		 		residuoDaFattorizzare = residuoDaFattorizzare / divisore;
		 	}
		 	
		 	// ho esaurito l'applicazione del divisore
		 	divisore++;
		 }
		 System.out.println();

         
         lettore.close();
         */
                     sc.close();
            }
        }

        
        

