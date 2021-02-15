package ru.geekbrans.java.level2.lesson1.task.obstacles;

public class ObstacleCourse {
    private IOvercome[] overcomes;
    public ObstacleCourse(IOvercome ... overcomes) {
        this.overcomes = overcomes;
    }

    public IOvercome[] getOvercomes() {
        return overcomes;
    }
}
