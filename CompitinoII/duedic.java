package CompitinoII;
import java.util.Scanner;

public class duedic {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        double [] temperatura = new double[30]; //type [array] name = new type[how much for the array]
        temperatura[3] = 7;

        int i2 = 4;
        temperatura[i2] = 18;
        temperatura[i2+3] = 11;
        // all'interno dei [ ] si mette il numero del'array; possono essere inserite anche variabili.

        System.out.println("Il valore di indice 3 è: " + temperatura[3]);
        //gli array hanno valori di default, che varia a seconda del tipo di variabile.

        int [] voto;
        voto = new int[100];
        // posso anche dichiarare un array su righe ddiverse

        // se si fa una call di un index out of bounds, l'errore viene mostrato in runtime e non in compilazione.

        //int lunghezza = voto.length;
        //attributo per dire quanto è lungo un attributo. NON è un metodo!
        //boolean Decisione[] = new boolean[10];
        // notare la differenza della posizione delle parentesi quadre in Boolean

        for (int i = 0; i < temperatura.length; i++){
            temperatura[i] = i+1;
            //si possono controllare gli array attraverso i cicly For.
        }

        System.out.println("il valore di temperatura 5 è: " + temperatura[5] + voto);

        //esempio di dimensione stabilita a runtime
        int []estrazioneLotto;
        System.out.print("How many numbers have been selected? ");
        int dimensione = tastiera.nextInt();

        estrazioneLotto = new int[dimensione];
        //posso usare variabili a runtime per dichiarare la dimensione dell'array

        System.out.println("This is how many numbers you've chosen: " + estrazioneLotto.length);
        //è un attributo, non è possibile modificarlo.

        double [] temperatura1 = new double[31];

        for (int indice = 1; indice< 31; indice++){
            temperatura[indice] = indice + 3;
        }

        tastiera.close();
    }
    
    
}
