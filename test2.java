import java.util.Scanner;   
public class test2 {

    public static void main (String args[]) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Quante righe deve essere la matrice? ");
        a = sc.nextInt();
    
        System.out.print("Quante colonne deve avere la matrice? ");
        b = sc.nextInt();
    
    
        int matrice [][] = new int [a][b];
        int trasposta [][] = new int [b][a];
        // matrice --> nome[righe][colonne]
    
    
        System.out.println("Qua la matrice che è stata scelta: ");
        for (int i = 0; i < a; i++) { //per le righe
            for (int j = 0; j < b; j++) { //per le colonne
                matrice[i][j] = (int)(Math.random()*99); //numeri random
                System.out.print(" " + matrice[i][j] + " ");
            }
                System.out.println("");
        }
    
        System.out.println("");
        System.out.println("Qua è la matrice trasposta: ");
    
        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++) {
                trasposta[i][j] = matrice[j][i];
                System.out.print(" " + trasposta[i][j] + " ");
        }
        System.out.println("");
    
    }
    
    System.out.println("");
    System.out.println("Adesso con i metodi:");
    
    generaMatriceCasuale(a,b,matrice);
    
    System.out.println("Adesso trasposta con i metodi:");
    trasponiMatrice(a,b,matrice,trasposta);
    sc.close();
    }
    


public static int[][] generaMatriceCasuale(int a, int b, int [][]matrice){
    // a = righe; b = colonne

    for (int i = 0; i < a; i++) { //per le righe
        for (int j = 0; j < b; j++) { //per le colonne
            matrice[i][j] = (int)(Math.random()*99); //numeri random
            System.out.print(" " + matrice[i][j] + " ");
        }
            System.out.println("");
    }
    return matrice;
}

public static int[][] trasponiMatrice(int a, int b, int[][] matrice, int [][] trasposta){
    // a = righe; b = colonne
    for (int i = 0; i < b; i++){
        for (int j = 0; j < a; j++) {
            trasposta[i][j] = matrice[j][i];
            System.out.print(" " + trasposta[i][j] + " ");
    }
    System.out.println("");

}
    return trasposta;
}

}