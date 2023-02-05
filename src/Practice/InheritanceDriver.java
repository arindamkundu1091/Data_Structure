package Practice;

public class InheritanceDriver {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("The result is:");

        GrandChild_1 gc1 = new GrandChild_1();
        GrandChild_2 gc2 = new GrandChild_2();

        gc1.pShow();
        gc1.c_1Show();
        gc1.gc_1Show();

        System.out.println();

        gc2.pShow();
        gc2.c_2Show();
        gc2.gc_2Show();
    }
}
