
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        int evenNum = 1;
        while (evenNum <= 100) {
            if (evenNum % 2 == 0) {
                System.out.println(evenNum);
            }
            evenNum++;
        }
    }
}
