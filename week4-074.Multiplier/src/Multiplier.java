public class Multiplier {
    private int num;
    
    public Multiplier(int number) {
        this.num = number;
    }
    
    public int multiply(int otherNumber) {
        return otherNumber * this.num;
    }
}
