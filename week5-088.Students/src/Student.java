public class Student {
    
    private String name;
    private String studentNumber;
    
    public Student (String initName, String initStudentNumber) {
        this.name = initName;
        this.studentNumber = initStudentNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.studentNumber + ")";
    }
    
    
}
