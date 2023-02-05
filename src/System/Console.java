package System;

import java.util.Scanner;

public class Console {
    public static final Scanner sc = new Scanner(System.in);

    public final static void clear(boolean status) {
        try {
            if(status == true) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } else if(status == false){
                System.exit(0);
            }
        } catch(final Exception e){
            e.printStackTrace();
        }
    }


    public final static void write(int value){
        System.out.print(value);
    }
    public final static void write(double value){
        System.out.print(value);
    }
    public final static void write(char value){
        System.out.print(value);
    }
    public final static void write(String value){
        System.out.print(value);
    }


    public final static int readInt(){
        int value = sc.nextInt();
        return value;
    }
    public final static double readDouble(){
        double value = sc.nextDouble();
        return value;
    }
    public final static char readChar(){
        String defaultValue = sc.next();
        char value = defaultValue.charAt(0);
        return value;
    }
    public final static String readString(){
        String value = sc.nextLine();
        return value;
    }
    public final static boolean readBoolean(){
        boolean value = sc.nextBoolean();
        return value;
    }


    
}
