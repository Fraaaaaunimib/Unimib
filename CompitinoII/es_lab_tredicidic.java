

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
        Scanner sc = new Scanner(System.in);
       char [][] matrix = new char [3][3];
       boolean finished = false, winPC = false, winUser = false, repeat = true, validText = false, vediNonVincita = false, wrongMove = false;
       int scelta = 0;

       while (repeat == true){
        
        finished = false; winPC = false; winUser = false; repeat = true; validText = false; vediNonVincita = false; wrongMove = false;
        scelta = sceltaMenu(scelta);

        if (scelta == 1){
            System.out.print("Player 1, enter your name --> ");
            String name1 = sc.next();
            System.out.println("Ok, " + name1 + ", ready to play? ");

       creaNuovaConfigurazione(matrix);
       while (finished == false){
        stampaMatrix(matrix);
        if (wrongMove == false)
        mossaComputer(matrix);
        mossaUser(matrix,name1, wrongMove);
        winPC = vediVincita(matrix);
        winUser = vediVincitaUser(matrix);
        vediNonVincita = vediNonVincita(matrix);

        if (winPC == true){
            finished = true;
        }

        if (winUser == true){
            finished = true;
        }
        
        if (vediNonVincita == true){
            finished = true;
       }

       if (winPC == true){
        System.out.println("Sorry, but the computer won this time...");
    }

    if (winUser == true){
        System.out.println(name1 + ", you won! Yay!");
    }

    if (vediNonVincita = true){
        System.out.println("Seems like no one has won. Perhaps you want to re-run again.");
    }

    while (validText == false){
    System.out.println("Want to play again? \"S\" if you want, or \"N\" if you don't want. ");
    String a = sc.next();
    if (a.charAt(0) == 'S' || a.charAt(0) == 's'){
        validText = true;
        repeat = true;
    } else if (a.charAt(0) == 'N' || a.charAt(0) == 'n'){
        validText = true;
        repeat = false;
        System.exit(0);
    } else {
        System.out.println("You need to either insert a \"S\" if you want to repeat, or a \"N\" if you want to exit.");
        validText= false;
    }
       }
    }
}

    if (scelta == 2){

        System.out.print("Player 1, enter your name --> ");
        String name1 = sc.next();
        System.out.println("Ok, " + name1 + ", ready to play? ");

        System.out.print("Player 2, enter your name --> ");
        String name2 = sc.next();
        System.out.println("Perfect, " + name2 + ", ready to play?");
        creaNuovaConfigurazione(matrix);
        while (finished == false){
         stampaMatrix(matrix);
         if (wrongMove == false)
         mossaUser(matrix, name1, wrongMove);
         stampaMatrix(matrix);
         if (wrongMove == false)
         mossaUser2(matrix, name2, wrongMove);
         winPC = vediVincita(matrix);
         winUser = vediVincitaUser(matrix);
         vediNonVincita = vediNonVincita(matrix);
 
         if (winPC == true){
             finished = true;
         }
 
         if (winUser == true){
             finished = true;
         }

         if (vediNonVincita == true){
            finished = true;
         }
        }

        if (vediNonVincita == true){
            System.out.println(name1 + ", and " + name2 + ", both of you have lost to this game.");
            stampaMatrix(matrix);
        }
 
        if (winPC == true){
         System.out.println("First player won!");
     }
 
     if (winUser == true){
         System.out.println("Second player won!");
     }
 
     while (validText == false){
     System.out.println("Want to play again? \"S\" if you want, or \"N\" if you don't want. ");
     String a = sc.next();
     if (a.charAt(0) == 'S' || a.charAt(0) == 's'){
         validText = true;
         repeat = true;
     } else if (a.charAt(0) == 'N' || a.charAt(0) == 'n'){
         validText = true;
         repeat = false;
         System.exit(0);
     } else {
         System.out.println("You need to either insert a \"S\" if you want to repeat, or a \"N\" if you want to exit.");
         validText= false;
     }
        }
     }
    }


    sc.close();
}

    public static int sceltaMenu(int scelta){

        Scanner sc = new Scanner(System.in);
        System.out.print("How do you want to play? Write \"1\" if you want to play against the computer, \"2\" if you want to play against someone else.");
        scelta = sc.nextInt();
        switch (scelta){
            case 1:  
            return 1;
                
            case 2:
            return 2;
            
            default:
                System.out.println("You have to insert either 1, if you want to play against the computer, or two if you want to play against another person.");
                return 0;
            
        }

    }
    public static void creaNuovaConfigurazione(char [][] matrix){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix[i][j] = ' ';
            }
        }
    }

    public static void mossaComputer(char [][] matrix){
        for (int i = 0; i < 2; i++){
            for (int  j = 0; j < 2; j++){
                if (matrix[j][j+1] == 'O'){
                    matrix[j][j+2] = 'X';
                }
                else if (matrix[j+1][j] == 'O'){
                        try {
                    matrix[j+2][j] = 'X';
                        } catch (IndexOutOfBoundsException e){
                            System.out.print("Ignore this message.");
                        }
                }
            }
        }
        if (matrix[1][1] == ' '){
            matrix[1][1] = 'X';
        } else if ( matrix[0][0] == 'O'){
            matrix[2][2]= 'X';
        } else if (matrix [2][2] == 'O'){
            matrix[0][0] = 'X';
        } else if (matrix[0][0] == ' '){
            matrix[0][0] = 'X';
        } else if (matrix[0][2] == ' '){
            matrix[0][2] = 'X';
        } else if (matrix[2][0] == ' '){
            matrix[2][0] = 'X';
        } else if (matrix[2][2] == ' '){
            matrix[2][2] = 'X';
        } else {

            boolean clean = false;
            for (; clean == false;){
                int a = (int)(Math.random()*2);
                int b = (int)(Math.random()*2);
                if (matrix[a][b] == ' '){
                    matrix[a][b] = 'X';
                    clean = true;
                }
            }
        }
    }

    public static void mossaUser(char[][]matrix, String name, boolean wrongMove){
        boolean valid = false, validInput = false;
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        while (valid == false){
            while (validInput == false){
        System.out.print(name + ", which move you want to do? At which row: ");
        a = sc.nextInt();
        System.out.print("And in which column? ");
        b = sc.nextInt();

        if (a > 0 && a < 4 && b > 0 && b < 4){
            validInput = true;
        } else {
            System.out.println("Nope, not valid.");
        }
            }

        a--;
        b--;
            try {
        if (matrix[a][b] == 'X'){
            System.out.println("Nope, this is not valid.");
            wrongMove = true;
            break;
        } else if (matrix[a][b] == ' '){
        matrix[a][b] = 'O';
        wrongMove = false;
        valid = true;
        } else if (matrix[a][b] == 'O'){
            System.out.println("You can't place your move on top of an already occupied place.");
            wrongMove = true;
            break;
        }
    } catch (IndexOutOfBoundsException e){
        System.out.print("");
    }
    }
    }

    public static void mossaUser2(char[][]matrix, String name, boolean wrongMove){
        boolean valid = false, validInput = false;
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        while (valid == false){
            while (validInput == false){
        System.out.print(name + ", which move you want to do? At which row: ");
        a = sc.nextInt();
        System.out.print("And in which column? ");
        b = sc.nextInt();

        if (a > 0 && a < 4 && b > 0 && b < 4){
            validInput = true;
        } else {
            System.out.println("Nope, not valid.");
        }
            }

        a--;
        b--;
            try {
        if (matrix[a][b] == 'O'){
            System.out.println("Nope, this is not valid.");
            wrongMove = true;
            break;
        } else if (matrix[a][b] == ' '){
        matrix[a][b] = 'X';
        valid = true;
        wrongMove = false;
        }  else if (matrix[a][b] == 'X'){
            System.out.println("You can't place your move on top of an already occupied place.");
            wrongMove = true;
            break;
        }
    } catch (IndexOutOfBoundsException e){
        System.out.print("");
    }
    }
    }

    public static void stampaMatrix(char[][]matrix){
        System.out.println("  1     2     3 ");
        System.out.println("  _     _     _ ");
        for (int i = 0; i < 3; i++){
            System.out.print ((i+1 + "  "));
            for (int j = 0; j < 3; j++){
                System.out.print(" " + matrix[i][j] + " | ");
            }
            System.out.println("");
            System.out.println("  _     _     _ ");
        }
    }
    
    public static boolean vediVincita(char[][]matrix){
        boolean vincitaComputer = false;
        if (matrix[0][0] == 'X' && matrix[1][0] == 'X' && matrix[2][0] == 'X' || matrix[0][0] == 'X' && matrix[0][1] == 'X' && matrix[0][2] == 'X' || matrix[0][0] == 'X' && matrix [1][1] == 'X' && matrix[2][2] == 'X' || matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X' || matrix[0][1] == 'X' && matrix[1][1] == 'X' && matrix[2][1] == 'X' || matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X' || matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X' || matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X'){
            vincitaComputer = true;
        } else {
            vincitaComputer = false;
        }

        return vincitaComputer; 
    }

    public static boolean vediVincitaUser(char[][]matrix){
        boolean vincitaUser = false;
        if (matrix[0][0] == 'O' && matrix[1][0] == 'O' && matrix[2][0] == 'O' || matrix[0][0] == 'O' && matrix[0][1] == 'O' && matrix[0][2] == 'O' || matrix[0][0] == 'O' && matrix [1][1] == 'O' && matrix[2][2] == 'O' || matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O' || matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O' || matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O' || matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'O' || matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O'){
            vincitaUser = true;
        } else {
            vincitaUser = false;
        }

        return vincitaUser; 
    }

    public static boolean vediNonVincita(char[][] matrix){
        boolean isItNonFinished = false;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (matrix[i][j] == ' '){
                    isItNonFinished = false;
                    break;
                } else {
                    isItNonFinished = true;
                }
            }
        }

        return isItNonFinished;
    }
                 }
             
            
            


