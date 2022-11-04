import java.util.Scanner;
public class es_lab_quattronov {
    public static void main(String[] args) {
        //due numeri interi
        int a=0,b=0, c=0, i;

        Scanner sc = new Scanner(System.in);


        //esercizio 1 
        /*
        System.out.println("Scrivi l'anno: ");
        a = sc.nextInt();

        System.out.println("Scrivi il mese: ");
        b = sc.nextInt();

        if (a >= 1900 && a <= 2099){
            if (b >= 1 && b <= 12) {
                
                if (b == 1) { //gennaio
                    c = 31;
                }

                if (b == 2) { //febbraio
                    while(a%4 == 0 && a%100 != 0 || a%400 == 0 && a==2000){

                        System.out.println("29");
                        System.exit(0);
                    } 
                    c = 28;
                }

                if (b == 3) { //marzo
                    c = 31;
                }

                if (b == 4) { //aprile
                    c = 30;
                }

                if (b == 5) { //maggio
                    c = 31;
                }

                if (b == 6) { //giugno
                    c = 30;
                }

                if (b == 7) { //luglio
                    c = 31;
                }

                if (b == 8) { //agosto
                    c = 31;
                }

                if (b == 9) { //settembre
                    c = 30;
                }

                if (b == 10) { //ottobre
                    c = 31;
                }

                if (b == 11) { //novembre
                    c = 30;
                }

                if (b == 12) { //dicembre
                    c = 31;
                }

                System.out.println(c);
            } else {
                System.out.println("That's yet another error");
                System.exit(0);
            }
        } else {
            System.out.println("That's an error");
            System.exit(0);
        }
*/

        //esercizio 2
        /* 
        System.out.println("Scrivi una stringa: ");
        String string = sc.nextLine();

     

        
        String onlyspaces = string.replaceAll("[^ ]","");
        int onlyspaceslength = onlyspaces.length() +1;


        if (onlyspaceslength > 1 ){
            String tofind = " ";
            int found = string.indexOf(tofind);
            String lastoccurrence = string.substring(string.lastIndexOf(" "),string.length()).replaceAll(" ", "");
            String firstoccurrence = string.substring(0,found);
            if (lastoccurrence != " "){

        

        found = string.indexOf(tofind);
        int wordlength = string.replaceAll(" ", "").length();
        lastoccurrence = string.substring(string.lastIndexOf(" "),string.length()).replaceAll(" ", "");
        firstoccurrence = string.substring(0,found);
        System.out.println ("Here's what you've inserted: " + string);
        System.out.println("Here's how many words are in this sentence: " + onlyspaceslength);
        System.out.println("The last word: " + lastoccurrence);
        System.out.println("And the first word: " + firstoccurrence);
            } else {
                System.out.println("That is not valid");
                System.exit(0);
            }
        } 
        

        if (onlyspaceslength == 1 && string.equals("")){
            System.out.println("There are no words");
            System.exit(0);
        }

        if (onlyspaceslength == 1) {

        String tofind = " ";

        int found = string.indexOf(tofind);
        int wordlength = string.replaceAll(" ", "").length();

            System.out.println("Here's what you've inserted: " + string);
            System.out.println("And here is your length: " + wordlength);
            System.exit(0);
        } 
        */

        //esercizio 3
        /* 
        int examvotetheory;
        System.out.println("Insert here your exam vote in the theoretical part: ");
        examvotetheory = sc.nextInt();

        System.out.println("Insert here your exam vote in the practical part: ");
        int examvotepractice = sc.nextInt();

        if (examvotetheory <= -8 && examvotetheory >= 8){
            System.out.println("That's an error");
            System.exit(0);
    }

    if (examvotepractice <= 0 && examvotepractice >= 24){
        System.out.println("That's an error");
        System.exit(0);
    }
    
    int examvotecompletion = examvotetheory + examvotepractice;

    if (examvotecompletion >= 18 && examvotetheory <= 1) {
        System.out.println("That's so low for theory. Study a bit goddamn more");
        System.exit(0);
    }

    if (examvotetheory <=0 && examvotecompletion < 18){
        System.out.println("That's so low. Study a bit goddamn more");
        System.exit(0);
    }

    if (examvotetheory > 0 && examvotecompletion < 18){
        System.out.println("That's so low. Study a bit goddamn more");
        System.exit(0);
    }

    if (examvotecompletion == 31 || examvotecompletion == 32){
        System.out.println("Congratulations, you're so awesome!");
        System.exit(0);
    }

    if (examvotecompletion != 31 && examvotecompletion != 32 && examvotetheory > 0 && examvotecompletion > 18 && examvotepractice > 0){
        System.out.println("This is your grade: " + examvotecompletion);
        System.exit(0);
*/

final String ANSI_SOL1 = "\u001B[48;2;0;43;54m";
final String ANSI_RED = "\u001B[38;2;220;58;47m";
            final String ANSI_SOL11 = "\u001B[38;2;253;246;227m";
            final String ANSI_RESET = "\033[49m";
            final String ANSI_RESET2 = "\033[39m";
            final String ANSI_ORANGE1 = "\u001B[38;2;207;188;0m";

            final String ANSI_BOLD = "\u001B[1m"; // makes text afterwards bold

            final String ANSI_BOLD_END = "\u001B[0m"; // makes the text return to its normal state


            String firstplayer;
            String secondplayer;

            String firstplayerdraw;
            String secondplayerdraw;
            String parola;

            String secondplayerwin = ANSI_BOLD + ANSI_RED + secondplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
String start = """
        
    ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
    ┇                                  ┇                            ┇
    ┇    Roshambo!                     ┇
    ┇    Paper, rock, or scissors!     ┇
    ┇                                  ┇
    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
        """;

        System.out.println(ANSI_SOL1 + ANSI_SOL11 + start + ANSI_RESET + ANSI_RESET2);

        System.out.println("┇ Hello, and welcome to Roshambo for two people. To start, please choose if you want to fight");
        System.out.println("against another person, or against *me*. You can enter '2' for two-player action, and 'c' to play against me┇");

        String player = sc.next();

        switch (player) {
            case "2":
                System.out.println(ANSI_SOL1 + ANSI_SOL11 + "Ok, you'll be playing against someone else." + ANSI_RESET + ANSI_RESET2);
                System.out.print(ANSI_ORANGE1 + "1P, enter your name! ┣━━> " + ANSI_RESET);
                firstplayer = sc.next();
                System.out.println();

                System.out.println(ANSI_RED + "Cool! 2P, ready to enter your name? ┣━━> " + ANSI_RESET);
                secondplayer = sc.next();
                System.out.println();
            
    do{
        System.out.println(ANSI_ORANGE1 + "First player, go! Draw your figure ┣━━> " + ANSI_RESET);
        firstplayerdraw = sc.next();

        System.out.println(ANSI_RED + "2P, ready to roll... now! ┣━━> " + ANSI_RESET);
        secondplayerdraw = sc.next();

        System.out.println(ANSI_SOL1 + ANSI_SOL11 + "Alright, the results are in..." + ANSI_RESET + ANSI_RESET2 + "Remember, it's a very important game.");
        System.out.println();

        Thread.sleep(3000);
        System.out.print(ANSI_BOLD + ANSI_RED + "Ro..." + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END);
        Thread.sleep(1000);
        System.out.print(ANSI_BOLD + ANSI_ORANGE1 + "sham..." + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END);
        Thread.sleep(1000);
        System.out.print(ANSI_BOLD + ANSI_SOL11 + "bo!" + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END);

        if (firstplayerdraw.equals("rock") && secondplayerdraw.equals("rock")){
            System.out.println(ANSI_RED + ANSI_BOLD + "It's a draw! We should try this again." + ANSI_RESET + ANSI_RESET2);
        }

        if (firstplayerdraw.equals("scissors") && secondplayerdraw.equals("scissors")) {
            System.out.println(ANSI_RED + ANSI_BOLD + "It's a draw! We should try this again." + ANSI_RESET + ANSI_RESET2);
        }

        if (firstplayerdraw.equals("paper") && secondplayerdraw.equals("paper")) {
            System.out.println(ANSI_RED + ANSI_BOLD + "It's a draw! We should try this again." + ANSI_RESET + ANSI_RESET2);

        }

        if (firstplayerdraw.equals("rock") && secondplayerdraw.equals("paper")) {
            System.out.println("And the winner is... ");
            Thread.sleep(1000);
            System.out.println(secondplayerwin);

        }
       System.out.println("Scrivi ANCORA per continuare, STOP per fermarti");
       parola = sc.next();

      
   } while(!parola.equals("STOP"));
                break;
        }



}
    }