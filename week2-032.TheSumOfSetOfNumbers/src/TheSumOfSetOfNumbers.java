
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.print("Until what? ");
        int i = Integer.parseInt(reader.nextLine());
        int count = 0;
        while (count <= i) {
            sum += count;
            count++;
        }
        System.out.println("Sum is " + sum);
    }
}
