
import java.util.Scanner;

public class ventottonov {
    
    /* 
public static void implicazioni(boolean a, boolean b, boolean c){
    System.out.println("Il valore di A --> B è: " + !)
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/* 
        //calcolare l'n-esimo numero di fibonacci
        System.out.print("Write here how many Fibonacci numbers you want: "); 
        int fibo = sc.nextInt();
        int fibo2 = 0, fibo3 = 1, somma = 1;
        System.out.println(fibo2);
        System.out.println(fibo3);
        System.out.println(fibo2 + fibo3);
        //caso -1
        for (int i = 0;somma<fibo;i++){
        fibo3 = somma -2;

        somma = somma + fibo3;
        System.out.println(somma);
    
    }
    */
/* 
    boolean valA, valB, valC;
    System.out.print("Write the boolean value of the first: ");
    valA = sc.nextBoolean();

    System.out.print("Now the next: ");
    valB = sc.nextBoolean();

    System.out.print("And at the end, the third: ");
    valC = sc.nextBoolean();

    */
    /* 
    int n1, n2,n3,n4;
    public static int lettura(int n1, int n2, int n3, int n4){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    n1 = sc.nextInt();
    System.out.print("Enter the second number: ");
    n2 = sc.nextInt();
    System.out.print("Enter the third number: ");
    n3 = sc.nextInt();
    System.out.print("Enter the fourth number: ");
    n4 = sc.nextInt();

return n1;

    }

    public static int prodotto (int risultato, int n1, int n2, int n3, int n4){
        Scanner sc = new Scanner(System.in);
        risultato = 1;
        
        for(int i = n1; i <= n3; i++){
           for (int j = n2; j <= n4; j++){
                risultato = risultato *(i+j);
            }
        }

    
        
        sc.close();
        return risultato;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int n1,n2,n3,n4, risultato;
        n1 = lettura();
        n2 = lettura();
        n3 = lettura();
        n4 = lettura();
        risultato = prodotto();
        System.out.println("Il risultato è: " + risultato);
    sc.close();

    */


    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi quanti asterischi vuoi: ");
        int n1 = sc.nextInt();
        stampa(n1);
        sc.close();
    }

    public static void stampa(int n1){
        for (int i = 0;i<n1;i++){
            if (i % 2 == 0){
                for (int j = 0; j<=n1/2;j++)
                System.out.print("* ");

                System.out.println("");
            } else {
                for (int x = 0; x<=n1/2-1; x++)
                System.out.print(" *");
                System.out.println("");
            }
        }
    }
}




