package com.hashan.solid.l.solution;

public class Crow implements FlyingBird {
    @Override
    public void eat(){
        System.out.println("Crow Eats");
    }

    @Override
    public void fly(){
        System.out.println("Crow flies");
    }
}
