package edu.realemj.exercises03;

import java.util.*;
public class Rando {
    public static void main(String [] args) {
        Random r1 = new Random(42);
        Random r2 = new Random(42);
        System.out.println("RANDOM:");
        for(int i = 0; i < 5; i++) {
            System.out.println(r1.nextDouble());
            System.out.println(r2.nextDouble());
        }
    }
}
