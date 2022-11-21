
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
        /* 

        //esercizio 3
        
        long numero;
		 long residuoDaFattorizzare;
		 long divisore;
     long contatore = 0;
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
		 			System.out.print(" " + divisore + " per " + contatore + " volte ");   // stampa senza il simbolo di moltiplicazione
		 		else
        {
          contatore++;
		 			System.out.print(" * " + divisore); // stampo premettendo il simbolo di moltiplicazione
        }
		 			
		 		residuoDaFattorizzare = residuoDaFattorizzare / divisore;
		 	}
		 	
		 	// ho esaurito l'applicazione del divisore
		 	divisore++;
		 }
		 System.out.println();

         
         lettore.close();
         


// esercizio 5
/* 
int numero = 0;

  System.out.print("Inserisci un numero valido per la congettura di Collatz: ");
  numero = sc.nextInt();
  int contatore = numero;

  for (contatore=numero;contatore <= numero; contatore--) {

    if (numero == 1){
      System.exit(0);
      contatore = 0;
    }

    while (numero%2 == 0) {
      numero = numero/2;
      contatore--;

      if (numero == 1){
        System.out.print(numero + " ");
        System.exit(0);
        contatore = 0;
      }
      System.out.print(numero + " ");
    }

    while (numero >= 1 && numero%2 == 1) {
      numero = (3*numero)+1;
      contatore--;
      System.out.print(numero + " ");
    }

    
  }


//esercizio 7
/* 
System.out.print("Thou may enter numbers: ");
String numero1 = sc.next();

System.out.print("Thou may write numbers onceforth: ");
String numero2 = sc.next();

int numero1char=1, numero2char=1, numerorisultato1;
String numerorisultato1string = "";
String numerorisultato1string2 = "";
String numerorisultato1string21 = "";
String numerorisultato1string211 = "";
String numerorisultato1string211risultato="";
int numerorisultato1string21int = 1;
int numerorisultatostring211int = 1;
int contatore1 = numero1.length();
int contatore2 = numero2.length();
int contatore11 = numero1.length() -1;
int contatore22 = numero2.length() -1;
int contatore3;

/*
 * prendi il numero in alto e la sua lunghezza
 * prendi il numero in basso e la sua lunghezza
 */

 /* while (contatore1 > 0 && contatore2 > 0){

  // il carattere della stringa
  numero1char = numero1.charAt(contatore11) -48;
  numero2char = numero2.charAt(contatore22) - 48;
  numerorisultato1string = ""+(numero1char*numero2char);

  if(contatore1 > 0 && contatore2 > 0){
    numerorisultato1string2 = ""+numero1char*numero2char;
      contatore3= numerorisultato1string2.length()-1;
      numerorisultato1string21 = ""+numerorisultato1string2.charAt(contatore3);
      
      numerorisultato1string211 = numerorisultato1string2.substring(0,contatore3);
      if (!numerorisultato1string211.equals("")){
        System.out.println(numerorisultato1string21);
      }
    }
  // moltiplica i char
      numerorisultato1string2 = ""+numero1char*numero2char;
      numerorisultato1string211risultato = ""+(numerorisultatostring211int*numerorisultato1string21int);
    System.out.println(numerorisultato1string2);

    if (numerorisultato1string2.length() > 0) {
      numerorisultato1string21int = numerorisultato1string2.charAt(1) - 48;
      System.out.println(numerorisultato1string21int);
    }
    System.out.println(numerorisultato1string211risultato);

    
    contatore1--;
    contatore2--; 
    contatore11--;
    contatore22--;
    if (numerorisultato1string2.length() > 1){
      

    }
    //diminuisce di uno i contatori
    
  
  }

 */

 //esercizio 6
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
        int posizione = 0;
        int contatoresim = 0;

        while (length1 > 0 && length2 > 0){

            char1 = stringa1.charAt(contatore1);
            char2 = stringa2.charAt(contatore1);
            contatore1++; //lo devo mettere fuori perchè se fosse stato nell'if non si sarebbe aggiornato
            posizione++;
            
            if (char1 == char2) {
                stringacomune = ""+stringacomune+char1; //i need not to put equals
                contatoresim = posizione;
                System.out.println(contatoresim);
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
        System.out.println(contatoresim);
    }

    if (contatore1 == 0) {
        System.out.println("You have no similarities");
    }

    System.out.println("Here's what you have in common: "+stringacomune);

    sc.close();

}
            
        

}
        

