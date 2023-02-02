package com.hashan.designpatterns.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        internet.connectToHost("google.com");
        internet.connectToHost("facebook.com");
    }
}
