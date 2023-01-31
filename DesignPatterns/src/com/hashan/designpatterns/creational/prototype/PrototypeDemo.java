package com.hashan.designpatterns.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Archiver arcZip = ArchiverFactory.getPrototypeForArchiver("zip");
        Archiver arcRar = ArchiverFactory.getPrototypeForArchiver("rar");

        arcZip.archive();
        arcRar.archive();
    }
}
