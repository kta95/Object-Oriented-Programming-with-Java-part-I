public class Player {
     private String name;
     private int goals;
     
     public Player(String initName, int initGoals) {
         this.name = initName;
         this.goals = initGoals;
     }
     
     public Player(String initName) {
         this(initName, 0);
     }

    public String getName() {
        return name;
    }

    public int goals() {
        return goals;
    }

    @Override
    public String toString() {
        return name + ", goals " + goals;
    }
     
     
}
