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

    */

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

        int counts = 0, counto = 0, counte = 0, countn = 0;

        boolean placed = aggiungiObiettivo(array_Matrix, row, column);

        aggiungiOstacolo(array_Matrix);
       


        System.out.println("");
  while (foundObjective  == false){
  
     

        System.out.print("And how can the robot move around in order to reach the objective? (N.B.: the robot always starts at position zero) ");
        String countMove = sc.next();
        posizioneRobotSud = aggiungiPosizioniRobot(array_Matrix, countMove, posizioneRobotSud, posizioneRobotEst);
        aggiungiPosizioniRobot(array_Matrix, countMove, posizioneRobotSud, posizioneRobotEst);
        stampaMondo(array_Matrix, posizioneRobotSud, posizioneRobotEst);
  }
        }

        public static int[][]creaMondo(){
            int [][] array = new int[20][20];
            return array;
        }

        public static boolean aggiungiObiettivo(int [][] array, int  row, int column){
            boolean canIPlace = false;

            if (array[row][column] == 0){
                canIPlace = true;
                System.out.println("Great, your obstacle can be put in this position!");
                array[row][column] = 1;
            } else {
                canIPlace = false;
                System.out.println("Sorry, your obstacle cannot be put in this position!");
            }
            return canIPlace;
        }

        public static void aggiungiOstacolo(int [][] array){
            boolean randomChoice = (Math.random() < 0.5);
            boolean shouldThisRow = (Math.random() < 0.5);
            for (int i = 0; i < 20; i++){
                
                shouldThisRow = (Math.random() < 0.5);
                for (int j = 0; j < 20; j++){
                    j++;
                    randomChoice = (Math.random() < 0.5);

                    if (shouldThisRow == true){
                    if (randomChoice == true)
                    randomChoice = (Math.random() < 0.5);
                    
                     if (randomChoice == true){
                        array[i][j] = 2;
                        break;
                    } else if (randomChoice == false && array[i][j] == 0) {
                        array[i][j] = 0;
                    }
                }   
                    }
                }

            }

            public static void stampaMondo (int [][] array_Matrix, int posizioneRobotSud, int posizioneRobotEst){
                System.out.println("**********************");
                System.out.println("*O");
                for (int i = 0; i < 20; i++){
                    System.out.print("*");

                    if (i < 19){
                    if (posizioneRobotSud > 0){
                        array_Matrix[posizioneRobotEst][i+1] = 3;
               
                    }

                    if (posizioneRobotEst > 0){
                        array_Matrix[i+1][posizioneRobotSud] = 3;
                
                    }
                }
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

            public static int aggiungiPosizioniRobot(int [][] array, String percorso, int posizioneRobotSud, int posizioneRobotEst){
                array[0][0] = 3;
                
                if (percorso.charAt(0) == 's'){
                        posizioneRobotSud++;
                }

                if (percorso.charAt(0) == 'e'){
                        posizioneRobotEst++;
                }

                if (percorso.charAt(0) == 'n' && posizioneRobotSud != 0){
                        posizioneRobotSud--;
                } else {
                    System.out.println("Posizione non valida!");
                }

                if (percorso.charAt(0) == 'o' && posizioneRobotEst != 0){
                    posizioneRobotEst--;
                } else {
                    System.out.println("Posizione non valida!");
                }

                return posizioneRobotSud;
                }

            }
        
    

