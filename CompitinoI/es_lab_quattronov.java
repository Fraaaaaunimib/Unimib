package CompitinoI;
import java.util.Scanner;
public class es_lab_quattronov {
    public static void main(String[] args) {
        //due numeri interi
       // int a=0,b=0, c=0, i;

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

    /*    int x=2, y=3;

        do {
       
           do {
       
              x=x+y;
       
           } while(x<6);
       
           x=x-1;
       
        } while(x<=8);
       
        System.out.println(x);

        int i2 = 1; 
boolean trovato = false; 
while ((i2 < 10) || !trovato) { 
    if (i2 % 3 == 0) 
       trovato = true; 
    i2++; 
    System.out.println(i2);


    x=1;
*/ /* 
int x =-1;
    do {
   
        x=x-2;
   
        do {
   
            x=x+1;
   
        } while(x<5);
   
    } while(x<=4);
   
    System.out.println(x);

 i = 1; 
boolean trovato = false; 
while ((i < 10) && !trovato) { 
    if (i % 3 == 0) 
        trovato = true; 
    i++; 
    System.out.println(i);
}

System.out.print("Insert a number: ");
int n2;
i = 0;
int n = sc.nextInt();

do {
    System.out.print(i+" ");
    System.out.print("You may enter the same number you've entered previously: ");
    n2 = sc.nextInt();
    i++;
} while (n2 != n);
if (n2 == n) {
    System.exit(0);
}
*/
 //fattoriale
 /*
System.out.print("Enter a number to be inserted: ");
int n5, n4;
n5 = 1;
int n3 = sc.nextInt();
    if (n3 == 0){
        System.out.println("1");
        System.exit(0);
    }
n4 = n3-1;
n5 = n3*n4;
System.out.println(n5);
n3 = n3-1;


while (n5 > 0 && n5 != 0){
    n3 = n3-1;
    n5 = n5*n3;
    System.out.println(n5);

    /*
    scrive 8
    7
    1 = 7
     */
    /* 
int base, exp;
int contatore;

     
     int totale = 1;

     /*
      * potenza
      base = 3
      esponente = 3
      base * base * base
      */
      /*
     String parola;
     do {
        System.out.print("Leggi la base: ");
        base = sc.nextInt();
   
        System.out.print("Leggi l'esponente: ");
        exp = sc.nextInt();
        contatore = exp -1; //devo mettere -1 perché conta da zero e non da uno
        while (contatore > 0){
            base = base * exp;
            contatore--;
        }
        System.out.println(base);
        System.out.print("Scrivi STOP per fermarti: ");
        parola = sc.next();

     } while (!parola.equals("STOP"));
*/
String s1,s2;
int contatore1, contatoresbagliato1, contatoresbagliato2, contatore2;
contatoresbagliato1 = 0;
contatoresbagliato2 = 0;

do {
    do{
     System.out.print("Scrivi una sequenza di cinque zeri e uno: ");
     s1 = sc.next();
     contatore1 = s1.length() -1;
     contatoresbagliato1 = 0;
    
    while (contatore1 > 0){
        if (s1.charAt(contatore1) != 48 && s1.charAt (contatore1) != 49){
            contatoresbagliato1++;
        }
        contatore1--;
    }
    

    if (contatoresbagliato1 == 1) {
        System.out.println("Hai " + contatoresbagliato1 + " carattere non valido, riprova.");
    }

    if (contatoresbagliato1 > 0 && contatoresbagliato1 != 1) {
        contatoresbagliato1 = contatoresbagliato1 + 1;
        System.out.println("Hai " + contatoresbagliato1 + " caratteri non validi, riprova.");
    }  

    if (s1.length() > 5){
        System.out.println("Hai messo troppi numeri, riprova");
    }

    if (s1.length() < 5){
        System.out.println("Hai messo troppi pochi numeri, riprova");
    }
    } while (s1.length() > 5 || s1.length() < 5);

    
} while (contatoresbagliato1 > 0);

do {
    do{
     System.out.print("Scrivi una sequenza di cinque zeri e uno un'altra volta: ");
     s2 = sc.next();
     contatore2 = s2.length() -1;
     contatoresbagliato2 = 0;
    
    while (contatore2 > 0){
        if (s2.charAt(contatore2) != 48 && s2.charAt (contatore2) != 49){
            contatoresbagliato2++;
        }
        contatore2--;
    }
    

    if (contatoresbagliato2 == 1) {
        System.out.println("Hai " + contatoresbagliato2 + " carattere non valido, riprova.");
    }
    
    if (contatoresbagliato2 > 0 && contatoresbagliato2 != 1) {
        contatoresbagliato2 = contatoresbagliato2 + 1;
        System.out.println("Hai " + contatoresbagliato2 + " caratteri non validi, riprova.");
    }  

    if (s2.length() > 5){
        System.out.println("Hai messo troppi numeri, riprova");
    }

    if (s2.length() < 5){
        System.out.println("Hai messo troppi pochi numeri, riprova");
    }
    } while (s2.length() > 5 || s2.length() < 5);

    
} while (contatoresbagliato2 > 0);


    int s1value1 =0, s1value2=0, s1value3=0, s1value4=0, s1value5=0, s2value1=0, s2value2=0, s2value3=0, s2value4=0, s2value5 = 0;

    if (s1.charAt(0) == 49){
        s1value1 = 1;
    }

    if (s1.charAt(1) == 49){
        s1value2 = 1;
    }

    if (s1.charAt(2) == 49){
        s1value3 = 1;
    }

    if (s1.charAt(3) == 49){
        s1value4 = 1;
    }

    if (s1.charAt(4) == 49){
        s1value5 = 1;
    }


    if (s2.charAt(0) == 49){
        s1value1 = 1;
    }

    if (s2.charAt(1) == 49){
        s1value2 = 1;
    }

    if (s2.charAt(2) == 49){
        s1value3 = 1;
    }

    if (s2.charAt(3) == 49){
        s1value4 = 1;
    }

    if (s2.charAt(4) == 49){
        s1value5 = 1;
    }

    int total1 = 0,total2 = 0,total3=0,total4=0,total5=0;

    System.out.print("Vuoi l'unione o intersezione? ");
    String choice = sc.next();

    switch (choice){
case "unione":
 //unione
 if (s1value1 == 1 || s2value1 == 1)
 total1 = 1;

 if (s1value2 == 1 || s2value2 == 1)
 total2 = 1;

 if (s1value3 == 1 || s2value3 == 1)
 total3 = 1;

 if (s1value4 == 1 || s2value4 == 1)
 total4 = 1;

 if (s1value5 == 1 || s2value5 == 1)
 total5 = 1;

 System.out.println("Il tuo valore finale: " + total1+total2+total3+total4+total5);
break;

case "intersezione":
if (s1value1 == 1 && s2value1 == 1)
 total1 = 1;

 if (s1value2 == 1 && s2value2 == 1)
 total2 = 1;

 if (s1value3 == 1 && s2value3 == 1)
 total3 = 1;

 if (s1value4 == 1 && s2value4 == 1)
 total4 = 1;

 if (s1value5 == 1 && s2value5 == 1)
 total5 = 1;
 System.out.println("Il tuo valore finale: " + total1+total2+total3+total4+total5);
break;

default:
System.out.println("No.");
break;

    }


        sc.close();
}
}
       
    
    