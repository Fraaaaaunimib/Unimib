import java.util.Scanner; //imports scanner object --> scans input from your keyboard
import java.lang.Math; //imports Mathematic functions
public class Calc{

    public static void main(String[]args) {
System.out.println("[°°°°°°Simple Calculator in Java°°°°°°] (10/10/2022)");

char operator;
        double number1, number2, result, resto;  //variables

        Scanner Input = new Scanner(System.in); //creates a new scanner object


        System.out.print("Enter here the first number: ");
            number1 = Input.nextDouble();

            System.out.print("Enter here which operation you want to make (+, -, *, /, q for sqrt, p for pow, a for average): ");
        operator = Input.next().charAt(0); //asks for an operator
       
        System.out.print("Enter here the second number: ");
            number2 = Input.nextDouble();

            switch (operator) {
                //performs addition between numbers
                case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

                //performs subtraction between numbers
                case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

                //performs multiplication between numbers
                case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

                //performs division between numbers
                case '/':
                result = number1 / number2;
                resto = number1 % number2;
                System.out.println(number1 + " / " + number2 + " = " + result + " with a rest of " + resto);
                break;

                //performs sqrt between numbers...?
                case 'q':
               Double resultsqrt1 = Math.sqrt(number1);
                 Double resultsqrt2 = Math.sqrt(number2);
                System.out.print("First sqrt value: " + resultsqrt1);
                System.out.print("Second sqrt value:" + resultsqrt2);
                break;

                //performs pow
                case 'p':
                double resultpow1 = Math.pow(number1, number2);
                System.out.println(number1 + " power of " +number2 + " = " +resultpow1);
                break;

                //does an average between the two numbers
                case 'a':
                double number3;
                
                System.out.print("Enter here the third number to do an average: ");
                number3 = Input.nextDouble();

                double resulta = (number1 + number2 + number3)/3;
                System.out.println("The average between the two numbers is: " + resulta);
                break;


            
            }

            System.out.println(" ");
            System.out.println("Thank you for having used such simple, basic and poorly functional calculator.");
            System.out.print("What you've been seeing is my testing projects for uni, which you can all check on my GitHub page at unimib.");
            System.out.println("You'll see me back in Visual Basic 6 because it is faaaar better than Java for me");

            Input.close(); // after reading user input, you need to close it
    }

}
