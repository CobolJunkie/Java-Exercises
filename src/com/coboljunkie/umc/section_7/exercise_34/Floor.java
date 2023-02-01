package com.coboljunkie.umc.section_7.exercise_34;
/** This class describes a floor
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class Floor {
    private double width;
    private double length;

    /** Creates a floor object
     *
     * @param width the width of the floor
     * @param length the height of the floor
     */
    public Floor(double width, double length) { //Constructor
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    /** Calculates the area of a given size of floor
     *
     * @return Area
     */
    public double getArea(){
        double area =(width * length);
        return area;
    }
}
