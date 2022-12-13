package CompitinoII;

import java.util.Scanner;
public class es_lab_tredicidic {

    public static int[] creaArray(){
int [] array = new int[100];
        return array;
    }

    public static void aggiungiElemento(int[] array, int numeroElementi, int elemento){

        if (array[numeroElementi] != 0) {
System.out.println("There's already an element at this position, which is: "+ array[numeroElementi]);
        } else {
            array[numeroElementi] = elemento;
        }
    }

    public static void rimuoviElemento (int []array, int numeroElementi, int elemento){

        if (array[numeroElementi] != 0){
            array[numeroElementi] = 0;
        } else {
            System.out.println("There's nothing in this position, so you can't remove anything.");
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        creaArray();
        System.out.print("In which position do you want to add an item?");
        int numeroElementi = sc.nextInt();

        System.out.print("And what do you want to add in this position? ");
        aggiungiElemento(array, numeroElementi, elemento);
    
        sc.close();
    }

}