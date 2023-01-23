import java.util.Scanner;
public class testoAppelloCompleto{
    public static void scrivi(double somma){
        if (somma >= 0){
            System.out.print('E');
            scriviPositivo(somma);
        } else {
            double sommaPositiva = -somma;
            System.out.print('E');
            System.out.print('-');
            scriviPositivo(sommaPositiva);
        }
    }

    public static void scriviPositivo(double somma){
        int centesimiTotali = (int)(Math.floor(somma / 100));
        int euro = centesimiTotali/100;
        int centesimi = centesimiTotali % 100;

        System.out.print(euro);
        System.out.print('.');

        if (centesimi < 10){
            System.out.print('0');
            System.out.print(centesimi);
        } else
            System.out.print(centesimi);
    }

    public static void scriviRiga(double somma){
        scrivi(somma);
        System.out.println();
    }

    public static void scriviScientifico(double somma){
        Scanner sc = new Scanner(System.in);
        String sommaa = "" + somma;
        boolean isValid = false;
        do {
        somma = somma / 10;
        sommaa = "" + somma;
        if (sommaa.charAt(1) == '.'){
            isValid = true;
        }
        } while (isValid == false);
        System.out.println(sommaa);

        System.out.print("Quante cifre vuoi dopo la virgola? ");
        int a = sc.nextInt();
        sc.close();

        String nonFormatted = sommaa.substring(0,sommaa.length() - (a + 2));
        String toFormat = sommaa.substring(sommaa.length() - (a + 1), sommaa.length());
        int formats = 0;
        String formatted = "";
        for (int i = 0; i < toFormat.length(); i++){
            formats++;
        }
        System.out.print("Ecco la nuova stringa: ");
        System.out.print(nonFormatted);
        System.out.print("e-");
        System.out.print(formats);

    }

    public static void stubscriviScientifico(){
        System.out.println("Testo il metodo scriviScientifico");
        double somma = 5345.59124;
        scriviScientifico(somma);
    }

    public static void main(String[] args){
    pin();
    }

    public static int calcolatrice(String inserisci){
        int totale = 0;
        int try1 = 0, try2 = 0, salvation1 = 0;
        char operation = ' ';
        String try12 = "", try23 = "";
        for (int i = 0; i < inserisci.length(); i++){
            if (inserisci.charAt(i) != '+' && inserisci.charAt(i) != '+' && inserisci.charAt(i) != '*' && inserisci.charAt(i) != '/'){
                try12 = try12+inserisci.charAt(i);
                i = salvation1;
                i++;
            } else {
                i = inserisci.length();
            }
        }

        for (int i = salvation1; i < inserisci.length(); i++){
            if (inserisci.charAt(i) != '+' && inserisci.charAt(i) != '+' && inserisci.charAt(i) != '*' && inserisci.charAt(i) != '/'){
                try23 = try23+inserisci.charAt(i);
                System.out.println(try23);
                i = salvation1;
            } else {
                if (inserisci.charAt(i) == '+'){
                    operation = '+';
                } else if (inserisci.charAt(i) == '-'){
                    operation = '-';
                } else if (inserisci.charAt(i) == '*'){
                    operation = '*';
                } else if (inserisci.charAt(i) == '/'){
                    operation = '/';
                }
                System.out.println(operation);
                i = inserisci.length();
            }
        }

        try1 = Integer.parseInt(try12);
        try2 = Integer.parseInt(try23);
        if (operation == '+'){
            totale = try1+try2;
        } else if (operation == '-'){
            totale = try1 - try2;
        } else if (operation == '*'){
            totale = try1 * try2;
        } else if (operation == '/'){
            totale = try1 / try2;
        }
        System.out.println(totale);

        return totale;
    }

