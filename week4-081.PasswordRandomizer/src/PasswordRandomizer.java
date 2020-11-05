import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passwordLen;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLen = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        for(int i = 0; i < this.passwordLen; i++) {
            int number = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password += symbol;
        }
        return password;
    }
}
