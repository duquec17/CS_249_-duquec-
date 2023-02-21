package edu.realemj.exercises03;

import java.util.*;
public class Party {
    private Person [] party;

    public Party(String [] names) {
        Arrays.sort(names);
        party = new Person[names.length];
        for(int i = 0; i < party.length; i++) {
            party[i] = new Person(names[i]);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("%% PARTY %%%%%%%%%%%%\n");
        for(Person p: party) {
            sb.append("* " + p.toString() + "\n");
        }
        sb.append("%%%%%%%%%%%%%%%%%%%%%\n");
        return sb.toString();
    }

    public static Party askForPartyMembers(Scanner input) {
        // Ask for number of people
        System.out.println("Enter number of people in party:");
        int cnt = input.nextInt();
        // Allocate String array
        String [] names = new String[cnt];
        // Loop through and get names
        for(int i = 0; i < names.length; i++) {
            System.out.println("Enter name for person " + (i+1) + ":");
            names[i] = input.next();
        }
        // Create and return Party object
        Party myParty = new Party(names);
        return myParty;
    }
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Party myfolks = askForPartyMembers(input);
        System.out.println(myfolks);
        /*
        Party myfolks = new Party(new String[] {
                "Alex Trebek",
                "Sean Connery",
                "Ted Ferguson"
        });
        System.out.println(myfolks.toString());
        */
    }
}
