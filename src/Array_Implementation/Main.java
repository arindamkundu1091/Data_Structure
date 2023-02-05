package Array_Implementation;

/**Main class contains only simple main method for testing...*/
public class Main {
    public static void main(String[] args) {
        try {
            GameEntry p1 = new GameEntry("Jack", 510);
            GameEntry p2 = new GameEntry("Rose", 590);
            GameEntry p3 = new GameEntry("Mike", 1105);
            GameEntry p4 = new GameEntry("Paul", 720);
            GameEntry p5 = new GameEntry("Anna", 660);
            GameEntry p6 = new GameEntry("Rob", 750);
            ScoreBoard board = new ScoreBoard(7);
            System.out.println(p5.toString());
            board.add(p1);
            board.add(p2);
            board.add(p3);
            board.add(p4);
            board.add(p5);
            board.add(p6);
            board.remove(1);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
