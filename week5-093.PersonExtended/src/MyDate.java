
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */

    public int differenceInYears(MyDate comparedDate) {
        int result = this.year - comparedDate.year;
        if (result < 0) {
            result *= -1;
        }
        int comparedDays = 0;
        int thisDays = 0;
        if (this.year < comparedDate.year){
            comparedDays = (result * 365) + (comparedDate.month * 30) + comparedDate.day; 
            thisDays = (this.month * 30) + this.day;
        } else {
            comparedDays = (comparedDate.month * 30) + comparedDate.day; 
            thisDays = (result * 365) + (this.month * 30) + this.day;            
        }
        int finalResult = (thisDays - comparedDays) / 365;
        if (finalResult < 0) {
            finalResult *= -1;
        }
        
        return finalResult;
    }

  
}
