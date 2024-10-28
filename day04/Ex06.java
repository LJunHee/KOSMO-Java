package com.day04;
public class Ex06 {
    public static void main(String[] args) {
        Car myCar = new Car();
        // myCar.color ="흰";
        // myCar.model = "모닝";
        // myCar.maxSpeed = 80;

        myCar.show();
        // myCar.maxSpeed = 120;
        for(int i=0; i<10; i++) {
            myCar.speedUp();
            myCar.show();
        }
        for(int i=0; i<10; i++) {
            myCar.speedDown();
            myCar.show();
        }
    }
}
