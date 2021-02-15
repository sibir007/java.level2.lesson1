package ru.geekbrans.java.level2.lesson1.task;

import ru.geekbrans.java.level2.lesson1.task.obstacles.IOvercome;
import ru.geekbrans.java.level2.lesson1.task.obstacles.ObstacleCourse;
import ru.geekbrans.java.level2.lesson1.task.participants.IParticipant;
import ru.geekbrans.java.level2.lesson1.task.participants.Team;

public class Competition{
    private ObstacleCourse obstacleCourse; //полоса препятствий
    private Team team; //команда

    public Competition (ObstacleCourse obstacleCourse, Team team) {
        this.obstacleCourse = obstacleCourse;
        this.team = team;
        printCompetition();
    }

    /**
     * запускает соревнование
     */
    public void start() {
        boolean check = true;
        for (IParticipant participant: team.getParticipants()) {
            for (IOvercome overcome: obstacleCourse.getOvercomes()) {
                check = participant.run(overcome);
                if (!check) {
                    System.out.printf("%s %s сошёл с дистанции\n", participant.getTYPE(), participant.getName());
                    break;
                }
            }
            if (check) {
                System.out.printf("%s %s прошёл всю дистанцию\n", participant.getTYPE(), participant.getName());
            }
        }
    }

    /**
     * печатает полосу препятствий и команду
     */
    private void printCompetition() {
        System.out.println("----------ObstacleCourse---------");
        printObstacleCourse();
        System.out.println("---------------------------------");
        System.out.println("----------Team----------");
        printTeam();
        System.out.println("------------------------");
    }

    /**
     * печатает полосу препятствий
     */
    private void printObstacleCourse() {
        for (IOvercome overcome: this.obstacleCourse.getOvercomes()) {
            overcome.info();
        }
    }

    /**
     * печатает команду
     */
    private void printTeam() {
        for (IParticipant participant: this.team.getParticipants()) {
            participant.info();
        }
    }
}
