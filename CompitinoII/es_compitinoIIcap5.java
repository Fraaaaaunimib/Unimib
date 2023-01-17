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

            case 4:
            int[] FrequenzaCarattere = new int[10];
            System.out.print("Scrivi un numero di telefono: ");
            int nome = sc.nextInt();
            String nome2 = "" + nome;

            for (int i = 0; i < nome2.length(); i++){
                char nomeChar = nome2.charAt(i);
                int value = Character.getNumericValue(nomeChar);

                FrequenzaCarattere[value]++;
            }

            for (int i = 0; i < FrequenzaCarattere.length;i++){
                if (FrequenzaCarattere[i] != 0 && FrequenzaCarattere[i] != 1)
                System.out.println("Ci sono " + FrequenzaCarattere[i] + " numeri, uguali a " + i + ".");
                else if (FrequenzaCarattere[i] == 1)
                System.out.println("C'è una occorrenza di " + i + ".");
            }
            break;

            case 5:
            int dimensioneArray = 1;
            boolean isCase5Finished = false;
            System.out.print("Quanti numeri vuoi scrivere? ");
            a = sc.nextInt();
            int[] StrettamenteCrescente = new int[a];
            int[] arrayCase5 = new int[a];
            for (int i = 0; i < arrayCase5.length;i++){
                System.out.print("Inserisci un valore nella posizione " + i + " dell'array.");
                StrettamenteCrescente[i] = sc.nextInt();
            }
            System.out.print("L'array ha i seguenti valori: ");
            for (int i = 0; i<arrayCase5.length-1;i++){
                System.out.print(" " + StrettamenteCrescente[i] + ", ");
            }
            System.out.println(", " + StrettamenteCrescente[arrayCase5.length-1]);
            
            if (strettamenteCrescente(StrettamenteCrescente) == true){
                System.out.println("Tutti i numeri sono in ordine!");
            } else if (strettamenteCrescente(StrettamenteCrescente) == false){
                System.out.println("Nope, non tutti i numeri sono in ordine.");
            }
            break;

            case 6:
            System.out.print("Scrivi una frase, verranno verificate dopo le lettere duplicate: ");
            nome2 = sc.next();
            char[] nome2Char = new char[nome2.length()];
            for (int i = 0; i < nome2.length(); i++){
                nome2Char[i] = nome2.charAt(i);
                System.out.print(nome2Char[i] + " ");
            }
            rimuoviDuplicati(nome2Char);

            break;

            case 7:
            System.out.print("Scrivi che numero vuoi rimuovere: ");
            a = sc.nextInt();

            System.out.print("Quanti numeri vuoi scrivere? ");
            int b = sc.nextInt();

            int[] case7Array = new int[b];
            
            for (int i = 0; i < case7Array.length; i++){
                System.out.print("Scrivi un numero: ");
                case7Array[i] = sc.nextInt();
            }
            rimuovi(a,case7Array);
            break;

            case 8:
            /*
             * 1: dolci alla menta
             * 2: cioccolatini alle mandorle
             * 3: biscotti al cioccolato
             * 4: dolci al cioccolato
             * 5: lecca lecca senza zucchero
             */
            String[] ordini = new String[5];
            ordini[0] = "Dolci alla menta";
            ordini[1] = "Cioccolatini alle mandorle";
            ordini[2] = "Biscotti al cioccolato";
            ordini[3] = "Dolci al cioccolato";
            ordini[4] = "Lecca lecca senza zucchero";

            String[] ordine = new String[5];
            ordine[0] = "Dolce alla menta";
            ordine[1] = "Cioccolatino alle mandorle";
            ordine[2] = "Biscotto al cioccolato";
            ordine[3] = "Dolce al cioccolato";
            ordine[4] = "Lecca lecca senza zucchero";

             int[] ordine1 = new int[5];
             int[] ordine2 = new int[5];

             for (int i = 0; i<ordine1.length;i++){
                System.out.print("Quanti " + ordini[i].toLowerCase() + " vuoi? ");
                ordine1[i] = sc.nextInt();
             }
             System.out.println("");
             System.out.println("Dobbiamo fare due ordini, e non uno.");
             for (int i = 0; i<ordine2.length;i++){
                System.out.print("Quanti " + ordini[i].toLowerCase() + " vuoi? ");
                ordine2[i] = sc.nextInt();
             }
             System.out.println("");

             int[]arrayTotale = new int[5];
             arrayTotale = combinaOrdini(ordine1, ordine2);

             for(int i = 0; i< arrayTotale.length;i++){
                if (arrayTotale[i] == 1){
                    System.out.println("Abbiamo 1 " + ordine[i] + " nel tuo ordine.");
                } else if (arrayTotale[i] > 1){
                    System.out.println("Abbiamo " + arrayTotale[i] + " " + ordine[i] + " nel tuo ordine.");
                }
             }
            break;

            case 9:
             System.out.println("Selection sort demo");
             System.out.println("I nostri numeri sono 7, 5, 11, 2, 16, 4, 18, 14, 12, 30");

             int [] c= {7,5,11,2,16,4,18,14,12,30};
             System.out.print("Valori dell'array prima dell'ordinamento: ");
             for (int i = 0; i < c.length; i++){
                System.out.print(c[i] + " ");
             }
             System.out.println();

             selectionSort(c);
             System.out.print("Valori dell'array dopo dell'ordinamento: ");
             for (int i = 0; i < c.length; i++){
                System.out.print(c[i] + " ");
             }
             System.out.println();

            break;

            case 10:
            System.out.println("Selection sort parziale demo - si usa lo stesso array dell'esercizio 9");
            boolean inizioValido = false;
            int inizio = 0;
            int fine = 0;
            while (inizioValido == false){
            System.out.print("Da che indice bisogna iniziare? ");
            inizio = sc.nextInt();
                if (inizio <= 0){
                    System.out.println("L'inizio non può essere minore di zero.");

                } else{
                    inizioValido = true;
                }
            }
            boolean fineValido = false;
            while (fineValido == false){
            System.out.print("Fino a quale fine? ");
            fine = sc.nextInt();
                if (fine <= inizio){
                    System.out.println("L'inizio non può essere minore di zero.");

                } else{
                    fineValido = true;
                }
            }

            int [] c1= {7,5,11,2,16,4,18,14,12,30};
            System.out.print("Valori dell'array prima dell'ordinamento: ");
             for (int i = 0; i < c1.length; i++){
                System.out.print(c1[i] + " ");
             }
             System.out.println();

             selectionSortParziale(c1,inizio,fine);
             System.out.print("Valori dell'array dopo dell'ordinamento: ");
             for (int i = 0; i < c1.length; i++){
                System.out.print(c1[i] + " ");
             }
             System.out.println();
            break;

            case 12:
            System.out.println("Scrivi un numero che vuoi trovare: ");
            a = sc.nextInt();
             
            System.out.println("Quanti numeri vuoi inserire? ");
            int lunghezza = sc.nextInt();
            int[] arrayCase12 = new int[lunghezza];

            for (int i = 0;i<arrayCase12.length;i++){
                System.out.println("Scrivi un numero: ");
                arrayCase12[i] = sc.nextInt();
            }
            ricercaSequenziale(a,arrayCase12,lunghezza);
            break;

            case 13:
            double[][]figura = new double[4][5];
            for (int i = 0; i<4;i++){
                for (int ab = 0; ab<5;ab++){
                    System.out.print("Scrivi un numero a riga " + i + " e a colonna " + ab + ": ");
                    figura[i][ab] = sc.nextDouble();
                }
            }
            System.out.print("Scrivi una soglia: ");
            double soglia = sc.nextDouble();

            cercaFigura(figura, soglia);
            break;

            case 14:
            figura = new double[4][5];

            System.out.println("Debug?");
            int sceltaCase142 = sc.nextInt();

            switch (sceltaCase142){

                case 1:
                figura[0][0] = 1.2;
                figura[0][1] = 1.3;
                figura[0][2] = 4.5;
                figura[0][3] = 6.0;
                figura[0][4] = 2.7;
                figura[1][0] = 1.7;
                figura[1][1] = 3.3;
                figura[1][2] = 4.4;
                figura[1][3]=10.5;
                figura[1][4]=17.0;
                figura[2][0]=1.1;
                figura[2][1]=4.5;
                figura[2][2]=2.1;
                figura[2][3]=25.3;
                figura[2][4]=9.2;
                figura[3][0]=1.0;
                figura[3][1]=9.5;
                figura[3][2]=8.3;
                figura[3][3]=2.9;
                figura[3][4]=2.1;
                

                System.out.println("Array iniziale: ");
                for (int i = 0; i < 4; i++){
                    for (int ae = 0; ae < 5; ae++){
                        System.out.print(" " + figura[i][ae] + " ");
                    }
                    System.out.println();
                }

                break;
                case 2:
            for (int i = 0; i<4;i++){
                for (int ab = 0; ab<5;ab++){
                    System.out.print("Scrivi un numero a riga " + i + " e a colonna " + ab + ": ");
                    figura[i][ab] = sc.nextDouble();
                }
            }
            break;
            default:
            System.out.println("e");
            break;
        }
            blur(figura);
        
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

