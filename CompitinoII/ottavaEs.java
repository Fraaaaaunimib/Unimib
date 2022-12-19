package CompitinoII;

public class ottavaEs {

    public static void main (String[]args){
        String espressione = "";
        String valori = "";
        espressione = args[0];
            valori = args[1];
        boolean checkExpression = checkEspr(espressione);
            System.out.println(checkExpression);
        }
    

    public static boolean checkEspr(String espressione){
        boolean checkLetter = true;
        for (int i = 0; i < espressione.length(); i += 1){
            try {
            if (espressione.charAt(i) >= 'A' && espressione.charAt(i) <= 'Z' || espressione.charAt(i) >= '0' && espressione.charAt(i) <= '9'){
                checkLetter = true;
            } else {
                checkLetter = false;
            }
            if (checkLetter == false && espressione.charAt(i+1) != '-' || espressione.charAt(i+1) != '+'){
                return false;
            }
        } catch (IndexOutOfBoundsException e){
            System.out.print("");
        }
        }
        return true;
    }
}