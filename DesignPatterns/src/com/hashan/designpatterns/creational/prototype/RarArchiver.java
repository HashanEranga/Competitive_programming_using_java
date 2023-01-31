package com.hashan.designpatterns.creational.prototype;

public class RarArchiver implements Archiver{
    @Override
    public void archive(){
        System.out.println("Archived Rar file");
    }

    @Override
    public Archiver clone(){
        System.out.println("Rar Archiver Cloned");
        return new RarArchiver();
    }
}
