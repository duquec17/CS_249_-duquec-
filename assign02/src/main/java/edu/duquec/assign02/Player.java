package edu.duquec.assign02;

public class Player {
    private String firstName = "";
    private String lastName = "";
    private int height;
    private double weight;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public void setFirstName(String first){
        firstName = first;
    }

    public void setLastName(String last){
        lastName = last;
    }

    public void setHeight(int totalInches){
        height = totalInches;
    }

    public void setWeight(double pounds){
        weight = pounds;
    }

    public int calculateBMI(){
        //Calculates BMI using input weight & height
           //Also converts to int
        int BMI = (int) ((703 * weight)/(height*height));
        //Returns calculated BMI value
        return BMI;
    }

    public String getNameString(){
        //Generates String to hold first & last name (starts with last)
        StringBuilder sb = new StringBuilder(lastName);
        //Adds comma and space
        sb.append(", ");
        //Adds first name
        sb.append(firstName);
        //Returns entire name string
        return sb.toString();
    }

    public String getHeightString(){
        //Calculate feet
        int feet = height/12;
        //Calculate remaining inches
        int remainder = height%12;
        //Makes string for converted height (starts with feet
        StringBuilder convHeight = new StringBuilder(feet + "'-" + remainder + "\"");

        //Returns convHeight String
        return convHeight.toString();
    }

    public String getWeightString(){
        //Makes new string
        StringBuilder weightString = new StringBuilder();
        //Fills string with weight and words
        weightString.append(weight + " lbs.");
        //Returns Weight String
        return weightString.toString();
    }

    public String toString(){
        // Creates string to hold all info
        String allInfo = (("NAME: " + getNameString() + "\n")
        // Adds weight
        + ("WEIGHT: " + getWeightString()+"\n")
        // Adds height
        + ("HEIGHT: " + getHeightString() + "\n")
        //Adds BMI
        + ("BMI: " + calculateBMI() + "\n")
        );
        //Returns string full of all info
        return allInfo;
    }
}
