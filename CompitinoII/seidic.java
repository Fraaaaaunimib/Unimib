

import java.util.Scanner;
public class seidic {

    public static void aggiorna(double t[]){

    for (int indice = 0; indice<t.length;indice++)
    t[indice]+= 0.2;
    }

    public static int[][] prodotto(int[][]a, int [][]b){
        int i;
        int m = a.length;
        int n = b.length;
        int l = b[0].length;
        int [][] risultato = new int [n][l];

    if (a[0].length!=b[0].length) { //numero di colonne di a
        System.out.println("Non si può fare.");
        } 

    for (i = 0; i<n;i++)
    for (int j = 0;j<1; j++)
    for (int x = 0; x < m; x++)
    risultato [i][j] = a [1][x]*b[x][j];
    return risultato;
    }
    
    public static void main(String[]args){
        Scanner tastiera = new Scanner(System.in);
        double temp[];
        temp = new double[7];
        int i = 0;
        int j = 0;

        aggiorna(temp);
        for (i = 0; i<temp.length;i++){
            temp[i]= i;
        }

        for (i=0;i<temp.length;i++)
        System.out.print(temp[i] + ", ");
        System.out.println();
        System.out.println(temp);

        double temp_anno [] = new double[365];
        double temp_annuali[][] = new double [12][31];

        for (i = 0;i<12;i++)
        for (j = 0;j<31;j++)
            temp_annuali[i][j] = i + j;

            for(j = 0;j <31;j++)
            System.out.print(temp_annuali[3][j] + ", ");
            System.out.println();

            for (i = 0; i<12; i++)
            System.out.print(temp_annuali[i][1] + ", ");
            System.out.println();


            //matrici
            double temperatura[][] = new double[4][];
            temperatura [0] = new double[31];
            temperatura [1] = new double[30];
            temperatura [2] = new double[31];
            temperatura [3] = new double[30];

            for (i=0;i<temperatura.length;i++)
            for (j=0;j<temperatura[i].length;j++)
            temperatura[i][j] = i+j;

            for (j=0;j<temperatura[1].length;j++)
            System.out.println(temperatura[1][j] + ", ");

            //array di char
            char []s = new char[4];
            s[0]='c';
            s[1]='i';

            String s2 = "ciao";
            for (i = 0; i < s2.length();i++)
            s[i] = s2.charAt(i);

            for(i =0;i<s.length;i++)
            System.out.print(s[i]);
            System.out.println();

            
        tastiera.close();
    }
}
