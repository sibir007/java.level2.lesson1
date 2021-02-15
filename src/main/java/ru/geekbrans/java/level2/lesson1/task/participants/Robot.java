package ru.geekbrans.java.level2.lesson1.task.participants;

import ru.geekbrans.java.level2.lesson1.task.obstacles.IOvercome;

import java.util.Random;

public class Robot implements IParticipant {
    private final String TYPE = "Robot"; //тип объекта
    private final int MAX_RUN = 60; //максимально взможно пробежать для типа
    private final int MIN_RUN = 40; //минимльно возможно пробежать для типа
    private int runDistance; //дистанция которую может пробежать человек
    private final int MAX_JUMP = 12;//максимольная высота прыжка для типа
    private final int MIN_JUMP = 7; //миникальная высота прыжка для типа
    private int jumpHeight; //высота на которую может прыгнуть робот
    private String name; //имя

    {
        int diffRun = this.MAX_RUN - this.MIN_RUN + 1;
        int diffJump = this.MAX_JUMP - this.MIN_JUMP + 1;
        Random random = new Random();
        this.runDistance = random.nextInt(diffRun) + this.MIN_RUN;
        this.jumpHeight = random.nextInt(diffJump) + this.MIN_JUMP;
    }

    public Robot (String name) {
        this.name = name;
    }

    @Override
    public void info(){
        System.out.printf("%s %s runDistance: %d, jumpHeight %d\n", this.TYPE, this.name, this.runDistance, this.jumpHeight);
    }


    @Override
    public boolean run(IOvercome overcome) {
        if (overcome.getTYPE() == "Treadmill") {
            return runTreadmill(overcome);
        } else {
            return runWall(overcome);
        }
    }
    private boolean runTreadmill(IOvercome overcome) {
        if (this.runDistance >= overcome.overcoming()) {
            System.out.printf("%s %s пробежал дистанцию %d км\n", this.TYPE, this.name, overcome.overcoming());
            return true;
        } else {
            System.out.printf("%s %s не смон пробежать дистанцию %d км\n", this.TYPE, this.name, overcome.overcoming());
            return false;
        }
    }

    private boolean runWall(IOvercome overcome) {
        if (this.jumpHeight >= overcome.overcoming()) {
            System.out.printf("%s %s перепрыгнул через стену %d м\n", this.TYPE, this.name, overcome.overcoming());
            return true;
        } else {
            System.out.printf("%s %s не смон перепрыгнуть через стену %d м\n", this.TYPE, this.name, overcome.overcoming());
            return false;
        }
    }

    @Override
    public String getTYPE() {
        return TYPE;
    }

    @Override
    public String getName() {
        return name;
    }
}
