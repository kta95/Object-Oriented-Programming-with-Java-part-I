
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int initNum = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int userNum = Integer.parseInt(reader.nextLine());
        while (initNum <= userNum) {
            System.out.println(initNum);
            initNum++;
        }

    }
}
