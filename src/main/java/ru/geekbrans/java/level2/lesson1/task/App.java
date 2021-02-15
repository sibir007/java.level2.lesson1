package ru.geekbrans.java.level2.lesson1.task;

import ru.geekbrans.java.level2.lesson1.task.obstacles.ObstacleCourse;
import ru.geekbrans.java.level2.lesson1.task.obstacles.Treadmill;
import ru.geekbrans.java.level2.lesson1.task.obstacles.Wall;
import ru.geekbrans.java.level2.lesson1.task.participants.Cat;
import ru.geekbrans.java.level2.lesson1.task.participants.Man;
import ru.geekbrans.java.level2.lesson1.task.participants.Robot;
import ru.geekbrans.java.level2.lesson1.task.participants.Team;

public class App {
    public static void main(String[] args) {
        Team team = new Team(
                new Cat("Barsik"),
                new Man("Dima"),
                new Robot("Robot1")
        );
        ObstacleCourse obstacleCourse = new ObstacleCourse(
                new Wall(),
                new Treadmill(),
                new Wall(),
                new Treadmill()
        );
        new Competition(obstacleCourse,team).start();
    }
}
