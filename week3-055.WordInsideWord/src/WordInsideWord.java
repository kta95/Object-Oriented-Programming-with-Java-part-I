
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String text = reader.nextLine();
        System.out.print("Type the second word: ");
        String ndtext = reader.nextLine(); 
        if (text.indexOf(ndtext) == -1) {
            System.out.println("The word '" + ndtext + "' is not found in the word '" + text + "'.");
        } else {
            System.out.println("The word '" + ndtext + "' is found in the word '" + text + "'.");
        }
    }
}
