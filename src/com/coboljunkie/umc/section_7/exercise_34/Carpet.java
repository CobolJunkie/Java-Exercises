package com.coboljunkie.umc.section_7.exercise_34;
/** This class describes a carpet.
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost <0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
