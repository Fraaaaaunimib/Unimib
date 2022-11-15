package CompitinoI;
import java.util.Scanner;
public class es_compitino2 {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        /*
        boolean valid = false;
        String expression;
        String parola = "";
        char expression1;
        String expression2 = "";
        boolean circular = false;
        boolean square = false;
        boolean graph = false;


do {
    parola = "";
    System.out.print("Write all the brackets you want here! Beware though... thou shall be valid programmer brackets! ");
    expression = sc.next();

    for (int i = 0; i < expression.length(); i++) {
        for(int i2 = 0; i2 < expression.length() -1; i2++) {
            if (expression.charAt(i2)!= '(' && expression.charAt(i2)!= ')' && expression.charAt(i2)!= '[' && expression.charAt(i2)!= ']' && expression.charAt(i2)!='{' && expression.charAt(i2) != '}' && expression.length() == 1){
                valid = false;
            } else {
                valid = true;
            }
}
}
} while (valid == false);

if (valid == true){
    for (int i2 = 0; i2 < expression.length(); i2++) {
        expression1 = expression.charAt(i2);

        if (expression.length() == 2) {
          if (expression.charAt(0) == '(' && expression.charAt(1) == ')' || expression.charAt(0) == '[' && expression.charAt(1) == ']'|| expression.charAt(0) == '{' && expression.charAt(1) == '}'){
            System.out.println("Valid yay!");
            System.exit(0);
          }
        }

        switch(expression1){
            case '(':
            if (expression.charAt(i2+1) == ')'){
                circular = true;
            } 

            if (expression.charAt(i2+1) != ')'){
                circular = false;
            }

            break;

            case '[':
            if (expression.charAt(i2+1) == ']'){
                square = true;
        }

        if (expression.charAt(i2+1)!= ']'){
            square = false;
    }

    break;

    case '{':
    if (expression.charAt(i2+1) == '}'){
        graph = true;
}

    if (expression.charAt(i2+1)!= '}'){
graph = false;

    }

    break;

    
}
    }
}

if (expression.length() == 4 && circular == true && square == true || expression.length() == 4 && circular == true && graph == true || expression.length() == 4 && square == true && graph == true){
    System.out.println("Valid yay!");
    System.exit(0);
}
if (circular == true && square == true && graph == true){
        System.out.println("Valid!");
}

if (circular == false || square == false || graph == false){
    System.out.println("Nope.");
}




System.out.print("Write here how much cash you have, and then I'll convert it into mone: ");
double numero = sc.nextDouble();
int contatore = 0;
int contatoredue = 0;
int contatoreuno = 0;
int contatoreflat = 0;
int contatoreventi = 0;
int contatoredieci = 0;
int contatorecinque = 0;
int contatoreduee = 0;
int contatoreunoo = 0;


System.out.print("Here's your money: ");

for (contatore = 0; contatore <= numero; contatore++){

    for (; numero-2 > 0 && numero > 1.000000; contatoredue++){
        
        if(numero-2 < 0) {
contatoredue = 0;
        }
        numero = numero-2;
    }

    }

    for (; contatoreuno < numero && contatore > 1.000000;contatoreuno++){
        if (numero-1 < 0){
            contatoreuno++;
        }
        numero = numero - 1;
    }

    for (; contatoreflat < numero && contatore > 1.000000;contatoreflat++){
            if (numero-0.5 < 0){
                contatoreflat++;
            }
            numero = numero - 0.5;
    }

    for (; contatoreventi < numero && contatore > 1.000000;contatoreventi++){
        if (numero-0.2 < 0){
            contatoreventi++;
        }
        numero = numero - 0.2;
}

for (; contatoredieci < numero && contatore > 1.000000;contatoredieci++){
    if (numero-0.1 < 0){
        contatoredieci++;
    }
    numero = numero - 0.1;
}

for (; contatorecinque < numero && contatore > 1.000000;contatorecinque++){
    if (numero-0.05 < 0){
        contatorecinque++;
    }

    if (contatorecinque%2 == 0){
        contatorecinque = contatorecinque -2;
        contatoredieci++;
    }
    numero = numero - 0.05;
}

for (; contatoreduee < numero && contatore > 1.000000;contatoreduee++){
    if (numero-0.02 < 0){
        contatoreduee++;
    }

    if (contatoreduee%5 == 0){
        contatoreduee = contatoreduee - 5;
        contatoredieci++;
    }
    numero = numero - 0.02;
}

for (; contatoreunoo < numero && contatore > 1.000000;contatoreunoo++){
    if (numero-0.01 < 0){
        contatoreunoo++;
    }

    numero = numero - 0.01;
}
    
if (contatorecinque -10 >= 0){
    contatorecinque = contatorecinque -2;
    contatoredieci++;
}

if (contatoreduee -5 >= 0){
    contatoreduee = contatoreduee - 5;
    contatorecinque++;
}

if (contatorecinque == 2){
    contatorecinque = 0;
    contatoredieci++;
}

if (contatoredieci -2 >= 0){
    contatoredieci = contatoredieci - 2;
    contatoreventi++;
}

    System.out.print(contatoredue + " monete da 2€, " + contatoreuno-- + " monete da 1€, " + contatoreflat + " monete da 0.5€, " + contatoreventi);
    System.out.print(" monete da 0.2€, " + contatoredieci + " monete da 0.1€, " + contatorecinque + " monete da 0,05€, " + contatoreduee + " monete da 0,02€, " + contatoreunoo + " monete da 0,01€.");
    System.out.println();


String parola = "";
do {
System.out.println("Ugly numbers: ");
int number = sc.nextInt();
int contatoredue=0,contatoretre=0,contatorecinque=0;
if (number%3 == 0){
contatoretre++;
}

if (number%2==0){
    contatoredue++;
}

if (number%5 == 0){
    contatorecinque++;
}

if (number%7 == 0){
    contatoredue = 0;
    contatorecinque = 0;
    contatoretre = 0;
}

if(contatoredue > 0 || contatoretre >0 || contatorecinque >0){
    System.out.println("This is an ugly number");
}

if (contatoredue == 0 && contatoretre == 0 && contatorecinque == 0){
    System.out.println("Retry.");
}

System.out.print("Write \"STOP\" if you want to stop this program, or qrite anything else if you want to restart. ");
parola = sc.next();
} while (!parola.equals("STOP"));



//Paola ha a disposizione 100 Euro, e non può comprare più di tre prodotti.

final int buono = 100;
final int prodottimax = 3;

boolean soldibene = true;
int prodotti = prodottimax;
int soldispesi = buono;
int soldiinsert;

System.out.print("Hai questo buono da 100€ che puoi spendere soltanto su tre prodotti.");
System.out.println("");

while (soldibene == true && soldispesi >= 0 && prodotti >= 0){
    System.out.print("Quanto vale il prodotto che vuoi comprare? ");
    soldiinsert = sc.nextInt();
     soldispesi = soldispesi - soldiinsert;
     prodotti--;

     if(soldispesi >= 0 && prodotti >= 0){
        System.out.println("Hai deciso di acquistare un oggetto da " + soldiinsert + "€, ti rimangono " + soldispesi + "€. Puoi comprare ancora " + prodotti + " prodotti.");
     }

     if (soldispesi <= 0){
        System.out.println("Non hai più soldi da spendere, basta così");
        System.exit(0);
     }
}


if (soldispesi <= 0){
    System.out.println("Non hai più soldi da spendere, basta così");
    System.exit(0);
}


String parola = "";
String digitato = "";
boolean esegui = true;
char carattere;

while (esegui == true){
System.out.print("Write here a string, until you don't write the word \"fine\" the program won't end. ");
digitato = sc.nextLine();
for (int i = 0; i <digitato.length();i++){
    carattere = digitato.charAt(i);
    if (digitato.charAt(i) == 'f' && digitato.charAt(i+1) == 'i' && digitato.charAt(i+2) == 'n' && digitato.charAt(i+3) == 'e'){
        esegui = false;
    } 

    if (esegui == false) {
    System.out.println("I'm sure you wrote \"fine\" somewhere, and that \"somewhere\" is at position " + (i + 1));
    System.exit(0);
    }

 
}
}

int deposito;
int prelievo;
int solditotali = 0;
int mese = 0;
String parola = "";
String meseword = "";

while (parola != "STOP" && mese <= 11) {
    mese++;

    if (mese == 1)
    meseword = "gennaio";

    if (mese == 2)
    meseword = "febbraio";

    if (mese == 3)
    meseword = "marzo";

    if (mese == 4)
    meseword = "aprile";

    if (mese == 5)
    meseword = "maggio";

    if (mese == 6)
    meseword = "giugno";

    if (mese == 7)
    meseword = "luglio";

    if (mese == 8)
    meseword = "agosto";

    if (mese == 9)
    meseword = "settembre";

    if (mese == 10)
    meseword = "ottobre";

    if (mese == 11)
    meseword = "novembre";

    if (mese == 12)
    meseword = "dicembre";


System.out.print("Mese " + mese + " - " + meseword + " - deposito o prelievo! Digita 1 se vuoi fare un deposito, 2 se vuoi fare un prelievo --> ");
int choice = sc.nextInt();

if (choice >= 'a' && choice <= 'z' || choice <= 'A' && choice <= 'Z') {
    System.out.println("Non siamo a scuola, matematica non si fa con le lettere... metti un numero!");
    mese = mese - 2;
}

switch (choice){
    case 1:
    System.out.print("Ok, hai deciso di fare un deposito. Quant'è l'ammontare di ciò che vuoi depositare? ");
    deposito = sc.nextInt();
    solditotali = solditotali + deposito;

    if (mese == 12)
    break;
    System.out.println("Questo è quanto hai sul tuo conto corrente: " + solditotali);
    break;

    case 2:
    System.out.print("Ok, hai deciso di prelevare. Quant'è l'ammontare di ciò che vuoi prelevare? ");
    prelievo = sc.nextInt();
    solditotali = solditotali - prelievo;

    if (mese == 12)
    break;

    System.out.println("Questo è quanto hai sul tuo conto corrente: " + solditotali);
    break;
}
if (mese < 12){
System.out.print("Se vuoi continuare, possiamo arrivare fino a dicembre e poi interromperci, o se digiti \"STOP\" ci si fermerà subito.");
parola = sc.next();
}

if (parola.equals("STOP")){
    System.out.print("Ok, hai deciso di interrrompere il tuo conto. Siamo arrivati ad avere sul tuo conto " + solditotali + "€. Buh-bye!");
    System.exit(0);
}

if (mese == 12){
    System.out.println("Benissimo, abbiamo fatto l'ammontare del tuo estratto conto annuale. Il tuo conto è arrivato a " + solditotali + "€.");
}
}


int max = 99999;
int min = 11111;
double computernumberexp = (Math.random()  * (max - min) + min);

int computernumber = (int)computernumberexp;
String computernumberfinder = "" + computernumber;
boolean valid = true;
int personnumber = 0;
String personnumberfinder = "" + personnumber;
int tries = 0;

int foundnumber;
int foundnumberposition;
System.out.println("Indovina un numero random generato dal computer! ");
System.out.println("Hai 10 tentativi prima che ti sbatta fuori, quindi fai attenzione....");
System.out.println("Il numero random è un numero sempre di 5 cifre. Pronto a immettere un numero?");

while (valid == true && tries < 10){
    tries++;
    System.out.println(tries + " tentativo. Ne hai 10.");
    System.out.print("Inserisci il numero che tu pensa sia quello corretto: ");
    personnumber = sc.nextInt();
    personnumberfinder = "" + personnumber;

    for (int i = 0; i < personnumberfinder.length(); i++){
        if (computernumberfinder.charAt(i) == personnumberfinder.charAt(i)){
            foundnumber = computernumberfinder.charAt(i);
            System.out.print("Hai indovinato questo numero! " + (foundnumber -48) + " alla posizione ");
            foundnumberposition = i+1;
            System.out.println(foundnumberposition);
        }
    }

    if (personnumber == computernumber){
        System.out.println("Hai trovato il numero! Il numero era: " + computernumber);
        System.exit(0);
    }

    System.out.print("Riprovaci, sarai più fortunato la prossima volta. ");
    }

    if (tries > 10){
        System.out.println("Hai finito i tentativi!! Questo era il numero che dovevi indovinare: "+computernumber);
        System.exit(0);
    }


int numero, numerorisultato = 1, numerotot = 1;

System.out.print("Fai la somma dei primi numeri dispari dall'uno al numero che metti --> ");
numero = sc.nextInt();

while (numerorisultato < numero){
    numerorisultato = numerorisultato + 2;
    numerotot = numerotot + numerorisultato;
    
}

System.out.println(numerotot);



int n, n2 = 1, n3 = 0;

System.out.print("Scrivi fino a quale numero le potenze di due devono arrivare --> ");
n = sc.nextInt();

for (n2 = 1; n2 <= n; n2++){
    n2 = (int)(Math.pow(n2, 2));
    System.out.print(n2 + " ");
    n3 = n3 + n2;

}
System.out.println(n3);


int contatore = 0;
System.out.println("Conta gli spazi in questa stringa --> ");
String stringa = sc.nextLine();

for (int i = 0; i < stringa.length();i++){
    if (stringa.charAt(i) == ' ') {
        contatore++;
    }
}

System.out.println("Ci sono " + contatore + " spazi in ciò che hai digitato");



System.out.print("Inverti questa stringa che scrivi: ");
String stringa = sc.nextLine();

String stringa2 = "";

for (int i = stringa.length() - 1; i >= 0; i--) {
    stringa2 = stringa2 + stringa.charAt(i);
}

System.out.println("Ecco la stringa invertita: " + stringa2);


boolean valid = true;
String uno="",due="",tre="",quattro="",cinque="",sei="",sette="",otto="";
int contatorec = 0, contatoret = 0;
int i = 1;
do {
System.out.print("Tira una moneta, e scrivi cosa ti esce, se ti esce croce scrivi \"c\", se ti esce testa scrivi \"t\". " + i + "° tentativo --> " );
if (i == 1){
uno = sc.next();
    if (uno.equals("c"))
    contatorec++;

    if (uno.equals("t"))
    contatoret++;
}
  
if (i == 2) {
due = sc.next();
if (due.equals("c"))
    contatorec++;

    if (due.equals("t"))
    contatoret++;
}

if (i == 3){
tre = sc.next();
if (tre.equals("c"))
    contatorec++;

    if (tre.equals("t"))
    contatoret++;
}
 
if (i == 4){
quattro = sc.next();
if (quattro.equals("c"))
    contatorec++;

    if (quattro.equals("t"))
    contatoret++;
}
  
if (i == 5){
cinque = sc.next();
if (cinque.equals("c"))
    contatorec++;

    if (cinque.equals("t"))
    contatoret++;
}
  
if (i == 6){
sei = sc.next();
if (sei.equals("c"))
    contatorec++;

    if (sei.equals("t"))
    contatoret++;
}
   
if (i == 7) {
sette = sc.next();
if (sette.equals("c"))
    contatorec++;

    if (sette.equals("t"))
    contatoret++;
}
    
if (i == 8) {
otto = sc.next();
if (otto.equals("c"))
    contatorec++;

    if (otto.equals("t"))
    contatoret++;
}
    


if (uno.length() > 1 || due.length() > 1 || tre.length() > 1 || quattro.length() > 1 || cinque.length() > 1 || sei.length() > 1 || sette.length() > 1 || otto.length() > 1){
System.out.println("Ti ho appena detto di mettere solo un carattere, non metterne di più!");
valid = false;
i--;
}


i++;
} while (valid == false || i <= 9);

System.out.println("Prima giocata è " + uno);
System.out.println("Seconda giocata è " + due);
System.out.println("Terza giocata è " + tre);
System.out.println("Quarta giocata è " + quattro);
System.out.println("Quinta giocata è " + cinque);
System.out.println("Sesta giocata è " + sei);
System.out.println("Settima giocata è " + sette);
System.out.println("Numero di croci: " + contatorec + " e numero di teste: " + contatoret);

// contatorec:8 = x:100
// x = contatorec*100 /8

int percentualec = (contatorec*100)/8;
int percentualet = (contatoret*100)/8;

System.out.println("Percentuali di croci: " + percentualec + "% e percentuale di teste: " + percentualet + "%");





int max = 0, min = -1;
int n = 0;
int i=0;
int totale = 0;
do {
System.out.print("Scrivi una sequenza di numeri, scrivi un numero negativo per interrompere: --> ");
n = sc.nextInt();

if (n <0){
    break;
}
if (n > max) {
    max = n;

}

if (n < max) {
    min = n;
   
}


totale = totale + n;
i++;



} while (n > 0);

if (n < 0)
System.out.println("Il massimo è " + max + ", il minimo è " + min + ", e la media tra tutti i numeri che hai messo è " + (totale/i));


int righe;
boolean valid = true;
int i;

do{
System.out.println("Scrivi di quante righe deve essere lungo il tuo triangolo --> ");
righe = sc.nextInt();

if (righe > 5) {
System.out.println("Nah nah nah, numero non valido... riprovaci!");
valid = false;
}

if (righe < 1){
    System.out.println("Nah nah nah, numero non valido... riprovaci!");
    valid = false;

}
} while (valid == false);
    if (righe == 1)
    System.out.println("*");

    if (righe == 2){
        System.out.println("*");
        System.out.println("**");
    }

    if (righe == 3){
        System.out.println("*");
        System.out.println("**");
        System.out.println("*");
    }

    if (righe == 4){
        System.out.println("*");
        System.out.println("**");
        System.out.println("**");
        System.out.println("*");
    }

    if (righe == 5){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

    }

    

    double altezza = 0;
    int i;
    double velocità = 0;
    boolean valid = true;
    int rimbalzocount = 0;
    boolean valid2 = false;
    boolean valid3 = true;
    do{
    System.out.print("Scrivi a che velocità la pallina deve andare ogni volta --> ");
    velocità = sc.nextDouble();

    if (velocità < 0){
       valid = false;
       System.out.println("Come puoi avere una velocità negativa?");         
    }
    } while (valid == false);
altezza = velocità;
    System.out.println("Tempo: 0 Altezza: 0");
    System.out.println("Tempo: 1 Altezza: " + velocità);
    System.out.println("Tempo: 2 Altezza: " + (altezza + velocità - 96));

    for (i=2;valid2 == false;i++){
        if (altezza > 0){
            velocità = velocità - 96;
            altezza = altezza + velocità;
            
            if (altezza < 0){
                valid3 = false;
            }

            if (altezza > 0){
                valid3 = true;
            }

            if (valid3 == true) {
            System.out.println("Tempo: " + i + " Altezza: " + altezza);
            }
        }

        if (altezza < 0){
            altezza = altezza + 204;
        }
        if (altezza == 0){
            i++;
            rimbalzocount++;
            System.out.println("Rimbalzo!");
            
            if (rimbalzocount == 5){
                System.out.println("Fine.");
                System.exit(0);
                valid2 = true;
            }


            altezza = altezza*-0.5;
            velocità = velocità*-0.5;
            continue;
        }


        if (rimbalzocount == 5){
            System.out.println("Fine.");
            System.exit(0);
        }

        if (altezza < 0){
            altezza = altezza*-0.5;
            velocità = velocità*-0.5;
            System.out.println("Rimbalzo!");
            rimbalzocount++;
        }
    }

    */

    final int chiave = 10;
    System.out.print("Scrivi un messaggio normale, e verrà codificato nella maniera speciale -->");
    String stringOriginale = sc.next();
int carOriginale;
int carCodificato;
char carCodificato2;
String stringCodificato = "";

    for (int i =0; i < stringOriginale.length();i++){
        carOriginale = stringOriginale.charAt(i);
        if (carOriginale + chiave > 126) {
            carCodificato = 32 + ((carOriginale + chiave) - 127);
        } else {
            carCodificato = (carOriginale + chiave);
        }

        carCodificato2 = (char)carCodificato;
        stringCodificato = "" + stringCodificato + carCodificato2;

    }

    System.out.println(stringCodificato);
    sc.close();
}


}

