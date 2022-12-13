
import java.util.Scanner;
public class Cypher {
    
    public static int sceltaMenuSeiDic(String scelta){

        if (scelta == "1" || scelta.equals("1"))
         return 1;
 
         if (scelta.equals("2") || scelta == "2")
         return 2;
 
         if (scelta == "3" || scelta.equals("3"))
         return 3;
 
         if (scelta == "4" || scelta.equals("4"))
         return 4;
 
         if (scelta == "5" || scelta.equals("5"))
         return 5;
 
         return 0;
     
                 
     }
 
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    //variabili
    String parolaChiave = "", parolaData = "", parolaCifrata1 = "", parolaCifrata2 = "", parolaMessaggio = "", scelta = "";
    /*
     * parolaChiave = posizione 1
     * parolaData = word which you put
     * ParolaCifrata1 = transformed from normal into 1conv (choice 1)
     * parolaCifrata2 = transformed using the matrix
     * parolaMessaggio = your message which should be decrypted
     */

    boolean menu = false, menuInsert = true, alreadySubstitutedKey = false, alreadyInsertedMsg = false; //controls the menu
int scelta1 = 0; //choices variables for the menu


 // ANSI strings - check https://stackoverflow.com/questions/4842424/list-of-ansi-color-escape-sequences for all details

 final String ANSI_BOLD = "\u001B[1m"; // makes text afterwards bold

 final String ANSI_BOLD_END = "\u001B[0m"; // makes the text return to its normal state

 final String ANSI_ITALIC = "\u001B[3m"; // makes the text italic

 final String ANSI_GREEN1 = "\u001B[38;2;62;142;146m"; // colour variable: \u001B[38;2 <-- this tells to just colour the text;R;G;Bm <-- rgb values

 //final String ANSI_GREENB = "\u001B[48;2;62;244;197m"; // prints the background as green

 final String ANSI_ORANGE1 = "\u001B[38;2;207;188;0m";

 //final String ANSI_BLACK = "\u001B[38;2;0,0,0m";
 //final String ANSI_WHITEB = "\u001B[48;2;240;240;240m";

 final String ANSI_WHITE = "\u001B[38;2;255;255;255m";

 final String ANSI_SOL1 = "\u001B[48;2;0;43;54m";

 final String ANSI_SOL11 = "\u001B[38;2;253;246;227m";

 final String ANSI_BLUE = "\u001B[38;2;38;139;218m";

 final String ANSI_SOL2 = "\u001B[38;2;131;148;150m";

 final String ANSI_YELLOW = "\u001B[38;2;181;137;0m";

 final String ANSI_BLACKB = "\u001B[48;2;0;0;0m";

 final String ANSI_GRAYB = "\u001B[48;2;35;35;50m";

 final String ANSI_RED = "\u001B[38;2;220;58;47m";

 // string to reset the colours to default values
 final String ANSI_RESET = "\033[49m";
 final String ANSI_RESET2 = "\033[39m";


//alphabet array
char ch[] = new char[27];
ch[0] = 'a';
ch[1] = 'b';
ch[2] = 'c';
ch[3] = 'd';
ch[4] = 'e';
ch[5] = 'f';
ch[6] = 'g';
ch[7] = 'h';
ch[8] = 'i';
ch[9] = 'j';
ch[10] = 'k';
ch[11] = 'l';
ch[12] = 'm';
ch[13] = 'n';
ch[14] = 'o';
ch[15] = 'p';
ch[16] = 'q';
ch[17] = 'r';
ch[18] = 's';
ch[19] = 't';
ch[20] = 'u';
ch[21] = 'v';
ch[22] = 'w';
ch[23] = 'x';
ch[24] = 'y';
ch[25] = 'z';

