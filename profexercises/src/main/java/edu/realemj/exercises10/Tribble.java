package edu.realemj.exercises10;

public class Tribble {
    private static int count = 0;
    private static int getCount() { return count; }

    public Tribble() {
        count++;
    }

    public static void main(String [] args) {
        Tribble [] trouble = new Tribble[100];
        for(int i = 0; i < trouble.length; i++) {
            trouble[i] = new Tribble();
        }
        System.out.println(Tribble.getCount());
    }
}
