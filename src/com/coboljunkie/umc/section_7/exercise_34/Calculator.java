package com.coboljunkie.umc.section_7.exercise_34;
/** This class contains a methods to calculate the cost of a carpet
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) { //Constructor
        this.floor = floor;
        this.carpet = carpet;
    }

    /** This method calculates the total cost of carpet used
     *
     * @return the cost of the carpet
     */
    public double getTotalCost(){
        double totalcost = (carpet.getCost() * floor.getArea());

        return totalcost;
    }
}
