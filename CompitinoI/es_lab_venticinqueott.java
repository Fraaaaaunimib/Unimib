package CompitinoI;
import java.util.Scanner;

public class es_lab_venticinqueott {

    public static void main (String[]Args) {

        Scanner input = new Scanner(System.in);
 /* 
        // primo esercizio: valore assoluto di un numero
        System.out.print("Digit a number: ");
        double numero1 = input.nextDouble();

    if (numero1 < 0) {
        double numero2 = numero1 - numero1 - numero1;
        System.out.println("Valore assoluto, baby! " + numero2);
        } else {
            System.out.println(numero1);
        }
        
    // esercizio due: leeggi due numeri interi, calcola la divisione tra interi
    System.out.println("");
    System.out.print("Enter now a brand new number: ");
    int numero1es2num = input.nextInt();

    System.out.print("Enter now the second term of your division: ");
    int numero1es2den = input.nextInt();

    if (numero1es2den == 0){
        System.out.println("Oops, sorry, you can't make a division by zero");
        System.exit(0);
    } else {
        System.out.println(numero1es2num / numero1es2den);

        
    }
*/
    // esercizio tre: leggere da tastiera messaggio, posizione, e stringa, e cambia la frase

    
    
    /* 
    String messaggio = "";
    int posizione = 0;
    String stringa = "";

    System.out.println("Entra frase: ");
    messaggio=input.next();

    System.out.println("Posizione: ");
    posizione = input.nextInt();
    if (posizione > 0 & posizione < messaggio.length()-1) {
        if (messaggio == "") {
            System.out.println("Well that's the end of the road");
        } else {
        System.out.println("c");
        input.nextLine();
        stringa = input.nextLine();
    
        String nuovastringauno = messaggio.substring(0,posizione);
        String nuovastringadue = messaggio.substring(posizione, messaggio.length());
    
        System.out.println(nuovastringauno + stringa + nuovastringadue);
    }
        } else {
            System.out.println("Oops, this is not a valid string ;-;");
            System.exit(0);
        }
    

        */
    // esercizio 4
    /*
    String caratteri;
    int char1, char2, char3, char4;
    System.out.print("Enter a string of four characters --> ");
    caratteri = input.nextLine();
    char1 =  caratteri.charAt(0);
    char2 = caratteri.charAt(1);
    char3 = caratteri.charAt(2);
    char4 = caratteri.charAt(3);
   

    if (caratteri.length() == 4){
    
        if (char1 < 48 | char1 > 58 | char2 < 48 | char2 > 58 | char3 < 48 | char3 > 58 | char4 < 48 | char4 > 58) {
            System.out.println("ERROR");
        } else {
            System.out.println("This is a valid string");
        }
    } else {
        System.out.println("The string isn't made out of four characters.");
        System.exit(0);
    }
*/ /* 
    // esercizio 5
        int numero; 

        System.out.println("This has been a one heck of an exercise.");
        System.out.print("Enter now a number between 0 and 127 -->");
        numero = input.nextByte();
        
        int quoziente = (int)numero;
        int resto;
       String risultato = "";
  quoziente = numero/2;
  
                    resto = quoziente%2;
        if (numero < 0 | numero > 127) {
            System.out.println("This does not work");
            } else {
                quoziente = numero / 2;
                resto = quoziente%2;
                
                // carattere 1
                String risultatoparte1 = "0";
                String risultatoparte2 = "0";
                String risultatoparte3 = "0";
                String risultatoparte4 = "0";
                String risultatoparte5 = "0";
                String risultatoparte6 = "0";
                String risultatoparte7 = "0";

                if (resto == 0) {
                    quoziente = numero/2;
                    resto = numero%2;
                    risultatoparte1 = "0";
                } else if (resto == 1) {
                    quoziente = numero/2;
                    resto = numero%2;
                    risultatoparte1 = "1";
                }

                
                if (resto == 0) {
                    quoziente = quoziente/2;
                resto = quoziente%2;
                    risultatoparte2 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                resto = quoziente%2;
                    risultatoparte2 = "1";
                }

                if (resto == 0) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte3 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte3 = "1";
                }

                if (resto == 0) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte4 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte4 = "1";
                }

                if (resto == 0) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte5 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte5 = "1";
                }

                if (resto == 0) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte6 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte6 = "1";
                }

                if (resto == 0) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte7 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte7 = "1";
                }


                String risultato1 = risultato.concat(risultatoparte7);
                String risultato2 = risultato1.concat(risultatoparte6);
                String risultato3 = risultato2.concat(risultatoparte5);
                String risultato4 = risultato3.concat(risultatoparte4);
                String risultato5 = risultato4.concat(risultatoparte3);
                String risultato6 = risultato5.concat(risultatoparte1);
                String risultato7 = risultato6.concat(risultatoparte2); // non capisco perché invertire l'uno con il due

                System.out.println(risultato7);
                input.close();

                }
    }
            
                /* while (quoziente != 0) {
                   

                    risultato = resto + risultato + resto;
                    /*  
                    if (resto == 1) {
                        System.out.print(resto);
    
                    } else if (resto == 0) {
                        System.out.print(resto);
        
                    }
                    
        }
      
      
        // esercizio 6

    
    

   
    // chiusura input

    
*/


// esercizio 2
String stringa = "";
String stringa2 = "";

stringa = input.next();
char char1 = stringa.charAt(0);
char char2 = stringa.charAt(1);
char char3 = stringa.charAt(2);
char char4 = stringa.charAt(3);
char char5 = stringa.charAt(4);


int a1 = 0;
int a2 = 0;
int a3 = 0;
int a4 = 0;
int a5 = 0;
int a = 0;
int b = 4;
int b1 = 0;
int b2 = 0;
int b3 = 0;
int b4 = 0;
int b5 = 0;

if (stringa.length() <= 5 & stringa.length() > 0 & char1 == 43 | char1 == 45 | char2 == 43 | char2 == 45 | char3 ==43 | char3 == 45 | char4 == 43 | char4 == 45 | char5 == 43 | char5 == 45){
                

                    if (char1 == 43) {
                        a1 = 1;
                    } else if (char1 == 45) {
                        a1 = -1;
                    }

                    if (char2 == 43) {
                        a2 = 1;
                    } else if (char2 == 45) {
                        a2 = -1;
                    }

                    if (char3 == 43) {
                        a3 = 1;
                    } else if (char3 == 45) {
                        a3 = -1;
                    } 

                    if (char4 == 43) {
                        a4 = 1;
                    } else if (char4 == 45) {
                        a4 = -1;
                    }

                    if (char5 == 43) {
                        a5 = 1;
                    } else if (char4 == 45) {
                        a5 = -1;
                    }

                    a = a1+a2+a3+a4+a5;

                    System.out.println("The first variable has this value: " + a);

                    
                } else {
                    System.out.println("Well, that's an error.");
                    System.exit(0);
                }

                stringa2 = input.next();


char char11 = stringa2.charAt(0);
char char12 = stringa2.charAt(1);
char char13 = stringa2.charAt(2);
char char14 = stringa2.charAt(3);
char char15 = stringa2.charAt(4);
                if ( stringa2.length() <= 4 & stringa2.length() > 0 | char11 == 43 | char11 == 45 | char12 == 43 | char12 == 45 | char13 ==43 | char13 == 45 | char14 == 43 | char14 == 45 | char15 == 43 | char15 == 45){
                // seconda stringa
                if (char11 == 43) {
                     b1 = 1;
                } else if (char11 == 45) {
                   b1 = -1;
                }

                if (char12 == 43) {
                    b2 = 1;
                } else if (char12 == 45) {
                     b2 = -1;
                }

                if (char13 == 43) {
                       b3 = 1;
                } else if (char13 == 45) {
                       b3 = -1;
                } 

                if (char14 == 43) {
                       b4 = 1;
                } else if (char14 == 45) {
                        b4 = -1;
                }

                if (char15 == 43) {
                      b5 = 1;
                } else if (char14 == 45) {
                    b5 = -1;
                }

                b = b+b1+b2+b3+b4+b5;

                System.out.println("The second variable has this value: " + b);

                } else {
                    System.out.println("This is an error.");
                    System.exit(0);
                }

                while (a != b) {

                    if (a == b)
                   System.out.println("Yay you've reached the end of the program, hurrah!");

                    if (char1 == 43) {
                        a1 = 1;
                    } else if (char1 == 45) {
                        a1 = -1;
                    }

                    if (char2 == 43) {
                        a2 = 1;
                    } else if (char2 == 45) {
                        a2 = -1;
                    }

                    if (char3 == 43) {
                        a3 = 1;
                    } else if (char3 == 45) {
                        a3 = -1;
                    } 

                    if (char4 == 43) {
                        a4 = 1;
                    } else if (char4 == 45) {
                        a4 = -1;
                    }

                    if (char5 == 43) {
                        a5 = 1;
                    } else if (char4 == 45) {
                        a5 = -1;
                    }

                    a = a1+a2+a3+a4+a5;

                    System.out.println("The first variable has this value: " + a);

                    if (char11 == 43) {
                        b1 = 1;
                   } else if (char11 == 45) {
                      b1 = -1;
                   }
   
                   if (char12 == 43) {
                       b2 = 1;
                   } else if (char12 == 45) {
                        b2 = -1;
                   }
   
                   if (char13 == 43) {
                          b3 = 1;
                   } else if (char13 == 45) {
                          b3 = -1;
                   } 
   
                   if (char14 == 43) {
                          b4 = 1;
                   } else if (char14 == 45) {
                           b4 = -1;
                   }
   
                   if (char15 == 43) {
                         b5 = 1;
                   } else if (char14 == 45) {
                       b5 = -1;
                   }
   
                   b = b+b1+b2+b3+b4+b5;
   
                   System.out.println("The second variable has this value: " + b);
   
                   } 

                if (a == b)
                System.out.println("Yay you've reached the end of the program, hurrah!");

                input.close();

                }
    
            }
