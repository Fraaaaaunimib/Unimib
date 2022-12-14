package CompitinoII;

import java.util.Scanner;
public class es_lab_tredicidic {

    /* 
    public static int[] creaArray(){
int [] array = new int[100];
        return array;
    }

    public static void aggiungiElemento(int[] array, int numeroElementi, int elemento){

        if (array[numeroElementi] != 0) {
System.out.println("There's already an element at this position, which is: "+ array[numeroElementi]);
        } else {
            array[numeroElementi] = elemento;
            System.out.println("The " + array[numeroElementi] + " object is in the array at the position " + numeroElementi);
        }
    }

    public static void rimuoviElemento (int []array, int numeroElementi, int elemento){

        if (array[numeroElementi] != 0){
            array[numeroElementi] = 0;
            System.out.println("An element has been removed in the place " + numeroElementi);
        } else {
            System.out.println("There's nothing in this position, so you can't remove anything.");
        }
    }

    
    public static void main(String[] args) {
        boolean menu = true;

        int [] array = creaArray();
        Scanner sc = new Scanner(System.in);

   while (menu == true){
        System.out.print("In which position do you want to add an item? ");
        int numeroElementi = sc.nextInt();

        System.out.print("And what do you want to add in this position? ");
        int elemento = sc.nextInt();
        aggiungiElemento(array, numeroElementi, elemento);
    
  

        System.out.print("In which position do you want to remove an item? ");
        numeroElementi = sc.nextInt();

        System.out.print("And what do you want to remove from this position? ");
        elemento = sc.nextInt();
        rimuoviElemento(array, numeroElementi, elemento);

        System.out.print("Do you want to continue adding/removing stuff, or do you want to stop doing this? [S] if you want to continue, [N] if you want to exit.");
        String scelta = sc.next();

        if (scelta.equals("S")){
            menu = true;
        }

        if (scelta.equals("N")){
            menu = false;
        }

   }
        sc.close();
    }

    

    public static void main (String[]args ){
        int [][] array_Matrix = creaMondo();
        int posizioneRobotSud = 0, posizioneRobotEst = 0;
        Scanner sc = new Scanner(System.in);
        boolean foundObjective = false;
        System.out.print("At which position is the objectve? ");
        System.out.print("Row: ");
        int row = sc.nextInt();

        if (row == 1)
        row = 0;

        System.out.print("Column: ");
        int column = sc.nextInt();
        if (column == 1)
        column = 0;
        else
        column = column - 1;

        System.out.print("And what track do you want to do? ");
        String track = sc.next();
        char arraychar[]= track.toCharArray();


        int counts = 0, counto = 0, counte = 0, countn = 0;

        boolean placed = aggiungiObiettivo(array_Matrix, row, column);

        aggiungiOstacolo(array_Matrix);
       aggiungiPercorsoRobot(arraychar, array_Matrix);


        System.out.println("");

        stampaMondo(array_Matrix, posizioneRobotSud, posizioneRobotEst);
  
        }

        public static int[][]creaMondo(){
            int [][] array = new int[20][20];
            return array;
        }

        public static boolean aggiungiObiettivo(int [][] array, int  row, int column){
            boolean canIPlace = false;

            if (array[row][column] == 0){
                canIPlace = true;
                System.out.println("Great, your objective can be put in this position!");
                array[row][column] = 1;
            } else {
                canIPlace = false;
                System.out.println("Sorry, your objetive cannot be put in this position!");
            }
            return canIPlace;
        }

        public static void aggiungiOstacolo(int [][] array){
            int x = 0, y = 0;

            for (int i = 0; i < 10; i++){
                x = (int)(Math.random()*20);
                y = (int)(Math.random()*20);

                if (array[x][y] == 0){
                    array[x][y] = 2;
                } else {
                    array[x][y]= 0;
                    i--;
                }
            }
            }

            public static void stampaMondo (int [][] array_Matrix, int posizioneRobotSud, int posizioneRobotEst){
                System.out.println("**********************");

                for (int i = 0; i < 20; i++){
                    System.out.print("*");

                    for (int j = 0; j < 20; j++){
                        
                        if (array_Matrix[i][j] == 0){
                            System.out.print(" ");
                        } else if (array_Matrix[i][j] == 2){
                            System.out.print("#");
                        } else if (array_Matrix[i][j] == 1){
                            System.out.print("X");
                            } else if (array_Matrix[i][j] == 3){
                                System.out.print("O");
                            }

                          
                    }
                    System.out.println("*");
                }

                System.out.println("**********************");
            }


            public static void aggiungiPercorsoRobot(char[] arrayChar, int [][] arrayMatrix){
                int x = 0, y = 0;
                arrayMatrix[0][0] = 3;
                for (int i = 0; i < arrayChar.length; i++){

                    
                    if (arrayChar[i] == 's'){
                        y++;
                        try {
                        if (arrayMatrix[y][x] == 2){
                            y--;
                        }
                        if (x == 20){
                            y--;
                        }
                    } catch (StringIndexOutOfBoundsException e){
                        System.out.println("Invalid move - generic error.");
                    }
                    }

                    if (arrayChar[i] == 'e'){
                        x++;
                        try {
                        if (arrayMatrix[y][x] == 2){
                            x--;
                        }
                        if (x == 20){
                            x--;
                        }
                    } catch (StringIndexOutOfBoundsException e){
                        System.out.println("Invalid move - generic error.");
                    }
                    }

                    if (arrayChar[i] == 'o'){
                        x--;
                        try {
                        if (arrayMatrix[y][x] == 2){
                            x++;
                        }
                        if (x == 0){
                            x++;
                        }
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println("Invalid move - generic error.");
                    }
                    }

                    if (arrayChar[i] == 'n'){
                        y--;
                        try {
                        if (arrayMatrix[y][x] == 2){
                            y++;
                        }
                        if (y == 0){
                            y++;
                        }
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println("Invalid move - generic error.");
                    }
                    }

                    if (arrayMatrix[y][x] == 0)
                    arrayMatrix[y][x]= 3;

                    if (arrayMatrix[y][x] == 1){
                        System.out.println("Congratulations! You've found the objective you've placed!");
                    }

                    if (arrayMatrix[y][x] == 2){
                        System.out.println("No no no... what about the obstacle that's right in front of your eyes?");
                    }


                }
            }
            

            public static void main (String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Please insert how many rows do you want: ");
                int n = sc.nextInt();

                System.out.print("Please insert how many colummns do you want: ");
                int m = sc.nextInt();
            }

            public static int []creaMatrice (int n, int m){
                int [] matrice = new int  [n*m];
                return matrice;
            }

            public static void scriviElemento(int [] array, int n, int m, int i, int j, int elemento){

            }
            
             
            public static void main (String [] args){
                Scanner sc = new Scanner(System.in);

                int a = 0;
                int b = 0;

                a = sc.nextInt();
                b = sc.nextInt();

                System.out.println(somma(a,b));
      
            }

            public static int somma(int a, int b){
                if (a + b == a) 
                return 1;
                else {
                    System.out.println(a + " " + b);
                return somma(a+1,b-1);
                
                }

            }
            

            public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println(mcd(a,b));
            }

            public static int mcd (int a, int b){

                /*
                 * mcd tra 12 e 4
                 * mcd tra 12 e 4 è 4
                 * 12/1 = 12
                 * 12/2 = 6
                 * 12/3 = 4
                 * 12/4 = 3 
                 
                int i = a;
                int j = b;
                if (a > b) // pongo i > j
                {
                   i = a;
                   j = b;
                }
          
                Algoritmo di Euclide
                int tmpInt;
                while ((tmpInt = i % j) != 0)
                if ((tmpInt = i % j) != 0){
                    mcd(i, tmpInt);
                }
               
                    return j;

                    */

    public static void main(String[]args){
       char [][] matrix = new char [3][3];
        creaNuovaConfigurazione(matrix);

    }

    public static void creaNuovaConfigurazione(char [][] matrix){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix[i][j] = ' ';
            }
        }
    }

    
                 }
             
            
            


