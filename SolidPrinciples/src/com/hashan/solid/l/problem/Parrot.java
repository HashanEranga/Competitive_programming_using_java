package com.hashan.solid.l.problem;

public class Parrot implements Bird{
    @Override
    public void eat(){
        System.out.println("Parrot eats");
    }

    @Override
    public void fly(){
        System.out.println("Parrot flies");
    }
}
