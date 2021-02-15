package ru.geekbrans.java.level2.lesson1.lesson;

public class App {
    public static void main(String[] args) {
        Car car =  new Car("BMW", 160);
        Moto moto = new Moto("SUZUKI", 260);
        Bicycle bicycle = new Bicycle("Star", 20);
        Human human = new Human("Bob");
        human.ride(car);
        human.stop();

        human.ride(moto);
        human.stop();

        human.ride(bicycle);
        human.stop();
    }
}
