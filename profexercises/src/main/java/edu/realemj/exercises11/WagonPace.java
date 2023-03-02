package edu.realemj.exercises11;

public enum WagonPace {
    SLOW(7),
    NORMAL(15),
    FAST(18);

    private double speed;

    private WagonPace(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
}
