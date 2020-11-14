
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value;
    private int upperLimit;
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue( int newValue) {
        if (newValue <= this.upperLimit && newValue > 0) {
            this.value = newValue;
        }
    }
    
    public BoundedCounter(int upperBound) {
        this.value = 0;
        this.upperLimit = upperBound;
    }
    
    public void  next() {
        if (this.value >= this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }
    
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }    
}
