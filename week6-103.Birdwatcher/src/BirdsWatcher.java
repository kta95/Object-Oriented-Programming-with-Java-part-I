
import java.util.ArrayList;
import java.util.Scanner;

public class BirdsWatcher {

    private ArrayList<Bird> birds;
    
    public BirdsWatcher() {
        this.birds = new ArrayList<Bird>();
    }
    
    public void add(Bird bird) {
        this.birds.add(bird);
    }
    
    public void observation(Bird bird) {
        int temp = bird.getObserve();
        temp++;
        bird.setObserve(temp);
    }

    public void show(Bird bird) {
        System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObserve() + " observations");
    }
    
    public void Statistics() {
        for (Bird bird : this.birds) {
            this.show(bird);
        }
    }
    
    public void action(Scanner scan) {
        while (true) {
            System.out.print("? ");
            String theInput = scan.nextLine().toLowerCase();
            if (theInput.equals("quit")) {
                break;
            }
            if (theInput.equals("add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Latin Name: ");
                String lName = scan.nextLine();                
                this.add(new Bird(name, lName));
            }
            if (theInput.equals("observation")) {
                System.out.print("What was observed:? ");
                String name = scan.nextLine();
                ArrayList<String> tempList = new ArrayList<String>();
                for (Bird b : this.birds) {
                    tempList.add(b.getName());
                }
                if (tempList.contains(name)) {
                    for (Bird bird : this.birds) {
                        if (bird.getName().equals(name)) {
                            this.observation(bird);
                        }
                    }
                } else {
                    System.out.println("Is not a bird!");
                }
            }
            
            if (theInput.equals("statistics")) {
                this.Statistics();
            }
            
            if (theInput.equals("show")) {
                System.out.print("What? ");
                String name = scan.nextLine();
                for (Bird bird : this.birds) {
                    if (bird.getName().equals(name)) {
                        this.show(bird);
                    }
                }
            }
        }
    }
}
