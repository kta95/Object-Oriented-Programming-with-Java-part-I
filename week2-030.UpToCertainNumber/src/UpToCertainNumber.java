
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int initNum = 1;
        System.out.print("Up to what number? ");
        int userNum = Integer.parseInt(reader.nextLine());
        while (initNum <= userNum) {
            System.out.println(initNum);
            initNum++;
        }
        
    }
}
