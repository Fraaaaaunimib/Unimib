package CompitinoII;
import java.util.Scanner;
public class es_lab_seidic {
    
    // esercizio 1
    

    /* 

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tenta = true;
        System.out.println("DEBUG: " + metodi.estraiNumeroCasuale100());

        System.out.println("Indovina il numero! (p.s. è tra 1 e 100!)");

        do {
        int result = 0, volte = 0, choice = 0, arraychoice[], numeroPartita = 0;
        arraychoice = new int[10];
        String show = "";

        int numero = metodi.estraiNumeroCasuale100();
        boolean valid = false, tastieravalid = true;
        while (valid == false && volte < 10){

            while (tastieravalid == false){
            System.out.print("Qual'è la tua giocata? --> ");
            choice = sc.nextInt();

                arraychoice[volte]= choice;
                metodi.confrontaNumeriArrayCasuale100(choice, arraychoice, volte, show);
                System.out.println(show);
            
            if (choice > 1 && choice < 100){
                tastieravalid = true;
            } else {
                valid = false; 
                System.out.println("Nonono, questo non è un numero per niente valido. Riprova.");

            }
        }

        while (tastieravalid == true && valid == false && volte < 10){
            System.out.print("Qual'è la tua giocata? --> ");
            choice = sc.nextInt();

            if (choice > 1 && choice < 100){
                tastieravalid = true;
            } else {
                valid = false; 
                System.out.println("Nonono, questo non è un numero per niente valido. Riprova.");

            }
            arraychoice[volte]= choice;
            
        

            boolean indovinato = false;
            result = metodi.confrontaNumeriCasuale100(choice,numero,indovinato);

            if (result == 0){
                valid = true;
            }

            if (result == -1){
                valid = false;
                volte++;
                
            arraychoice[volte]= choice;
            

            metodi.confrontaNumeriArrayCasuale100(choice, arraychoice, volte, show);

            if (volte == 0)
            show = ("Il numero " + choice + " è più piccolo di quello da indovinare, ma ti avevo già detto che " + arraychoice[volte] + " era più piccolo!");
            else
            show = ("Il numero " + choice + " è più piccolo di quello da indovinare, ma ti avevo già detto che " + arraychoice[volte-1] + " era più piccolo!");
            System.out.println(show);
            
            }

            if (result == 1){
                valid = false;

                arraychoice[volte]= choice;


                metodi.confrontaNumeriArrayCasuale100(choice, arraychoice, volte, show);

                if (volte == 0) {
                
            show = ("Il numero " + choice + " è più grande di quello da indovinare, ma ti avevo già detto che " + arraychoice[volte] + " era più grande!");
            } else {
            if (arraychoice[volte-1] == choice) {
            System.out.println("E' esattamente lo stesso numero che hai messo prima ;-;");
            }
            show = ("Il numero " + choice + " è più grande di quello da indovinare, ma ti avevo già detto che " + arraychoice[volte-1] + " era più grande!");
            System.out.println(show);
            }
                volte++;
            }

            
        }

        
    }

    int numeroIndovinato[] = new int [10];
        if (valid == true){
            System.out.println("Congratulazioni! Hai vinto yeeeeee");
            

            // cose per il riepilogo
            numeroIndovinato[numeroPartita] = numero;

            for (int i = 0; i < numeroPartita; i++) {
            System.out.println(numeroIndovinato[i]);
            }
        }

        if (valid == false){
            System.out.println("Peccato...");
            


            // cose per il riepilogo
            numeroIndovinato[numeroPartita] = numero;
            for (int i = 0; i < numeroPartita; i++){
            System.out.println(numeroIndovinato[i]);
            }
        }

        boolean validfinalchoice = false;
        while (validfinalchoice == false){
        System.out.print("Vuoi provarci ancora? SI per provarci ancora, NO per uscire. .°.> ");
        String finalchoice = sc.next();


        
        if (finalchoice.equals("SI"))
        {
            tenta = false;
            validfinalchoice = true;
        } else if (finalchoice.equals("NO")){
            tenta = true;
            System.out.println("Buh bye!");
            validfinalchoice = true;
        } else {
            tenta = false;
            validfinalchoice = false;
            System.out.println("Perché non inserici SI e NO come detto prima?");

        }
        
    }
    
    } while (tenta == false);
    sc.close();


}  
*/

