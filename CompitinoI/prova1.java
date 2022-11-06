package CompitinoI;
public class prova1{

    public static final char d='s';
    public static void main(String[]args) {
        // i have to leave this in any program
        // public or private state: as VB6

    final double piGreco=3.1415;
        // costante:
        /* se scrivo una costante sopra "public static void": scrivo "public static final" 
         * se voglio invece scrivere una costante dopo il "public static void": scrivo soltanto "final tyoe name=value;"
        */

    System.out.println("something");

    /* system.out.print = prints on the screen a line
    /* system.out.println = print a CR (carriage return) after the line is printed, aka
         * I write something
         * it goes down one line after it prints out that
         */

    int intero = 4;
    double virgola = 5.4;
    short s = 10;
    int n1;
    double n2;
    float f = 999999;
    
    
    

    /* double: numero con la virgola. int = intero. float = numero floating point */
    
    // make the scanner library actually read your text input //

    intero = s;
    virgola = intero;

    //conversione implicita

    f = (float)virgola;


    // cast esplicito
        /* i can't put smth like a value such as "double" or smth like that, but another value name */
        n1 = 25;
        n2 = 52.04;

        n1 = (char)intero;

        System.out.println("Here's a summary of what you've written");
        System.out.println(n1+n2 + " summa function");
        System.out.println(virgola + " this is double");
        System.out.println(f);
        System.out.println(piGreco);
        System.out.println(d);

        // prova del quiz
        int c = 30;
        int n = c++; //firstly, the value gets assigned - then augmented
        int a = ++c; /*firstly, it augments the value out of nowhere, and then assigns the value. */ 
        System.out.println(a);
        System.out.println(n);
        /*print function: System.out.print for the same line, System.out.println */
        
    }

}
