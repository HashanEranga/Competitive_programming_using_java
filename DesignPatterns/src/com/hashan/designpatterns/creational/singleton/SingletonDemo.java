package com.hashan.designpatterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        OrderManagementService order1 = OrderManagementService.getInstance();
        OrderManagementService order2 = OrderManagementService.getInstance();
        System.out.println(order1 == order2);
    }
}
