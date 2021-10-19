package com.bridgelabz.day24;

public class ObserverMain {
    public static void main(String[] args) {
        Students students = new Students();


        new BinaryObserver(students);
        new HexaObserver(students);

        System.out.println("First state change: 15");
        students.setState(15);
        System.out.println("Second state change: 10");
        students.setState(10);
    }
}