public static boolean strettamenteCrescente(int[]in){
    boolean strettamenteCrescente = false;
    for (int i = 1; i<in.length;i++){
        if (in[i-1] < in[i]){
            strettamenteCrescente = true;
        } else {
            strettamenteCrescente = false;
            return strettamenteCrescente;
        }
    }

    return strettamenteCrescente;
}

public static void rimuoviDuplicati(char[] in){
    String[][] alphabetTracker = new String[in.length][2];

    for (int i = 0; i < in.length; i++){
        alphabetTracker[i][0] = "" + in[i];
        System.out.print(alphabetTracker[i][0] + " ");
    }

    for (int i = 0; i < in.length; i++){
        alphabetTracker[i][1] = "0";
    }

    int intAlphabet = 0;
System.out.println("");
    for (int i = 0; i < in.length; i++){
        for (int a = 0; a < in.length;a++){
            intAlphabet = 0;
            if (in[i] == alphabetTracker[a][0].charAt(0)){
                for (int b = 0; b<in.length; b++){
                    if (alphabetTracker[b][0].charAt(0) == in[i]){
                            intAlphabet++;
                    }
                }
                alphabetTracker[a][1] = "" + intAlphabet;
            }
        }
    }
    System.out.println();
    boolean alreadyPrinted = false;
for (int i = 0; i < in.length; i++){
    if(alphabetTracker[i][1].equals("1")){
        System.out.print(alphabetTracker[i][0]);
    }
    intAlphabet = Integer.parseInt(alphabetTracker[i][1]);
    if (intAlphabet >= 2) {
        System.out.print(alphabetTracker[i][0]);
        //stampa prima occorrenza della lettera
        alphabetTracker[i][1] = "-69420";
        String reportedletter = alphabetTracker[i][0];
        for (int a = 0; a < in.length; a++){
            intAlphabet = Integer.parseInt(alphabetTracker[a][1]);
            if (intAlphabet >= 2 &&  intAlphabet != -69420 && alphabetTracker[a][0].equals(reportedletter)){
                alphabetTracker[a][1] = "-69420";
            }
        }
    }
    
}
System.out.println("");
}

