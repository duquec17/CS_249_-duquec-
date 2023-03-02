package edu.realemj.oregon;

import edu.realemj.exercises11.WagonPace;

public class OregonTrail {
    public static void main(String [] args) {
        System.out.println("Welcome to the Oregon Trail!");

        double milesToGo = 140;

        WagonPace pace = WagonPace.NORMAL;

        int daysTraveled = 0;

        while(milesToGo > 0) {

            for(WagonPace p: WagonPace.values()) {
                System.out.println("* " + p);
            }

            milesToGo -= pace.getSpeed();
            daysTraveled++;
        }

        System.out.println("You traveled for " + daysTraveled + " days.");
    }
}
