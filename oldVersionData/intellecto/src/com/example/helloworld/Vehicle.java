package com.example.helloworld;

public class Vehicle {
    private String color;
    private String model;
    private String numberPlate;
    private String design;

    //    Setup getters
    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getDesign() {
        return design;
    }

    //    Setup setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setDesign(String design) {
        this.design = design;
    }

//    Methods
    public void applyBreaks(){
        System.out.println("Vehicle Breakes");
    }
}
