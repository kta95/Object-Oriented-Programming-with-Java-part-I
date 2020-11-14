
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        action(reader);
    }
    
    public static void action(Scanner reader) {
        ArrayList<Student> students = new ArrayList<Student>();
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
               break; 
            }
            System.out.print("studentnumber: ");
            String studentNum = reader.nextLine();
            Student newStudent = new Student(name, studentNum);
            students.add(newStudent);
        }
        System.out.println("");
        for (Student stdInfo : students) {
            System.out.println(stdInfo);
        }
        
        System.out.println("");
        System.out.print("Give search term: ");
        String text = reader.nextLine();
        System.out.println("Result:");
        for (Student std : students) {
            if (std.getName().contains(text)) {
                System.out.println(std);
            }
        }
    }
}
