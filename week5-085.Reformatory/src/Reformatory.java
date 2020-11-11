public class Reformatory {
    private int count;

    public Reformatory() {
        this.count = 0;
    }
        
    public int weight(Person person) {
        // return the weight of the person
        this.count++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int temp = person.getWeight();
        temp++;
        person.setWeight(temp);
    }
    
    public int totalWeightsMeasured() {
        return this.count;
    }
}
