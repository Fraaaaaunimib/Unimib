package CompitinoI;
import java.util.Scanner;
public class es_lab_quattronov {
    public static void main(String[] args) {
        //due numeri interi
        int a=0,b=0, c=0, i;

        Scanner sc = new Scanner(System.in);


        //esercizio 1 
        /*
        System.out.println("Scrivi l'anno: ");
        a = sc.nextInt();

        System.out.println("Scrivi il mese: ");
        b = sc.nextInt();

        if (a >= 1900 && a <= 2099){
            if (b >= 1 && b <= 12) {
                
                if (b == 1) { //gennaio
                    c = 31;
                }

                if (b == 2) { //febbraio
                    while(a%4 == 0 && a%100 != 0 || a%400 == 0 && a==2000){

                        System.out.println("29");
                        System.exit(0);
                    } 
                    c = 28;
                }

                if (b == 3) { //marzo
                    c = 31;
                }

                if (b == 4) { //aprile
                    c = 30;
                }

                if (b == 5) { //maggio
                    c = 31;
                }

                if (b == 6) { //giugno
                    c = 30;
                }

                if (b == 7) { //luglio
                    c = 31;
                }

                if (b == 8) { //agosto
                    c = 31;
                }

                if (b == 9) { //settembre
                    c = 30;
                }

                if (b == 10) { //ottobre
                    c = 31;
                }

                if (b == 11) { //novembre
                    c = 30;
                }

                if (b == 12) { //dicembre
                    c = 31;
                }

                System.out.println(c);
            } else {
                System.out.println("That's yet another error");
                System.exit(0);
            }
        } else {
            System.out.println("That's an error");
            System.exit(0);
        }
*/

        //esercizio 2
        /* 
        System.out.println("Scrivi una stringa: ");
        String string = sc.nextLine();

     

        
        String onlyspaces = string.replaceAll("[^ ]","");
        int onlyspaceslength = onlyspaces.length() +1;


        if (onlyspaceslength > 1 ){
            String tofind = " ";
            int found = string.indexOf(tofind);
            String lastoccurrence = string.substring(string.lastIndexOf(" "),string.length()).replaceAll(" ", "");
            String firstoccurrence = string.substring(0,found);
            if (lastoccurrence != " "){

        

        found = string.indexOf(tofind);
        int wordlength = string.replaceAll(" ", "").length();
        lastoccurrence = string.substring(string.lastIndexOf(" "),string.length()).replaceAll(" ", "");
        firstoccurrence = string.substring(0,found);
        System.out.println ("Here's what you've inserted: " + string);
        System.out.println("Here's how many words are in this sentence: " + onlyspaceslength);
        System.out.println("The last word: " + lastoccurrence);
        System.out.println("And the first word: " + firstoccurrence);
            } else {
                System.out.println("That is not valid");
                System.exit(0);
            }
        } 
        

        if (onlyspaceslength == 1 && string.equals("")){
            System.out.println("There are no words");
            System.exit(0);
        }

        if (onlyspaceslength == 1) {

        String tofind = " ";

        int found = string.indexOf(tofind);
        int wordlength = string.replaceAll(" ", "").length();

            System.out.println("Here's what you've inserted: " + string);
            System.out.println("And here is your length: " + wordlength);
            System.exit(0);
        } 
        */

        //esercizio 3
        /* 
        int examvotetheory;
        System.out.println("Insert here your exam vote in the theoretical part: ");
        examvotetheory = sc.nextInt();

        System.out.println("Insert here your exam vote in the practical part: ");
        int examvotepractice = sc.nextInt();

        if (examvotetheory <= -8 && examvotetheory >= 8){
            System.out.println("That's an error");
            System.exit(0);
    }

    if (examvotepractice <= 0 && examvotepractice >= 24){
        System.out.println("That's an error");
        System.exit(0);
    }
    
    int examvotecompletion = examvotetheory + examvotepractice;

    if (examvotecompletion >= 18 && examvotetheory <= 1) {
        System.out.println("That's so low for theory. Study a bit goddamn more");
        System.exit(0);
    }

    if (examvotetheory <=0 && examvotecompletion < 18){
        System.out.println("That's so low. Study a bit goddamn more");
        System.exit(0);
    }

    if (examvotetheory > 0 && examvotecompletion < 18){
        System.out.println("That's so low. Study a bit goddamn more");
        System.exit(0);
    }

    if (examvotecompletion == 31 || examvotecompletion == 32){
        System.out.println("Congratulations, you're so awesome!");
        System.exit(0);
    }

    if (examvotecompletion != 31 && examvotecompletion != 32 && examvotetheory > 0 && examvotecompletion > 18 && examvotepractice > 0){
        System.out.println("This is your grade: " + examvotecompletion);
        System.exit(0);
*/
       // psst, it's in the other file

       //esercizio 4
       /*
       int capacitàkgzaino;
       int pesozaino;
       int numerooggetti = 0;
       int massimo, minimo;
    
       System.out.print("Inserisci la capacità del tuo zaino ");
       capacitàkgzaino = sc.nextInt();
       System.out.println();

       
       int pesooggetto ;
       int mediaoggetti;
       pesozaino = 0;
       pesooggetto = 0;
       if (pesozaino > capacitàkgzaino) {
        System.out.println("Sei fuori-");
        System.exit(0);
    }
    massimo = pesooggetto;
    minimo = pesooggetto;
       System.out.println();
      


       int pesomassimo = pesooggetto;
       int pesominimo = pesooggetto;

       do {

        System.out.print("Adesso quanto pesa un singolo oggetto? ");
        pesooggetto = sc.nextInt();
        System.out.println();
        pesozaino = pesozaino + pesooggetto;


        if (pesooggetto > massimo)
         massimo = pesooggetto;

         if (pesooggetto < minimo)
         minimo = pesooggetto;

        numerooggetti++;

        mediaoggetti = pesozaino/numerooggetti;
       } while (pesozaino < capacitàkgzaino && pesooggetto != 0);

       if (pesooggetto == capacitàkgzaino) {
        System.out.println("Questo è esattamente lo stesso valore, ma perchè???");
    }

       if (pesooggetto < pesozaino) {
       System.out.println("La capacità è: " + capacitàkgzaino + ", il numero degli oggetti è " + numerooggetti + ", il peso degli oggetti che hai messo è " + pesozaino + ", il massimo è " + massimo + ", il minimo è " + minimo + ", e la media è " + mediaoggetti);
} 

if (pesozaino > capacitàkgzaino) {
    System.out.println("Perchè vuoi mettere un oggetto che pesa " + pesooggetto + " kg in uno zaino da " + capacitàkgzaino + " kg?");
}
if (pesooggetto == 0) {
    System.out.println("L'oggetto non pesa niente...");
}
*/

        //esercizio 5
        /*
        System.out.print("Primo numero: ");

        int n = sc.nextInt();
        int result =0;

        System.out.print("Secondo numero: ");
        int m = sc.nextInt();

        int resto=0;

       while (n>0) {
        n = n - m; //numero pieno - numero che hai messo nel secondo
        System.out.println(n);
        result++;

        if (n < 0){
            System.out.println("No.");
            resto =n+m; //ritorno al numero prima
                result = result -1;
                System.out.println("Ecco il tuo resto. " + resto);
                  System.out.println("La tua divisione ha come risultato: " + result);
                  System.exit(0);
              }
        }
        */

        String string1 = sc.next();
        String string2 = sc.next();

        
       }
       
    }
    