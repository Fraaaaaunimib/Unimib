package CompitinoII;
import java.util.Scanner;

public class venticinquenov{

    /*

    public static double square(double x) {
        double ris = x*x;
        return ris;
    }

    public static double squareDiff(double x, double y) {
        double val1 = square(x);
        double val2 = square(y);
        return (val1-val2);
}

public static void main (String[]args ){
    Scanner tastiera = new Scanner(System.in);
    int i;
    double ris;
    for (i=5;i>0;i--){
        ris = squareDiff(i,i-1);
        squareDiff(i, i+1);
        System.out.println(ris + " ");
        //stampa la differenza al quadrato di un numero e di quello prima

        
    }
    System.out.println();
    tastiera.close();
    */

    /*
     * convertire temperature da Fahrenheit a Celsius e da C a F
     * continuare a convertire temperature fino a quando decide di uscire con un menu a tre scelte
     * tre metodi:
     * - convFtoC
     * convCtoF
     * scelta
     * 
     * -formule di conversione:
     * C = (F - 32) / 1.8
     * F = C * 1.8 +32
     */

     public static String caseC(){
        double temperatura;
        String e = "";
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Converting Celsius to Fahrenheit");
        System.out.print("You may enter a Celsius temperature, thou shall may be converted into the unholy Fahrenheit. --> ");
        temperatura = tastiera.nextDouble();

        System.out.println("We have an unholy result, sir --> " + venticinquenov.convCtoF(temperatura) + "°F");
        tastiera.close();
        return e;
        
     }

     public static String caseF(){
        double temperatura;
        String e = "";
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Converting Fahrenheit to Celsius");
        System.out.print("You may enter a Fahrenheit temperature, thou shall may be converted into the holy Celsius. --> ");
        temperatura = tastiera.nextDouble();

        System.out.println("We have a result, sir --> " + convFtoC(temperatura) + "°C");
        tastiera.close();
        return e;
     }

     public static String scelta(){

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Thou may select if you want to convert C to F, F to C, or straight up exit.");
        System.out.println("(F) Fahrenheit --> Celsius");
        System.out.println("(C) Celsius --> Fahrenheit");
        System.out.println("(E) Exit");
        String scelta = "";
        scelta = tastiera.next();

        switch (scelta){
            case "C":
                System.out.println(caseC());
                break;

            case "F":
                System.out.println(caseF());
                break;

            case "E":
                System.out.println("Exit");
                System.exit(0);
                break;

            default:
            while (scelta != "E" || scelta != "C" || scelta != "F") {
                System.out.println("Invalid Input, may you try onceforth?");
                scelta = tastiera.next();
            }
                break;
        }

        tastiera.close();
        return "a";
     }
     
     public static double convCtoF(double cel){
        return (cel *1.8 + 32);
     }

     public static double convFtoC(double far){
        return (far-32)/1.8;
     }
     public static void main (String[] args){
        Scanner tastiera = new Scanner(System.in);
        String selezione;

        do {
            selezione = venticinquenov.scelta();
        } while (selezione.equals("C") || selezione.equals("F"));

        tastiera.close();
     }
    }

    
