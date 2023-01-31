package com.hashan.solid.i.problem;

public class InterfaceSegregationDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle plane = new Plane();
        Vehicle boat = new Boat();

        car.drive();
        boat.sail();
        plane.fly();
    }
}
