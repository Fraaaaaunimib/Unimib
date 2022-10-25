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

    // esercizio tre: leggere da tastiera messaggio, posizione, e stringa, e cambia la frase

    input.close();
    */
/* 
    String messaggio;
    int posizione;
    String stringa;

    System.out.println("Entra frase: ");
    messaggio=input.nextLine();

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
            System.out.println("Oopsies, this is not a valid string ;-;");
            System.exit(0);
        }
    

    */
    // esercizio 4
    /* 
    String caratteri;
    int char1, char2, char3, char4;
    caratteri = input.nextLine();
    char1 =  caratteri.charAt(0);
    char2 = caratteri.charAt(1);
    char3 = caratteri.charAt(2);
    char4 = caratteri.charAt(3);
   

    if (caratteri.length() == 4){
    
        if (char1 < 48 | char1 > 58 | char2 < 48 | char2 > 58 | char3 < 48 | char3 > 58 | char4 < 48 | char4 > 58) {
            System.out.println("ERROR");
        } else {
            System.out.println("Yeeeee");
        }
    } else {
        System.out.println("Boy, that's an error right here. The string isn't made out of four characters.");
        System.exit(0);
    }
*/
    // esercizio 5
        int numero; 
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
                String risultato6 = risultato5.concat(risultatoparte2);
                String risultato7 = risultato6.concat(risultatoparte1);

                System.out.println(risultato7);

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
                    */
        }
      
      

   
    
    

   
    // chiusura input

    



