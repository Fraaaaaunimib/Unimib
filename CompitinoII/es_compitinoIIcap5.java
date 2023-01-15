import java.util.Scanner;
public class es_compitinoIIcap5{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        boolean Finished = false;

        while (Finished == false){

            System.out.println("Scegli quale categoria: [1: metodi, 2: array, 3: ricorsione] ");
            int sceltaCategoria = sc.nextInt();
            if (sceltaCategoria == 1){
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
        System.out.print("Scrivi un numero, vediamo se è primo: ");
        a = sc.nextInt();
        boolean primo = primo(a);
        if (primo == true)
            System.out.println("Il numero " + a + " è primo!");
        else if (primo == false)
            System.out.println("Il numero " + a + " non è primo.");
            System.out.println("Il divisore più piccolo di questo numero è " + divisore(a) + ".");
        break;

        case 9:
        System.out.print("Scrivi una frase: ");
        nome = sc.next();
        System.out.print("Che carattere vuoi cercare all'interno di questa frase? ");
        car = sc.next();
        car1 = car.charAt(0);
        System.out.println("La lettera " + car1 + " si ripete " + conta(nome, car1) + " volte nella frase " + nome);

        System.out.print("Alternativamente, dimmi a che posizione si trova la lettera che vuoi cercare: ");
        a = sc.nextInt();
        System.out.println("La lettera " + nome.charAt(a) + ", alla posizione " + a + " della frase " + nome + " è stata trovata " + contaAlt(nome, a) + " volte.");
        break;

        case 10:
        boolean isCase10Finished = false;
        String piuLunga = "";
        while (isCase10Finished == false){
            
            System.out.print("Inserisci una frase: ");
            nome = sc.next();
            if (nome.equals("fine") || nome.equals("fine\n")){
                isCase10Finished = true;
            }
            if (contaVocali(nome) > 5){
                System.out.println("Questa parola ha più di 5 vocali!");
                if (nome.length() > piuLunga.length()){
                    piuLunga = nome;
                }
            
            
            }
            
        }
        System.out.println("La parola più lunga che è stata scritta è stata: " + piuLunga);
        break;

        case 11:
        a = 0;
        System.out.print("Inserisci una parola: ");
        nome = sc.next();

        boolean outOfIndex = false;
        while (outOfIndex == false){
        System.out.print("Inserisci da che punto vuoi che le lettere siano invertite: ");
        a = sc.nextInt();

        if (a > nome.length()){
            System.out.println("Errore - out of bounds exception. Riprova.");
            outOfIndex = false;
        } else {
            outOfIndex = true;
        }
        }
        String invertita = "";
        invertita = inverti(nome,a);
        
        System.out.println("La tua parola " + nome + " è stata invertita in: " + (nome.substring(0, a-1)).concat(invertita));
        break;

        case 12:
        boolean isCase12Finished = false;
        while (isCase12Finished == false){
        System.out.print("Scrivi una parola: ");
        nome =sc.next();
        System.out.print("Da quale posizione deve iniziare a shiftare i caratteri? ");
        a = sc.nextInt();

        String shiftata = shift(nome,a);
        System.out.println("La parola " + nome + ", shiftata, è: " + shift(nome,a));

        if(shiftata.charAt(0) == 'a' && shiftata.charAt(shiftata.length()-1) == 'a'){
            System.out.println("La parola shiftata inizia e termina con la lettera a.");
        }
        }
        break;

        case 13:
        System.out.print("Scrivi una frase: ");
        nome = sc.next();
        System.out.print("Ora scrivi un'altra frase: ");
        car = sc.next();

        System.out.println("Ho trovato il primo carattere uguale, che è " + "" + cercaCarattere(nome,car));
        break;

        case 14:
        System.out.print("Scrivi un numero per la base del rettangolo: ");
        a = sc.nextInt();
        System.out.print("Adesso scrivi un numero per l'altezza: ");
        b = sc.nextInt();
        System.out.println("L'area del rettangolo che hai scelto è " + areaRettangolo(a,b));

        System.out.print("Adesso scrivi un lato del quadrato: ");
        a = sc.nextInt();
        System.out.println("L'area del quadrato che hai scelto è " + areaQuadrato(a));
        break;

        case 0:
        System.exit(0);
        Finished = true;
        break;

        default:
        System.exit(0);
        break;
        }
            
    }

