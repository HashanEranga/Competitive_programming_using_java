package com.hashan.solid.l.problem;

public class Ostrich implements Bird{
    @Override
    public void eat(){
        System.out.println("Ostrich eats");

    }

    @Override
    public void fly(){
        try{
            throw new UnsupportedOperationException();
        }
        catch(UnsupportedOperationException ex){
            System.out.println(ex.getMessage());
        }
    }
}
