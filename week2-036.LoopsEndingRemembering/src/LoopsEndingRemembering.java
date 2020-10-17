import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Type numbers:");
        while (true) {
            int num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += num;
            counter++;
        }
        double avg = (1.0 * sum) / counter; 
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + even);
        System.out.println("odd numbers: "+ odd);
    }
}
