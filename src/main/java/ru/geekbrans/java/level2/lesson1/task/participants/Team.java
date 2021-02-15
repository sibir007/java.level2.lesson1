package ru.geekbrans.java.level2.lesson1.task.participants;

public class Team {
    private IParticipant[] participants;
    public Team(IParticipant ... participants) {
        this.participants = participants;
    }

    public IParticipant[] getParticipants() {
        return participants;
    }
}