    //esercizio 2

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String returno = "";
        String returnoUpdate = "";
        boolean validStufato= false;

        int contatore = 0;
        boolean Programma = false;

        
        

        while (Programma == false){
            returno = metodi.estraiStringaCasuale();
        System.out.println("[DEBUG]: " + returno);
 
        System.out.println("Indovina la parola! Scrivi secondo te quali lettere ci sono.. hai 10 tentativi. ");
        for (int i = 0; i < returno.length(); i++){
            returnoUpdate = returnoUpdate + "" + "-"; 
        }
        System.out.println("[ " + returnoUpdate + " ]");

        boolean found = false;
        while (found == false && contatore < 9){

            if (returnoUpdate == returno){
                found = true;
            }

            if (returnoUpdate.equals(returno)){
                found = true;
            }
            System.out.print("Qual'è la tua giocata? --> ");
            String a = sc.next();
            char aChar = a.charAt(0);

            if (a == "smetto" || a == "SMETTO" || a == "Smetto" || a.equals("smetto") || a.equals("Smetto") || a.equals("SMETTO") ){
                System.out.println("Hai digitato la ✨parola segreta✨; Non giocherai più allora.");
                System.exit(0);
            }

            if (a.length() > 1){
                System.out.println("La tua scelta era fin troppo lunga, serve una sola lettera. Pertanto, abbiamo preso la prima della tua parola, ovvero: " + aChar);
            }

            boolean charFound = false;
            
            for (int i = 0; i <returno.length();i++){
                if (returno.charAt(i) == aChar){
                    returnoUpdate = returnoUpdate.substring(0,i) + aChar + returnoUpdate.substring(i+1);
                    charFound = true;
                    
                }
            }


if (charFound == false){
    System.out.print("Non ci siamo... ritorniamo al punto di partenza, e riproviamoci! --> ");
}
            System.out.println(returnoUpdate);

            
            if (returnoUpdate == returno){
                found = true;
            }

            if (returnoUpdate.equals(returno)){
                found = true;
            }
            contatore++;
    
            if (found == true){
                boolean tastieraValid = false;
                while (tastieraValid == false){
                System.out.println("Congratulazioni! Hai trovato la parola " + returno + " in solo " + contatore + " turni! Vuoi giocare ancora? [S] per si, [N] per uscire.");
                String finSelect = sc.next();
                char finSelectChar = finSelect.charAt(0);
            
                if (finSelectChar == 'S' || finSelectChar == 's'){
                   found = true; 
                   tastieraValid = true;
                   contatore = 0;
                   Programma = false;
                   returnoUpdate = "";
                }

                if (finSelectChar == 'N' || finSelectChar == 'n'){
                    found = false;
                    tastieraValid = true;
                    System.out.println("Buh bye!");
                    System.exit(0);
                }

                if (finSelectChar != 'N' && finSelectChar != 'n' && finSelectChar != 'S' && finSelectChar != 's'){
                    System.out.println("Aw man, questa è una lettera sbagliata. Devi inserire [S] se vuoi rifare, [N] se ti sei stufato.");
                    tastieraValid = false;
            }
            }

}

// aggiungi:
/*
 * ad ogni turno dì quanti turni rimangono
 * fai i turni "custom", ovvero fai scegliere quanti turni vuoi (con anche messaggi particolari)
 * trasformalo in un hobby project




}

if (found == false){
    System.out.println("Oops, sembra che tu abbia superato i 20 tentativi, e non hai comunque indovinato la parola. Era " + returno + " btw.");
}

        }

sc.close();    
}

*/

// esercizio 3
/* 
public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);

    
    boolean spacevalid = true, startfinish = true;
    int numero1 = 0, numero2 = 0, contatoreoperandi = 0;
    char [] operandi = new char[999];
    int [] operatore = new int[999];
    int [] posizioneoperandi = new int [999];
    String a = "";

    do{
    System.out.print("Scrivi un'espressione (senza spazi): ");
    a = sc.nextLine();

    
    //spaces check
    for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) ==' ' || a.charAt(i) <= '0' && a.charAt(i) >= '9' && a.charAt(i) != '-' && a.charAt(i) != '+') {
            spacevalid = false;

            break;
        } else {
            spacevalid = true;
        }
        if (a.charAt(a.length() - 1) == '-' || a.charAt(a.length() - 1) == '+' && a.charAt(0) == '-' && a.charAt(0) == '+') {
            startfinish = false;
            break;
        }

        //check position of the operators
        if (a.charAt(i) == '-' || a.charAt(i) == '+'){
        contatoreoperandi++;
        posizioneoperandi[i] = i;
        operandi[i] = a.charAt(i);
        System.out.println(operandi[i]);
        }


        if(i == 0 && posizioneoperandi[i] == 0){
            operatore[i] = Integer.parseInt(a.substring(0, posizioneoperandi[i]));
            System.out.println(posizioneoperandi[i]);
        } else{
        System.out.println(posizioneoperandi[i]);
        operatore[i] = Integer.parseInt(a.substring(operandi[i-1], operandi[i]));
        }
        System.out.println(operatore [i]);

    }

    

    if (spacevalid == false && startfinish == true) { 
        System.out.println("Hai aggiunto degli spazi... o qualcos'altro che non è un numero");
    }

    if (spacevalid == false && startfinish == false){
        System.out.println("Hai aggiunto qualche carattere non valido, e hai iniziato senza un numero.");
    }

    if (spacevalid == true && startfinish == false){
        System.out.println("L'espressione deve iniziare e finire con un numero.");
    }

    if (spacevalid == true && startfinish == true){
        System.out.println("Tutto a posto!");
    }

    } while (spacevalid == false || startfinish == false);

sc.close();
}
*/

//esercizio 4
/*
public static void main (String args[]) {
    int a = 0, b = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Quante righe deve essere la matrice? ");
    a = sc.nextInt();

    System.out.print("Quante colonne deve avere la matrice? ");
    b = sc.nextInt();


    int matrice [][] = new int [a][b];
    int trasposta [][] = new int [b][a];
    // matrice --> nome[righe][colonne]


    System.out.println("Qua la matrice che è stata scelta: ");
    for (int i = 0; i < a; i++) { //per le righe
        for (int j = 0; j < b; j++) { //per le colonne
            matrice[i][j] = (int)(Math.random()*99); //numeri random
            System.out.print(" " + matrice[i][j] + " ");
        }
            System.out.println("");
    }

    System.out.println("");
    System.out.println("Qua è la matrice trasposta: ");

    for (int i = 0; i < b; i++){
        for (int j = 0; j < a; j++) {
            trasposta[i][j] = matrice[j][i];
            System.out.print(" " + trasposta[i][j] + " ");
    }
    System.out.println("");

}

System.out.println("");
System.out.println("Adesso con i metodi:");

metodi.generaMatriceCasuale(a,b,matrice);

System.out.println("Adesso trasposta con i metodi:");
metodi.trasponiMatrice(a,b,matrice,trasposta);
sc.close();
}

*/

// esercizio 5

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
System.out.println("Scegli:");
System.out.println("1 - Inserisci/cambia la parola chiave");
System.out.println("2 - Cifra un messaggio");
System.out.println("3 - Decifra un messaggio");
System.out.println("4 - Esci dal programma");

int scelta = sc.nextInt();
int scelta = metodi.sceltaMenuSelDic()
}
}