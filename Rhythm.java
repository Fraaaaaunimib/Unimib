/* After asking you all the data needed, it calculates how much speed you did have compared to the data you've put.
 * Made by Fraaaaa#7481 - October 2022
*/

import java.util.Scanner; //imports scanner library from java.util

public class Rhythm {
    public static void main (String[] args)    {

        // create a new Scanner object
        Scanner tastiera = new Scanner (System.in);
        

        //secondo problema:
            /*calcolare il ritmo in min/km per percorrere una maratona nel tempo specificato dall'utente.
             * 1) chiediamo il tempo in ore, minuti e secondi
             * 2) chiedere la distanza che si vuole avere
             * (problem at University)
             */

             // values needed
             char distance2;
             boolean distance3 = true;
             boolean time = true;
             int hour, minute, second, hourtosecond, minutetosecond;
             char min;
             double distance, secondtotal, rhythm, hourtominute, secondtominute, minutetotal;

             // ask how many hours 
             System.out.print("Enter here how much time you want your marathon to be, in hour: ");
             hour = tastiera.nextInt();
             
             // ask how many minutes
             System.out.print("Now type the minutes: ");
             minute = tastiera.nextInt();

             // ask how many seconds
             System.out.print("Now type the seconds: ");
             second = tastiera.nextInt();

             // ask the distance
             System.out.print("Do you want to calculate your distance in metres or kilometres? a for metres, b for kilometers. ");
             distance2 = tastiera.next().charAt(0);
             
             // make a switch for distance -> if "a" then do thing, if "b" then do other thing.
             switch (distance2) {
                case 'a':
                    distance3 = true;
                        System.out.println("Ok, we'll be measuring this marathon in metres.");
                   break; // remember to put break otherwise it doesn't check for the rest

                case 'b':
                    distance3 = false;
                        System.out.println("Ok, we'll be measuring this marathon in kilometers.");
                break;

                   
             }
            
             //ask the distance value
             System.out.print("Enter here how much distance you want your marathon to be: ");
            distance = tastiera.nextInt();

            // convert from hour to seconds --> for time = false
            hourtosecond = hour * 3600;
            
            // convert from minutes to seconds --> for time = false
            minutetosecond = minute * 60;

            // convert hours to minutes --> for time = true
            hourtominute = hour * 60;

            // convert seconds to minutes --> for time = true
            secondtominute = second / 60;

            // select if you want time in minutes or seconds
            System.out.print("Enter if you want it in minutes or seconds. (Type a for minutes, type b for seconds) ");
            min = tastiera.next().charAt(0);

            // check what you've written in console
            switch (min) {
                case 'a':
            minutetotal = hourtominute + minute + secondtominute;
            time = true; // set initial value to Minutes

            if (distance3 == true){ //distance as metres
                rhythm = (distance)/ minutetotal;
                System.out.println("Here's your rhythm - in m/min: " + rhythm + " m/min");
            }   
           
            else{ // distance as kilometers
                rhythm = (distance)/minutetotal;
                System.out.println("Here's your rhythm - in km/min: " + rhythm + " km/min");
            }
            break;


            case 'b':
               time = false; // set initial value to Seconds
            secondtotal = hourtosecond + minutetosecond + second;

                if (distance3 == true){
                    rhythm = (distance)/ secondtotal;
                    System.out.println("Here's your rhythm - in m/s: " + rhythm + " m/s");
                }
                
                else {
                    rhythm = (distance)/secondtotal;
                    System.out.println("Here's your rhythm - in km/s: " + rhythm + " km/s");
                }
                
                break;
            }

 tastiera.close();
            
// System.out.println("Let's write here the value of distance3: " + distance3 + " and time: " + time);
            /* old stuff, it was telling me that the value wasn't used anywhere so I did this, but it's unnecessary 
             * told also if variable changing was working or not, which was not
             * 
             * [NOTE]: if you want to set a variable then "=", if you want to compare a variable then "=="
            */

                // better outputting - changes values in the output based on your choices, to provide an answer based on your choices
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






