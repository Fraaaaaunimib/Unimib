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

*/
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

    sc.close();
}


}

