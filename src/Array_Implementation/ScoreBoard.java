package Array_Implementation;

/**Class for storing high score in an array in non decreasing order... */
public class ScoreBoard {
    private int numEntries = 0;
    private GameEntry[] board;
    /**Construct an empty score board with the given capacity... */
    ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }
    /**Attempt to add a new score to the collection... */
    public void add(GameEntry e) {
        int newScore = e.getScore();
        if(numEntries < board.length || newScore > board[numEntries-1].getScore()) {
            if(numEntries < board.length){
                numEntries++;
            }
            int j = numEntries -1;
            while(j > 0 && board[j-1].getScore() < newScore){
                board[j] = board[j-1];
            }
            board[j] = e;
        }
    }
    /**Remove and return the high score at index i... */
    public GameEntry remove(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= numEntries){
            throw new IndexOutOfBoundsException("Invalid index: "+index);
        }
        GameEntry temp = board[index];
        for(int j = index; j< numEntries; j++){
            board[j] = board [j-1];
        }
        board[numEntries-1] = null;
        numEntries--;
        return temp;
    }
}
