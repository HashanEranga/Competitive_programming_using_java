package com.hashan.solid.i.problem;

public class Boat implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Boat drives");
    }

    @Override
    public void sail(){
        System.out.println("Boat sails");
    }

    @Override
    public void fly(){
        throw new UnsupportedOperationException();
    }
}
