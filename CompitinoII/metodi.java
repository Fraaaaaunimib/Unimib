package CompitinoII;

public class metodi {

    public static int sommaDueInteri(int x, int y){
        int risultato = x + y;
        return risultato;
    }

    public static int divisioneIntera(int x, int y){
        int risultato = x/y;
        int resto = x%y;
        System.out.println("Il risultato della divisione è: " + risultato + ", il resto è " + resto);
        return risultato;
    }

    public static double mediaTraDueDouble(double x, double y){
        double risultato =  (x+y)/2;
        return risultato;
    }

    public static int valoreAssolutoIntero(int x){
      int risultato;
        if (x < 0)

        risultato = x + x + x;
        else
        risultato = x;
        return risultato;
    }

    public static String lunghezzaStringaIntero(String a){
        int x;
        x = a.length();
        return a;
    }

    public static Boolean cercaCarattere(String a, boolean found, char foundable, int foundCount){
        for (int i = 0;i < a.length();i++){
            if (a.charAt(i) == foundable){
                found = true;
                foundCount++;
                }
                else {
                    found = false;
                }
            }

            if (found == true && foundCount == 1){
                System.out.println("Your character was found one time!");
            }

            if (found == false){
                System.out.println("Your character was not found one time!");
            }

            if (found == true && foundCount > 1){
                System.out.println("Your character was found " + foundCount + " times!");
            }
            return found;
    }


    public static String rimuoviCarattere(String text, String text2, char foundable){
        for (int i = 0;i<text.length(); i++){
            if (text.charAt(i) != foundable){
                text2 = text2 + "" + text.charAt(i);
            }
        }
        return text2;
    }

    
    public static String convDecinBin(int dec, String bin){
        int i = dec;
        for (;i>0;){
            
            if (i%2 == 1){
                bin = bin + "" + 1;
            }
            if (i%2 == 0){
                bin = bin + "" + 0;
            }
            i = i/2;
        }
        return bin;
    }
            
    public static int potenze(int m, int n, boolean pari){
        int somma = 0;
        int i = 0;
        if (pari){
            for (i=2;i<=n;i+=2) {
                somma += Math.pow(i,m);
            }
        } else {
            for (i = 1;i<= n; i+=2){
                somma += Math.pow(i,m);
            }
        }

        return somma;
    }

    public static int estraiNumeroCasuale100(){
        int numero = 0;
        boolean valid = false;

        while (valid == false) {
        numero = (int)(Math.random()*100);
        if (numero < 1 || numero > 100)
        valid = false;
        else
        valid = true;
        }

        return numero;
    }

    public static int confrontaNumeriCasuale100(int numeroInserito, int numeroDaIndovinare, boolean valid){
        int result = 0;
        if (numeroInserito < numeroDaIndovinare){
        result = -1;
        System.out.println("Il numero " + numeroInserito + " è più piccolo di quello da indovinare.");
        valid = false;
        }

        if (numeroInserito > numeroDaIndovinare){
        result = 1;
        System.out.println("Il numero " + numeroInserito + " è più grande di quello da indovinare.");
        valid = false;
        }

        if (numeroInserito == numeroDaIndovinare){
        result = 0;
        System.out.println("Congratulazioni! Hai vinto!");
        valid = true;
        }

        return result;
    }

    public static int confrontaNumeriArrayCasuale100(int numeroInserito, int Array[], int i, String show){
        if (numeroInserito > Array[i]){
            show = ("Il numero " + numeroInserito + " è più piccolo di quello da indovinare, ma ti avevo già detto che " + Array[i] + " era più piccolo!");
            int a = -1;
            return a;
        }

        if (numeroInserito < Array[i]){
            show = ("Il numero " + numeroInserito + " è più grande di quello da indovinare, ma ti avevo già detto che " + Array[i] + " era più grande!");
            int a = 1;
            return a;
        }
        return 0;
    }

public static void finePartitaCasuale100(int indovinato[], int tentativi, int numeroPartita, boolean indovinatoo){
        indovinato = new int [numeroPartita];
        if (indovinatoo == true){
            String tentativoString [] = new String [numeroPartita];
          
                tentativoString [numeroPartita] = "Hai indovinato il numero " + indovinato + " dopo " + tentativi + " tentativi. Hai giocato " + numeroPartita + " volte.";

                if (numeroPartita == 0)
                System.out.println(tentativoString [numeroPartita]);

                if (numeroPartita == 1)
                System.out.println(tentativoString [numeroPartita]);
                System.out.println(tentativoString [numeroPartita - 1]);

                if (numeroPartita == 2)
                System.out.println(tentativoString [numeroPartita]);
                System.out.println(tentativoString [numeroPartita - 1]);
                System.out.println(tentativoString [numeroPartita - 2]);

                if (numeroPartita == 3)
                System.out.println(tentativoString [numeroPartita]);
                System.out.println(tentativoString [numeroPartita - 1]);
                System.out.println(tentativoString [numeroPartita - 2]);
                System.out.println(tentativoString [numeroPartita - 3]);
            }


            if (indovinatoo == false){
                String tentativoString [] = new String [numeroPartita];
              
                    tentativoString [numeroPartita] = "Non hai indovinato il numero " + indovinato + " dopo " + tentativi + " tentativi. Hai giocato " + numeroPartita + " volte.";
    
                    if (numeroPartita == 0)
                    System.out.println(tentativoString [numeroPartita]);
    
                    if (numeroPartita == 1)
                    System.out.println(tentativoString [numeroPartita]);
                    System.out.println(tentativoString [numeroPartita - 1]);
    
                    if (numeroPartita == 2)
                    System.out.println(tentativoString [numeroPartita]);
                    System.out.println(tentativoString [numeroPartita - 1]);
                    System.out.println(tentativoString [numeroPartita - 2]);
    
                    if (numeroPartita == 3)
                    System.out.println(tentativoString [numeroPartita]);
                    System.out.println(tentativoString [numeroPartita - 1]);
                    System.out.println(tentativoString [numeroPartita - 2]);
                    System.out.println(tentativoString [numeroPartita - 3]);
                }
    
        }
    }
    