    while (menu == false){
   menuInsert = true;
System.out.println("Scegli:");
System.out.println("1 - Inserisci/cambia la parola chiave");
System.out.println("2 - Cifra un messaggio");
System.out.println("3 - Decifra un messaggio");
System.out.println("4 - Esci dal programma");
System.out.println("5 - debug");
// menu
//control if number > 1 & number < 5
scelta = sc.next();

if (scelta.charAt(0) < '1' || scelta.charAt(0) > '5'){
    System.out.println(ANSI_RED +"Hai inserito una scelta invalida! Devi inserire un numero tra 1 e 5.😶‍🌫️" + ANSI_RESET + ANSI_RESET2);
    menuInsert = false;
}
//method to return the number of the menu
while (menuInsert == true){
scelta1 = sceltaMenuSeiDic(scelta);

switch (scelta1){ //DEV notes: substituted the 5 If's with a switch.

case 1:

if (parolaChiave.equals("") && alreadySubstitutedKey == false || parolaChiave == "" && alreadySubstitutedKey == false){ 
System.out.print("Inserisci la parola chiave: " + ANSI_BOLD);
    parolaChiave = sc.next();
    System.out.print(ANSI_BOLD_END);
    alreadySubstitutedKey = false;
    menuInsert = false;

    for (int i = 0; i < parolaChiave.length(); i++){
        if (parolaChiave.charAt(i) < 'a' || parolaChiave.charAt(i) > 'z'){
            System.out.println(ANSI_RED + "Non si accettano caratteri che non siano lettere.😰" + ANSI_RESET + ANSI_RESET2);
            parolaChiave = "";
            menuInsert = false;
            break;
        }
    }
break;

} else if (alreadySubstitutedKey == true || !parolaChiave.equals("") || parolaChiave != ""){
    System.out.print(ANSI_ORANGE1 + "Hai già inserito una parola chiave, che è: " + parolaChiave + ". Vuoi sostituirla, o mantenere l'attuale? [S] per sostituire, [N] per mantenere l'attuale. --> " + ANSI_BLUE);
    String sceltaCase1 = sc.next();
    System.out.print(ANSI_RESET + ANSI_RESET2);


    switch (sceltaCase1){
    case "S":
    System.out.print("Quale parola chiave vuoi? --> " + ANSI_BOLD);
        parolaChiave = sc.next();
        System.out.print(ANSI_BOLD_END);
        menuInsert = false; //universal switch: causes the program to return to the start of it

        break;

        case "N":
        System.out.println(ANSI_GREEN1 + "La parola chiave rimarrà: " + parolaChiave + " ." + ANSI_RESET + ANSI_RESET2);
        menuInsert = false;
        break;

        default:
        System.out.println(ANSI_RED + "Mi dispiace, ma questa non è una lettera consentita.😒" + ANSI_RESET + ANSI_RESET2);
        break;
    }

    for (int i = 0; i < parolaChiave.length(); i++){
        if (parolaChiave.charAt(i) < 'a' || parolaChiave.charAt(i) > 'z'){
            System.out.println(ANSI_RED + "Non si accettano caratteri che non siano lettere.😰" + ANSI_RESET + ANSI_RESET2);
            parolaChiave = "";
            menuInsert = false;
            break;
        }
    }
}
    break;

    case 2:
    parolaData = "";
    System.out.println("Cifra un messaggio ");
    System.out.print("Inserisci la parola da cifrare: " + ANSI_BOLD);
    parolaData = sc.next();
    System.out.print(ANSI_BOLD_END);

    for (int i = 0; i < parolaChiave.length(); i++){
        if (parolaData.charAt(i) < 'a' || parolaData.charAt(i) > 'z'){
            System.out.println(ANSI_RED + "Non si accettano caratteri che non siano lettere.😰" + ANSI_RESET + ANSI_RESET2);
            parolaData = "";
            menuInsert = false;
            break;
        }
    }

    //error handler
 try {
    parolaCifrata1 = CifraMessaggio1(parolaChiave, parolaData); //transforms the word from normal word into remade word with keyword letters
    parolaCifrata2 = CifraMessaggio2(parolaCifrata1, parolaData, parolaChiave); //transforms the word from keyword letters word into cyphered word
    System.out.println("Ecco il messaggio cifrato: " + ANSI_BLUE + parolaCifrata2 + ANSI_RESET + ANSI_RESET2);
    menuInsert = false; 
 } catch (StringIndexOutOfBoundsException e){ //error handler
    System.out.print(ANSI_RED + "C'è stato un problema, ecco qua dei dettagli: ");

    if (parolaChiave.equals("") || parolaChiave == ""){
        System.out.println(ANSI_ORANGE1 + ANSI_BOLD +"Non hai inserito alcuna parola chiave. Ricordati di inserirne prima una, prima di cercare di cifrare un messaggio!" + ANSI_BOLD_END + ANSI_RESET + ANSI_RESET2);
        menuInsert = false;
        break;
    } else {
        System.out.println(ANSI_ORANGE1 + ANSI_BOLD +"Errore generico." + ANSI_BOLD_END + ANSI_RESET + ANSI_RESET2);
    }
 }
    break;

    case 3:
    System.out.println("Decifra un messaggio");
    System.out.print("Inserisci la parola da decifrare: ");
    if (!parolaCifrata2.equals("") || parolaCifrata2 != ""){
        System.out.print(ANSI_ORANGE1 +"Sembra che tu abbia già salvato un messaggio: " + parolaCifrata2 + " . Vuoi sostituirlo, o mantenere l'attuale? [S] per sostituire, [N] per mantenere l'attuale. --> " + ANSI_BLUE);
        String switchCase3 = sc.next();
         System.out.print(ANSI_RESET + ANSI_RESET2);

        switch (switchCase3){
        case "S":
        System.out.print("Inserisci la parola da decifrare: " + ANSI_BOLD);
        parolaCifrata2 = sc.next();
        System.out.print(ANSI_BOLD_END);
        menuInsert = false;
        break;

        case "N":
        System.out.println(ANSI_GREEN1 + "Va bene, verrà mantenuto " + parolaCifrata2 + " come messaggio da decriptare."+ANSI_RESET + ANSI_RESET2);
        menuInsert = false;
        break;
        }
    } else {
    parolaCifrata2 = sc.next();
    }

    for (int i = 0; i < parolaChiave.length(); i++){
        if (parolaCifrata2.charAt(i) < 'a' || parolaCifrata2.charAt(i) > 'z'){
            System.out.println(ANSI_RED + "Non si accettano caratteri che non siano lettere.😰" + ANSI_RESET + ANSI_RESET2);
            parolaCifrata2 = "";
            menuInsert = false;
            break;
        }
    }

    parolaMessaggio = decifraMessaggio(parolaCifrata2, parolaChiave, parolaData, parolaCifrata1);
    System.out.println("Il messaggio " + parolaCifrata2 + " decifrato equivale a: " + parolaMessaggio);
    menuInsert = false;
    break;
    /*
     * DEBUG:
     * thequickfoxjumpedoverthelazydog
     * canecanecanecanecanecanecanecan
     * vhruwipohoknwmcifoiittuinamcfot
     *
     * breaks in:
     * column n - position c - gives "c" when it is "p"
     * column n - position i - gives "i" when it is "v" 
     * column n - position z - gives "m" when it is "z"
     * column e - position y - gives "c" when it is "y"
     * Try why " abcdefghijklmnopqrstuwxyz" with key " abcdefghijklmnopqrstuwxyz" does not work.
     */

    case 4:
    System.out.println(ANSI_RED + "Esci dal programma" + ANSI_RESET + ANSI_RESET2);
    menu = true;
    System.exit(0);
    break;

    case 5:
    System.out.println("Debug menu");
    System.out.println("Cypher debug menu - Codename Vah Medoh");
    parolaChiave = "cane";
    parolaData = "programmazione";

    System.out.println("Imposto parola chiave come \"cane\" e parola data come \"programmazione\"");
    parolaCifrata1 = CifraMessaggio1(parolaChiave, parolaData);

    System.out.println();

    System.out.println("Stampo la matrice");
    MatrixDebug(); //prints the entire matrix

    System.out.println();

    System.out.println("Stampo la parola crittografata");
    parolaCifrata2 = cifraMessaggio2Debug(parolaCifrata1, parolaData, parolaChiave); //prints step by step all the cyphered variables
    System.out.println(parolaCifrata2);

    parolaMessaggio = decifraMessaggioDebug(parolaCifrata2, parolaChiave, parolaData, parolaCifrata1);

    System.out.println("");

    System.out.println("Stampo l'array n con valore alfabeto");
    parolaChiave = "n";
    for (int i = 0; i < ch.length; i++){
    parolaData = "" + ch[i];
    parolaCifrata1 = CifraMessaggio1(parolaChiave,parolaData);
    parolaCifrata2 = CifraMessaggio2(parolaCifrata1, parolaData, parolaChiave);
    parolaMessaggio = decifraMessaggio(parolaCifrata2, parolaChiave, parolaData, parolaCifrata1);
    System.out.println(parolaMessaggio);
    }
    menuInsert = false;
    break;

}
}
}
sc.close();
}
public static String CifraMessaggio1 (String parolachiave, String parolaData){
    //trasforma parola data in stringa trasformata

    String parolaCifrata = "";
    char caratterescelto = ' ';

    int j = 0;
    for (int i = 0; i < parolaData.length(); i++){ 
         //j : contatore per la lunghezza della seconda parola

        if (j > parolachiave.length() -1) //return from position final to zero, when the keyword ends
        j = 0;
        caratterescelto = parolachiave.charAt(j);
        parolaCifrata += "" + caratterescelto; //attach the char to the original cifred word
                
        j++;
    }
    return parolaCifrata;
    
}

