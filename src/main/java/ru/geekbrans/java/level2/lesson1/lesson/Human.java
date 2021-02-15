package ru.geekbrans.java.level2.lesson1.lesson;

public class Human {
    private String name;
    private Transport transport;

    public Human(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ride (Transport transport) {
        if (!transport.isOnTheWay()) {
            this.transport = transport;
            this.transport.move();
            System.out.println(this.name + " поехал  " + this.transport.getTYPE() + " " + this.transport.getModel());
        }else {
            System.out.println(this.transport.getTYPE() + " " + transport.getModel() + "занят, поездка не возможна");
        }
    }
    public void stop() {
        if (this.transport != null) {
            this.transport.stop();
            System.out.println(this.name + " остановил  " + this.transport.getTYPE() + " " + this.transport.getModel());
            this.transport = null;
        }else {
            System.out.println("Мы не начём не едем, нечего останавливать");
        }
    }
}
