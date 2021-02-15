package ru.geekbrans.java.level2.lesson1.lesson;

public class Moto implements Transport{
    private final String TYPE = "Moto";
    private String model;
    private int speed;
    private boolean busy;

    public Moto(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
    @Override
    public void move() {
        this.busy = true;
    }
    @Override
    public void stop() {
        this.busy= false;

    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public boolean isOnTheWay() {
        return busy;
    }

    @Override
    public String getTYPE() {
        return TYPE;
    }
}
