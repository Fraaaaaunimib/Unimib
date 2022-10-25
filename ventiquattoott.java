import java.util.Scanner;
public class ventiquattoott {
    public static void main (String[] Args){
Scanner tastiera = new Scanner (System.in);

/*
// prendi il nome Valentina, sostituisci la n e pasta sia l'inizio che la fine
String s = "Valentina";
int indice = s.indexOf("n");

String s1 = s.substring(0,  indice) + "f" + s.substring(indice+1);
System.out.println(s1);


// cambia una lettera da Gianpiertolda
String s2 = "gianpiertoldald";
int indice2 = s2.indexOf("n");
int indice3 = s2.lastIndexOf("a");
String risultato1 = s2.substring (0, indice2) + "r" + s2.substring(indice2 +1);
String risultato2 = s2.substring (0,indice3)+"a"+s2.substring(indice3 + 1);

System.out.println(risultato1);
System.out.println("Last occurrence: " + risultato2);

// come faccio a capire se in una stringa ci sono una o due parole
System.out.print("Thou shall enter here what you desire to find: ");
String s3 = tastiera.nextLine();
int indice4 = s3.indexOf(" ");
if (indice4==-1){
    System.out.println("This is just one word, damn, and it is: " + s3);
} else {
    System.out.println("You have so many words. in fact, you have " + indice4 + " words.");
     */

     // numero dispari e compreso tra [5,51] /*
     /* int n = tastiera.nextInt();
     if (n > 5 || n < 51 || n % 2 !=1) {
        System.out.println("Your damn number is well inside this range huh");
     } else {
        if (n < 5 || n > 51 ||  n % 3 == 0) {
            System.out.println("You're in the goddamn second range!");
        } else { 
            System.out.println("You're way too far");

            }
        }
 
        boolean a = 5 < 9 | ( 6 >=19/3 & 7%6==2); // or: se il primo è vero e il secondo è false allora vero
            boolean b = (5<9 | 6>=19/3) & 7%6==2; // c'è l'and
            System.out.println(a);
            System.out.println(b);

            a = 5<9 | 26>25; // con una sola | veritifa entrambi
            b = 5<9 || 26>25; //con due || evita di verificarne due
            System.out.println(a);
            System.out.println(b);
        
            a = (2 >=3) || (10!=10 & 7!=4) || (2 >=-1); //or = basta uno vero ed è vero
            b = (2 >=3 || 10!=10) & (7!=4 || 2 >=-1); // &: entrambe devono essere vere per essere vera
            System.out.println(a + " " + b);

            // se n è multiplo di due:
            // se n è multiplo di 3:
            //se n è multiplo di 2 e di tre:

            int n = tastiera.nextInt();
*/

/* System.out.print(" We don't need no light, why is it on? - enter a number, please ");
int n = tastiera.nextInt();
            if (n%2==0){
                if (n%3==0) {
                    System.out.println("Damn it's a mess out there - due e tre");
                } else
                    System.out.println("They'll leave but we don't care, we'll stay - solo due");
             } else if (n%3 == 0) 
                    System.out.println("I'm good right here, say whatever I don't care - solo tre");
                 else 
                    System.out.println("They say please turn it down, I say just turn around - nè due nè tre");
            

                // Esercizio 1 pagina 80
                double a = tastiera.nextDouble();

                double b = 1.0/a;
                System.out.println(a + " " + b + " " + a*b);
                System.out.println(a*b - a);

                // Esercizio 2 pagina 80 /* /* */
               /*  double a1 = tastiera.nextDouble();
                int b2 = (int)a1;
                System.out.println(a1 + " " + b2);
                byte c1 = (byte)b2;
                System.out.println(c1);
                /* */

                // esercizio 3 pagina 80
               /*   System.out.println("");
                double a2 = tastiera.nextDouble();
                double b3 = (a2%2.0);
                int c2 = (int)a2;
                System.out.println(a2 + " " + b3 + " " + c2 + " " + c2%2);

                // esercizio 4 pagina 80
                System.out.println("");
                int u = 2, v = 3, w = 5, x = 7, y = 11;
                System.out.println(u+(v*w)+x);
                System.out.println(u+(y%(v*w))+x);
                System.out.println((u++ / v) + (u++ * w));
                System.out.println(u++/v + u++*w); // they're different with parenthesis or notyst
            

                // il ciclo While
                int conteggio = 0;
                System.out.print("Il ciclo While: ");
                conteggio = tastiera.nextInt();

                while(conteggio <=10){
                    System.out.println(conteggio);
                    conteggio++;
                }
                /* in questo caso, il ciclo While continua ad eseguire system.out e
                 * ad aumentare di uno la variabile se hai inserito un numero minore o
                 * uguale a 10, fino a quando il valore della variabile non arriva a 10.
                 */
                /* boolean conteggioo = false;
                 while (conteggio >= 10 & conteggio < 90){
                    System.out.println(conteggio);
                    conteggio++;
                 } */
                // ciclo per le potenze

                double n1 = 0;
                    System.out.println("Inserisci un valore intero: ");
                    n1 = tastiera.nextDouble();

                    double contatore = 0;
                    double potenza = 1;

                    while(contatore <= n1){
                        potenza = 2*potenza;
                        System.out.println(contatore + " " + potenza);
                        contatore++;
                    }
                       
                        
                        tastiera.close();
                    }
    
         
        }

    


    





