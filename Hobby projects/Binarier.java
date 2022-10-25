import java.util.Scanner;
public class Binarier {
    public static void main (String[]Args){
        Scanner input = new Scanner(System.in);
        // esercizio 5
        int numero; 

        final String ANSI_BOLD = "\u001B[1m"; // makes text afterwards bold
            final String ANSI_BOLD_END = "\u001B[0m"; // makes the text return to its normal state
            final String ANSI_ORANGE1 = "\u001B[38;2;207;188;0m";
            final String ANSI_RESET = "\033[49m";
            final String ANSI_RESET2 = "\033[39m";
            final String ANSI_SOL1 = "\u001B[48;2;0;43;54m";
            final String ANSI_RED = "\u001B[38;2;220;58;47m";
            final String ANSI_SOL11 = "\u001B[38;2;253;246;227m";
            final String ANSI_SOL2 = "\u001B[38;2;131;148;150m";

        String start = """
            ╔════════════════════════════════════════════╗
            ║                                            ║
            ║ Binarier                                   ║
            ║ ┬┬┬┬┬┬┬┬ Transform any number into binary  ║
            ║                                            ║
            ╚════════════════════════════════════════════╝
                """;

        System.out.println(ANSI_SOL1 + ANSI_SOL11 + start + ANSI_RESET + ANSI_RESET2);
        System.out.println("This has been a one heck of an exercise.");
        System.out.print("Enter now a number between 0 and 127 --> " + ANSI_BOLD + ANSI_ORANGE1);
        numero = input.nextByte();
        System.out.print(ANSI_BOLD_END + ANSI_RESET + ANSI_RESET2);
        
        int quoziente = (int)numero;
        int resto;
       String risultato = "";
  quoziente = numero/2;
  
                    resto = quoziente%2;
        if (numero < 0 | numero > 127) {
            System.out.println(ANSI_RED + "This does not work sadly." + ANSI_RESET + ANSI_RESET2);
            System.exit(0);
            } else {
                quoziente = numero / 2;
                resto = quoziente%2;
                
                // carattere 1
                String risultatoparte1 = "0";
                String risultatoparte2 = "0";
                String risultatoparte3 = "0";
                String risultatoparte4 = "0";
                String risultatoparte5 = "0";
                String risultatoparte6 = "0";
                String risultatoparte7 = "0";

                if (resto == 0) {
                    quoziente = numero/2;
                    resto = numero%2;
                    risultatoparte1 = "0";
                } else if (resto == 1) {
                    quoziente = numero/2;
                    resto = numero%2;
                    risultatoparte1 = "1";
                }

                
                if (resto == 0) {
                    quoziente = quoziente/2;
                resto = quoziente%2;
                    risultatoparte2 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                resto = quoziente%2;
                    risultatoparte2 = "1";
                }

                if (resto == 0) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte3 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte3 = "1";
                }

                if (resto == 0) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte4 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte4 = "1";
                }

                if (resto == 0) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte5 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte5 = "1";
                }

                if (resto == 0) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte6 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte6 = "1";
                }

                if (resto == 0) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte7 = "0";
                } else if (resto == 1) {
                    quoziente = quoziente/2;
                    resto = quoziente%2;
                    risultatoparte7 = "1";
                }


                String risultato1 = risultato.concat(risultatoparte7);
                String risultato2 = risultato1.concat(risultatoparte6);
                String risultato3 = risultato2.concat(risultatoparte5);
                String risultato4 = risultato3.concat(risultatoparte4);
                String risultato5 = risultato4.concat(risultatoparte3);
                String risultato6 = risultato5.concat(risultatoparte1);
                String risultato7 = risultato6.concat(risultatoparte2); // non capisco perché invertire l'uno con il due qua

                System.out.println("The results are in! Your decimal number transformed into binary is...");

                String end = """
                    ╔════════════════════════════════════════════╗
                        """;

                        String end2 = """
                    ╚════════════════════════════════════════════╝ 
                                """;

                        System.out.println(ANSI_SOL1 + ANSI_SOL11 + end + "║  " + ANSI_SOL2 + risultato7 + ANSI_SOL1 + ANSI_SOL11 + "                                   ║" + "\n" + end2 + ANSI_RESET + ANSI_RESET2);
                        System.out.print(ANSI_RESET + ANSI_RESET2);
                input.close();

                }
    }
    
}
