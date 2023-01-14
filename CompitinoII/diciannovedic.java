
import java.util.Scanner;
public class diciannovedic{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] matrice;

        /* 
        int [][]e = new int [2][];
        e[0] = new int [3];
        e[0][1] = 1;

        try {
        System.out.println(e[1][1]);
        } catch (NullPointerException v){
            System.out.println("e");
        }
*/

        boolean [][] a= new boolean[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++){
           double b = Math.random();
           if (b < 0.5){
            a[i][j] = false;
           } else {
            a[i][j] = true;
            
           }
        }
        }

        stampaMatrix(a);
        System.out.println();


        /*
         * Riflessività: x in relazione con x
         * 
         */

        boolean reflect = reflex(a);
        if (reflect == true)
        System.out.print("La matrice è riflessiva? " + "🫠 SI! ");
        else
        System.out.print("La matrice è riflessiva? " + "😪 No..... ");
        
        /*
         * Simmetrica: se x relazione con y allora y relazione con x
         * r[i][j] = r[j][i]
         */
        boolean simmetrica = symmetry(a);
        if (simmetrica == true)
        System.out.print("La matrice è simmetrica? " + "🫠 SI! ");
        else
        System.out.print("La matrice è simmetrica? " + "😪 No..... ");
         

        boolean transitiva = transitivity(a);
if (transitiva == true)
        System.out.print("La matrice è transitiva? " + "🫠 SI! ");
        else
        System.out.print("La matrice è transitiva? " + "😪 No..... ");

        /*
         * Transitiva: se (x relazione y) e (y relazione z) allora (x relazione z)
         * r[x][y] = false or r[y][z] = false or r[x][z]= true
         */
    }

    public static boolean transitivity(boolean [][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                for (int z = 0; z < a.length; z++){
                if (!(a[i][j] == false || a[j][z] == false || a[i][z] == false)){
                    return false;
                }
            }
            }
        }
        return true;
    }

    public static boolean symmetry(boolean [][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j]!= a[j][i]){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean reflex(boolean[][] a){
        for (int i = 0; i < a.length; i++){
            if (a[i][i] != true){
                return false;
            }
        }

        return true;
    }
    public static void stampaMatrix(boolean [][]a){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}