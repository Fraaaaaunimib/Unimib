import java.util.Scanner;
public class Tinkertherobot {
    public static void main (String[]args ){
        int [][] array_Matrix = creaMondo();
        int posizioneRobotSud = 0, posizioneRobotEst = 0, savedx = 0, savedy = 0;
        String savedint = "";
        Scanner sc = new Scanner(System.in);
        boolean foundObjective = false, alreadyCreatedMatrix = false;
        System.out.print("At which position is the objectve? ");
        System.out.print("Row: ");
        int row = sc.nextInt();

        if (row == 1)
        row = 0;

        if (row > 20){
            System.out.println("Way too big!");
            row = 19;
        }

        System.out.print("Column: ");
        int column = sc.nextInt();
        if (column == 1)
        column = 0;
        else
        column = column - 1;
        if (column > 20){
            System.out.println("Way too big!");
            column = 19;
    }

        while (foundObjective == false){

        System.out.print("And what track do you want to do? ");
        String track = sc.next();
        char arraychar[]= track.toCharArray();


        int counts = 0, counto = 0, counte = 0, countn = 0;

        boolean placed = aggiungiObiettivo(array_Matrix, row, column);

        if (alreadyCreatedMatrix == false)
        aggiungiOstacolo(array_Matrix);
       savedint = aggiungiPercorsoRobot(arraychar, array_Matrix, foundObjective, savedx, savedy);
       int savei = 0;
       for (int i = 0; i < savedint.length();i++){
        if (savedint.charAt(i) == '&'){
            
        }
       }


        System.out.println("");

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
                } else if (array[x][y] == 1){
                    array[x][y] = 1;
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


            public static String aggiungiPercorsoRobot(char[] arrayChar, int [][] arrayMatrix, boolean foundObjective, int savedx, int savedy){
                String savednumber = "";
                int x = 0, y = 0, savedAll = 0;

                if (savedx == 0 && savedy == 0){
                    x = 0;
                    y = 0;
                    arrayMatrix[0][0] = 3;
                } else if (savedx != 0 && savedy != 0){
                    x = savedx;
                    y = savedy;
                }
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
                    foundObjective = false;
                    arrayMatrix[y][x]= 3;

                    if (arrayMatrix[y][x] == 1){
                        foundObjective = true;
                        System.out.println("Congratulations! You've found the objective you've placed!");
                    }

                    if (arrayMatrix[y][x] == 2){
                        foundObjective = false;
                        System.out.println("No no no... what about the obstacle that's right in front of your eyes?");
                    }


                }
                    
                savednumber = "" + x + "&" + y;
                return savednumber;
            }
}
