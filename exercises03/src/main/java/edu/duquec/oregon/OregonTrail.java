package edu.duquec.oregon;

import edu.duquec.exercises11.WagonPace;
import java.util.*;

public class OregonTrail {
    public static void main(String [] args){
        System.out.println("Welcome to the Oregon Trail!");
        Scanner input = new Scanner(System.in);

        double milesToGo = 140;

        WagonPace pace = WagonPace.NORMAL;

        int daysTraveled = 0;

        while(milesToGo > 0){
            for(WagonPace p: WagonPace.values()){
                System.out.println("* " + p);
            }

            pace = setWagonpace(input);

            milesToGo -= pace.getSpeed();
            daysTraveled++;
            System.out.println("***************************");
            System.out.println("DAY " + daysTraveled);
            System.out.println(milesToGo + " miles to go...");
        }

        System.out.println("You traveled for " + daysTraveled + " days.");
    }

    public static WagonPace setWagonpace(Scanner input){
        boolean found = false;
        WagonPace pace = WagonPace.NORMAL;
        do {
           System.out.println("enter wagon pace:");
           for (WagonPace p : WagonPace.values()) {
               System.out.println("* " + p);
           }
           String paceString = input.nextLine();
           paceString = paceString.trim().toUpperCase();

           for (WagonPace p : WagonPace.values()) {
               String name = p.toString();
               if(paceString .equals(name)){
                   pace = p;
                   found = true;
                   break;
               }
           }

           if(!found){
               System.out.println("Invalid wagon pace");
           }

         }while(!found);

       return pace;
    }
}
