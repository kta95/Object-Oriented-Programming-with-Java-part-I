
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment otherApartment) {
        int tempValue = this.pricePerSquareMeter * this.squareMeters;
        int otherValue = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        int result = tempValue - otherValue;
        if (result < 0) {
            return result * (-1);
        }
        return result;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int tempValue = this.pricePerSquareMeter * this.squareMeters;
        int otherValue = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        if (tempValue > otherValue) {
            return true;
        }
        return false;
    }
}
