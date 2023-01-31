package com.hashan.designpatterns.creational.prototype;

public class ZipArchiver implements Archiver {
    @Override
    public void archive() {
        System.out.println("Archived Zip file");
    }

    @Override
    public Archiver clone(){
        System.out.println("Zip Archiver Cloned");
        return new ZipArchiver();
    }
}
