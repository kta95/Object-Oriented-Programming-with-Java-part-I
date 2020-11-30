import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        doSomething(scanner);
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
    
    public static void doSomething(Scanner scanner) {
        ArrayList<Integer> scores = new ArrayList<Integer> ();
        System.out.println("Type exam scores, -1 completes:");
        while(true) {
            int score = Integer.parseInt(scanner.nextLine());
            if (score == -1) {
                break;
            }
            if (score >= 0 && score <= 60) {
                scores.add(score);  
            }
        }
        System.out.println("");
        helper(scores);
    }
    
    public static void helper(ArrayList<Integer> scan) {
        int accepted = 0;
        ArrayList<Integer> grades = new ArrayList<Integer>();
        for (int g = 0; g < 6; g++) {
            grades.add(0);
        }
        System.out.println("Grade distribution:");
        for (int i = 0; i < scan.size(); i++) {          
            int index = grading(scan.get(i));
            grades.set(index, grades.get(index) + 1);
        }
        for (int j = 5; j >= 0; j--) {
            System.out.println(j + ": " + star(grades.get(j)));
            if (j > 0) {
                accepted += grades.get(j);
            }
        }
        System.out.println("Acceptance percentage: " + (100 * accepted) / (double) scan.size());
       
    }
    
    public static String star(int num) {
        String result = "";
        for(int i = 0; i < num; i++) {
            result += "*";
        }
        return result;
    }
    
    public static int grading (int point) {
        if (point >= 30 && point <= 34) {
            return 1;
        } else if (point >= 35 && point <= 39) {
            return 2;
        } else if (point >= 40 && point <= 44) {
            return 3;
        } else if (point >= 45 && point <= 49) {
            return 4;
        } else if (point >= 50 && point <= 60) {
            return 5;
        }
        return 0;
    }
}
