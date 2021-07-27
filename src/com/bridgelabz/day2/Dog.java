package com.bridgelabz.day2;

public class Dog {

    void bark() {
        System.out.println("bark");
    }

     void sleep() {
        System.out.println("sleep");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.sleep();
    }
}
