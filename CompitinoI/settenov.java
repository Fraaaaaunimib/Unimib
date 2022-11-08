package CompitinoI;
import java.util.Scanner;
public class settenov {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String s = sc.next();

        int indice = 0;

        while (indice < s.length()){
            System.out.println(s.charAt(indice) + " ");
            indice++;
        }

        System.out.print("Thou may shall enter a string: ");
        String a = sc.next();
        String abutlowercase;

        System.out.print("Thou shall answer if they want the Y to be a vowel or not: ");
        String b = sc.next();
        boolean vowely;
        int vowel = 0;
        int contatore = 0;
        if (b.equals("yes")){
            vowely = true;
        }

        if (b.equals("no"))
        vowely = false;

        do {

            abutlowercase = a.toLowerCase();

            if (abutlowercase.charAt(indice) == 'a' || abutlowercase.charAt(indice) == 'e' || abutlowercase.charAt(indice) == 'i' || abutlowercase.charAt(indice) == 'o' || abutlowercase.charAt(indice) == 'u'){
                vowel++;
            }
            contatore++;

            
        } while (contatore >= 0 && contatore < a.length() -1);
        
        if (vowel == 1)
        System.out.print("You have only one vowel.");

        if (vowel > 1)
        System.out.println("You have more than one vowel");
        sc.close();
    }
}