public static void MatrixDebug(){ //do the matrix but actually print it
    String matrix[][] = new String[26][26]; //creates a new array
    int a = 0, b = 0;
    char ch = 'a'; //start with the letters from a


    //alfabeto
    char alfabeto[] = new char[26];
    for (int i = 0; i < 26; i++){
        alfabeto[i] = ch;
        ch++;
    }
    // end of alphabet

    //matrix for row 'a'
    ch = 'a'; //return to start
    for (int i = 0; i < 26;i++){
        matrix[1][i]= "" + ch; 
        ch++;
        System.out.print(" " + matrix[1][i] + " ");
    }
    System.out.print("\n");

    //entire matrix
    ch = 'a'; //reset char counter
    int i = 0;
    int howManyLetters = 26;
    int howManyLetters2 = 26; //counts how many letters are printed in one go --> to know how many letters to print afterwards
    boolean EnterIntoMatrixMode = true, finishedFirstMatrix = false; //boolean controls
    for (b = 1; b< 26; b++){
        ch = alfabeto[b]; //takes the letter corresponding to your position
        howManyLetters--;
        
        
        EnterIntoMatrixMode = true; //if true, do not repeat the sequence; when false, repeat the sequence
        for (int j = 0; j < 26; j++){
            howManyLetters--;
            howManyLetters2--; //
            
            if (EnterIntoMatrixMode == true){ //stamp the normal alphabet matrix
        for (i = 0; i < howManyLetters2; i++){
            matrix[b][i] = "" + ch; //b: row; i: column; completes an entire row and goes by and by each column
            ch++;
            System.out.print(" " + matrix[b][i] + " "); //prints the matrix from the starting letter to z
        }
    }
        EnterIntoMatrixMode = false; //disables matrix mode: restart the matrix from zero
        j = i; //counts how many letters the main matrix has printed (e.g. if you are in row "b", you've printed 25 out of 26 letters --> restart from column 25)
        ch = 'a'; //restart the count of the letters from zero

        for (;j<26;j++){ //limit the number of letters to the alphabet
        matrix[b][j] = "" + ch;
        ch++;
        System.out.print(" " + matrix[b][j] + " ");
        howManyLetters++;
        }
    }
        System.out.print("\n");

    }
    }


