import java.util.Scanner;
public class es_compitinoIIcap5{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        boolean Finished = false;

        while (Finished == false){
        System.out.print("[ Seleziona quale esercizio vuoi provare:] ");
        int sceltaEsercizio = sc.nextInt();

        switch (sceltaEsercizio){

        //esercizio 1
        case 1:
        System.out.print("Scrivi il primo numero: ");
        int a = sc.nextInt();

        System.out.print("Ora il secondo: ");
        int b = sc.nextInt();

        confronta(a,b);
        break;

        //esercizio 2
        case 2:
        System.out.print("Scrivi il tuo nome: ");
        String nome = sc.next();

        System.out.print("Quante volte vuoi che lo ripeta? ");
        a = sc.nextInt();
        saluta(a, nome);
        break;

        case 3:
        System.out.print("Scrivi un intero: ");
        a = sc.nextInt();
        System.out.print("Scrivine un'altro: ");
        b = sc.nextInt();

        if (divisibile(a,b) == true){
            System.out.println("Il numero " + a + " è divisibile per " + b);
        } else {
            System.out.println("Il numero " + a + " NON è divisibile per " + b);
        }
        break;

        case 4:
        System.out.print("Scrivi un minimo: ");
        a = sc.nextInt();
        System.out.print("Scrivi un massimo: ");
        b = sc.nextInt();
        System.out.print("Quale valore vuoi ricercare all'interno dell'intervallo tra " + a + " e " + b + "? ");
        int c = sc.nextInt();
        if (valoreInternoIntervallo(a,b,c) == true){
            System.out.println("Il valore " + c + " è contenuto all'interno dell'intervallo tra " + a + " e " + b);
        } else {
            System.out.println("Il valore " + c + " non è contenuto all'interno dell'intervallo tra" + a + " e " + b);
        }
        break;

        case 5:
        System.out.print("Scrivi una frase: ");
        nome = sc.next();
        if (contaVocali(nome) == 1) {
            System.out.println("C'è una vocale nella frase " + nome);
        } else
        System.out.println("Ci sono " + contaVocali(nome) + " vocali nella frase " + nome);
        break;

        case 6:
        System.out.print("Scrivi una frase: ");
        nome = sc.next();

        System.out.print("Scrivi il carattere che vuoi cercare: ");
        String car = sc.next();

        char car1 = car.charAt(0);

        if (trova(nome, car1) == true){
            System.out.println("Yay! Il carattere " + car1 + " è stato trovato in " + nome);
        } else {
            System.out.println("Nope, non è stato trovato niente.");
        }

        break;

        case 7:
        System.out.print("Scrivi un numero, questi tre numeri verranno ordinati in ordine crescente: ");
        a = sc.nextInt();
        System.out.print("Scrivi un'altro numero: ");
        b = sc.nextInt();
        System.out.print("Scrivi ancora un'altro numero: ");
        c = sc.nextInt();

        ordinaEStampa(a,b,c);
        break;

        case 8:
        break;
        case 0:
        System.exit(0);
        Finished = true;
        }
    }
        sc.close();
    }

    //Esercizio 1
    public static void confronta(int a, int b){
        if (a>b){
            System.out.println("Il primo è maggiore del secondo");
            System.out.println(a-b);
        } else {
            System.out.println("Il secondo è maggiore del primo");
            System.out.println(b-a);
    
        }
    }

    public static void saluta(int a, String nome){
        int contatore = 0;
        for (contatore = 0; contatore < a; contatore++){
            System.out.println("Ciao " + nome);
        }
    }

    public static boolean divisibile (int a, int b){
        if (a%b == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean valoreInternoIntervallo(int min, int max, int valore){
        if (valore >= min && valore <= max){
            return true;
        } else {
            return false; 
        }
    }

    public static int contaVocali(String stringa){
        int vocali = 0;

        stringa = stringa.toLowerCase();
        for (int i = 0; i < stringa.length(); i++){
            if (stringa.charAt(i) == 'a' || stringa.charAt(i) == 'e' || stringa.charAt(i) == 'i' || stringa.charAt(i) == 'o' || stringa.charAt(i) == 'u'){
                vocali++;
            }
        }
        return vocali;
    }

    public static boolean trova(String stringa, char car){
        boolean found = false;
        for (int i = 0; i<stringa.length();i++){
            if (stringa.charAt(i) == car){
                found = true;
            } else {
                found = false;
            }
        }
        return found;
    }

    public static void ordinaEStampa(int a, int b, int c){
        int f = 0, d = 0, e = 0;

        if (a < b && a < c){
            d = a;
            System.out.print("a < b && a < c ");
        }
    if (a > b && a < c){
            e = a;
            System.out.print("a > b && a < c ");
        } 
        if (a > b && a > c){
            f = a;
            System.out.print("a > b && a > c ");
        }
        if (b < a && b < c){
            d = b;
            System.out.print("b < a && b < c ");
        }
        if (b > a && b < c){
            e = b;
            System.out.print("b > a && b < c ");
        }
        if (b > a && b > c){
            f = b;
            System.out.print("b > a && b > c ");
        }
        if (c < a && c < b){
            d = c;
            System.out.print("c < a && c < b ");
        }
        if (c > a && c < b){
            e = c;
            System.out.print("c > a && c < b ");
        }
        if (c > a && c > b){
            f = c;
            System.out.print("c > a && c < b ");
        }

        boolean IsEqual = false;
        if (a == b || a == c || b == a || b == c || c == a || c == b){
            System.out.println("Non ci devono essere numeri uguali!");
            IsEqual = true;
        }

       if (e == 0){
        if (b > a && b < c)
        e = b;
    }

        if (IsEqual == false)
        System.out.println("Ordine: " + " 1." + d + " 2." + e + " 3." + f);
    }

    public static boolean primo(int a, int b)
}