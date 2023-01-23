package com.coboljunkie.mcu.section_7.exercise_33;

public class Point {
    private int x;
    private int y;

    //constructors
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    //getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //distance methods

    public double distance(){
        double distance = Math.sqrt((getX()*getX()) + (getY()*getY()));
        return distance;
    }

    public double distance(Point first){
        double distance;
        return distance(first.x,first.y);
    }

    public double distance(int x, int y){
        double distance = Math.sqrt((x-getX())*(x-getX()) + (y-getY())*(y-getY()));
        return distance;
    }
}
//    d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)