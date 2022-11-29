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
            
    
}