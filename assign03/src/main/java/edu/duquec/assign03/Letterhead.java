package edu.duquec.assign03;

import java.util.Scanner;
import java.util.*;

public class Letterhead {
    // Variable List
    private String name;
    private String[] sloganLines = new String[4];
    private char boundaryChar;

    // Calls upon all functions to establish Letterhead function
    public Letterhead(String name, String[] sloganLines, char boundaryChar) {
        setName(name);
        setBoundaryChar(boundaryChar);
        setSlogan(sloganLines);
    }

    // Returns name of company when it's put in other class
    public String getName() {
        return name;
    }

    // Returns boundary character when it's put in other class
    public char getBoundaryChar() {
        return boundaryChar;
    }

    // Creates SB to split and hold sloganLines values
    public String getSlogan() {
        StringBuilder SB = new StringBuilder();
        for (String s : sloganLines) {
            if (s != null) {
                SB.append(s);
                SB.append("\n");
            } else {
                SB.append("");
            }
        }

        String slogan = SB.toString();
        return slogan;
    }

    // Stores business name *Use of "this." specifies which version is being used
    public void setName(String name){
        this.name = name;
    }

    // Stores boundary character "this." specifies which version is being used
    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;
    }

    // Stores slogan lines by detecting if there is a null or not
    public void setSlogan(String [] sloganLines){
        for(int i = 0; i <sloganLines.length; ++i){
            if(sloganLines[i] != null){
                this.sloganLines[i] = sloganLines[i];
            }
            else if (sloganLines[i] == null){
                this.sloganLines[i] = "";
            }
        }
    }

    public String toString(){
        // Makes a string that can be appended to (appended = add to)
        StringBuilder sb = new StringBuilder();

        // Tracker for spacing
        int space = 0;

        // Places the selected bChar 40 times creating top
        for(int i = 0; i < 40; ++i){
            sb.append(boundaryChar);
        }

        sb.append("\n" + boundaryChar + " " + name);

        // Spacing procedure for text
        space = 38 - name.length();

        for(int i = 0; i < space - 1; ++i){
            sb.append(" ");
        }

        sb.append(boundaryChar + "\n" + boundaryChar);
        for(int i = 0; i < 38; ++i){
            sb.append(" ");
        }

        // Places slogan lines into position (accounts for space)
        sb.append(boundaryChar + "\n");
        for(int i = 0; i < 4; ++i){
            sb.append(boundaryChar);
            if(sloganLines[i] == null){
                sb.append("");
                space = 38;
            }else{
                sb.append(" " + sloganLines[i]);
                space = 37 - sloganLines[i].length();
            }
            for (int j = 0; j < space; ++j){
                sb.append(" ");
            }
            sb.append(boundaryChar);
            sb.append("\n");
        }

        // Generates bottom line for header
        for(int i = 0; i < 40; ++i){
            sb.append(boundaryChar);
        }

        // Builds letterhead
        sb.append("\n");
        String message = sb.toString();

        // Returns message
        return message;
    }
}
