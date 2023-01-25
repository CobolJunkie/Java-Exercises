package com.coboljunkie.umc.section_5.exercise_09;
/** This class calculates the area of geometric shape
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/

public class AreaCalculator {
    /** This method calculates the area of a circle from its radius
     *
     * @param radius the radius of the circle
     * @return the area of the circle
     */
    public static double area(double radius){
        if (radius < 0) return -1.0;
        else return radius * radius * Math.PI;
    }

    /** This method calculates the Area of a rectangle
     *
     * @param x the width of the rectangle
     * @param y the length of the rectangle
     * @return the area of the rectangle
     */
    public static double area(double x, double y){
        if (x < 0 || y < 0) return -1.0;
        else return x * y;
    }
}
