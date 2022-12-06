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
 */



}

if (found == false){
    System.out.println("Oops, sembra che tu abbia superato i 20 tentativi, e non hai comunque indovinato la parola. Era " + returno + " btw.");
}

        }

sc.close();    
}

}

