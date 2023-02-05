package Array_Implementation;

public class GameEntry {
    private String name;
    private int score;
    /**Construct a GameEntry with the given parameter...*/
    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }
    /**Returns the name field... */
    public String getName() {
        return name;
    }
    /**Returns the score field... */
    public int getScore() {
        return score;
    }
    /**Returns a string representing of this entry...*/
    public String toString() {
        return "("+name+", "+score+")";
    }
}
