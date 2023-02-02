package com.hashan.designpatterns.structural.proxy;

import java.util.List;
import java.util.ArrayList;
public class ProxyInternet implements Internet{
    private final Internet internet = new DefaultInternet();
    private static final List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("facebook.com");
        bannedSites.add("instagram.com");
    }

    @Override
    public void connectToHost(String url){
        try{
            if(bannedSites.contains(url.toLowerCase())){
                throw new RuntimeException("Access Denied : Connecting to " + url);
            }
            internet.connectToHost(url);
        }
        catch(RuntimeException ex){
            System.out.println("Error : " + ex.getLocalizedMessage());
        }
    }
}
