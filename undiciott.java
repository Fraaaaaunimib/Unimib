import java.util.Scanner; //imports scanner library from java.util

public class undiciott {
    public static void main (String[] args)    {

        Scanner tastiera = new Scanner (System.in);
        

        //secondo problema:
            /*calcolare il ritmo in min/km per percorrere una maratona nel tempo specificato dall'utente.
             * 1) chiediamo il tempo in ore, minuti e secondi
             * 2) chiedere la distanza che si vuole avere
             * 
             */

             // ask time
             int hour, minute, second, hourtosecond, minutetosecond;
             char min;
             double distance, secondtotal, rhythmfever, hourtominute, secondtominute, minutetotal;
                
             System.out.print("Enter here how much time you want your marathon to be, in hour: ");
             hour = tastiera.nextInt();
             
             System.out.print("Now type the minutes: ");
             minute = tastiera.nextInt();

             System.out.print("Now type the seconds: ");
             second = tastiera.nextInt();

             // ask the distance
             System.out.print("Enter here how much distance you want your marathon to be: ");
            distance = tastiera.nextInt();

            // make the rhythm
            hourtosecond = hour * 3600;
                
            minutetosecond = minute * 60;
            hourtominute = hour * 60;
            secondtominute = second / 60;

            // select which in min or seconds
            System.out.print("Enter if you want it in minutes or seconds. ");
            min = tastiera.next().charAt(0);

            switch (min) {
                case '1':
            minutetotal = hourtominute + minute + secondtominute;

                rhythmfever = (distance)/ minutetotal;

                System.out.println("Here's your rhythm - " + rhythmfever);
                break;

                case '2':

               
            secondtotal = hourtosecond + minutetosecond + second;

            
            
            

                rhythmfever = (distance)/ secondtotal;
                System.out.println("Here's your rhythm - " + rhythmfever);
                break;
            }


 tastiera.close();

    }

}




