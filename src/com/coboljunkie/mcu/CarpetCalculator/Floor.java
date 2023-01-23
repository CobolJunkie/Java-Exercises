package com.coboljunkie.mcu.CarpetCalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) { //Constructor
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    public double getArea(){
        double area =(width * length);
        return area;
    }
}