public static String cifraMessaggio2Debug(String CifraMessaggio1, String parolaData, String parolaChiave){
String cifraMessaggio2 = "";

//-debug Ciframessaggio2
//riga: lettera della parola data
//colonna: lettera della CifraMessaggio1

//conta in che posizione sono le lettere nell'alfabeto
char ch[] = new char[27];
ch[0] = 'a';
ch[1] = 'b';
ch[2] = 'c';
ch[3] = 'd';
ch[4] = 'e';
ch[5] = 'f';
ch[6] = 'g';
ch[7] = 'h';
ch[8] = 'i';
ch[9] = 'j';
ch[10] = 'k';
ch[11] = 'l';
ch[12] = 'm';
ch[13] = 'n';
ch[14] = 'o';
ch[15] = 'p';
ch[16] = 'q';
ch[17] = 'r';
ch[18] = 's';
ch[19] = 't';
ch[20] = 'u';
ch[21] = 'v';
ch[22] = 'w';
ch[23] = 'x';
ch[24] = 'y';
ch[25] = 'z';

int savednumber = 0, savednumber2 = 0, j = 1, x = 0; //values for positions and saved numbers
//Saved numbers values: number of the position of the found letter

/*
 * 1 - analyze char by char the given word - if letter found in position i in array ch, then save the value
 * 2 - analyze char by char the enc word - if letter found in position j in array ch, then save the value
 */
for (int i = 0; i <CifraMessaggio1.length();i++){

    boolean isA = false; //control boolean if both letters are two a's
    savednumber = 0; //reset the counters
    savednumber2 = 0;

    if (parolaData.charAt(i) == 'a' && CifraMessaggio1.charAt(i) == 'a'){
        isA = true; //goes to isA function
    }

    if (isA == false){
    for (j = 1; j < 26; j++){
        if (parolaData.charAt(i) == ch[j]) //verifies each character if corresponds to a letter of the alphabet
        /*
        * verifies the rows
         * counts all the array from zero, until it finds the same letter of parolaData
         * after so, it saves the number of the position of the letter
         */
        savednumber = j;

        if (parolaData.charAt(i) == 'a'){ //exception: if it's an a, directly set it as "zero" and skip the rest of the instructions
        savednumber = 0;
        break; //skips the for
        }

        if (savednumber != 0)
        break; //exits the for cicle
    }

    for (x = 0; x < 26; x++){
        //the same as the first one, but for the parolaCifrata1
        //verifies the columns
        if (CifraMessaggio1.charAt(i) == ch[x])
        savednumber2 = x;

        if (savednumber2 != 0)
        break;
    }
    }

    if (isA == true){
        cifraMessaggio2 = cifraMessaggio2 + 'a'; //manually set up that, if both letters are an 'a', then add an 'a'
        //doesn't mess up with the zero
    }


    if (isA == false) //normal execution
    cifraMessaggio2 = cifraMessaggio2 + Matrix(savednumber, savednumber2); //checks in the matrix what's the corresponding letter
    System.out.println("savednumber: " + savednumber + ", savednumber2: " + savednumber2 + " , i:" + i + " ,j:" + j + " ,x: " + x + ", encrypted message: " + cifraMessaggio2 + " , og char: " + parolaData.charAt(i) + ", corr array: " + ch[j] + " , enc char: " + cifraMessaggio2.charAt(i) + ", corr array 2: " + ch[x]);
    }
    

    return cifraMessaggio2;
}


