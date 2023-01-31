package com.hashan.solid.l.solution;

public class Parrot implements FlyingBird {
    @Override
    public void eat(){
        System.out.println("Parrot eats");
    }

    @Override
    public void fly(){
        System.out.println("Parrot flies");
    }
}