    if (sceltaCategoria == 2){
        System.out.print("Scrivi quale esercizio vuoi provare: ");
        int sceltaEsercizi = sc.nextInt();

        switch (sceltaEsercizi){
            case 1:
            int totale = 0;
            int media = 0;
            int[] temperature = new int[10];

            for (int i = 0; i < temperature.length;i++){
                System.out.print("Scrivi quali temperature vuoi: ");
                temperature[i] = sc.nextInt();
                // media
                totale = totale + temperature[i];
            }
            
            //media
            media = totale/temperature.length;
            System.out.println("La media tra le temperature è " + media + ".");
            for (int i = 0; i < temperature.length; i++){
                if (temperature[i] < media){
                    System.out.println("Nel giorno " + i + " la temperatura di " + temperature[i] + " è minore della media, che è di " + media);
                }
            }
            break;

            case 2: 
            System.out.print("Quante famiglie ci sono? ");
            int a = sc.nextInt();
            int massimo = 0;
            int[] reddito = new int[a];
            for (int i = 0; i < reddito.length; i++){
                System.out.print("Che reddito ha la famiglia? ");
                reddito[i] = sc.nextInt();

                if (reddito[i] > massimo){
                    massimo = reddito[i];
                }
            }

            int redditoInferiore10 = massimo - (massimo*(10/100));
            int contatoreredditoInf10 = 0;
            for (int i = 0; i < reddito.length; i++){
                if (reddito[i] < redditoInferiore10){
                    contatoreredditoInf10++;
                }
            }

            System.out.println("Ci sono " + contatoreredditoInf10 + " famiglie che hanno un reddito sotto il 90% del massimo, che è " + massimo);
            break;

            case 3:
            String[] fiori = new String[5];
            //fiori
            fiori[0] = "Petunie";
            fiori[1] = "Viole del pensiero";
            fiori[2] = "Rose";
            fiori[3] = "Violette";
            fiori[4] = "Garofani";

            String[] fioriSingle = new String[5];
            fioriSingle[0] = "petunia";
            fioriSingle[1] = "viola del pensiero";
            fioriSingle[2] = "rosa";
            fioriSingle[3] = "violetta";
            fioriSingle[4] = "garofano";

            double[] fioriPrezzo = new double[5];
            fioriPrezzo[0] = 0.50;
            fioriPrezzo[1] = 0.75;
            fioriPrezzo[2] = 1.50;
            fioriPrezzo[3]= 0.50;
            fioriPrezzo[4] = 0.80;

            System.out.print("Quale fiore vuoi? (Scrivi con la prima lettera maiuscola) ");
            for (int i = 0; i < fiori.length-1; i++){
                System.out.print(fiori[i] + ", ");
            }
            System.out.print(fiori[4] + " - ");
            String fioriScelta = sc.next();
            int fioriSceltato = 0;
            for (int i = 0; i < fiori.length; i++){
                if (fioriScelta == fiori[i]){
                    fioriSceltato = i;
                    break;
                }
            }

            System.out.print("Quanti fiori vuoi? ");
            int quantita = 0;
            totale = 0;
            quantita = sc.nextInt();

            if (quantita == 1)
            System.out.println(quantita + " " + fioriSingle[fioriSceltato] + " costa " + fioriPrezzo[fioriSceltato]*quantita + " €.");
            else
            System.out.println(quantita + " " + fioriScelta.toLowerCase() + " costano " + fioriPrezzo[fioriSceltato]*quantita + " €.");

            break;
            case 0:
            System.exit(0);
            break;

            default:
            System.exit(0);
            break;
        }
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

    public static boolean primo(int a){
boolean finished = false;
boolean isPrimo = false;
        for (int i = 1; i <= a; i++){
            if (i != 1 &&  i != a && a % i != 0){
            isPrimo = true;
            finished = true;
        } else if (a % i == 0 && i != 1 && i !=a) {
            isPrimo = false;
            break;
        } 
    }

        return isPrimo;
        
}

public static int divisore(int a){
    int divisore = 0;
    for (int i = 2; i <= a; i++){
        if (a%i == 0){
            divisore = i;
            break;
        }
    }
    return divisore;
}

public static int conta(String Stringa, char Chara){
int conta = 0;
    for (int i = 0; i<Stringa.length();i++){
        if (Stringa.charAt(i) == Chara) {
            conta++;
        }
    }
return conta;
}

public static int contaAlt(String stringa, int posizione){
    int conta = 0;
    for (int i = 0; i < stringa.length(); i++){
        if (stringa.charAt(i) == stringa.charAt(posizione)){
            conta++;
        }
    }
    return conta;
}

public static String inverti(String daInvertire, int n){
    String invertita1 = "";
    if (n > daInvertire.length()){
      invertita1 = "errore";
      System.exit(0);
     return invertita1;

    }
    
    System.out.print(daInvertire.length());
    for (int i = daInvertire.length()-1; i > n-1;i--){
        invertita1 = invertita1 + daInvertire.charAt(i);
    }
    return invertita1;
}

public static String shift (String daShiftare, int n){
    String shiftata = "";

    for (int i = n; i < daShiftare.length();i++){
        shiftata = shiftata + daShiftare.charAt(i);
    }

    for (int i = 0; i < n; i++){
        shiftata = shiftata + daShiftare.charAt(i);
    }

    return shiftata;
}

public static char cercaCarattere(String stringa, String stringa2){
    boolean isFound = false;
    char Found = ' ';
   int length= 0;
    if (stringa.length() > stringa2.length()){
    length = stringa.length();
    for (int i = 0; i < length; i++){
        for (int a = 0; a < stringa2.length(); a++){
            if (stringa.charAt(i) == stringa2.charAt(a)){
                isFound = true;
                Found = stringa.charAt(i);
               break;
            }
        }
    }
    } else if (stringa.length() < stringa2.length()) {
    length = stringa2.length();
    for (int i = 0; i < length; i++){
        for (int a = 0; a < stringa.length(); a++){
            if (stringa.charAt(a) == stringa2.charAt(i)){
                isFound = true;
                Found = stringa2.charAt(a);

                if (isFound == true){
                    System.out.println("Trovato un carattere! E' " + stringa.charAt(a));
                    System.exit(0);
                }
                break;
            }
        }
    }
    } else if (stringa.length() == stringa2.length()) {
    length = stringa.length();
    for (int i = 0; i < length; i++){
        for (int a = 0; a < stringa2.length(); a++){
            if (stringa.charAt(i) == stringa2.charAt(a)){
                isFound = true;
                Found = stringa.charAt(i);
                break;
                
            }
        }
    }
    }

    
    return Found;
}

public static int areaRettangolo(int base, int altezza){
    int area = 0;
    area = base*altezza;
    return area;
}

public static int areaQuadrato(int lato){
    int area = 0;
    area = areaRettangolo(lato,lato);
    return area;
}
}
