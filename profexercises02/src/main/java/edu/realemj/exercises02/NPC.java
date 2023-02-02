package edu.realemj.exercises02;

public class NPC {
    private String name = "";
    private int health = 100;

    public NPC() {
        // Does nothing
    }

    public NPC(String n) {
        name = n;
    }

    public NPC(String n, int h) {
        name = n;
        setHealth(h);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String n) {
        name = n;
    }

    public void setHealth(int h) {
        health = h;
        if(health < 0) {
            health = 0;
        }
    }

    public void takeDamage(int d) {
        int healthAfter = health - d;
        setHealth(healthAfter);
    }
}

