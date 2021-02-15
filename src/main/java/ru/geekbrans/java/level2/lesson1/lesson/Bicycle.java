package ru.geekbrans.java.level2.lesson1.lesson;

public class Bicycle implements Transport{
    private final String TYPE = "Bicycle";
    private String model;
    private int speed;
    private boolean onTheWay;

    public Bicycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
    @Override
    public void move() {
        this.onTheWay = true;
    }

    @Override
    public void stop() {
        this.onTheWay = false;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public boolean isOnTheWay() {
        return onTheWay;
    }

    @Override
    public String getTYPE() {
        return TYPE;
    }
}
