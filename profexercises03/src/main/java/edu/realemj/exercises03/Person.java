package edu.realemj.exercises03;

public class Person {
    private String name = "";
    private boolean alive = true;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String toString() {
        String s = name;
        if(!alive) {
            s += " (DECEASED)";
        }
        return s;
    }

}
