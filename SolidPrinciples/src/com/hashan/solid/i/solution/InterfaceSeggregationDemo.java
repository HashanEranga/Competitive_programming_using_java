package com.hashan.solid.i.solution;

public class InterfaceSeggregationDemo {
    public static void main(String[] args) {
        Flyable plane1 = new Plane();
        plane1.fly();
        Drivable plane2 = new Plane();
        plane2.drive();

        Plane plane3 = new Plane();
        plane3.fly();
        plane3.drive();

        Drivable car = new Car();
        car.drive();

        Sailable boat = new Boat();
        boat.sail();
    }
}
