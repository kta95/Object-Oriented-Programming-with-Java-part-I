public class Counter {
    private int counter;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.check = check;
        this.counter = startingValue;
    }
    public Counter(int startingValue){
        this(startingValue, true);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter() {
        this.counter = 0;
        this.check = false;
    }
    
    public int value() {
        return this.counter;
    }
    
    public void increase() {
        this.counter++;
    }
    
    public void decrease() {
        if (this.check) {
            if (this.counter >= 1) {
                this.counter--;
            }
        } else {
            this.counter--;
        }
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.counter += increaseAmount;        
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (this.check) {
                if (this.counter >= 1) {
                    this.counter -= decreaseAmount;
                    if (this.counter < 0) {
                        this.counter = 0;
                    }
                }
            } else {
                this.counter -= decreaseAmount;
            }        
        }
    }
}
