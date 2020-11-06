
import java.util.ArrayList;


public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        // if the letter has already been guessed, nothing happens
        if (!this.guessedLetters.contains(letter)) {
            // it the word does not contains the guessed letter, number of faults increase
            if (!this.word.contains(letter)){
                this.numberOfFaults ++;
            }
            // the letter is added among the already guessed letters
            this.guessedLetters += letter;
        }      
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String temp = "";
        for (int count = 0; count < this.word.length(); count++) {
            temp += "_";
        }
        // create the hidden word by interating through this.word letter by letter
        StringBuilder hiddenWord = new StringBuilder(temp);
        // if the letter in turn is within the guessed words, put it in to the hidden word
        for (int i = 0; i < this.word.length(); i++) { 
            char fu = this.word.charAt(i);
            for (int j = 0; j < this.guessedLetters.length(); j++) {
                char gl = this.guessedLetters.charAt(j);
                if (fu == gl) {
                    hiddenWord.setCharAt(i, gl);
                    break;
                }
            }
        }
        // if the letter is not among guessed, replace it with _ in the hidden word 
        String hw = "";
        hw += hiddenWord;
        // return the hidden word at the end
        return hw;
    }
}
