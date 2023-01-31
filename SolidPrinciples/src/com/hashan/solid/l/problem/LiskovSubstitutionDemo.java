package com.hashan.solid.l.problem;

public class LiskovSubstitutionDemo {
    public static void main(String[] args) {
        Bird[] birds = {new Crow(), new Parrot(), new Ostrich()};
        for(Bird bird : birds){
            bird.fly();
            bird.eat();
        }
    }
}
