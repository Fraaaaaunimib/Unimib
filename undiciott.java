import java.util.Scanner; //imports scanner library from java.util

public class undiciott {
    public static void main (String[] args)    {

        Scanner tastiera = new Scanner (System.in);
        

        int baseM;
        int basem;
        int altezzaT;

        baseM= tastiera.nextInt();
        basem = tastiera.nextInt();
        altezzaT = tastiera.nextInt();

        System.out.println("La base maggiore del trapezio è: " + baseM + ", la base minore è: " + basem + ", e l'altezza è: " + altezzaT);
        tastiera.close(); //closes the input after reading it
    }

}




