package edu.realemj.exercises03;

public class MethodHolder {
    private String preamble = "MESSAGE: ";

    private static String closing = "Goodbye!";

    public void instancePrint(String message) {
        System.out.println(preamble + message);
        staticPrint(message + "...again!");
    }

    public static void staticPrint(String message) {
        System.out.println(message);
        System.out.println(closing);
    }

    public static void main(String [] args) {
        // Static from static - OK
        staticPrint("Hi");
        // Instance from static - NOPE - need instance!
        //instancePrint("Hello");
        MethodHolder h = new MethodHolder();
        h.instancePrint("Hello");

    }
}
