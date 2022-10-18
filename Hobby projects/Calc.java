import java.util.Scanner; //imports scanner object --> scans input from your keyboard
import java.lang.Math; //imports Mathematic functions
public class Calc{

// yoinked code, ty :)
static double eval(final String str) {
    return new Object() {
        int pos = -1, ch;
        
        void nextChar() {
            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
        }
        
        boolean eat(int charToEat) {
            while (ch == ' ') nextChar();
            if (ch == charToEat) {
                nextChar();
                return true;
            }
            return false;
        }
        
        double parse() {
            nextChar();
            double x = parseExpression();
            if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
            return x;
        }
        
        // Grammar:
        // expression = term | expression `+` term | expression `-` term
        // term = factor | term `*` factor | term `/` factor
        // factor = `+` factor | `-` factor | `(` expression `)` | number
        //        | functionName `(` expression `)` | functionName factor
        //        | factor `^` factor
        
        double parseExpression() {
            double x = parseTerm();
            for (;;) {
                if      (eat('+')) x += parseTerm(); // addition
                else if (eat('-')) x -= parseTerm(); // subtraction
                else return x;
            }
        }
        
        double parseTerm() {
            double x = parseFactor();
            for (;;) {
                if      (eat('*')) x *= parseFactor(); // multiplication
                else if (eat('/')) x /= parseFactor(); // division
                else return x;
            }
        }
        
        double parseFactor() {
            if (eat('+')) return +parseFactor(); // unary plus
            if (eat('-')) return -parseFactor(); // unary minus
            
            double x;
            int startPos = this.pos;
            if (eat('(')) { // parentheses
                x = parseExpression();
                if (!eat(')')) throw new RuntimeException("Missing ')'");
            } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                x = Double.parseDouble(str.substring(startPos, this.pos));
            } else if (ch >= 'a' && ch <= 'z') { // functions
                while (ch >= 'a' && ch <= 'z') nextChar();
                String func = str.substring(startPos, this.pos);
                if (eat('(')) {
                    x = parseExpression();
                    if (!eat(')')) throw new RuntimeException("Missing ')' after argument to " + func);
                } else {
                    x = parseFactor();
                }
                if (func.equals("sqrt")) x = Math.sqrt(x);
                else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                else throw new RuntimeException("Unknown function: " + func);
            } else {
                throw new RuntimeException("Unexpected: " + (char)ch);
            }
            
            if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
            
            return x;
        }
    }.parse();}
    public static void main(String[]args) {


        final String ANSI_BOLD = "\u001B[1m"; // makes text afterwards bold

        final String ANSI_BOLD_END = "\u001B[0m"; // makes the text return to its normal state
        final String ANSI_ORANGE1 = "\u001B[38;2;255;127;80m";
        final String ANSI_RESET2 = "\033[39m";

        String start = """
            ╔════════════════════════════════════════════════════════════════════════════════════════════════════╗                        
            ║  This is a calculator.                                                                             ║
            ╚════════════════════════════════════════════════════════════════════════════════════════════════════╝
              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             
              @@@                           @@@             
              @@@                           @@@             
              @@@                           @@@             
              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@            This is a calculator 
              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@            A calculator calculates math stuff
              @@@@@     @@@@     @@@@     @@@@@            Math stuff is not fun
              @@@@@     *@@@     #@@      @@@@@            That's why there's a calculator for you
              @@@@@@@@@@@@@%@&@@@&@@@@@@@@@&@@@            You should try the calculator
              @@@@@@@@&@&@&@@&@&@@&@&%@@@@@@&@&            It's very fun to try the calculator 
              @@@@@     (@@@     &@@      @@@@@            It'll change your life trying the calculator
              @@@@@     @@@@     @@@@     @@@@@            This is the calculator. 
              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             
              @@@@@@   .@@@@&   *@@@@    @@@@@@             
              @@@@@      @@@      @@      @@@@@             
              @@@@@@   @@@@@@   @@@@@@  .@@@@@@             
              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             
                                                            
                                                            
                """;
    
                // box drawing characters
                /*
     ─	━	│	┃	┄	┅	┆	┇	┈	┉	┊	┋	┌	┍	┎	┏
    ┐	┑	┒	┓	└	┕	┖	┗	┘	┙	┚	┛	├	┝	┞	┟
	┠	┡	┢	┣	┤	┥	┦	┧	┨	┩	┪	┫	┬	┭	┮	┯
	┰	┱	┲	┳	┴	┵	┶	┷	┸	┹	┺	┻	┼	┽	┾	┿
	╀	╁	╂	╃	╄	╅	╆	╇	╈	╉	╊	╋	╌	╍	╎	╏
	═	║	╒	╓	╔	╕	╖	╗	╘	╙	╚	╛	╜	╝	╞	╟
	╠	╡	╢	╣	╤	╥	╦	╧	╨	╩	╪	╫	╬	╭	╮	╯
	╰	╱	╲	╳	╴	╵	╶	╷	╸	╹	╺	╻	╼	╽	╾	╿
                 */


char operator;
        double number1, number2, result, resto;  //variables

        Scanner Input = new Scanner(System.in); //creates a new scanner object

System.out.println(start);
        System.out.print("┇ Enter here the first number. ┇   ┠──> ");
            number1 = Input.nextDouble();

            System.out.print("┇ Enter here which operation you want to make. ┇ [+, -, *, /, q for sqrt, p for pow, a for average, w for expression typing]   ┠──> ");
        operator = Input.next().charAt(0); //asks for an operator
       

            switch (operator) {
                //performs addition between numbers
                case '+':
                System.out.print("┇ Enter here the second number. ┇    ┠──> ");
                number2 = Input.nextDouble();
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

                //performs subtraction between numbers
                case '-':
                System.out.print("┇ Enter here the second number. ┇    ┠──> ");
                number2 = Input.nextDouble();
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

                //performs multiplication between numbers
                case '*':
                System.out.print("┇ Enter here the second number. ┇    ┠──> ");
                number2 = Input.nextDouble();
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

                //performs division between numbers
                case '/':
                System.out.print("┇ Enter here the second number. ┇    ┠──> ");
                number2 = Input.nextDouble();
                result = number1 / number2;
                resto = number1 % number2;
                System.out.println("┇ " + number1 + " / " + number2 + " = " + result + " with a rest of " + resto + " ┇");
                break;

                //performs sqrt between numbers...?
                case 'q':
               Double resultsqrt1 = Math.sqrt(number1);
                System.out.print("┇ First sqrt value. ┇    ┠──> " + resultsqrt1);

                break;

                //performs pow
                case 'p':
                System.out.print("┇ Enter here the second number. ┇    ┠──> ");
                number2 = Input.nextDouble();
                double resultpow1 = Math.pow(number1, number2);
                System.out.println("┇ " + number1 + " power of " +number2 + " = " +resultpow1 + " ┇");
                break;

                //does an average between the two numbers
                case 'a':
                System.out.print("┇ Enter here the second number. ┇    ┠──> ");
                number2 = Input.nextDouble();
                double number3;
                
                System.out.print("┇ Enter here the third number to do an average. ┇    ┠──> ");
                number3 = Input.nextDouble();

                double resulta = (number1 + number2 + number3)/3;
                System.out.println("┇ The average between the two numbers is: " + resulta + " ┇");
                break;

                case 'w':
                System.out.print("┇ Enter here a mathematical expression as you would on any other mathematician program. ┇    ┠──> ");
                System.out.println("┇ Here is the result: ┇ " +eval(Input.next()));
break;
            
            }

            System.out.println(" ");

            String end = """
                    ╔════════════════════════════════════════════════════════════════════════════════════╗                        
                    ║  We've reached the end.                                                        ┣X┨ ║
                    ╚════════════════════════════════════════════════════════════════════════════════════╝    
                   """;
                           
                           
                    String end2 = """
                     ║  This is the end of the calculator, one of the first things I've done in university║ 
                     ║  I've yoinked some code here and there, but not that much, you can clearly see what║
                     ║  is yoinked and what's not.                                                        ║
                     ╚════════════════════════════════════════════════════════════════════════════════════╝
                    """;
                    
                    System.out.print( ANSI_BOLD + end + ANSI_BOLD_END);
                    System.out.print( ANSI_ORANGE1 +end2 + ANSI_RESET2);

            Input.close(); // after reading user input, you need to close it


System.out.println("[°°°°°°Simple Calculator in Java°°°°°°] (10/10/2022)"); 


            // try error handler
            
            }
                }
            
            
    


