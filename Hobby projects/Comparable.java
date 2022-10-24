import java.util.Scanner;

public class Comparable {
    public static void main(String[]args) {

                        // box drawing characters
                /*
     ─	━	│	┃	┄	┅	┆	┇	┈	┉	┊	┋	┌	┍	┎	┏
    ┐	┑	┒	┓	└	┕	┖	┗	┘	┙	┚	┛	├	┝	┞	┟
	┠	┡	┢	┣	┤	┥	┦	┧	┨	┩	┪	┫	┬	┭	┮	┯
	┰	┱	┲	┳	┴	┵	┶	┷	┸	┹	┺	┻	┼	┽	┾	┿
	╀	╁	╂	╃	╄	╅	╆	╇	╈	╉	╊	╋	╌	╍	╎	╏
	═	║	╒	╓	╔	╕	╖	╗	╘	╙	╚	╛	╜	╝	╞	╟
	╠	╡	╢	╣	╤	╥	╦	╧	╨	╩	╪	╫	╬	╭	╮	╯
	╰	╱	╲	╳	╴	╵	╶	╷	╸	╹	╺	╻	╼	╽	╾	╿
                 */

    String start = """
        ╔════════════════════════════════════════════════════════════╗
        ║                                                            ║
        ║ Compare two strings in a lessographic order/////////////// ║
        ║ //////////////Aka which string comes first in the alphabet ║
        ║                                                            ║ 
        ╙────────────────────────────────────────────────────────────╜
        ╟                                                            ╢
            """;
        Scanner in = new Scanner(System.in);
System.out.print(start);
        System.out.print("╟ Here the first string:                                     ╢ ┣━━━╼ ");
        String phrase1 = in.nextLine();

        System.out.print("╟ Here the second string:                                    ╢ ┣━━━╼ " );
        String phrase2 = in.nextLine();

        int compare1 = phrase1.compareTo(phrase2);

        if (compare1 > 0){
            System.out.println("╟ The second string is sadly coming first.                   ╢");
        }
        else {
            System.out.println("╟ You're lucky the first string comes first                  ╢");

        }
        if (compare1 == 0) {
        System.out.println("╟ The two strings are identical!                       ╢");
    }

    in.close();
    }

}
