package com.coboljunkie.umc.section_7.exercise_32;

/** This class contains a methods to calculate the area of a wall
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class Wall {
    private double width;
    private double height;

    /** Constructor with width and height
     *
     * @param width
     * @param height
     */
    public Wall(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    /** Empty Constructor
     *
     */
    public Wall() {
        this(0, 0);
    }

    /** Getter for Width
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /** Getter for height
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /** Setter for width
     *
     * @param width
     */
    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    /** Setter for height
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    /** This method calculates the Area
     *
     * @return Area of the object based on height and width variables
     */
    public double getArea() {
        return width * height;
    }
}