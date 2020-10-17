
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int userNum = Integer.parseInt(reader.nextLine());
        int result = 0;
        int counter = 0;
        while (counter <= userNum) {
            int temp = (int)Math.pow(2, counter);
            result += temp;
            counter++;
        }
        System.out.println("The result is " + result);
    }
}
