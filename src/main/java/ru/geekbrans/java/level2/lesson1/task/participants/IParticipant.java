package ru.geekbrans.java.level2.lesson1.task.participants;

import ru.geekbrans.java.level2.lesson1.task.obstacles.IOvercome;

public interface IParticipant {
    boolean run(IOvercome overcome);
    void info();
    String getTYPE();
    String getName();
}
