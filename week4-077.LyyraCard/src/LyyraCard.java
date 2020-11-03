public class LyyraCard {
    private double balance;
    
    public LyyraCard(double startingBalance) {
        this.balance = startingBalance;
    }
    
    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }
    
    public void payGourmet() {
        if (this.balance >= 4.00){
            this.balance -= 4.00;
        }
    }
    
    public void loadMoney(double amount) {
        if (amount > 0) {
            double total = this.balance + amount;
            if (total <= 150){
                this.balance += amount;
            } else if (total > 150) {
                this.balance = 150;
            }
        }
    }
    public String toString() {
        return "The card has " + balance + " euros";
    }
}
