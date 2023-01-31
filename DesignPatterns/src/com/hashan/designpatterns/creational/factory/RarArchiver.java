package com.hashan.designpatterns.creational.factory;

public class RarArchiver implements Archiver{
    @Override
    public void archive(){
        System.out.println("Archived a Rar file");
    }
}
