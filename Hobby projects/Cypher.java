
import java.util.Scanner;
public class Cypher {
    
    public static int sceltaMenuSeiDic(int scelta){

        if (scelta == 1)
         return 1;
 
         if (scelta == 2)
         return 2;
 
         if (scelta == 3)
         return 3;
 
         if (scelta == 4)
         return 4;
 
         if (scelta == 5)
         return 5;
 
         return 0;
     
                 
     }
 
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    //variabili
    String parolaChiave = "", parolaData = "", parolaCifrata1 = "", parolaCifrata2 = "", parolaMessaggio = "";
    /*
     * parolaChiave = posizione 1
     * parolaData = word which you put
     * ParolaCifrata1 = transformed from normal into 1conv (choice 1)
     * parolaCifrata2 = transformed using the matrix
     * parolaMessaggio = your message which should be decrypted
     */

    boolean menu = false; //controls the menu
int scelta = 0, scelta1 = 0; //choices variables for the menu

    while (menu == false){
System.out.println("Scegli:");
System.out.println("1 - Inserisci/cambia la parola chiave");
System.out.println("2 - Cifra un messaggio");
System.out.println("3 - Decifra un messaggio");
System.out.println("4 - Esci dal programma");
System.out.println("5 - debug");
// menu
//control if number > 1 & number < 5
scelta = sc.nextInt();

//method to return the number of the menu
scelta1 = sceltaMenuSeiDic(scelta);


if (scelta1 == 1) { //change the keyword
    System.out.println("Inserisci la parola chiave" );
    parolaChiave = sc.next();
}

if (scelta1 == 2) { //cypher the message
    System.out.println("Cifra un messaggio ");
    System.out.print("Inserisci la parola da cifrare: ");
    parolaData = sc.next();

    parolaCifrata1 = CifraMessaggio1(parolaChiave, parolaData); //transforms the word from normal word into remade word with keyword letters
    parolaCifrata2 = CifraMessaggio2(parolaCifrata1, parolaData, parolaChiave); //transforms the word from keyword letters word into cyphered word
    System.out.println(parolaCifrata2);
    
}

if (scelta1 == 3) {
    System.out.println("Decifra un messaggio");
    System.out.print("Inserisci la parola da decifrare: ");
    parolaData = sc.next();

    
}

if (scelta1 == 4) {
    System.out.println("Esci dal programma");
    menu = true;
    System.exit(0);
}

if (scelta1 == 5){
    System.out.println("Debug menu");
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
    System.out.println(parolaMessaggio);
    
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
    System.out.print("\n");

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
boolean skipFirst = false, haveICountedtheSecond = false, enterCheckLetterMode = true;
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
    savedletter1 = CifraMessaggio1.charAt(i);
        savedletter2 = CifraMessaggio2.charAt(i);
        enterCheckLetterMode = true;

        for (int j = 0; enterCheckLetterMode == true;j++){
            
            if (!savedletter2string.equals(""))
            j = 0;
            skipFirst = false;
            if (savedletter1 == ch[j] && haveICountedtheSecond == false){
                savedletter1number = j;
                skipFirst = true;
                
            }

            if (savedletter1 == ch[j] && skipFirst == true){
            j= 0;
            haveICountedtheSecond = true;
            }
             if (savedletter2 == ch [j]){
                savedletter2number = j;
                savedletter2string = "" + savedletter2;

                for (int a = 0; a < ch.length-1; a++){
                    matrixsavedletter = Matrix(savedletter1number, a);
                    if (savedletter2string.equals(matrixsavedletter) && a != 0){
                        savedletter2number = a;
                        messaggio += "" + ch[a];
                        enterCheckLetterMode = false;
                        savedletter1 = ' '; savedletter2 = ' '; savedletter1number = 0; savedletter2number = 0; savedletter2string = ""; matrixsavedletter = "";
                        break;
                    }

                    if (a == 0 && savedletter2string.equals(matrixsavedletter)){
                        savedletter2number = a;
                        break;
                }

                
                
                }
                
            }

        }

        
        
  }
  System.out.print(" " + messaggio + " ");
return messaggio;
}
}

