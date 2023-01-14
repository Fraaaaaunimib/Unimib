
import java.util.Scanner;
public class es_lab_ventinovenov {
    
    // esercizio 1: numeri in posizione positiva
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = true;
        String s;
        do {
        System.out.print("Inserisci una stringa di numeri: ");
        s = sc.nextLine();
        
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == '-' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) < '0' && s.charAt(i) > (9)) {
                System.out.println("Numero non valido, riprova di nuovo!");
                valid = false;
                break;
            } else {
                valid = true;
            }
        }
    } while (valid == false);
        System.out.println("La stringa che hai inserito è: " + s + " . Ora visualizzo solo gli elementi in posizione pari.");
        System.out.println(aggiornaStringa(s));

        sc.close();
    }

    public static String aggiornaStringa(String s){
        String s2 = "";

        
        for (int i = 0; i < s.length(); i++){

            if (s.charAt(i) == '0'){
                System.out.println("Trovato uno zero! Si finisce l'esecuzione.");
                System.out.println(s2);
                System.exit(0);
            }

            if (i%2 == 0){
                if (i == 0){
                i = 2;
                
                }
                s2 = s2 + s.charAt(i-1); 
            }

        }
        return s2;

        
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean valid = true;
        String start = """
                a) somma di due numeri interi
                b) divisione intera e resto tra due numeri interi
                c) media tra due numeri double
                d) valore assoluto di un numero intero
                e) lunghezza della stringa che rappresenta un numero intero
                t) termina il programma
                """;
do {
                System.out.println(start + "Seleziona un'opzione: ");
                String s = sc.next();

                switch (s.charAt(0)){
                    case 'a':
                    System.out.print("Scrivi il primo intero: ");
                    int x = sc.nextInt();

                    System.out.print("Ora scrivi il secondo: ");
                    int y = sc.nextInt();

                    System.out.println(metodi.sommaDueInteri(x,y));
                    valid = false;
                    break;

                    case 'b':
                    System.out.print("Scrivi il primo intero: ");
                    int x2 = sc.nextInt();
                    System.out.print("Scrivi ora il secondo:");
                    int y2 = sc.nextInt();
                    System.out.println(metodi.divisioneIntera(x2,y2));
                    valid = false;
                    break;

                    case 'c':
                    System.out.print("Scrivi il primo double: ");
                    double x3 = sc.nextDouble();
                    System.out.print("Scrivi ora il secondo:");
                    double y3 = sc.nextDouble();
                    System.out.println(metodi.mediaTraDueDouble(x3,y3));
                    valid = false;
                    break;

                    case 'd':
                    System.out.print("Scrivi un intero:");
                    int x4 = sc.nextInt();
                    System.out.println(metodi.valoreAssolutoIntero(x4));
                    valid = false;
                    break;

                    case 'e':
                    System.out.print("Scrivi un intero, ti dico quanto è lungo:");
                    String s1 = sc.next();
                    boolean valid2 = true;
                    do {
                        for (int i = 0; i < s1.length();i++){
                            if (s1.charAt(i) < '0' && s1.charAt(i) > '9'){
                                valid = false;
                            }
                        }

                        if (valid2 == false)
                        System.out.println("Male, male, male.... riprova.");
                    } while (valid == false);
                    metodi.lunghezzaStringaIntero(s1);
                    System.out.println(metodi.lunghezzaStringaIntero(s1));
                    valid = false;
                    break;

                    case 't':
                    System.out.println("Buh bye!");
                    System.exit(0);
                    valid = true;
                    }
                } while (valid == false);
                }

                */

                //esercizio 3: stringa + quante volte ha trovato qualcosa
                /*
                public static void main (String[]args){
                    Scanner sc = new Scanner(System.in);
                    boolean valid = true;
                    boolean validString = true;
                    int a3 = 0;
                    char e = ' ';
                    String s2 = " ";
                    do {
                    System.out.print("Scrivi una stringa: ");
                    String s = sc.nextLine();

                    System.out.print("Che carattere vuoi cercare?");
                    String a = sc.next();
                    if (a.length() > 1){
                        System.out.print("Devi metterci un carattere, non una frase!");
                        valid = false;
                    }
                    char a2 = a.charAt(0);

                    metodi.cercaCarattere(a, validString,a2, a3);

                    System.out.println("La nuova stringa senza il carattere " + a2 + " è: " + metodi.rimuoviCarattere(s,s2,a2));
                } while (valid == false);

                }
                */

                public static void main(String[]args){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter here a number to be converted into binary: ");
                    int a = sc.nextInt();
String binary = "";
                    System.out.println("Your number converted to binary is: " + metodi.convDecinBin(a,binary));
                }
                


    }
    