public static String CifraMessaggio2(String CifraMessaggio1, String parolaData, String parolaChiave){
    String cifraMessaggio2 = "";
    
    //check debug ver for more comments
    //riga: lettera della parola data
    //colonna: lettera della CifraMessaggio1
    
    //conta in che posizione sono le lettere nell'alfabeto
    char ch[] = new char[27];
    ch[0] = 'a';
    ch[1] = 'b';
    ch[2] = 'c';
    ch[3] = 'd';
    ch[4] = 'e';
    ch[5] = 'f';
    ch[6] = 'g';
    ch[7] = 'h';
    ch[8] = 'i';
    ch[9] = 'j';
    ch[10] = 'k';
    ch[11] = 'l';
    ch[12] = 'm';
    ch[13] = 'n';
    ch[14] = 'o';
    ch[15] = 'p';
    ch[16] = 'q';
    ch[17] = 'r';
    ch[18] = 's';
    ch[19] = 't';
    ch[20] = 'u';
    ch[21] = 'v';
    ch[22] = 'w';
    ch[23] = 'x';
    ch[24] = 'y';
    ch[25] = 'z';
    
    int savednumber = 0, savednumber2 = 0, j = 1, x = 0;
    
    /*
     * 1 - analyze char by char the given word - if letter found in position i in array ch, then save the value
     * 2 - analyze char by char the enc word - if letter found in position j in array ch, then save the value
     */
    for (int i = 0; i <CifraMessaggio1.length();i++){
    
        boolean isA = false;
        savednumber = 0;
        savednumber2 = 0;
    
        if (parolaData.charAt(i) == 'a' && CifraMessaggio1.charAt(i) == 'a'){
            isA = true;
        }
    
        if (isA == false){
        for (j = 1; j < 26; j++){
            if (parolaData.charAt(i) == ch[j])
            savednumber = j;
    
            if (parolaData.charAt(i) == 'a'){
            savednumber = 0;
            break;
            }
    
            if (savednumber != 0)
            break;
        }
    
        for (x = 0; x < 26; x++){
            if (CifraMessaggio1.charAt(i) == ch[x])
            savednumber2 = x;
    
            if (savednumber2 != 0)
            break;
        }
        }
    
        if (isA == true){
            cifraMessaggio2 = cifraMessaggio2 + 'a';
        }
    
    
        if (isA == false)
        cifraMessaggio2 = cifraMessaggio2 + Matrix(savednumber, savednumber2);
        }
        
    
        return cifraMessaggio2;
    }
    

