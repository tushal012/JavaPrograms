package com.bridgelabz.day24;

public class BinaryObserver extends Observer {

    public BinaryObserver(Students students) {
        this.students = students;
        this.students.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(students.getState()));
    }
}
