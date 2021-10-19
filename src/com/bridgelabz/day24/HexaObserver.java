package com.bridgelabz.day24;

public class HexaObserver extends Observer{

    public HexaObserver(Students students){
        this.students = students;
        this.students.attach( this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( students.getState() ).toUpperCase() );
    }
}
