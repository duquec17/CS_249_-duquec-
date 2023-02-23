package edu.realemj.exercises03;

public class Supplies {
    private double totalFood;

    public double getTotalFood() {
        return totalFood;
    }

    public boolean setTotalFood(double f) {
        totalFood = f;
        if(totalFood < 0) {
            System.err.println("WARNING: Invalid food value; clamping to zero.");
            totalFood = 0;
            return false;
        }
        return true;
    }

    public boolean addFood(double f) {
        boolean success = true;
        totalFood += f;
        if(totalFood < 0) {
            totalFood = 0;
            success = false;
        }
        return success;
    }

    public boolean haveFood() {
        final double EPS = 1e-10;
        return (Math.abs(totalFood) > EPS);
        //return (totalFood != 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("** SUPPLIES **\n");
        sb.append("* Total food: " + totalFood + "\n");
        sb.append("**************");
        return sb.toString();
    }
}
