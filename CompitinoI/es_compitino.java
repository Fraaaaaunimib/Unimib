package CompitinoI;
import java.util.Scanner;
public class es_compitino {
    
    public static void main (String[]Args) {

    Scanner sc = new Scanner(System.in);

    /* 
    int contatore = -1;
    int numero;
    int sum = 0;
    int min = -1; // così posso mettere lo zero
    int max = 0;

    while (contatore != 0){
    System.out.print("Esercizio 1: Scrivi numeri: ");
    numero = sc.nextInt();

    if (numero < 0){
        System.out.println("Error");
        contatore = -1;
    }

    if (numero == 0)
    contatore = 0;

    if (numero > 0){
        sum = sum + numero;

        // max
        if (numero > max)
        max = numero;

        // min
        // devo mettere -1 perché posso mettere lo zero
        if (numero < min)
        min = numero;

        if (min == -1) //posizione di partenza
        min = numero; 
    }
    }

    System.out.println ("Somma: " + sum + ", massimo: " + max + ",minimo: " + min);

    int i = 0, j = 1;

    // in questo caso, metto i come max, e j come min
    // perchè? sono gli estremi inferiori dei valori che possono assumere
    int somma = 0;
    contatore = 0;
    i = max;
    j = min;
while (i <= sum && j <= max){
    while (j <= max) {
        somma += i*j;
        contatore++;
        j++;
    }
    i++;
}

double media = (double)(somma/contatore);
System.out.println("La media è: " + media);

*/


//esercizio 2
/*
int n, n2;
int contatore = 0;
int prod = 1, max=0, min=-1;
do {
System.out.print("Scrivi un numero intero: ");
n = sc.nextInt();

if (n <= 0){
System.out.println("No. ");
contatore = 0;
}

if (n > 0){
    contatore++;
}
} while (contatore == 0);

while (contatore != 0){
    System.out.print("Scrivi una fantastica stringa di numeri: ");
    n2 = sc.nextInt();

    if (n2 <= 0){
        System.out.println("No. ");
}

    if (n2 == n){
        contatore= 0;
    }

    prod = n * n2;
    if (n2 > max){
        max = n2;
    }

    if (n2 < min){
        min = n2;
    }


    }

    System.out.println("Prodotto: " + prod + ", massimo: " + max + ", minimo: " + min);

    */
    

//esercizio 3
/*
int contatore = 0;
String s = "";
int i = 0;
while (contatore == 0){
    i = 0;
System.out.print("Scrivi una fantastica stringa composta soltanto da lettere minuscole: ");
s = sc.nextLine();

while (i < s.length() - 1){
    if (s.charAt(i) < 'a' || s.charAt(i) > 'z'){
        contatore = 0;
        i++;
    }

    if (s.charAt(i) <= 97 && s.charAt(i) >= 122){
        contatore = 0;
        i++;
    }
    if (s.charAt(i) >= 97 && s.charAt(i) <= 122){
        contatore++;
        i++;
        
    }
}

if (contatore == 0){
    System.out.println("Oopsies, devi rifare da capo...");
} 
if (contatore == 1){
    System.out.println("Noice! Puoi proseguire.");
}
}

int numerovirgola = 0;
i = 0;

while (i < s.length()) {
    switch (s.charAt(i)){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': 
        numerovirgola++;
        break;
    }
    i++;
}
if (numerovirgola == 1){
    System.out.println("La stringa contiene una vocale");
}

if (numerovirgola >= 1){
    System.out.println("La stringa contiene " + numerovirgola + " vocali.");
}

if (numerovirgola <= 0){
    System.out.println("Non ci siamo proprio.... zero vocali");
}

String nuovastringa = "";
i = 0;

while (i < s.length()){
    switch (s.charAt(i)){
        case 'b':
        case 'c':
        case 'd':
        case 'f':
        case 'g': 
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'p':
        case 'q':
        case 'r':
        case's':
        case 't':
        case 'v':
        case 'z':
        nuovastringa += "" + (s.charAt(i));
        break;
    }
    i++;

    nuovastringa = nuovastringa.toUpperCase();
    
}
System.out.println("Ecco qua tutta la stringa con solo le consonanti: " + nuovastringa);

int somma = 0;
i = 0;

while (i < s.length()){
    somma = somma+ s.charAt(i);
    i++;
}

double media = (double)(somma/s.length());

System.out.println("La somma dei caratteri Unicode è: " + somma + ", mentre la media è: " + media);
*/

//carta oro 1
/* 
System.out.println("Esercizio 1 carta oro 1 - scrivi un numero per fare una successione ricorsiva: ");
int an = sc.nextInt();
int a0 = 2;
int ar;
int contatore = 0;
do{

    ar = (3*a0)-2;
    a0 = ar;
    contatore++;
    System.out.println("3*"+a0+"-2="+ar);

} while (contatore < an);

*/

//carta oro 1-2
/*
System.out.println("Esercizio 2 carta oro 1 - scrivi un numero per questo insieme: ");
double epsilon = sc.nextDouble();
double epsilon2;
double n = 0;
do {

    if (1-epsilon < 0){
        epsilon2 = (1-epsilon) - (1-epsilon) - (1-epsilon);
    }
 if ((n)/(n+1) > (1-epsilon) && (n)/(n+1) >= 1) {
    System.out.println("Non va bene questo valore di n, provo ad aumentare...");
    n++;
 }

 if ((n)/(n+1) < (1-epsilon) && (n)/(n+1) <= 1) {
    System.out.println("Ok, l'abbiamo trovato. Stampo il valore:" + (n)/(n+1));
 }
} while ((n)/(n+1) == 1);

*/

//carta oro 2-1
/* 
System.out.println("Esercizio 1 carta oro 2 - scrivi un'espressione");
String expression1 = sc.next();
String numbers ="";
String operator = " ";
int i = 0;
int operatorchar = 0;
int result = 0;
int numbers1 = 0;
int ascii;
String numberschar = "";

System.out.println((expression1.charAt(1)));
for (i = 0;i<expression1.length()-1;i++){
    if (expression1.charAt(i) >= '0' && expression1.charAt(i) <= '9'){
        numbers1 = numbers1 + expression1.charAt(i) -48;
     
    }

try {
    if (expression1.charAt(i) == '+' || expression1.charAt(i) == '-' || expression1.charAt(i) == 43){
        operator = "";
        operator = ""+operator + expression1.charAt(i);
        operatorchar = expression1.indexOf(expression1.charAt(i));
        
    }
} catch (StringIndexOutOfBoundsException e) {
    System.out.println(e);
}

    numberschar = numbers.substring(0,operatorchar);

    if (operator.charAt(i) != ' '){
        if (operator.charAt(i) == '+'){
            result = numbers1 + result;
            System.out.println(result);
            }
        
            if (operator.charAt(i) == '+'){
            result = result - numbers1;
            System.out.println(result);
            }
    }
    */



//esercizio carta oro 2-2

String s1;
String s2;
int contatore1sbagliato = 0;
int i, i2;

do {

System.out.print("Leggi la prima: ");
s1 = sc.next();

for (i=0;i<s1.length();i++){
    if (s1.charAt(i) < 97 || s1.charAt(i) > 122){
        contatore1sbagliato++;
    }
}

if (contatore1sbagliato > 0)
System.out.println("Riscrivilo con le minuscole.");
} while (contatore1sbagliato > 0);
System.out.print("Scrivi la seconda: ");
s2 = sc.next();

for (i=0;i<s1.length();i++){
System.out.println("" + s1.charAt(i) + s2.charAt(i));
}
sc.close();
    }
}