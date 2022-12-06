package CompitinoII;

import java.util.Scanner;
public class es_cinquedic {
    
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        /*
        int s = potenze(8,2,true);
        System.out.println(s);

        s = potenze(8,2,false);
        System.out.println(s);
        */
        

        int [] a;
        int b [];
        
        a = new int[10];
        a[0]=9;
        a[1]=1;

        int c [] = {1,2,3,4,5,6,7,8,9,10}; //definizione tutta sulla stessa riga
        System.out.println("Lunghezza dell'array: " + c.length); //non modificabile
        for (int indice = 0; indice < a.length;indice++){
            System.out.print("Assegna una variabile all'array, all'indirizzo "+ indice + " :");
            a[indice] = sc.nextInt();
        }

        //stampare a video il contenuto dell'array
        System.out.print("Ecco i valori dell'array: ");
        int indice = 0;
        for (indice = 0;indice<a.length-1;indice++){
            System.out.print(a[indice]+", ");
        }
        System.out.println(a[indice]);
        System.out.println();

    }
}
