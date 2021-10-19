package com.bridgelabz.day24;

import java.time.LocalDate;
import java.time.Month;

public class CurrentDate {
    public static void main(String[] args) {
        LocalDate ldt = LocalDate.of(2021, Month.OCTOBER, 10);
        Month mn = ldt.getMonth();
        int mnIntValue = mn.getValue();
        int maxLength = mn.maxLength();
        System.out.println("\nInteger value of the current month: " + mnIntValue);
        System.out.println("Maximum length of the month: " + maxLength);


    }

}