public static void rimuovi (int v, int [] in){
    int [] in2 = new int[in.length];
    int lengthOfNoNum = 0;
    for (int i = 0; i < in.length;  i++){
        if (in[i] != v){
            in2[i] = in[i];
            lengthOfNoNum++;
        }
    }

    int []in3 = new int[lengthOfNoNum];
   
    for (int i = 0; i < in2.length;i++){
        try{
        if (in2[i] != 0){
            in3[i] = in2[i];
        }

        if (in2[i] == 0 && in[i] == 0){
            in3[i]= in[i];
        }
        System.out.print(in3[i]);
    } catch(Exception e){
    }


}
}

public static int[] combinaOrdini(int[] ordine1, int[] ordine2){
    int[] arrayTotale = new int[ordine1.length];

    for (int i = 0; i < arrayTotale.length;i++){
        arrayTotale[i] = ordine1[i] + ordine2[i];   
    }

    return arrayTotale;
}

public static void selectionSort(int[] unArray){
    for (int i = 0; i < unArray.length -1;i++){
        //posiziona il valore corretto in unArray[i]
        int indiceDelSuccessivoPiuPiccolo = getIndiceDelPiuPiccolo(i,unArray);
        scambio(i, indiceDelSuccessivoPiuPiccolo, unArray);
    }
}

public static int getIndiceDelPiuPiccolo(int  indiceInizio, int[] a){
    int minimo = a[indiceInizio];
    int indiceDelMinimo = indiceInizio;

    for (int indice = indiceInizio + 1; indice < a.length; indice++){
        if (a[indice] < minimo){
            minimo = a[indice];
            indiceDelMinimo = indice;
        }
    }
    return indiceDelMinimo;
}

