package com.hashan.designpatterns.creational.factory;

public class ZipArchiver implements Archiver{
    @Override
    public void archive() {
        System.out.println("Archived zip file");
    }
}
