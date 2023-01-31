package com.hashan.designpatterns.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ArchiverFactory {
    private static final Map<String, Supplier<Archiver>> typeConstructorMap = new HashMap<>();

    static {
        typeConstructorMap.put("zip", ZipArchiver::new);
        typeConstructorMap.put("rar", RarArchiver::new);
    }

    public static Archiver getArchiver(String archiveType){
        return typeConstructorMap.get(archiveType) == null ? null : typeConstructorMap.get(archiveType).get();
    }
}
