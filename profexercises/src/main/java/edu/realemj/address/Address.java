package edu.realemj.address;

import java.util.*;
public class Address {
    private String name;
    private String[] street;
    private String city;
    private String state;
    private String zip;

    public Address(String name,
                   String [] street,
                   String city,
                   String state,
                   String zip) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.street = new String[street.length];
        for(int i = 0; i < this.street.length; i++) {
            this.street[i] = street[i];
        }
    }

    public String toString() {
        char trailChar = '-';
        StringBuilder sb = new StringBuilder();
        sb.append(addTrailing(name, trailChar));
        sb.append("\n");
        for(String a: this.street) {
            sb.append(addTrailing(a, trailChar));
            sb.append("\n");
        }

        for(int i = 0; i < (2-street.length); i++) {
            sb.append(addTrailing("", trailChar) + "\n");
        }

        sb.append(addTrailing(city
                                + ", "
                                + state
                                + "  "
                                + zip,
                                trailChar));
        sb.append("\n");

        return sb.toString();
    }

    private String addTrailing(String s, char trail) {
        final int LENGTH = 30;
        int trailCnt = LENGTH - s.length();
        StringBuilder combo = new StringBuilder();
        combo.append(s);
        for(int i = 0; i < trailCnt; i++) {
            combo.append(trail);
        }
        return combo.toString();
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your street:");
        String firstStreet = input.nextLine();

        System.out.println("Do you have apt info? (y/n)");
        char ans = input.nextLine().charAt(0);
        String [] streetInfo;
        if(ans == 'y') {
            streetInfo = new String[2];
            streetInfo[0] = firstStreet;
            streetInfo[1] = input.nextLine();
        }
        else {
            streetInfo = new String[1];
            streetInfo[0] = firstStreet;
        }

        System.out.println("Enter your city:");
        String city = input.nextLine();

        System.out.println("Enter your state:");
        String state = input.nextLine();

        System.out.println("Enter your zip:");
        String zip = input.nextLine();

        Address a = new Address(name, streetInfo,
                                    city, state, zip);

        System.out.println("YOUR ADDRESS:");
        System.out.println(a);
    }
}
