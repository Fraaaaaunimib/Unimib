import java.util.Scanner;
public class Roshambo {


    public static void main(String[] args) {
        //due numeri interi
        int a=0,b=0, c=0, i;

        Scanner sc = new Scanner(System.in);


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

        try {
            Thread.sleep(3000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        System.out.print(ANSI_BOLD + ANSI_RED + "Ro..." + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END);
        try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        System.out.print(ANSI_BOLD + ANSI_ORANGE1 + "sham..." + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END);
        try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
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

        if (firstplayerdraw.equals("paper") && secondplayerdraw.equals("rock")) {
            System.out.println("And the winner is... ");
            String secondplayerwin = ANSI_BOLD + ANSI_RED + secondplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
            try {
                Thread.sleep(1000);
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            System.out.println(secondplayerwin);

        }

        if (firstplayerdraw.equals("scissors") && secondplayerdraw.equals("rock")) {
            System.out.println("And the winner is... ");
            String secondplayerwin = ANSI_BOLD + ANSI_RED + secondplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
            try {
                Thread.sleep(1000);
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            System.out.println(secondplayerwin);

        }

       System.out.println("Scrivi ANCORA per continuare, STOP per fermarti");
       parola = sc.next();

      
   } while(!parola.equals("STOP"));
                break;
        }



}
    }
}
