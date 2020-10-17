
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int counter = 0;
        // program your solution here. Do not touch the above lines!
        while (true) {
            System.out.print("Guess a number: ");
            int userInput = Integer.parseInt(reader.nextLine());
            if (userInput == numberDrawn) {
                break;
            }
            counter++;
            if (userInput > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + counter);
            } else {
                System.out.println("The number is greater, guesses made: " + counter);
            }        
        }
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
