package CompitinoII;
import java.util.Scanner;
public class es_lab_seidic {
    
    // esercizio 1
    

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DEBUG: " + metodi.estraiNumeroCasuale100());

        System.out.println("Indovina il numero! (p.s. è tra 1 e 100!)");
        int result = 0, volte = 0, choice = 0, arraychoice[];
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
            volte++;
            }

            if (result == 1){
                valid = false;

                arraychoice[volte]= choice;


                metodi.confrontaNumeriArrayCasuale100(choice, arraychoice, volte, show);

                if (volte == 0) {
                if (arraychoice[volte] == choice) {
                System.out.println("E' esattamente lo stesso numero che hai messo prima ;-;");
                }
            show = ("Il numero " + choice + " è più grande di quello da indovinare, ma ti avevo già detto che " + arraychoice[volte] + " era più grande!");
            } else {
            if (arraychoice[volte] == choice) {
            System.out.println("E' esattamente lo stesso numero che hai messo prima ;-;");
            }
            show = ("Il numero " + choice + " è più grande di quello da indovinare, ma ti avevo già detto che " + arraychoice[volte-1] + " era più grande!");
            System.out.println(show);
            }
                volte++;
            }

            
        }

        
    }

        if (valid == true){
            System.out.println("Congratulazioni! Hai vinto yeeeeee");
            System.exit(0);
        }

        if (valid == false){
            System.out.println("Peccato...");
            System.exit(0);
        }

        

        sc.close();
    }

}

