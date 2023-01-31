package com.hashan.solid.l.problem;

public class Crow implements Bird{
    @Override
    public void eat(){
        System.out.println("Crow Eats");
    }

    @Override
    public void fly(){
        System.out.println("Crow flies");
    }
}
