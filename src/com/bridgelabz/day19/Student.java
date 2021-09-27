package com.bridgelabz.day19;

import java.util.Scanner;

public class Student {

    private String name;
    int  age;

    public String getName() {
        return name;
    }
     public int getAge(){
        return age;
     }

    public void setName(String name){
        this.name = name;

    }
    public void setAge(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        Student st = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the age");
        int age = sc.nextInt();
//        st.getName();
//        st.getAge();
          st.setName(name);
          st.setAge(age);
        System.out.println(st.getName());
        System.out.println(st.getAge());

    }

}
