package edu.duquec.util;

import java.util.Scanner;

public class SystemInputSingleton {
    private static SystemInputSingleton instance = new SystemInputSingleton();

    private Scanner input = new Scanner(System.in);

    private SystemInputSingleton(){

    }
    public static SystemInputSingleton getInstance() {
        return instance;
    }

    public Scanner getScanner(){
        return input;
    }
}
