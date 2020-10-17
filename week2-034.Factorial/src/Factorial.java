import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int result = 1;
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        if (num != 0) {
            int counter = 1;
            while (counter <= num) {
                result *= counter;
                counter++;
            }
        }
        System.out.println("Factorial is " + result);
    }
}
