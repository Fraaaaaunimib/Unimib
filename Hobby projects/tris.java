/*
* TRIS game : DEBUG notes
How does this work?

This program has a 3x3 char matrix, which includes all empty characters. If you do play against the computer, you are the "O" and the "X" is the computer.
You can make it also so that you play against another person, which uses yet another methods.

*/
import java.util.Scanner;
public class tris{

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   char [][] matrix = new char [3][3]; //the matrix
   boolean finished = false, winPC = false, winUser = false, repeat = true, validText = false, vediNonVincita = false, wrongMove = false;
   /*
    * finished: did your game finish?
    winPC : did the pc/second user won?
    winUser: did the user win?
    repeat: want to repeat the game after it ends?
    validText: is what you entered at the end of the program to repeat valid or not?
    vediNonVincita: have you filled the matrix up and can't make any moves anymore?
    wrongMove: are you trying to make an invalid move?
    */
   int scelta = 0; //menu choice

   while (repeat == true){ //repeats the program until you want to exit
    
    finished = false; winPC = false; winUser = false; repeat = true; validText = true; vediNonVincita = false; wrongMove = false; //resetting the booleans
    scelta = sceltaMenu(scelta); //calls the method to not go in error

    if (scelta == 1){ //play with the computer
        System.out.print("Player 1, enter your name --> ");
        String name1 = sc.next();
        System.out.println("Ok, " + name1 + ", ready to play? ");

  //first game: don't verify any winning
        creaNuovaConfigurazione(matrix); //empties the matrix

   stampaMatrix(matrix, winPC, winUser, finished); //prints the matrix
   
    mossaUser(matrix,name1, wrongMove); //lets the user play
    if (wrongMove == false) // if what you've inserted is wrong, then let the user play its move again
    mossaComputer(matrix); //computer move

  

   while (finished == false){
    stampaMatrix(matrix, winPC, winUser, finished);
    
     mossaUser(matrix,name1, wrongMove);
     if (wrongMove == false)
    mossaComputer(matrix);
   
    winPC = vediVincita(matrix, finished);
    winUser = vediVincitaUser(matrix, finished);
    vediNonVincita = vediNonVincita(matrix); //see if you have filled the matrix or not


    if (winPC == true){
        finished = true;
        validText = false;
    }

    if (winUser == true){
        finished = true;
        validText = false;
    }
    
    if (vediNonVincita == true){
        finished = true;
        validText = false;
   }

   if (winPC == true){
    System.out.println("Sorry, but the computer won this time...");
}

if (winUser == true){
    System.out.println(name1 + ", you won! Yay!");
}

if (vediNonVincita == true){
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
        winPC = vediVincita(matrix, finished);
        winUser = vediVincitaUser(matrix, finished);
     stampaMatrix(matrix, winPC, winUser, finished);
     winPC = vediVincita(matrix, finished);
     winUser = vediVincitaUser(matrix, finished);
     if (wrongMove == false){
             winPC = vediVincita(matrix, finished);
     winUser = vediVincitaUser(matrix, finished);
     mossaUser(matrix, name1, wrongMove);
     winPC = vediVincita(matrix, finished);
     winUser = vediVincitaUser(matrix, finished);
     }
     winPC = vediVincita(matrix, finished);
     winUser = vediVincitaUser(matrix, finished);
     stampaMatrix(matrix, winPC, winUser, finished);
     if (wrongMove == false) {
        winPC = vediVincita(matrix, finished);
        winUser = vediVincitaUser(matrix, finished);
     mossaUser2(matrix, name2, wrongMove);
     winPC = vediVincita(matrix, finished);
     winUser = vediVincitaUser(matrix, finished);
     }
     winPC = vediVincita(matrix, finished);
     winUser = vediVincitaUser(matrix, finished);
     vediNonVincita = vediNonVincita(matrix);
     winPC = vediVincita(matrix, finished);
     winUser = vediVincitaUser(matrix, finished);
  

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
        stampaMatrix(matrix, winPC, winUser,finished);
    }

    if (winPC == true){
     System.out.println("Second player won!");
 }

 if (winUser == true){
     System.out.println("First player won!");
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
            matrix[i][j] = ' '; //empties the matrix
        }
    }
}

public static void mossaComputer(char [][] matrix){
    boolean alreadyInserted = false;
    for (int i = 0; i < 2; i++){
        for (int  j = 0; j < 2; j++){
            try {
            if (matrix[j][j+1] == 'O' && alreadyInserted == false){
                matrix[j][j+2] = 'X'; //check every column; if the cell below the chosen one is full, then put one below
                alreadyInserted = true; //stops the computer from doing multiple moves in one go
                break;
            }
            else if (matrix[j+1][j] == 'O' && alreadyInserted == false){
                if (matrix[j+2][j] == 'X'){ //checks every line; if the cell next to it is full, then choose the one after
                    alreadyInserted = false;
                    break;
                } else 
                matrix[j+2][j] = 'X';

                alreadyInserted = true;
                break;
            }
                    } catch (IndexOutOfBoundsException e){ //let the program not error out
                        System.out.print("");
                    }
            }
        }
    
        //hardcoded rules
    if (matrix[1][1] == ' ' && alreadyInserted == false){
        matrix[1][1] = 'X';
        alreadyInserted = true;
    } else if ( matrix[0][0] == 'O' &&alreadyInserted == false ){
        matrix[2][2]= 'X';
        alreadyInserted = true;
    } else if (matrix [2][2] == 'O'&&alreadyInserted == false){
        matrix[0][0] = 'X';
        alreadyInserted = true;
    } else if (matrix[0][0] == ' '&&alreadyInserted == false){
        matrix[0][0] = 'X';
        alreadyInserted = true;
    } else if (matrix[0][2] == ' '&&alreadyInserted == false){
        matrix[0][2] = 'X';
        alreadyInserted = true;
    } else if (matrix[2][0] == ' '&&alreadyInserted == false){
        matrix[2][0] = 'X';
        alreadyInserted = true;
    } else if (matrix[2][2] == ' '&&alreadyInserted == false){
        matrix[2][2] = 'X';
        alreadyInserted = true;
    } else {

        //if not any other rule has been fullilled, then select a random empty cell
        for (; alreadyInserted == false;){
            int a = (int)(Math.random()*2);
            int b = (int)(Math.random()*2);
            if (matrix[a][b] == ' ' && alreadyInserted == false){
                matrix[a][b] = 'X';
                alreadyInserted = true;
 
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
    System.out.print(name + ", which move do you want to make? At which row: ");
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
    System.out.print(name + ", which move do you want to make? At which row: ");
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

public static void stampaMatrix(char[][]matrix, boolean winPC, boolean winUser, boolean finished){
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
    winPC = vediVincita(matrix, finished);
    winUser = vediVincitaUser(matrix, finished);
}

public static boolean vediVincita(char[][]matrix, boolean finished){
    boolean vincitaComputer = false;
    if (matrix[0][0] == 'X' && matrix[1][0] == 'X' && matrix[2][0] == 'X' || matrix[0][0] == 'X' && matrix[0][1] == 'X' && matrix[0][2] == 'X' || matrix[0][0] == 'X' && matrix [1][1] == 'X' && matrix[2][2] == 'X' || matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X' || matrix[0][1] == 'X' && matrix[1][1] == 'X' && matrix[2][1] == 'X' || matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X' || matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X' || matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X'){
        vincitaComputer = true;
        finished = true;
    } else {
        vincitaComputer = false;
        finished = false;
    }

    return vincitaComputer; 
}

public static boolean vediVincitaUser(char[][]matrix, boolean finished){
    boolean vincitaUser = false;
    if (matrix[0][0] == 'O' && matrix[1][0] == 'O' && matrix[2][0] == 'O' || matrix[0][0] == 'O' && matrix[0][1] == 'O' && matrix[0][2] == 'O' || matrix[0][0] == 'O' && matrix [1][1] == 'O' && matrix[2][2] == 'O' || matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O' || matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O' || matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O' || matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'O' || matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O'){
        vincitaUser = true;
        finished = true;
    } else {
        vincitaUser = false;
        finished = false;
    }

    return vincitaUser; 
}

public static boolean vediNonVincita(char[][] matrix){
    boolean isItNonFinished = false;

    String row1 = "", row2 = "", row3 = "";
   
    for (int i = 0; i < 3; i++){
        row1 += matrix[0][i] + "";
        row2 += matrix[1][i] + "";
        row3 += matrix[2][i] + "";
    }

    for (int i = 0; i < 2; i++){
        if (row1.charAt(i) == ' ')
        isItNonFinished = false;
else if (row2.charAt(i) ==' '){
            isItNonFinished = false;
        } else if (row3.charAt(i) == ' '){
            isItNonFinished = false;
        } else {
            isItNonFinished = true;
        }
    }


    
    return isItNonFinished;
}
             }
         
        
        


