package CompitinoII;
public class ventunonov {
    
    public static void saluta(double raggio){ //metodo: si scrive come il metodo main, e ogni volta che viene chiamato il main, esegue il codice
        // le variabili sono soltanto all'interno del metodo
        // ( ) : dove dichiarare delle variabili
        raggio = raggio + 0.1;
        System.out.println("Ciao");
    }

    public static void noVocali(String parola){
        String risultato = "";
        int i = 0;

        if (parola.length() == 0) return;
        for (i=0;i<parola.length(); i++){
            switch (parola.charAt(i)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            break;
            default: risultato = risultato + parola.charAt(i);
        }
        System.out.println(risultato);
    }


    
}
public static void main(String[] args) {
    noVocali ("aaergegbebtbehgrwd");; //chiama il metodo saluta - nelle () metti il valore della variabile
}
}