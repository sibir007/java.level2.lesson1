package ru.geekbrans.java.level2.lesson1.task.obstacles;

import java.util.Random;

public class Treadmill implements IOvercome {
    private final String TYPE = "Treadmill";
    private final int MAX_DiSTANCE = 40;
    private final int MIN_DiSTANCE = 10;
    private final int distance;

    {
        int diffDistance = this.MAX_DiSTANCE - this.MIN_DiSTANCE + 1;
        Random random = new Random();
        this.distance = random.nextInt(diffDistance) + this.MIN_DiSTANCE;
    }


    @Override
    public int overcoming() {
        return distance;
    }

    @Override
    public String getTYPE() {
        return TYPE;
    }

    @Override
    public void info() {
        System.out.printf("%s дистанция %d\n", this.TYPE, this.distance);
    }

}