public static String Matrix(int c, int d){
    //check matrix debug for more comments
    String matrix[][] = new String[26][26];
    int a = 0, b = 0;
    char ch = 'a';


    //alfabeto
    char alfabeto[] = new char[26];
    for (int i = 0; i < 26; i++){
        alfabeto[i] = ch;
        ch++;
    }
    //

    //first row of the matrix
    ch = 'a';
    for (int i = 0; i < 26;i++){
        matrix[1][i]= "" + ch;
        ch++;
    }

    ch = 'a';
    int i = 0;
    int howManyLetters = 26;
    int howManyLetters2 = 26;
    boolean EnterIntoMatrixMode = true;
    for (b = 1; b< 26; b++){
        ch = alfabeto[b];
        howManyLetters--;
        
        
        EnterIntoMatrixMode = true;
        for (int j = 0; j < 26; j++){
            howManyLetters--;
            howManyLetters2--;
            
            if (EnterIntoMatrixMode == true){
        for (i = 0; i < howManyLetters2; i++){
            matrix[b][i] = "" + ch;
            ch++;
            
        }
    }
        EnterIntoMatrixMode = false;
        j = i;
        ch = 'a';

        for (;j<26;j++){
        matrix[b][j] = "" + ch;
        ch++;
        howManyLetters++;
        }
    }
        

    }

    String matrixPosition = matrix[c][d];
    //c and d: numbers that they're given to the matrix from the other method, aka the ones you selected

    //matrice per posizione zero, ovvero A
    if (c == 0){
    String matrixA[][] = new String[1][26];
    ch = 'a';
    for (int e = 0; e < 26; e++){
        ch = alfabeto[e];
    matrixA[0][e] = "" + ch; //checks again every letter to create a new matrix for a single row

    }
    matrixPosition = matrixA[0][d]; //give the char corresponding to the first line and a given position
    }

    if (c == 0 && d == 0)
    matrixPosition = "a"; //manual exception: if both terms are '0' then manually set up the character

    return matrixPosition;
    }


public static String decifraMessaggioDebug (String CifraMessaggio2, String parolaChiave, String parolaData, String CifraMessaggio1){
String messaggio = "";
boolean skipFirst = false, haveICountedtheSecond = false, enterCheckLetterMode = true, resetTheCicle = false, doubleAMode = false, sameMode = false, aOnlyMode = false;
CifraMessaggio1 = CifraMessaggio1(parolaChiave, parolaData);
char savedletter1 = ' ', savedletter2 = ' ';
int savedletter1number = 0, savedletter2number = 0;
String savedletter2string = "", matrixsavedletter = "";

System.out.println("Stampo il messaggio decriptato: ");
 /*
  * 1. recreate the parolaCifrata1
  * 2. scan letter by letter the cyphered message, scan the matrix letter by letter, 
  */

  //conta in che posizione sono le lettere nell'alfabeto
  char ch[] = new char[27];
  ch[0] = 'a';
  ch[1] = 'b';
  ch[2] = 'c';
  ch[3] = 'd';
  ch[4] = 'e';
  ch[5] = 'f';
  ch[6] = 'g';
  ch[7] = 'h';
  ch[8] = 'i';
  ch[9] = 'j';
  ch[10] = 'k';
  ch[11] = 'l';
  ch[12] = 'm';
  ch[13] = 'n';
  ch[14] = 'o';
  ch[15] = 'p';
  ch[16] = 'q';
  ch[17] = 'r';
  ch[18] = 's';
  ch[19] = 't';
  ch[20] = 'u';
  ch[21] = 'v';
  ch[22] = 'w';
  ch[23] = 'x';
  ch[24] = 'y';
  ch[25] = 'z';
  
  for (int i = 0; i < CifraMessaggio1.length(); i++){
    haveICountedtheSecond = false;
    skipFirst = false;
    savedletter1 = CifraMessaggio1.charAt(i);
        savedletter2 = CifraMessaggio2.charAt(i);
        enterCheckLetterMode = true;
        doubleAMode = false; sameMode = false; aOnlyMode = false;

        if (savedletter1 == 'n' && savedletter2 == 'b'){
            messaggio += "" + "o";
            enterCheckLetterMode = false;
            haveICountedtheSecond = true;
            skipFirst = true;
            doubleAMode = true;
            sameMode = true;
            // if you put enterCheckLetterMode = false, haveICountedtheSecond = true and skipFirst = true it skips the checks for the rest of the string
            // enterCheckLetterMode = checks letter by letter
            // haveICountedtheSecond = gives you true if it already counted the letter of the cyphered part
            // skipFirst = handy when you need to skip checking on the first string, e.g. when resetting the circle
        }

        // doubleAMode
        if (savedletter1 == 'a' && savedletter2 == 'a'){
            messaggio += "" + "a";
            enterCheckLetterMode = false;
            haveICountedtheSecond = true;
            skipFirst = true;
            doubleAMode = true;
            
           }

           //sameMode
           if (savedletter1 == savedletter2 && doubleAMode == false){
            messaggio += "" + "a";
            enterCheckLetterMode = false;
            haveICountedtheSecond = true;
            skipFirst = true;
            sameMode = true;
           }

        // aOnlyMode: uses the alphabet array instead than the matrix
           if (savedletter1 == 'a' && doubleAMode == false && sameMode == false){
            enterCheckLetterMode = false;
            haveICountedtheSecond = true;
            skipFirst = true;

            // for to check letter by letter the alphabet array
            for (int b = 0; b < ch.length; b++){
                if (ch[b] == savedletter2){
                    messaggio += "" + ch[b];
                    break;
                }
            }
           }
        for (int j = 0; enterCheckLetterMode == true;j++){ //checks letter by letter
            
            if (!savedletter2string.equals("")) {
            j = 0;
            skipFirst = true; //if it hasn't checked yet the second string then check it, and do not check the first string
            }
            if (savedletter1 == ch[j] && skipFirst == false){
                savedletter1number = j;
                skipFirst = true;
                resetTheCicle = true;
                
            }

            if (savedletter1 == ch[j] && resetTheCicle == true){
            j= 0;
            haveICountedtheSecond = true; //resets the cicle back to zero in order to go back to the first letter of the alphabet and recheck all the letters
            }
            resetTheCicle = false;
              if (savedletter2 == ch [j]){
                savedletter2number = j;
                savedletter2string = "" + savedletter2; //transforms the char to string

                if (savedletter1 == 'a' && savedletter2 == 'a'){
                    messaggio += "" + "a";
                    enterCheckLetterMode = false;
                    break; //old debug check mode, useless
                   }
                for (int a = 0; a < ch.length-1; a++){ //checks letter by lette rinn the matrix
                    matrixsavedletter = Matrix(savedletter1number, a);
                    if (savedletter2string.equals(matrixsavedletter) && a != 0){
                       if (savedletter1 == 'a' && savedletter2 == 'a'){
                        messaggio += "" + "a";
                        enterCheckLetterMode = false;
                        break; //old debug checkk mode, useless
                       }
                        savedletter2number = a; //keep track of the position of the letter in the alphabet
                        messaggio += "" + ch[a]; //add the letter to the message
                        enterCheckLetterMode = false; //exit from this mode, and return to the original method mode
                        savedletter1 = ' '; savedletter2 = ' '; savedletter1number = 0; savedletter2number = 0; savedletter2string = ""; matrixsavedletter = ""; //reset all the variables
                        break;
                    }

                }
                
            }

        }
   
  }
  System.out.print(" " + messaggio + " ");
return messaggio;
}

