public class dieciott{

    public static void main(String[]args) {
        final double piGreco=3.1415;
        char a = 'b';
        double b = 12.6;
        int intero = 2;
        short c = 32766;
        // characters are written like this

        a = (char)b;
        c = (short)b;
        /*explicit cast: transform the char "a" into an integer, in this  
        
        */

        char e = '5';
        int x = (int)e;
        // quiz: risposta 4: cast esplicitio

        short gambe = 4;
        float dita = 10.0F;
        gambe =(short)dita;
        /*short gambe = 4;
        float dita = 10.0; --> 10.0 è di tipo "double", bisogna metterci alla fine la "f" se si vuole usare float
        gambe =(short)dita;
         */

    System.out.println(a + c);
    System.out.println(e);
    System.out.println(x);
    System.out.println(b + intero);
    System.out.println(piGreco); 
    System.out.println(dita);
    System.out.println(gambe);
}

}
