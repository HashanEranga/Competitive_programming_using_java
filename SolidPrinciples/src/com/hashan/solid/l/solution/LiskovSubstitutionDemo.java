package com.hashan.solid.l.solution;

public class LiskovSubstitutionDemo {
    public static void main(String[] args) {
        Bird[] birds = {new Crow(), new Parrot(), new Ostrich()};
        for(Bird bird : birds) bird.eat();

        FlyingBird[] flyingBirds = {new Crow(), new Parrot()};
        for(FlyingBird fBird : flyingBirds) fBird.fly();
    }
}
