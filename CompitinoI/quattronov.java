package CompitinoI;
import java.util.Scanner;
public class quattronov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int x = -1;
        int y = -3;

        do {
            do {
                y = y+1;
            }while(y>x);
            x = x+y;
        } while (x<=3);

        System.out.println(x);

        
        // passaggio da while a do-while
        int conteggio, numero;
        System.out.print("You shall insert inside a number: ");
        numero = sc.nextInt();

        conteggio = 1;

        while (conteggio <= numero){
            System.out.println(conteggio + " ");
            conteggio++;
        }

        /*
         * while -> do-while
         * if (boolean){
         * do {
         *  instruction;
         * while(boolean);
         * trasformato in do-while instruction
         

         System.out.println();


         conteggio = 1;
         if(conteggio<=numero) {
            do{
                System.out.println(conteggio + " ");
                conteggio++;
            } while(conteggio <= numero);
         }
        System.out.println();
*/
        // calcolo del fattoriale
        System.out.println("Calcolo del fattoriale");
        System.out.print("Inserisci un numero: ");
        int n = sc.nextInt();
        long fatt = 1;
        int contatore = 1;
        while (contatore <= n){
            fatt = fatt*contatore;
            contatore++;
        }

        System.out.println("Il fattoriale di " + n + " è: "+ fatt);

        fatt = 1;
        for (contatore=1;contatore<=n;contatore++) {
            fatt = fatt*contatore;
        }

        System.out.println("Con il for invece esce questo: " + fatt);
        
        sc.close();
        }

    
        }

    

    

        


