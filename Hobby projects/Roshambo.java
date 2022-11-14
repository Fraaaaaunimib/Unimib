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
            final String ANSI_BLUE = "\u001B[38;2;38;139;218m";

            final String ANSI_BOLD = "\u001B[1m"; // makes text afterwards bold

            final String ANSI_BOLD_END = "\u001B[0m"; // makes the text return to its normal state

            final String ANSI_REALRED = "\u001B[38;2;230;30;30m";

            String firstplayer;
            String secondplayer;

            String firstplayerdraw;
            String secondplayerdraw = "";
            String parola;
            boolean changed = true;

           
String start = """
        
    ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
    ┇                                  ┇                            
    ┇    Roshambo!                     ┇
    ┇    Paper, rock, or scissors!     ┇
    ┇                                  ┇
    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
        """;

        System.out.println(ANSI_SOL1 + ANSI_SOL11 + start + ANSI_RESET + ANSI_RESET2);

        System.out.println("┇ Hello, and welcome to Roshambo for two people. To start, please choose if you want to fight");

while (changed == true) {
        System.out.print("  against another person, or against *me*. You can enter '2' for two-player action, and 'c' to play against me ┇ ┣━━> ");

        String player = sc.next();

        switch (player) {
            case "2":
                System.out.println(ANSI_SOL1 + ANSI_SOL11 + "Ok, you'll be playing against someone else." + ANSI_RESET + ANSI_RESET2);
                do{
                System.out.print(ANSI_ORANGE1 + "1P, enter your name! ┣━━> " + ANSI_RESET);
                firstplayer = sc.next();
                System.out.println();

                System.out.print(ANSI_RED + "Cool! 2P, may you enter your name? ┣━━> " + ANSI_RESET);
                secondplayer = sc.next();
                System.out.println();
            
    
        System.out.print(ANSI_ORANGE1 + "First player, go! Draw your figure ┣━━> " + ANSI_RESET);
        firstplayerdraw = sc.next();
        System.out.print("\b\b\b\b\b\b\b");

        System.out.print(ANSI_RED + "2P, ready to roll... now! ┣━━> " + ANSI_RESET);
        secondplayerdraw = sc.next();

        
        System.out.println(ANSI_SOL1 + ANSI_SOL11 + "Alright, the results are in..." + ANSI_RESET + ANSI_RESET2 + " Remember, it's a very important game.");
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
        System.out.print(ANSI_BOLD + ANSI_SOL11 + "bo!" + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + " ");

        
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
            String firstplayerwin = ANSI_BOLD + ANSI_RED + firstplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
            try {
                Thread.sleep(4000);
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            System.out.println(firstplayerwin);

        }

        if (firstplayerdraw.equals("rock") && secondplayerdraw.equals("paper")) {
          System.out.println("And the winner is... ");
          String secondplayerwin = ANSI_BOLD + ANSI_RED + secondplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
          try {
              Thread.sleep(4000);
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
          System.out.println(secondplayerwin);

      }

        if (firstplayerdraw.equals("scissors") && secondplayerdraw.equals("rock")) {
            System.out.println("And the winner is... ");
            String secondplayerwin = ANSI_BOLD + ANSI_RED + secondplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
            try {
                Thread.sleep(4000);
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            System.out.println(secondplayerwin);

        }

        if (firstplayerdraw.equals("rock") && secondplayerdraw.equals("scissors")) {
          System.out.println("And the winner is... ");
          String firstplayerwin = ANSI_BOLD + ANSI_ORANGE1 + firstplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
          try {
              Thread.sleep(4000);
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
          System.out.println(firstplayerwin);

      }

      if (firstplayerdraw.equals("paper") && secondplayerdraw.equals("scissors")) {
        System.out.println("And the winner is... ");
        String secondplayerwin = ANSI_BOLD + ANSI_RED + secondplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
        try {
            Thread.sleep(4000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        System.out.println(secondplayerwin);

    }

    if (firstplayerdraw.equals("scissors") && secondplayerdraw.equals("paper")) {
      System.out.println("And the winner is... ");
      String firstplayerwin = ANSI_BOLD + ANSI_ORANGE1 + firstplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
      try {
          Thread.sleep(4000);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      System.out.println(firstplayerwin);

  }

  System.out.println();
  System.out.println("┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬");
   System.out.println("Want to play again? Just write anything you want to continue, or STOP if you want to not play anymore");
   System.out.println("┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴");
   System.out.println();
       parola = sc.next();


      } while(!parola.equals("STOP") || firstplayerdraw == "rock" || firstplayerdraw == "scissors" || firstplayerdraw == "paper"|| secondplayerdraw == "rock" || secondplayerdraw == "scissors" || secondplayerdraw == "paper");



      if (parola.equals("STOP")) {
        System.out.println(ANSI_BLUE + "You have thus reached the end of the line. It thou shall seem like you don't want to continue. Thou shall be Denis <-- according to tabnine, everyone should be Denis.");
      }
                break;






                case "c":
                int computerchoice = (int)(Math.random()*3);

                String computerchoicestring = "0";

                if (computerchoice == 0){
                  computerchoicestring = "scissors";
                }

                if (computerchoice == 1){
                  computerchoicestring = "paper";
                }

                if (computerchoice == 2){
                  computerchoicestring = "rock";
                }

                System.out.println(ANSI_SOL1 + ANSI_SOL11 + "Ok, you'll be against " + ANSI_BOLD + "me!" + ANSI_BOLD_END + ANSI_RESET + ANSI_RESET2);

                do{
                System.out.print(ANSI_ORANGE1 + "1P, enter your name! ┣━━> " + ANSI_RESET);
                firstplayer = sc.next();
                System.out.println();

            
        System.out.print(ANSI_ORANGE1 + "First player, go! Draw your figure ┣━━> " + ANSI_RESET);
        firstplayerdraw = sc.next();



        System.out.println(ANSI_SOL1 + ANSI_SOL11 + "Alright, the results are in..." + ANSI_RESET + ANSI_RESET2 + " Remember, it's a very important game.");
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
        System.out.print(ANSI_BOLD + ANSI_SOL11 + "bo!" + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + " ");

        if (firstplayerdraw.equals("rock") && computerchoicestring.equals("rock")){
            System.out.println(ANSI_RED + ANSI_BOLD + "It's a draw! We should try this again." + ANSI_RESET + ANSI_RESET2);
        }

        if (firstplayerdraw.equals("scissors") && computerchoicestring.equals("scissors")) {
            System.out.println(ANSI_RED + ANSI_BOLD + "It's a draw! We should try this again." + ANSI_RESET + ANSI_RESET2);
        }

        if (firstplayerdraw.equals("paper") && computerchoicestring.equals("paper")) {
            System.out.println(ANSI_RED + ANSI_BOLD + "It's a draw! We should try this again." + ANSI_RESET + ANSI_RESET2);

        }

        if (firstplayerdraw.equals("paper") && computerchoicestring.equals("rock")) {
            System.out.println("And the winner is... ");
            String firstplayerwin = ANSI_BOLD + ANSI_RED + firstplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
            try {
                Thread.sleep(4000);
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            System.out.println(firstplayerwin);

        }

        if(firstplayerdraw.equals("rock") && computerchoicestring.equals("paper")){
          System.out.println("And the winner is... ");
          String secondplayerwin = ANSI_BOLD + ANSI_RED + "I've won and you lost" + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
          try {
              Thread.sleep(4000);
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
          System.out.println(secondplayerwin);
        }

        if (firstplayerdraw.equals("scissors") && computerchoicestring.equals("rock")) {
            System.out.println("And the winner is... ");
            String secondplayerwin = ANSI_BOLD + ANSI_RED + "I've won and you lost" + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
            try {
                Thread.sleep(4000);
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            System.out.println(secondplayerwin);

        }

        if (firstplayerdraw.equals("rock") && computerchoicestring.equals("scissors")) {
          System.out.println("And the winner is... ");
          String firstplayerwin = ANSI_BOLD + ANSI_ORANGE1 + firstplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
          try {
              Thread.sleep(4000);
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
          System.out.println(firstplayerwin);

      }

      if (firstplayerdraw.equals("paper") && computerchoicestring.equals("scissors")) {
        System.out.println("And the winner is... ");
        String secondplayerwin = ANSI_BOLD + ANSI_RED + "I've won and you lost" + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
        try {
            Thread.sleep(4000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        System.out.println(secondplayerwin);

    }

    if (firstplayerdraw.equals("scissors") && computerchoicestring.equals("paper")) {
      System.out.println("And the winner is... ");
      String firstplayerwin = ANSI_BOLD + ANSI_ORANGE1 + firstplayer + ANSI_RESET + ANSI_RESET2 + ANSI_BOLD_END + "! Congratulations, this has been one of the best games we've ever seen here! Come back next time for an even better game!";
      try {
          Thread.sleep(4000);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      System.out.println(firstplayerwin);

  }
  System.out.println();
      System.out.println("┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬");
       System.out.println("Want to play again? Just write anything you want to continue, or STOP if you want to not play anymore");
       System.out.println("┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴");
       System.out.println();
       parola = sc.next();




   } while(!parola.equals("STOP") || firstplayerdraw == "rock" || firstplayerdraw == "scissors" || firstplayerdraw == "paper" || parola.equals("again"));

   if (parola.equals("again")) {
    System.out.println("Oh really, you want to change back the settings? Ok, we'll be doing this right now...");
    changed = false;
   }


  if (parola.equals("STOP")) {
    System.out.println(ANSI_BLUE + "You have thus reached the end of the line. It thou shall seem like you don't want to continue. Thou shall be Denis <-- according to tabnine, everyone should be Denis.");
  }
  
   break;
   
        }

  
          
        


sc.close();
    }

  }
  }
