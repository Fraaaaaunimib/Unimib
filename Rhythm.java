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
             ________  ___  ___      ___    ___ _________  ___  ___  _____ ______         
            |\\   __  \\|\\  \\|\\  \\    |\\  \\  /  /|\\___   ___\\  \\\\|\\  \\|\\   _ \\  _   \\       
            \\ \\  \\|\\  \\ \\  \\\\\\  \\   \\ \\  \\/  / ||___ \\  \\_\\ \\  \\\\\\  \\ \\  \\\\\\__\\ \\  \\      
             \\ \\   _  _\\ \\   __  \\   \\ \\    / /     \\ \\  \\ \\ \\   __  \\ \\  \\\\|__| \\  \\     
              \\ \\  \\\\  \\\\ \\  \\ \\  \\   \\/  /  /       \\ \\  \\ \\ \\  \\ \\  \\ \\  \\    \\ \\  \\    
               \\ \\__\\\\ _\\\\ \\__\\ \\__\\__/  / /          \\ \\__\\ \\ \\__\\ \\__\\ \\__\\    \\ \\__\\   
                \\|__|\\|__|\\|__|\\|__|\\___/ /            \\|__|  \\|__|\\|__|\\|__|     \\|__|   
                                   \\|___|/                                                                                                                              
                """;

        // ANSI strings - check https://stackoverflow.com/questions/4842424/list-of-ansi-color-escape-sequences for all details

        final String ANSI_BOLD = "\u001B[1m"; // makes text afterwards bold

        final String ANSI_BOLD_END = "\u001B[0m"; // makes the text return to its normal state

        final String ANSI_ITALIC = "\u001B[3m"; // makes the text italic

        final String ANSI_GREEN1 = "\u001B[38;2;62;142;146m"; // colour variable: \u001B[38;2 <-- this tells to just colour the text;R;G;Bm <-- rgb values

        //final String ANSI_GREENB = "\u001B[48;2;62;244;197m"; // prints the background as green

        final String ANSI_ORANGE1 = "\u001B[38;2;207;188;0m";

        //final String ANSI_BLACK = "\u001B[38;2;0,0,0m";
        //final String ANSI_WHITEB = "\u001B[48;2;240;240;240m";

        final String ANSI_WHITE = "\u001B[38;2;255;255;255m";

        final String ANSI_SOL1 = "\u001B[48;2;0;43;54m";

        final String ANSI_SOL11 = "\u001B[38;2;253;246;227m";

        final String ANSI_BLUE = "\u001B[38;2;38;139;218m";

        final String ANSI_SOL2 = "\u001B[38;2;131;148;150m";

        final String ANSI_YELLOW = "\u001B[38;2;181;137;0m";

        final String ANSI_BLACKB = "\u001B[48;2;0;0;0m";

        final String ANSI_GRAYB = "\u001B[48;2;35;35;50m";

        final String ANSI_RED = "\u001B[38;2;220;58;47m";

        // string to reset the colours to default values
        final String ANSI_RESET = "\033[49m";
        final String ANSI_RESET2 = "\033[39m";

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

             // ask how many hours 
             System.out.println(ANSI_BOLD_END + ANSI_RESET);
             System.out.print("[[ Enter here how long is this marathon," + ANSI_RED +" in hours" + ANSI_RESET + ANSI_RESET2 + " ]]" + ANSI_WHITE + " --> " + ANSI_SOL1 + ANSI_SOL11 + ANSI_BOLD);
             hour = tastiera.nextInt();
             
             // ask how many minutes
             System.out.println(ANSI_BOLD_END + ANSI_RESET);
             System.out.print(ANSI_BOLD_END + ANSI_RESET + ANSI_BLACKB + "[[ Now type the " + ANSI_ORANGE1 + "minutes" + ANSI_RESET + ANSI_RESET2 + " ]]" + ANSI_WHITE + " --> " + ANSI_SOL1 + ANSI_SOL11 + ANSI_BOLD);
             minute = tastiera.nextInt();

             // ask how many seconds
             System.out.println(ANSI_BOLD_END + ANSI_RESET);
             System.out.print(ANSI_BOLD_END + ANSI_RESET + "[[ Now type the " + ANSI_GREEN1 + "seconds" + ANSI_RESET + ANSI_RESET2 + " ]]" + ANSI_WHITE + " --> " + ANSI_SOL1 + ANSI_SOL11 + ANSI_BOLD);
             second = tastiera.nextInt();

             // ask the distance
             System.out.println(ANSI_BOLD_END + ANSI_RESET);
             System.out.print(ANSI_BOLD_END + ANSI_RESET + "[[ Do you want to calculate your distance in metres or kilometres? ]]" + ANSI_ITALIC + ANSI_BLUE + ANSI_GRAYB + " (Type a for metres, b for kilometers.)" + ANSI_RESET + ANSI_WHITE + " --> " + ANSI_SOL1 + ANSI_SOL11 + ANSI_BOLD);
             distance2 = tastiera.next().charAt(0);
             
             // make a switch for distance -> if "a" then do thing, if "b" then do other thing.
             switch (distance2) {
                case 'a':
                    distance3 = true;
                    System.out.println(ANSI_BOLD_END + ANSI_RESET);
                        System.out.println(ANSI_BOLD_END + ANSI_RESET + "[[ Ok, we'll be measuring this marathon in" + ANSI_BOLD + " metres" + ANSI_BOLD_END + " ]]");
                   break; // remember to put break otherwise it doesn't check for the rest

                case 'b':
                    distance3 = false;
                    System.out.println(ANSI_BOLD_END + ANSI_RESET);
                        System.out.println(ANSI_BOLD_END + ANSI_RESET + "[[ Ok, we'll be measuring this marathon in" + ANSI_BOLD + " kilometers." + ANSI_BOLD_END + " ]]");
                break;

                   
             }
            
             //ask the distance value
             System.out.println(ANSI_BOLD_END + ANSI_RESET);
             System.out.print(ANSI_BOLD_END + ANSI_RESET +"[[ Enter here how much distance you want your marathon to be: ]]" + ANSI_RESET + ANSI_WHITE + " --> " + ANSI_SOL1 + ANSI_SOL11 + ANSI_BOLD);
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
            System.out.println(ANSI_BOLD_END + ANSI_RESET);
            System.out.print(ANSI_BOLD_END + ANSI_RESET + "[[ Do you want to measure the speed in minutes or seconds? ]]" + ANSI_ITALIC + ANSI_GREEN1 + ANSI_GRAYB + " (Type a for minutes, type b for seconds)" + ANSI_RESET + ANSI_BOLD_END + "  --> " + ANSI_SOL1 + ANSI_SOL11 + ANSI_BOLD);
            min = tastiera.next().charAt(0);

            // check what you've written in console
            switch (min) {
                case 'a':
            minutetotal = hourtominute + minute + secondtominute;
            time = true; // set initial value to Minutes

            if (distance3 == true){ //distance as metres
                rhythm = (distance)/ minutetotal;
                System.out.println(ANSI_BOLD_END + ANSI_RESET);
                System.out.println(ANSI_BOLD_END + ANSI_RESET + "[[ Here's your rhythm - in m/min: " + ANSI_BOLD + ANSI_SOL2 + rhythm + ANSI_BOLD_END + ANSI_RESET + " m/min ]]");
            }   
           
            else{ // distance as kilometers
                rhythm = (distance)/minutetotal;
                System.out.println(ANSI_BOLD_END + ANSI_RESET);
                System.out.println(ANSI_BOLD_END + ANSI_RESET + "[[ Here's your rhythm - in km/min: " + ANSI_BOLD + ANSI_SOL2 + rhythm + ANSI_BOLD_END + ANSI_RESET + " km/min ]]");
            }
            break;


            case 'b':
               time = false; // set initial value to Seconds
            secondtotal = hourtosecond + minutetosecond + second;

                if (distance3 == true){
                    rhythm = (distance)/ secondtotal;
                    System.out.println(ANSI_BOLD_END + ANSI_RESET);
                    System.out.println(ANSI_BOLD_END + ANSI_RESET + "[[ Here's your rhythm - in m/s: " + ANSI_BOLD + ANSI_SOL2 + rhythm + ANSI_BOLD_END + ANSI_RESET + " m/s ]]");
                }
                
                else {
                    rhythm = (distance)/secondtotal;
                    System.out.println(ANSI_BOLD_END + ANSI_RESET);
                    System.out.println(ANSI_BOLD_END + ANSI_RESET + "[[ Here's your rhythm - in km/s: " + ANSI_BOLD + ANSI_SOL2 + rhythm + ANSI_BOLD_END + ANSI_RESET + " km/s ]]");
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
                            System.out.println(ANSI_BOLD_END + ANSI_RESET);
                            System.out.println("[[ The time you've chosen for this marathon was: " + ANSI_BOLD + ANSI_RED + hour + ANSI_BOLD_END + ANSI_RESET + " hours, " + ANSI_BOLD + ANSI_ORANGE1 + minute + ANSI_BOLD_END + ANSI_RESET + " minutes, and " + ANSI_GREEN1 + ANSI_BOLD + second + ANSI_BOLD_END + ANSI_RESET + " seconds, with a distance of " + ANSI_YELLOW + ANSI_BOLD + distance + ANSI_BOLD_END + ANSI_RESET + " m. ]]");
                            System.out.println(ANSI_BOLD_END + ANSI_RESET);
                        }
                        else{
                            System.out.println(ANSI_BOLD_END + ANSI_RESET);
                            System.out.println("[[ The time you've chosen for this marathon was: " + ANSI_BOLD + ANSI_RED + hour + ANSI_BOLD_END + ANSI_RESET + " hours, " + ANSI_BOLD + ANSI_ORANGE1 + minute + ANSI_BOLD_END + ANSI_RESET + " minutes, and " + ANSI_GREEN1 + ANSI_BOLD + second + ANSI_BOLD_END + ANSI_RESET + " seconds, with a distance of " + ANSI_YELLOW + ANSI_BOLD + distance + ANSI_BOLD_END + ANSI_RESET + " km. ]]");
                            System.out.println(ANSI_BOLD_END + ANSI_RESET);
                        }
                   
                }

                     else{
                        if (distance3 == true){
                            System.out.println(ANSI_BOLD_END + ANSI_RESET);
                            System.out.println("[[ The time you've chosen for this marathon was: " + ANSI_BOLD + ANSI_RED + hour + ANSI_BOLD_END + ANSI_RESET + " hours, " + ANSI_BOLD + ANSI_ORANGE1 + minute + ANSI_BOLD_END + ANSI_RESET + " minutes, and " + ANSI_GREEN1 + ANSI_BOLD + second + ANSI_BOLD_END + ANSI_RESET + " seconds, with a distance of " + ANSI_YELLOW + ANSI_BOLD + distance + ANSI_BOLD_END + ANSI_RESET + " m. ]]");
                            System.out.println(ANSI_BOLD_END + ANSI_RESET);
                        }
                        else {
                            System.out.println(ANSI_BOLD_END + ANSI_RESET);
                            System.out.println("[[ The time you've chosen for this marathon was: " + ANSI_BOLD + ANSI_RED + hour + ANSI_BOLD_END + ANSI_RESET + " hours, "+ ANSI_BOLD + ANSI_ORANGE1 + minute + ANSI_BOLD_END + ANSI_RESET + " minutes, and "+ ANSI_GREEN1 + ANSI_BOLD + second + ANSI_BOLD_END + ANSI_RESET +" seconds, with a distance of " + ANSI_YELLOW + ANSI_BOLD + distance + ANSI_BOLD_END + ANSI_RESET + " km. ]]");
                            System.out.println(ANSI_BOLD_END + ANSI_RESET);
                        }
                        

                     }
                    }

    }






