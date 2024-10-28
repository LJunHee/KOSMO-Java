package com.day04;

public class Car {

    public String model;
    public String color;
    public int speed;
    public final int maxSpeed;

    public Car() {
        this("주황","아반떼",85);
    }

    public Car(String color) {
        this(color,"소나타",95);
    }

    public Car(String a, String b) {
        this(a,b,100);
    }

    public Car(String color, String model, int maxSpeed){
        this.color = color;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void speedUp() {
        speed += 10;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    public void speedDown() {
        speed -= 10;
        if (speed < 0) {
            speed = 0;
        }
    }

    public void show() {
        System.out.println(color + "색 " + model + "의 현재속도는 " + speed + "km 입니다.");
    }

    public static void main(String[] args) {
    }

}
