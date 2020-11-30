public class Bird {

    private String name;
    private String latinName;
    private int observe;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observe = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObserve() {
        return observe;
    }

    public void setObserve(int observe) {
        this.observe = observe;
    }
 
    
    public void setName(String name) {
        this.name = name;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }   
}
