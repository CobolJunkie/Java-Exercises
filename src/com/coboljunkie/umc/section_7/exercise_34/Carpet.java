package com.coboljunkie.umc.section_7.exercise_34;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost <0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}