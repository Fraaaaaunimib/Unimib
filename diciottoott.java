import java.util.Scanner;

// import javax.lang.model.util.ElementScanner14;
public class diciottoott {
    

public static void main (String[]args) {
    // come controllare che il carattere sia una cifra
    Scanner tastiera = new Scanner(System.in);
    char carattere = tastiera.next().charAt(0);

    System.out.println("You've entered this character --> " + carattere);

    //controllare che il carattere sia una cifra
    if ((carattere == '0') || (carattere == '1') || (carattere == '2'))
    System.out.println("Looks like you've inserted a single number!");

    if ((carattere == '0') && (carattere == '9'))
        System.out.println("Damn");

        //come vedere il numero dopo
        carattere = (char) (carattere + 1);
        System.out.println("The next character is: " + carattere);



// provare se è vero e falso con int
    int n = tastiera.nextInt();

    if (n<0)
    System.out.println(n<0); // n minore di zero
    else if (n < 10)
        System.out.println("n<10"); // n >= 0 e n<10
        else if (n < 20)
            System.out.println("n<20"); // n minore di 20
            else
                System.out.println("Erano tutte false rip");    
                tastiera.close();
}

}
