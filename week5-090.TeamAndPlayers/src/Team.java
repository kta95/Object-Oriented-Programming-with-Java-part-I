
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String theName) {
        this.players = new ArrayList<Player>();
        this.name = theName;
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player) {
        if (this.size() < this.maxSize) {
            this.players.add(player);
        }
    }
    
    public void printPlayers() {
        for (Player person : this.players) {
            System.out.println(person);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.players.size();
    }
    
    public int goals() {
        int result = 0;
        for (Player person : this.players) {
            result += person.goals();
        }
        return result;
    }
}
