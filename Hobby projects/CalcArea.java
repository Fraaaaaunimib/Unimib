
import java.util.Scanner;


public class CalcArea {
        public static void main (String[] args)    {

        // initialize a Scanner object
        Scanner tastiera = new Scanner(System.in);
        
// declare variables
 double base;
 double altezza;
 char forma;
 double result;
        
        // print functions
        System.out.println("Questo programma ti calcola aree di varie forme in maniera semplice");
        System.out.println("Quale forma? (1 per rettangolo, 2 per triangolo, 3 per trapezio)");
        forma = tastiera.next().charAt(0);


        /* per queste funzioni, chiediamo prima i valori della base o dell'altezza, in base alla forma, e più avanti si
         * chiede poi i valori della base e dell'altezza, o della base maggiore/minore/altezza in base alla forma che si ha.
         */
        switch (forma) {

            //rettangolo
            case '1':

            System.out.print("Base:");
            base = tastiera.nextDouble();

            System.out.print("Altezza:");
            altezza = tastiera.nextDouble();

            result = base * altezza;
            System.out.println("Risultato dell'area del rettangolo: " + result);
            break;

            //triangolo
            case'2':

            System.out.print("Base:");
            base = tastiera.nextDouble();

            System.out.print("Altezza:");
            altezza = tastiera.nextDouble();

            result = (base * altezza)/2;
            System.out.println("Risultato dell'area del triangolo: " + result);
            break;

            //trapezio
            case '3':
            double altezza_2;

            System.out.print("Base maggiore:");
            base = tastiera.nextDouble();

            System.out.print("Base minore:");
            altezza = tastiera.nextDouble();

            System.out.print("Altezza:");
            altezza_2= tastiera.nextDouble();

                result = ((base + altezza) * altezza_2) / 2;
                System.out.println ("Risultato aera del trapezio: " + result);
                break;

        }


        tastiera.close(); //closes the input after reading it
    }

}
