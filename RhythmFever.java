import java.util.Scanner; //imports scanner library from java.util

public class RhythmFever {
    public static void main (String[] args)    {

        Scanner tastiera = new Scanner (System.in);
        

        //secondo problema:
            /*calcolare il ritmo in min/km per percorrere una maratona nel tempo specificato dall'utente.
             * 1) chiediamo il tempo in ore, minuti e secondi
             * 2) chiedere la distanza che si vuole avere
             * 
             */

             // ask time
             char distance2;
             boolean distance3 = true;
             boolean time = true;
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
             System.out.print("Do you want to calculate your distance in metres or kilometres? a for metres, b for kilometers. ");
             distance2 = tastiera.next().charAt(0);

             switch (distance2) {
                case 'a':
                    distance3 = true;

                    
                        System.out.println("Ok, we'll be measuring this marathon in metres.");
                   break;

                case 'b':
                    distance3 = false;

                    
                        System.out.println("Ok, we'll be measuring this marathon in kilometers.");
                      
                break;

                   
             }
if (distance3 == true){
    distance3 = true;
}
else {
    distance3 = false;
}
            
             //ask the distance value
             System.out.print("Enter here how much distance you want your marathon to be: ");
            distance = tastiera.nextInt();

            // make the rhythm
            hourtosecond = hour * 3600;
                
            minutetosecond = minute * 60;
            hourtominute = hour * 60;
            secondtominute = second / 60;

            // select which in min or seconds
            System.out.print("Enter if you want it in minutes or seconds. (Type a for minutes, type b for seconds) ");
            min = tastiera.next().charAt(0);

            switch (min) {
                case 'a':
            minutetotal = hourtominute + minute + secondtominute;
            time = true;

            if (distance3 == true){
                rhythmfever = (distance)/ minutetotal;
                System.out.println("Here's your rhythm - in m/min: " + rhythmfever + " m/min");
            }   
           
            else{
                rhythmfever = (distance)/minutetotal;
                System.out.println("Here's your rhythm - in km/min: " + rhythmfever + " km/min");
            }
            break;

            case 'b':

               time = false;
            secondtotal = hourtosecond + minutetosecond + second;

        
            
                if (distance3 == true){
                    rhythmfever = (distance)/ secondtotal;
                    System.out.println("Here's your rhythm - in m/s: " + rhythmfever + " m/s");
                }
                
                else {
                    rhythmfever = (distance)/secondtotal;
                    System.out.println("Here's your rhythm - in km/s: " + rhythmfever + " km/s");
                }
                
                break;
            }


 tastiera.close();
// value writing...?
            
System.out.println("Let's write here the value of distance3: " + distance3 + " and time: " + time);

                if (time == true){
                        if (distance3 == true){
                            System.out.println("The time you've chosen for this marathon was: " + hour + " hours, " + minute + " minutes, and " + second + "seconds, with a distance of " + distance + " m.");
                        }
                        else{
                            System.out.println("The time you've chosen for this marathon was: " + hour + " hours, " + minute + " minutes, and " + second + "seconds, with a distance of " + distance + " km.");
                        }
                   
                }

                     else{
                        if (distance3 == true){
                            System.out.println("The time you've chosen for this marathon was: " + hour + " hours, "+ minute + " minutes, and "+ second + " seconds, with a distance of " + distance + " m.");
                        }
                        else {
                            System.out.println("The time you've chosen for this marathon was: " + hour + " hours, "+ minute + " minutes, and "+ second + " seconds, with a distance of " + distance + " km.");
                        }
                        

                     }
                    }

    }






