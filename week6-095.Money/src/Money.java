
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int myEuros = this.euros + added.euros();
        int myCents = this.cents + added.cents();
        if (myCents > 99) {
            myEuros += myCents / 100;
            myCents %= 100;
        }        
        Money newMoney = new Money(myEuros, myCents);
        
        return newMoney;
    }
    
    public boolean less(Money compared) {
        if (this.euros > compared.euros()) {
            return false;
        } else if (this.euros == compared.euros()) {
            if (this.cents >= compared.cents()) {
                return false;
            }
        }
        
        return true;
    }
    
        
    public Money minus(Money decremented) {
        int myEuros = this.euros - decremented.euros();
        int myCents = this.cents;
        if (myEuros < 0) {
            myEuros = 0;
        }
        if (this.cents < decremented.cents()) {
            myEuros -= 1;
            myCents += 100;
        }
        myCents = myCents - decremented.cents();
        if (myCents > 99) {
            myEuros += myCents / 100;
            myCents %= 100;
        }
        if (myCents < 0) {
            myCents = 0;
        }
        if (this.less(decremented)) {
            myEuros = 0;
            myCents = 0;
        }
        Money newMoney = new Money(myEuros, myCents);
        
        return newMoney;        
    }
}
