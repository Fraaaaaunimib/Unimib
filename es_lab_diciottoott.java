import java.util.Scanner;
import java.lang.Math;
public class es_lab_diciottoott {
    public static void main(String[]args) {

        Scanner Input = new Scanner(System.in); //creates a new scanner object
    /*
     * definisca due variabili intere x e y;
•   assegni alle variabili i valori 3 e 5;
•   stampi a video i valori di x e y
     */

                     // box drawing characters
                /*
     ─	━	│	┃	┄	┅	┆	┇	┈	┉	┊	┋	┌	┍	┎	┏
    ┐	┑	┒	┓	└	┕	┖	┗	┘	┙	┚	┛	├	┝	┞	┟
	┠	┡	┢	┣	┤	┥	┦	┧	┨	┩	┪	┫	┬	┭	┮	┯
	┰	┱	┲	┳	┴	┵	┶	┷	┸	┹	┺	┻	┼	┽	┾	┿
	╀	╁	╂	╃	╄	╅	╆	╇	╈	╉	╊	╋	╌	╍	╎	╏
	═	║	╒	╓	╔	╕	╖	╗	╘	╙	╚	╛	╜	╝	╞	╟
	╠	╡	╢	╣	╤	╥	╦	╧	╨	╩	╪	╫	╬	╭	╮	╯
	╰	╱	╲	╳	╴	╵	╶	╷	╸	╹	╺	╻	╼	╽	╾	╿
                 */
/*
     int x= 'a', y= 'b';

     String start = """
        ╔═══════════════════════════════════════╗
        ║  I valori delle variabili x e y sono: ║
        ╚═══════════════════════════════════════╝
             """;

             System.out.println(start + x + " " + y);
             System.out.println(" ");

       ////////////////////////////////////////////////////////////////
            /*
             * • definisca due variabili double x e y;
•                assegni alle variabili i valori 125.0 e 85.3;
•               stampi a video i valori di x e y, il loro prodotto e la loro divisione.
             */
            /* 
            double x1 = 125, y1 = 85;
            String start1 = """
                ╔═══════════════════════════════════════╗
                ║  Le variabili double sono:            ║
                ╚═══════════════════════════════════════╝
                    """;

                    System.out.println(start1 + "┣ la variabile x ┣━━> " + x1 + " e la variabile y ┣━━> " + y1 + " ╏");
                    System.out.println("┣ Il prodotto tra x e y ┣━━> " + x1*y1 + " e la loro divisione ┣━━> " + x1/y1 + " ╏");
                    System.out.println(" ");

////////////////////////////////////////////////////////////////
/*definisca due variabili intere x e y;
• definisca due variabili double a e b;
• assegni alle variabili i valori 7 e 2;
• assegni alle variabili i valori 7.0 e 2.0;
• stampi a video il quoziente e il resto della divisione di x e y;
• stampi a video il risultato della divisione di a e b.
/* */
/*
        int x2 = 7, y2 = 2;
        double a = 7.0, b = 2.0;
        String start2 = """
                ╔═══════════════════════════════════════╗
                ║  Divisioni                            ║
                ╚═══════════════════════════════════════╝
                    """;

                    System.out.println(start2 + "┣ il quoziente della divisione tra x e y ┣━━>  " + x2/y2 + "┣ e il resto ┣━━> " + x2%y2);
                    System.out.println("┣ il risultato della divisione tra a e b ┣━━>  " + a/b);
                    System.out.println(" ");

////////////////////////////////////////////////////////////////
/* definisca due variabili carattere x e y;
• assegni alla variabile x il valore ’a’, alla variabile y il valore ’b’;
• stampi a video la stringa ab. */
/* /
        char x3 = 'a', y3 = 'b';
        
            System.out.println("┣ stampiamo sia la a che la b assieme senza il + se no lo somma ┣━━>  " + x3+y3);

 ////////////////////////////////////////////////////////////////
/* inizializzi due variabili intere x e y;
• assegni alle variabili due valori a scelta;
• calcoli l’area del rettangolo di lati x e y;
• stampi a video le misure dei lati e l’area del rettangolo, in modo che l’output abbia la
forma seguente:
> Lato1 = (valore di x)
> Lato2 = (valore di y)
> Area = (area calcolata) */
/* String area = """
    ╔═══════════════════════════════════════╗
    ║  Area del rettangolo                  ║
    ╚═══════════════════════════════════════╝
        """;
        System.out.print(area + "┣ inserisci qua la base ┣━━>  ");
        int base = Input.nextInt();

        System.out.print("┣ inserisci qua l'altezza ┣━━>  ");
        int altezza = Input.nextInt();

       

                System.out.println("┣ il valore della base: ┣━━>  " + base + " ┣ il valore dell'altezza: ┣━━>  " + altezza + " ┣ e l'area ┣━━>  " + base*altezza);
                
                 ////////////////////////////////////////////////////////////////
                 // espressioni...
                 String express = """
                    ╔═══════════════════════════════════════╗
                    ║  Espressioni yeeeee                   ║
                    ╚═══════════════════════════════════════╝
                        """;
                 System.out.print(express +"┣ il valore della x: ┣━━>  ");
                 Double double1 = Input.nextDouble();
                 System.out.print("┣ il valore della y: ┣━━>  ");
                 Double double2 = Input.nextDouble();

                 System.out.println("┣ wow 1 ┣━━>  " + (13+9+6-7)*2);
                 System.out.println("┣ wow 2 ┣━━>  " + ((2+3)*5+(2/3+5)*4)+(3*(7+5-13)));
                 System.out.println("┣ wow 3 ┣━━>  " + ((3.4+5-6.3)*4.3+(3.5*(-4))*6));
                 System.out.println("┣ wow 4 ┣━━>  " + ((double1 + double2)*(double1 - double2)));
                 System.out.println("┣ wow 5 ┣━━>  " + Math.pow(double1, double2));
                 System.out.println("┣ wow 6 ┣━━>  " + ((double1 + double2)*(double1 - double2)/Math.pow(2*double1 + double2, 2)));

                 Input.close();

*/
                ////////////////////////////////////////////////////////////////
                 // carta oro aaaaaaa

                 System.out.println("Successione");
                System.out.print("Inserisci quante volte vuoi che ci sia la successione: ");
                 int n = Input.nextInt();

                int a = 2;
  
                int i = 0;
   

            // NO CON IF
            while(i < n){
                i++;
                a = 3*a-2;
                System.out.println(a);

                /*
                 * come funzionano le successioni
                 * metti il valore di inizio in a0, poi prendi il risultato e lo metti nel posto di a0 sotto
                 */

                 ////////////////////////////////////////////////////////////////
                    

            } 
                }


            }

