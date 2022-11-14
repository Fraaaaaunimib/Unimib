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
*/

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
sc.close();
}
}
