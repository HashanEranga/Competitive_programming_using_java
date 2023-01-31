package com.hashan.designpatterns.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Archiver arcZip = ArchiverFactory.getArchiver("zip");
        Archiver arcRar = ArchiverFactory.getArchiver("rar");

        assert arcZip != null;
        assert arcRar != null;
        arcZip.archive();
        arcRar.archive();
    }
}
