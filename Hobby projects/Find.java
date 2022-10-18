import java.util.Scanner;
public class Find {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        

        String s1;
        String toSearch1;
        int found1;
        int index1;

        String string = """
            ╔═════════════════════════════════════════════════╗
            ║ [X]              Find in a text             [─] ║
            ╙─────────────────────────────────────────────────╜
            """;
                    
            String search = """
            ║       ,@@@@@@/                                  ║
            ║    (@@@      @@@                                ║
            ║   @@            @@                              ║
            ║  @@             ,@(                             ║
            ║  &@             %@        Insert the text       ║
            ║   @@,          @@(        you want to           ║
            ║     @@@@.  .@@@@@/*       SEARCH!               ║
            ║         @@@@    ..%&&                           ║
            ║                    &&&&#                        ║
            ║                      (%&%%                      ║
            """;
                    
        do{
            
            System.out.print(string);

        System.out.print(search);
        System.out.println("║                                                 ║");
        System.out.print("║   Text: --> ");
        String s = in.next();
        String toSearch = in.next();
        
        
        s1 = s;
        toSearch1 = toSearch;
        
         // ANSI strings - check https://stackoverflow.com/questions/4842424/list-of-ansi-color-escape-sequences for all details


         final String ANSI_SOL11 = "\u001B[38;2;41;161;152m";

         final String ANSI_RESET2 = "\033[39m";


        int index = s.indexOf(toSearch);
        
        if (index == -1){
            try {
            System.out.println(s);
            System.out.println("la parola: "+toSearch+" e' stata trovata 0 volte");
            index1 = 0;
            }  finally {
                System.out.println("Would you like to try it again?");
                boolean answer;
                answer = in.nextBoolean();
                    if (answer == true){
                          System.out.println("Thing to find: ");
                          s = in.next();
                          toSearch = in.next();

        StringBuilder formattedString = new StringBuilder(s.substring(0, index));
        int lastindex;
        String found = "0";
        int lastindex1;

                            if (index == -1){
                                try {
                                    System.out.println(s);
                                    System.out.println("la parola: " + toSearch + " è stata trovata zero volte.");
                                } finally {
                                    System.out.println("But don't worry, there's much more to come, please run me once again to find out what you were looking for. Buh-bye!");
                                    System.exit(0);
                                }
                            }
                            else {
                                formattedString.append(ANSI_SOL11).append(s.substring(index, index + toSearch.length())).append(ANSI_RESET2);
                                found = found + 1;
                                lastindex = index+toSearch.length();
                                lastindex1 = index+toSearch1.length();
                    
                                index = s.indexOf(toSearch,lastindex);
                                
                                if (index == -1) {
                                    formattedString.append(s.substring(lastindex));
                                }else { 
                                    formattedString.append(s.substring(lastindex, index));
                                }
                            }
                            System.out.println(formattedString);
                            index1 = index;
                            System.out.println(index1);
                            System.out.println("\nla parola: \""+toSearch+"\" e' stata trovata "+found+" volte");
                            
                       

        

                    }
                    else {
                        System.out.println("I guess this is the end of your journey.");
                        System.exit(0);
                    }
            }
        }

        StringBuilder formattedString = new StringBuilder(s.substring(0, index));
        int lastindex;
        String found = "1";
        int lastindex1;

        while(index >= 0){
            formattedString.append(ANSI_SOL11).append(s.substring(index, index + toSearch.length())).append(ANSI_RESET2);
            found = found + 1;


            lastindex = index+toSearch.length();
            lastindex1 = index+toSearch1.length();

            index = s.indexOf(toSearch,lastindex);
            
            if (index == -1) {
                formattedString.append(s.substring(lastindex));
            }else {
                formattedString.append(s.substring(lastindex, index));
            }
        }
        System.out.println(formattedString);
        index1 = index;
        
        if (found == "1") {

            System.out.println("\nla lettera: \""+toSearch+"\" e' stata trovata "+found+" volta");
        
            System.exit(0);
        } else {
            System.out.println("La parola: " + toSearch + " è stata trovata "+ found + " volte");
        }
        
        } while(index1 == 0);
        
        System.out.println("e");
        
in.close();
    }
}


