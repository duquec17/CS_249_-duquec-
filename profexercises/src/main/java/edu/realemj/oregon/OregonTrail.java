package edu.realemj.oregon;

import edu.realemj.exercises11.WagonPace;
import java.util.*;

public class OregonTrail {
    public static void main(String [] args) {
        System.out.println("Welcome to the Oregon Trail!");
        Scanner input = new Scanner(System.in);

        double milesToGo = 140;

        WagonPace pace = WagonPace.NORMAL;

        int daysTraveled = 0;

        while(milesToGo > 0) {

            pace = setWagonPace(input);

            milesToGo -= pace.getSpeed();
            daysTraveled++;

            System.out.println("****************************");
            System.out.println("DAY " + daysTraveled);
            System.out.println(milesToGo + " miles to go...");
        }

        System.out.println("You traveled for " + daysTraveled + " days.");
    }

    public static WagonPace setWagonPace(Scanner input) {
        boolean found = false;
        WagonPace pace = WagonPace.NORMAL;
        do {
            System.out.println("Enter wagon pace:");
            for (WagonPace p : WagonPace.values()) {
                System.out.println("* " + p);
            }
            String paceString = input.nextLine();
            paceString = paceString.trim().toUpperCase();

            for (WagonPace p : WagonPace.values()) {
                String name = p.toString();
                if(paceString.equals(name)) {
                    pace = p;
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.err.println("Invalid wagon pace!");
            }
        }while(!found);

        return pace;
    }
}
