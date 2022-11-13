
import java.util.Scanner;
public class Romanizer {
    
    public static void main (String[] args) {

        String start = """

            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*,%*(/(///(,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,(#(#/***/(((*(*,,,/#*,,,,,,,,,,,,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,//%*#(%###(#*(##/(((,#((#(#,,,,,,,,,,,,,,,,,,,,,        ╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,&#%%#@@@@%%%%%&#%(/%#%###(#(,,,,,,,,,,,,,,,,,,,,        ROMANIZER - Transform from how Caesar would count to how you count
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*//(/(//#//#(/(((####((/#&%##(,*#(,,,,,,,,,,,,,,,        ╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,&%/(@(&/**////////(###&%###((((/(###(,,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,/%(&(&%*/*/**//*****/#%#%#%%%#(##((###,,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,&%&%%***,***//*****//(#%##%&@@%##%(##,,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,#@&%*####(/(####/%##(((###&%%%####&%,,,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,#%&(%(#%&,,/#%%#(##%%#(/(#&&###%##%###,,,,,,,,,,,,,        // HOW DOES IT WORK?
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,/#%%(##,,////******////((#%&&@&###&###,,,,,,,,,,,,        Write any roman number you want, and it'll be transformed into a number
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%%#///####(*(***/(((#((#(##%%&&%%%@%#,,,,,,,,,,,,,        you can actually read!
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,##(((/(#%%%#*/#(/((########%@@%%&&##(,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,%#(#/(###((#(/(((((##(((#(##&%&%##,,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,(/######(//(((#((((((#(%&&%%%##,,,,,,,,,,,,,,,        Sorry but Caesar wouldn't have wanted to count higher than 3999, and wouldn't
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,((((**/***//((((((####%%%&&&&@&,,,,,,,,,,,,,,,        have wanted too to write numbers longer than 15 entries. Not great huh?
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,####%#################%%@@%%@,,,,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,(####################@@&@,,,,,,,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,/(#%%##%%%%##########%@%,,,,,,,,,,,,,,,,,,,,,
            ,,,,,,,,,,,,,,,,,,,,/,*/(((#,,,,,,######%#%%%%##########,,,,,,,,,,,,,,,,,,,,,,,,
            ,,,,,,,,,*//((((((##(####%%%%#%#((//((##################,,,,,,,,,,,,,,,,,,,,,,,,
            ,,,,,*(%&%(***,#*/*(*/(%/*/***,,,*//(((#####%######(###,,,,,,,,,,,,,,,,,,,,,,,,,
            ,,((#&****(%%/*/(&%%#//*/%#(*((#*,***,,/((#((##########,,,,,,,,,,,,,,,,,,,,,,,,,
            #@%&*%/(/((##(((**,*///(#/(@###/,****,***((/*(###((##((((,,,,,,,,,,,,,,,,,,,,,,,
            &*%&/(/**/(//#(//(*/(//*////#%%%%#####(,,*////*,**///(/((////(*,,,,,,,,,,,,,,,,,
            ,(/(/%%/(//*//##&&##%&##%**##((#%#%&%%%###(/**//((/****//*///%*(*//,,,,,,,,,,,,,
            ##(#%(((,////*/*//((#%&%#/,**(/(%(((((/(&&%%%##(***(#(//##((**//*/*//#,,,,,,,,,,

                """;

                Scanner tastiera = new Scanner(System.in);

String expression;
int numero;
int i = 0;
boolean valid = false;
int somma = 0;
String parola = "";
char choice;

System.out.print("Did you write an arabic number or a Roman number? 'a' for arabic number, 'r' for Roman number. ");
choice = tastiera.next().charAt(0);
switch (choice){
    case 'r':

do {
do {
    System.out.println(start);
System.out.print("Enter here a Roman number ");
expression = tastiera.next();


for (i=0;i<expression.length();i++){
    somma = 0;
    parola = "";

    if (expression.charAt(i) == 'a' || expression.charAt(i) == 'b' || expression.charAt(i) == 'c' || expression.charAt(i) == 'd' || expression.charAt(i) == 'e' || expression.charAt(i) == 'f' || expression.charAt(i) == 'g' || expression.charAt(i) == 'h' || expression.charAt(i) == 'i' || expression.charAt(i) == 'j' || expression.charAt(i) == 'k' || expression.charAt(i) == 'I' || expression.charAt(i) == 'l' || expression.charAt(i) == 'm' || expression.charAt(i) == 'n' || expression.charAt(i) == 'o' || expression.charAt(i) == 'p' || expression.charAt(i) == 'q' || expression.charAt(i) == 'r' || expression.charAt(i) == 's' || expression.charAt(i) == 't' || expression.charAt(i) == 'u' || expression.charAt(i) == 'v' || expression.charAt(i) == 'w' || expression.charAt(i) == 'x' || expression.charAt(i) == 'y' || expression.charAt(i) == 'z') {
        if (expression.charAt(i) == 'I' || expression.charAt(i) == 'V' || expression.charAt(i) == 'X' || expression.charAt(i) == 'L' || expression.charAt(i) == 'C' || expression.charAt(i) == 'D' || expression.charAt(i) == 'M' && expression.length() <= 15 && expression.length() >= 1) {
   
        }
       

        if (expression.charAt(i) != 'I' || expression.charAt(i) != 'V' || expression.charAt(i) != 'X' || expression.charAt(i) != 'L' || expression.charAt(i) != 'C' || expression.charAt(i) != 'D' || expression.charAt(i) != 'M' || expression.length() > 15 || expression.length() < 1) {
        valid = false;
        
        }
    }

    if (expression.charAt(i) == 'I' || expression.charAt(i) == 'V' || expression.charAt(i) == 'X' || expression.charAt(i) == 'L' || expression.charAt(i) == 'C' || expression.charAt(i) == 'D' || expression.charAt(i) == 'M' || expression.length() <= 15 || expression.length() >= 1) {
    valid = true; 
   
    }

    if (valid == false)
    System.out.println("Please repeat the process.");
}
    if (valid == false)
    System.out.println("Please repeat the process.");

} while (valid == false);

if (valid == true)
System.out.println("Valid expression! Please continue.");
for (i=0;i<expression.length();i++){
  if (expression.charAt(i) == 'I') {
if (i<expression.length() -1){
    if (expression.charAt(i+1) == 'V'){
        somma = somma -2;
    }

    if (expression.charAt(i+1) == 'X'){
        somma = somma - 2;
    }
}
    somma += 1;
  }

  if (expression.charAt(i) == 'V') {
    somma += 5;
  }

  if (expression.charAt(i) == 'X') {
if (i < expression.length() -1){
    if (expression.charAt(i+1) == 'L'){
        somma = somma - 20;
    }

    if (expression.charAt(i+1) == 'C'){
        somma = somma - 20;
    }
}
    somma += 10;
  }

  if (expression.charAt(i) == 'L') {
    somma += 50;
  }

  if (expression.charAt(i) == 'C') {


    if (expression.charAt(i+1) == 'D'){
        somma = somma - 200;
    }

    if (expression.charAt(i+1) == 'M'){
        somma = somma - 200;
    }
    somma += 100;
  }

  if (expression.charAt(i) == 'D') {
    somma += 500;
  }

  if (expression.charAt(i) == 'M') {
    somma += 1000;
  }

  if (somma > 3999){
    System.out.println("Way too high, not good.");
    System.exit(0);
  }
}

System.out.println("Here's the number you've written: " + somma);

System.out.println("Do you want to restart, or to just stop?");
parola = tastiera.next();

if (parola == "STOP") {
    System.out.println("Ave Caesar.");
    System.exit(0);
}

if (parola == "stop"){
    System.out.println("Ave Caesar.");
    System.exit(0);
}

if (parola == "Stop"){
    System.out.println("Ave Caesar.");
    System.exit(0);
}
} while (parola != "STOP" && parola != "stop" && parola != "Stop");

break;

case 'a':
somma = 0;
parola = "";
numero = 0;
String result = "";
int residuo;

valid = false;

    do{
     System.out.print("Write here your awesome arabic number if you please so. Facimus te Latinum! ");
     numero = tastiera.nextInt();

     if (numero < 0){
        System.out.println("That's way too small");
        valid = false;
     }

     if (numero > 3999){
        System.out.println("Way too high darling");
     }

     if (numero > 0 || numero <= 3999)
     valid = true;
    } while (valid == false);

    expression = "" + numero;

    if (expression.length() == 4){
        residuo = numero;
        if (expression.charAt(0) == '0' || expression.charAt(0) == ' ' ){
            System.out.println("No good.");
            System.exit(0);
        }

        if (expression.charAt(0) == '1'){
            result = result + 'M';
            residuo = numero - 1000;
        }

        if (expression.charAt(0) == '2'){
            result = result + "MM";
            residuo = numero - 2000;
        }

        if (expression.charAt(0) == '3'){
            result = result + "MMM";
            residuo = numero - 3000;
        }

        if (residuo >= 1900){
            result = "MCM";
        }

        if (residuo - 500 >= 0){
            result = result + "D";
            residuo = residuo - 500;
        } 

        if (residuo - 500 < 0){
            if (residuo - 100 >= 0){
                result = result + "C";
                residuo = residuo - 100;
            }

            if (residuo - 100 >= 0){
                result = result + "C";
                residuo = residuo - 100;
        }

        if (residuo - 100 >= 0){
            result = result + "C";
            residuo = residuo - 100;
    }
    if (residuo - 100 >= 0){
        result = result + "C";
        residuo = residuo - 100;
}

    if (residuo - 50 >= 0){

    }

}
System.out.println(" " + residuo + " " + result);

    System.out.println("Do you want to restart, or to just stop?");
    parola = tastiera.next();

    if (parola == "STOP") {
        System.out.println("Ave Caesar.");
        System.exit(0);
    }
    
    if (parola == "stop"){
        System.out.println("Ave Caesar.");
        System.exit(0);
    }
    
    if (parola == "Stop"){
        System.out.println("Ave Caesar.");
        System.exit(0);
    }
} while (parola != "STOP" && parola != "stop" && parola != "Stop");



    }

    }

}

