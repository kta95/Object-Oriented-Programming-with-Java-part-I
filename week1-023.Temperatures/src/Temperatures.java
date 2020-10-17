
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.print("enter a floating point number: ");
            double value = Double.parseDouble(reader.nextLine());

            if (value < 40 && value > -30) {
                Graph.addNumber(value);
            }
        }
        
        
        
        // Graph is used as follows:
        // Remove or comment out these lines above before trying to run the tests.
    }
}
