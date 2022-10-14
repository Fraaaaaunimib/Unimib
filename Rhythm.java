/* After asking you all the data needed, it calculates how much speed you did have compared to the data you've put.
 * Made by Fraaaaa#7481 - October 2022
*/

/*    ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ 
     /  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  /|
    /  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  // 
   /  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  
  /  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //   
 /_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //    
|__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/               
 ________  ___  ___      ___    ___ _________  ___  ___  _____ ______         
|\   __  \|\  \|\  \    |\  \  /  /|\___   ___\\  \|\  \|\   _ \  _   \       
\ \  \|\  \ \  \\\  \   \ \  \/  / ||___ \  \_\ \  \\\  \ \  \\\__\ \  \      
 \ \   _  _\ \   __  \   \ \    / /     \ \  \ \ \   __  \ \  \\|__| \  \     
  \ \  \\  \\ \  \ \  \   \/  /  /       \ \  \ \ \  \ \  \ \  \    \ \  \    
   \ \__\\ _\\ \__\ \__\__/  / /          \ \__\ \ \__\ \__\ \__\    \ \__\   
    \|__|\|__|\|__|\|__|\___/ /            \|__|  \|__|\|__|\|__|     \|__|   
                       \|___|/                                                
      ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ___    
     /  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  /|    
    /  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //     
   /  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //      
  /  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //  //       
 /_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //_ //        
|__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/__|/         
                                                                              
                                                                               */

import java.util.Scanner; //imports scanner library from java.util

public class Rhythm {
    public static void main (String[] args)    {



        // create a new Scanner object
        Scanner tastiera = new Scanner (System.in);

        // ASCII art
        String string = """
            $$\\                   $$\\     $$\\                     
            $$ |                  $$ |    $$ |                    
   $$$$$$\\  $$$$$$$\\  $$\\   $$\\ $$$$$$\\   $$$$$$$\\  $$$$$$\\$$$$\\  
  $$  __$$\\ $$  __$$\\ $$ |  $$ |\\_$$  _|  $$  __$$\\ $$  _$$  _$$\\ 
  $$ |  \\__|$$ |  $$ |$$ |  $$ |  $$ |    $$ |  $$ |$$ / $$ / $$ |
  $$ |      $$ |  $$ |$$ |  $$ |  $$ |$$\\ $$ |  $$ |$$ | $$ | $$ |
  $$ |      $$ |  $$ |\\$$$$$$$ |  \\$$$$  |$$ |  $$ |$$ | $$ | $$ |
  \\__|      \\__|  \\__| \\____$$ |   \\____/ \\__|  \\__|\\__| \\__| \\__|
                      $$\\   $$ |                                  
                      \\$$$$$$  |                                  
                       \\______/                                                                                 
                """;

        // ANSI strings - check https://stackoverflow.com/questions/4842424/list-of-ansi-color-escape-sequences for all details
        final String ANSI_BOLD = "\u001B[1m"; // makes text afterwards bold
        final String ANSI_BOLD_END = "\u001B[0m"; // makes the text return to its normal state
        final String ANSI_ITALIC = "\u001B[3m"; // makes the text italic
        final String ANSI_GREEN1 = "\u001B[38;2;62;142;146m"; // colour variable: \u001B[38;2 <-- this tells to just colour the text;R;G;Bm <-- rgb values
        final String ANSI_GREENB = "\u001B[48;2;62;244;197m"; // prints the background as green
        final String ANSI_ORANGE1 = "\u001B[38;2;207;188;0m";
        final String ANSI_BLACK = "\u001B[38;2;0,0,0m";
        final String ANSI_WHITEB = "\u001B[48;2;240;240;240m";

        // string to reset the colours to default values
        final String ANSI_RESET = "\033[49m";

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


             // start program
             System.out.println(" ");
             System.out.println(string);
             System.out.println(" ");
             // ask how many hours 
             System.out.print("Enter here how much time you want your marathon to be," + ANSI_ORANGE1 +" in hours." + ANSI_RESET + " --> " + ANSI_BOLD + ANSI_BLACK + ANSI_WHITEB);
             hour = tastiera.nextInt();
             
             // ask how many minutes
             System.out.print(ANSI_BOLD_END + ANSI_RESET + "Now type the minutes: ");
             minute = tastiera.nextInt();

             // ask how many seconds
             System.out.print("Now type the seconds: ");
             second = tastiera.nextInt();

             // ask the distance
             System.out.print("Do you want to calculate your distance in metres or kilometres? (Type a for metres, b for kilometers.)");
             distance2 = tastiera.next().charAt(0);
             
             // make a switch for distance -> if "a" then do thing, if "b" then do other thing.
             switch (distance2) {
                case 'a':
                    distance3 = true;
                        System.out.println("Ok, we'll be measuring this marathon in" + ANSI_BOLD + " metres" + ANSI_BOLD_END);
                   break; // remember to put break otherwise it doesn't check for the rest

                case 'b':
                    distance3 = false;
                        System.out.println("Ok, we'll be measuring this marathon in" + ANSI_BOLD + " kilometers." + ANSI_BOLD_END);
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
            System.out.print("Do you want to measure the speed in minutes or seconds?" + ANSI_ITALIC + ANSI_GREEN1 + ANSI_GREENB + "(Type a for minutes, type b for seconds)" + ANSI_RESET + ANSI_BOLD_END + "  --> ");
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