public static void scambio(int i, int j, int[] a){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

public static void selectionSortParziale(int[] unArray, int inizio, int fine){
    for (int i = inizio; i < fine;i++){
        //posiziona il valore corretto in unArray[i]
        int indiceDelSuccessivoPiuPiccolo = getIndiceDelPiuPiccolo(i,unArray);
        scambio(i, indiceDelSuccessivoPiuPiccolo, unArray);
    }
}

public static void ricercaSequenziale(int numero, int[] array, int lunghezza){
    /*
     * ricerca sequenziale: 
     * - si guardano gli elementi dell'array dal primo all'ultimo per veder ese l'elemento richiesto è uguale a qualche elemento presente nell'array
     * - ricerca termina qando nell'array viene trovato l'elemento desiderato, o raggiunge la fine.
     * Ordinato 2,4,6,8 - come si trova il cinque?
     */

     int[] arraySequential = new int[lunghezza];
     for (int i = 0; i < array.length; i++){
        if (numero == array[i]){
            System.out.println("Trovato " + numero + "!");
        }
     }
}

public static int[][] cercaFigura(double[][] figura, double soglia){
    int[][] Array = new int [4][5]; 

    double media = 0;
    double totale = 0;
    int numtotali = 0;
System.out.println("Array iniziale:");
    for (int i = 0; i < 4; i++){
        for (int a = 0; a < 5; a++){
            numtotali++;
            totale = totale + figura[i][a];
            System.out.print(" " + figura[i][a] + " ");
        }
        System.out.println();
    }

media = totale/numtotali;

    System.out.println("La soglia è " + soglia  +", e la media è: " + media + ". I numeri che eccedono di " + soglia + " il numero + " + media + " sono: ");

    for (int i = 0; i < 4;i++){
        for (int a = 0; a < 5; a++){
            if (figura[i][a] > soglia+media){
                Array[i][a] = 1;
            }
            System.out.print(" " + Array[i][a] + " ");
        }
        System.out.println();
    }
    return Array;
}

public static void blur(double[][]immagine){
    Scanner sc = new Scanner(System.in);
int pixelSceltoRiga = 0;
int pixelSceltoColonna = 0;

    double[][]risultato = new double[4][5];
    for (int x = 0; x < 4; x++){
        for (int y = 0; y < 5; y++){

            pixelSceltoRiga = x;
            pixelSceltoColonna = y;

   
    double totaleNumeri = 0;
    int[][] arrayBlur = new int[4][5];
    arrayBlur[pixelSceltoRiga][pixelSceltoColonna] = 4;
    if (pixelSceltoRiga > 0){
    arrayBlur[pixelSceltoRiga-1][pixelSceltoColonna] = 2;
    if (pixelSceltoColonna > 0)
    arrayBlur[pixelSceltoRiga-1][pixelSceltoColonna-1] = 1;
    
    } 
    if (pixelSceltoColonna > 0){
    arrayBlur[pixelSceltoRiga][pixelSceltoColonna-1] = 2;
    if (pixelSceltoRiga > 0){
        arrayBlur[pixelSceltoRiga-1][pixelSceltoColonna-1] = 1;
        if (pixelSceltoColonna < 4 && pixelSceltoRiga < 3)
        arrayBlur[pixelSceltoRiga-1][pixelSceltoColonna+1] = 1;
    }
    if (pixelSceltoRiga == 0){
        if (pixelSceltoColonna < 4 && pixelSceltoRiga < 3){
        arrayBlur[pixelSceltoRiga+1][pixelSceltoColonna+1] = 1;
        arrayBlur[pixelSceltoRiga+1][pixelSceltoColonna-1] = 1;
        }
    }
    }

    if (pixelSceltoRiga < 3){
        if (pixelSceltoColonna < 3){
    arrayBlur[pixelSceltoRiga+1][pixelSceltoColonna+1] = 1;
        }
    arrayBlur[pixelSceltoRiga+1][pixelSceltoColonna] = 2;
        
    }

    if (pixelSceltoColonna < 4){
    arrayBlur[pixelSceltoRiga][pixelSceltoColonna+1] = 2;
    if (pixelSceltoRiga > 0)
    arrayBlur[pixelSceltoRiga-1][pixelSceltoColonna+1] = 1;
    if (pixelSceltoRiga < 3){
        arrayBlur[pixelSceltoRiga+1][pixelSceltoColonna+1] = 1;
        if (pixelSceltoRiga > 0 && pixelSceltoColonna > 0 && pixelSceltoRiga < 3 && pixelSceltoColonna < 4){
            arrayBlur[pixelSceltoRiga+1][pixelSceltoColonna-1] = 1;
        }
    }
    }

    if (pixelSceltoColonna == 4){
        if (pixelSceltoRiga < 3){
        arrayBlur[pixelSceltoRiga+1][pixelSceltoColonna-1] = 1;
        }
    }
System.out.println("Array blur:");
    for (int i = 0; i<4; i++){
        for (int a = 0; a < 5; a++){
            System.out.print(" " + arrayBlur[i][a] + " ");
        }
        System.out.println();
    }
        
int totaleBlur = 0;
    for (int i = 0; i < 4; i++){
        for (int a = 0; a < 5; a++){
            totaleBlur = 0;

            for (int b = 0; b <4; b++){
                for (int c = 0; c < 5; c++){
                    totaleBlur += arrayBlur[b][c];
                }
            }
        }
    }

    for (int i = 0; i < 4; i++){
        for (int a = 0; a < 4; a++){
            totaleNumeri = totaleNumeri+(arrayBlur[i][a] * immagine[i][a]);
        }
    }

    risultato[x][y] = totaleNumeri/totaleBlur;
    
}
System.out.println();
    }

    for (int i = 0; i<4; i++){
        for (int a = 0; a < 5; a++){
            System.out.print(" " + risultato[i][a] + " ");
        }
        System.out.println();
    }
}
}