public static String decifraMessaggio (String CifraMessaggio2, String parolaChiave, String parolaData, String CifraMessaggio1){
    String messaggio = "";
    boolean skipFirst = false, haveICountedtheSecond = false, enterCheckLetterMode = true, resetTheCicle = false, doubleAMode = false, sameMode = false, aOnlyMode = false;
    CifraMessaggio1 = CifraMessaggio1(parolaChiave, parolaData);
    char savedletter1 = ' ', savedletter2 = ' ';
    int savedletter1number = 0, savedletter2number = 0;
    String savedletter2string = "", matrixsavedletter = "";
    
    System.out.println("Stampo il messaggio decriptato: ");
     /*
      * 1. recreate the parolaCifrata1
      * 2. scan letter by letter the cyphered message, scan the matrix letter by letter, 
      */
    
      //conta in che posizione sono le lettere nell'alfabeto
      char ch[] = new char[27];
      ch[0] = 'a';
      ch[1] = 'b';
      ch[2] = 'c';
      ch[3] = 'd';
      ch[4] = 'e';
      ch[5] = 'f';
      ch[6] = 'g';
      ch[7] = 'h';
      ch[8] = 'i';
      ch[9] = 'j';
      ch[10] = 'k';
      ch[11] = 'l';
      ch[12] = 'm';
      ch[13] = 'n';
      ch[14] = 'o';
      ch[15] = 'p';
      ch[16] = 'q';
      ch[17] = 'r';
      ch[18] = 's';
      ch[19] = 't';
      ch[20] = 'u';
      ch[21] = 'v';
      ch[22] = 'w';
      ch[23] = 'x';
      ch[24] = 'y';
      ch[25] = 'z';

      //n alphabet array
      char chn[] = new char [27];
      chn [0]='n';
      chn[1]='o';
      chn[2]='p';
      chn[3]='q';
      chn[4]='r';
      chn[5]='s';
      chn[6]='t';
      chn[7]='u';
      chn[8]='v';
      chn[9]='w';
      chn[10]='x';
      chn[11]='y';
      chn[12]='z';
      chn[13]='a';
      chn[14]='b';
      chn[15]='c';
      chn[16]='d';
      chn[17]='e';
      chn[18]='f';
      chn[19]='g';
      chn[20]='h';
      chn[21]='i';
      chn[22]='j';
      chn[23]='k';
      chn[24]='l';
      chn[25]='m';
      
      for (int i = 0; i < CifraMessaggio1.length(); i++){
        haveICountedtheSecond = false;
        skipFirst = false;
        savedletter1 = CifraMessaggio1.charAt(i);
            savedletter2 = CifraMessaggio2.charAt(i);
            enterCheckLetterMode = true;
            doubleAMode = false; sameMode = false; aOnlyMode = false;
    
           
            
    
            // doubleAMode
            if (savedletter1 == 'a' && savedletter2 == 'a'){
                messaggio += "" + "a";
                enterCheckLetterMode = false;
                haveICountedtheSecond = true;
                skipFirst = true;
                doubleAMode = true;
                
               }
    
               //sameMode
               if (savedletter1 == savedletter2 && doubleAMode == false){
                messaggio += "" + "a";
                enterCheckLetterMode = false;
                haveICountedtheSecond = true;
                skipFirst = true;
                sameMode = true;
               }
    
            // aOnlyMode: uses the alphabet array instead than the matrix
               if (savedletter1 == 'a' && doubleAMode == false && sameMode == false){
                enterCheckLetterMode = false;
                haveICountedtheSecond = true;
                skipFirst = true;
    
                // for to check letter by letter the alphabet array
                for (int b = 0; b < ch.length; b++){
                    if (ch[b] == savedletter2){
                        messaggio += "" + ch[b];
                        break;
                    }
                }
               }

               //special n mode
               if (savedletter1 == 'n'  && sameMode == false && doubleAMode == false){
                for (int b = 0; b < ch.length; b++){
                    if(savedletter2 == chn[b]){
                        messaggio += "" + ch[b];
                        break;
                    }
                }
                enterCheckLetterMode = false;
                skipFirst = true;
                sameMode = true;
                haveICountedtheSecond = true;
               }
            for (int j = 0; enterCheckLetterMode == true;j++){ //checks letter by letter
                
                if (!savedletter2string.equals("")) {
                j = 0;
                skipFirst = true; //if it hasn't checked yet the second string then check it, and do not check the first string
                }
                if (savedletter1 == ch[j] && skipFirst == false){
                    savedletter1number = j;
                    skipFirst = true;
                    resetTheCicle = true;
                    
                }
    
                if (savedletter1 == ch[j] && resetTheCicle == true){
                j= 0;
                haveICountedtheSecond = true; //resets the cicle back to zero in order to go back to the first letter of the alphabet and recheck all the letters
                }
                resetTheCicle = false;
                  if (savedletter2 == ch [j]){
                    savedletter2number = j;
                    savedletter2string = "" + savedletter2; //transforms the char to string
    
                    if (savedletter1 == 'a' && savedletter2 == 'a'){
                        messaggio += "" + "a";
                        enterCheckLetterMode = false;
                        break; //old debug check mode, useless
                       }
                    for (int a = 0; a < ch.length-1; a++){ //checks letter by lette rinn the matrix
                        matrixsavedletter = Matrix(savedletter1number, a);
                         if (savedletter2string.equals(matrixsavedletter) && a != 0){
                           if (savedletter1 == 'a' && savedletter2 == 'a'){
                            messaggio += "" + "a";
                            enterCheckLetterMode = false;
                            break; //old debug checkk mode, useless
                           }
                            savedletter2number = a; //keep track of the position of the letter in the alphabet
                            messaggio += "" + ch[a]; //add the letter to the message
                            enterCheckLetterMode = false; //exit from this mode, and return to the original method mode
                            savedletter1 = ' '; savedletter2 = ' '; savedletter1number = 0; savedletter2number = 0; savedletter2string = ""; matrixsavedletter = ""; //reset all the variables
                            break;
                        }
    
                    }
                    
                }
    
            }
       
    }
    return messaggio;
}

}

