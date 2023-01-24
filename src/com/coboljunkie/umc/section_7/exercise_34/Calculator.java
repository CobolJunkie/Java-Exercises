package com.coboljunkie.umc.section_7.exercise_34;

class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) { //Constructor
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        double totalcost = (carpet.getCost() * floor.getArea());

        return totalcost;
    }
}
