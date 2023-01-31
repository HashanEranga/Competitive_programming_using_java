package com.hashan.designpatterns.creational.singleton;

public class OrderManagementService {
    private static OrderManagementService instance;

    private OrderManagementService(){}

    public static synchronized OrderManagementService getInstance(){
        if(instance == null) instance = new OrderManagementService();
        return instance;
    }
}
