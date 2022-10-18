import java.util.Scanner;

public class diciassetteott {
    
        public static void main (String[] Args ){
            Scanner tastiera = new Scanner (System.in);
            char c = 'a';
            int x = c;
            System.out.println("Stampa il valore del char a in int: " + x);
/*
            //gives the value of the char a in Unicode...

            char x2 = (char)(c+2);
            System.out.println("Valore char in Unicode: " + x + " Carattere corrispondente a char + 2: " + x2);
            
            // prova divisione per zero con float
            float a = 0/0f;
            System.out.println(a);

            int b = 0;
            //stop this program aaaa
            System.out.println(b);

            // special characters
            char c4 = '\"'; // adds a "
            char c5= '\n'; // va a capo
            char c6 = '\t'; // inizio riga
            char c7 = '\\'; // backslash
            System.out.println(c4);
            System.out.println(c5 + c6);
            System.out.println(c6);
            System.out.println(c7);

            // differences between lowercase and uppercase
            System.out.println("Valore ASCII di a: " +(int)'a'); //ASCII è la codifica di char
            System.out.println("Valore ASCII di A: " + (int)'A');

            //nuova declarazione di variabili per quando non ho voglia di declarare un'intera variabile per una sola volta
            System.out.println("Prova di questa nuova declarazione di variabili: " + (String)"5");

            //esercizio: passare da un carattere minuscolo a maiuscolo
            // con string: usi toLowercase e toUpperCase
            String lower = "c";
            System.out.println(lower.toUpperCase());

            // char da lower a upper
            char lower2 = 'c';
            char upper = (char)(lower2 -32); // le parentesi permettono di fare il cast
            System.out.println("Da lower: " + lower2 + " a upper: " + upper);
            // per passare da minuscolo a maiuscolo: shifta il valore unicode del char di 32

            // esercizio: passare da un carattere maiuscolo a minuscolo
            char lower3 = (char) (upper + 32);
            System.out.println("Da upper: " + upper + " a lower3: " + lower3);
            System.out.println("Thing: " + (char)(upper+32)); // posso anche farlo senza dover dichiarare un'altra variabile :)
            // -32 : minuscolo -> maiuscolo
            // +32 : maiuscolo -> minuscolo

            // esercizio: convertire un carattere di una cifra nell'intero che rappresenta quella cifra: esempio: "3" carattere --> 3 (numero)
            // da carattere 
            char cifraCar = 'b';
            int cifraNum = cifraCar - '0';
            System.out.println("Carattere cifra " + cifraCar + " corrispondente alla cifra numerica " + cifraNum);
            tastiera.close();

            // doppio assegnamento
            int x1,y;
            x1 = y = 2; // assegnato sia a x1 che y
            System.out.println ("Assegnato a valore x1 " + x1 + " e valore y " + y);

            //lunghezza di una stringa
            String stringa1 = "stringa stringa stringa";
            System.out.println("La lunghezza della stringa " + stringa1 + " è " + stringa1.length());
            char primo = stringa1.charAt(0); // charAt da il carattere ad una determinata posizione del string 
            System.out.println(primo);
            System.out.println("La penultima lettera di string è: " + (char)(stringa1.charAt(stringa1.length()-2)));

            // sottostringhe
            System.out.println("Sottostringa iniziale: " + (String)(stringa1.substring(0,4)));

            // partire da 4 fino a fine
            System.out.println("Sottostringa da 4 a fine: " + stringa1.substring(4));

            // restituisce a che posizione è la frase che vuoi cercare
            // se non esiste una parola: out of range
            int mondo = stringa1.indexOf("str");
            System.out.println(mondo);

            // esercizio:
            String stringa = "Lorem ipsum dolor sit amet";
            int Index = stringa.indexOf(stringa1)+ stringa1.length();
            stringa1 = stringa1.substring(Index);
            System.out.println(stringa1);
 */
            //esercizio: a quale indice si trova "lenti" in Valentina?
            //indexOf: ti dice la posizione di quello che hai tentato di cercare
            String a = "Valentina", t = tastiera.next();
            int index = a.indexOf(t);
           System.out.println(a);

            for (int i = 0; i<index; i++){
                System.out.print(" ");
                        }

            for (int index2 = a.indexOf(t);
                        index2 <= 0;
                        index2 = a.indexOf(t, index2-5)) 
                        {
                            System.out.print("^");
                                                        
            }

            for (int i = 0; i>index; i++){
                System.out.println(" ");
            }


            for (int index2 = a.indexOf(t);
                        index2 >= 0;
                        index2 = a.indexOf(t, index2+1)) 
                        {
                            System.out.print("^");
                                                        
            }

            for (int i = 0; i>index; i++){
                System.out.println(" ");
            



            tastiera.close();
        }
    
}
}
