package CompitinoII;

import javax.lang.model.util.ElementScanner6;

public class ottavaEs {

    
    public static void main (String[]args){
        String espressione = "An+2-B";
        String valori = "A1B-2";
        int sceltaExp = 1, sceltaVal = 2;
       // espressione = args[0];
        //    valori = args[1];
        boolean checkExpression = checkEspr(espressione, sceltaExp);
        System.out.println(checkExpression);
        boolean CheckValori = checkEspr(valori, sceltaVal);
            System.out.println(CheckValori);
        }
    

    public static boolean checkEspr(String espressione, int scelta){
        boolean checkLetter = true, checkLetter2 = true;

switch(scelta){   
    
    case '1':
    try {
        for (int i = 0; i < espressione.length(); i += 2){
            if (espressione.charAt(i) >= '0' && espressione.charAt(i) <= '9' || espressione.charAt(i) >= 'A' && espressione.charAt(i) <= 'E' && espressione.charAt(i+1) == '+' || espressione.charAt(i) >= 'A' && espressione.charAt(i) <= 'E' && espressione.charAt(i+1) == '-'){
                checkLetter = true;
            } else {
                checkLetter = false;
                break;
            }
            
        }
        return checkLetter;
    } catch (IndexOutOfBoundsException e){
        System.out.print("");
    }
    

    case '2':
    try {
        if (espressione.charAt(0) >= 'A' && espressione.charAt(0) <= 'Z' && espressione.charAt(1) == ':' && espressione.charAt(2) >= '0' && espressione.charAt(2) <= '9' && espressione.charAt(3) >= 'A' && espressione.charAt(3) <= 'Z' && espressione.charAt(4) == ':' && espressione.charAt(5) >= '0' && espressione.charAt(5) <= '9'){
        checkLetter = true;
            } else {
                checkLetter = false;
                break;
            }
            return checkLetter;


    } catch (IndexOutOfBoundsException e){
        System.out.print("");
    }
    break;
    }
    return checkLetter;
    
}
}
        ;
    
/* 
    //funzione definita ricorsivamente
    //f(n) = 3 se n = 0 (caso base)
    //f(n) = 1-2*f(n-1) se n > 0 (passo ricorsivo)
    
    public static int mrf(int n){
        if (n == 0) return 3;
        else    return 1-(2*mrf(n-1));
    }

    public static void main (String[]args){
        int n = mrf(4);
        System.out.println(n);
        System.out.println(n);


       
}

// calcomo somma elementi di un array
// dividiamo in uno o due array, divide in sottoarray, ordina le due parti separatamente e somma
//metodo somma
// caso base: somma(0) - i == a.length-1 return a[i]
// metodo ricorsivo: somma(int []a, int i) --> i: punto iniziale array - return somma(a, i+1) + a[1]

public static int somma(int []a, int i){
    if (i == a.length-1){
        return a[1];
    } else {
        return somma(a, i+1) + a[i];
    }
}
public static int prod(int n, int m){
    if (n == 1)
    return m;
    else
    return prod (n-1,m) + m;
}

public static int potenza (int n){
    if (n == 1) return 1;
    else n = potenza(n-1);
    return n*n;
}

public static int fib(int n){
    if (n == 0 || n == 1){
        return 1; 
    } else {
        return 0;
    }
}

public static int es1(int n){
    if (n == 1)
    return 1;
    else
    return es1(n-1) +2;
}
*/