    public static String segnoZodiacale(int giorno, int mese){
        String zodiacale = "";
        switch(mese){
            case 1:
            if (giorno >= 1 && giorno <= 20){
                zodiacale = "capricorno";
            } else if (giorno >= 21 && giorno <= 31){
                zodiacale = "acquario";
            }
            break;

            case 2:
            if (giorno >= 1 && giorno <= 19){
                zodiacale = "acquario";
            } else if (giorno >= 20 && giorno <= 30){
                zodiacale = "pesci";
            }
            break;

            case 3:
            if (giorno >= 1 && giorno <= 20){
                zodiacale = "pesci";
            } else if (giorno >= 21 && giorno <= 31){
                zodiacale = "ariete";
            }
            break;

            case 4:
            if (giorno >= 1 && giorno <= 20){
                zodiacale = "ariete";
            } else if (giorno >= 21 && giorno <= 30){
                zodiacale = "toro";
            }
            break;

            case 5:
            if (giorno >= 1 && giorno <= 20){
                zodiacale = "toro";
            } else if (giorno >= 21 && giorno <= 31){
                zodiacale = "gemelli";
            }
            break;

            case 6:
            if (giorno >= 1 && giorno <= 21){
                zodiacale = "gemelli";
            } else if (giorno >= 22 && giorno <= 30){
                zodiacale = "cancro";
            }
            break;

            case 7:
            if (giorno >= 1 && giorno <= 22){
                zodiacale = "cancro";
            } else if (giorno >= 23 && giorno <= 31){
                zodiacale = "leone";
            }
            break;

            case 8:
            if (giorno >= 1 && giorno <= 23){
                zodiacale = "leone";
            } else if (giorno >= 24 && giorno <= 31){
                zodiacale = "vergine";
            }
            break;

            case 9:
            if (giorno >= 1 && giorno <= 22){
                zodiacale = "vergine";
            } else if (giorno >= 23 && giorno <= 30){
                zodiacale = "bilancia";
            }
            break;

            case 10:
            if (giorno >= 1 && giorno <= 22){
                zodiacale = "bilancia";
            } else if (giorno >= 23 && giorno <= 31){
                zodiacale = "scorpione";
            }
            break;

            case 11:
            if (giorno >= 1 && giorno <= 22){
                zodiacale = "scorpione";
            } else if (giorno >= 23 && giorno <= 31){
                zodiacale = "sagittario";
            }
            break;

            case 12:
            if (giorno >= 1 && giorno <= 21){
                zodiacale = "sagittario";
            } else if (giorno >= 22 && giorno <= 31){
                zodiacale = "capricorno";
            }
        }

        return zodiacale;
    }

    public static void progetto61(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanti interi verranno scritti? ");
        int length = sc.nextInt();
int somma = 0;
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++){
            System.out.print("Inserisci un numero: ");
            array[i] = sc.nextInt();
            somma += array[i];
        }
        System.out.println(somma);
        sc.close();
    }

    public static void lettere(String lettere){
        System.out.println("Scrivi una lettera: ");
        System.out.println(lettere);
        String[][] alfabeto = new String[26][2];
        for (int i = 65; i < 65+25; i++){
            char lettera = (char)(i);
            alfabeto[i-65][0] = "" + lettera;
            System.out.print(alfabeto[i-65][0]);
        }
        alfabeto[24][0] = "Y";
        alfabeto[25][0] = "Z";
System.out.println(alfabeto[25][0]);
        for (int i = 0; i < alfabeto.length; i++){
            alfabeto[i][1] = "0";
        }
lettere = lettere.toUpperCase();
System.out.println(lettere);

        for (int i = 0; i < lettere.length(); i++){
            String lettereCircumcised = lettere.substring(i, i+1);
            
            if (i == lettere.length() -1){
                lettereCircumcised = lettere.substring(lettere.length()-1);
            }
            System.out.print(lettereCircumcised);
            for (int x = 0; x < alfabeto.length; x++){
                
                if (lettereCircumcised.equals(alfabeto[x][0])){
                    int contatore = 0;
                    contatore++;
                    alfabeto[i][1]=""+contatore;
                    
                }
                
            }
        }

        for (int i = 0; i < alfabeto.length; i++){
            for (int a = 0; a < 1;a++){
                System.out.print(" " + alfabeto[i][0] + " " + alfabeto[i][1]);
            }
            System.out.println();
        }
    }

    public static boolean palindromia(){
        boolean isThisValid = false;
        System.out.println("Esempio di palindromia: Ai lati d'Italia");
        String start = "i topi non avevano nipoti";
       start = start.replace(" ", "");
       start = start.replace("'", "");
       start = start.toLowerCase();
        System.out.println(start);

        char[] starta = new char[start.length()];
        char[] startb = new char[start.length()];

        for (int i = 0; i < starta.length; i++){
            starta[i] = start.charAt(i);
        }
        int y = 0;
        for (int i = startb.length -1; i >= 0; i--){
                startb[y] = start.charAt(i);
y++;
            
        }

        for (int i = 0; i < starta.length; i++){
            for (int x = startb.length -1; i >= 0; i--) {
                if (starta[i] == startb[i]){
                     isThisValid = true;
                     break;
                } else {
                    isThisValid = false;
                    break;
                }
            }
        }

        return isThisValid;
    }

    public static void pin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi il pin: ");
        String pine = sc.next();
        int[][] pin = new int[2][11];
        for (int i = 0; i < 11; i++){
            pin[0][i]=i;
        }

        for (int i = 0; i < 11; i++){
            pin[1][i] = (int)(Math.random()*4);
            while (pin[1][i] == 0){
                pin[1][i] = (int)(Math.random()*4);  
            }
            pin[1][i] = (int)(Math.random()*4);
            while (pin[1][i] == 0){
                pin[1][i] = (int)(Math.random()*4);  
            }
        }

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 11; j++){
                System.out.print(" " + pin[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < pine.length(); i++) {
            int parsed = Integer.parseInt(""+pine.charAt(i));
            for (int x = 0; x < 11; x++) {
                if (pin[0][x] == parsed) {
                    System.out.print(pin[1][x]);
                    break;
                }
            }
        }
        
            sc.close();
    }
}