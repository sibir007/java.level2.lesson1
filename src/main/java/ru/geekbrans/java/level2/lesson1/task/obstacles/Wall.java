package ru.geekbrans.java.level2.lesson1.task.obstacles;

import java.util.Random;

public class Wall implements IOvercome{
    private final String TYPE = "Wall";
    private final int MAX_HEIGHT = 8;
    private final int MIN_HEIGHT = 3;
    private int height;


    {
        int diffDistance = this.MAX_HEIGHT - this.MIN_HEIGHT + 1;
        Random random = new Random();
        this.height = random.nextInt(diffDistance) + this.MIN_HEIGHT;

    }




    @Override
    public int overcoming() {
        return this.height;
    }

    @Override
    public String getTYPE() {
        return null;
    }

    @Override
    public void info() {
        System.out.printf("%s высота %d\n", this.TYPE, this.height);
    }
}
