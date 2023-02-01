package com.coboljunkie.umc.section_7.exercise_33;
/** This class represents a point in a 2 dimensional space
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class Point {
    private int x;
    private int y;

    /** Constructor for Point Object
     *
     * @param x X-Coordinate
     * @param y Y-Coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /** Empty Constructor
     *
     */
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

    /** Calculates distance between existing Point and Origin
     *
     * @return distance of Point to 0,0 coordinate
     */
    public double distance(){
        return Math.sqrt((getX()*getX()) + (getY()*getY()));
    }

    /** Calcuates distance between given Point object and existing Point
     *
     * @param first The Point to calculate distance to
     * @return the distance between both Points
     */
    public double distance(Point first){
        double distance;
        return distance(first.x,first.y);
    }

    /** Calculates distance of given coordinates to Point object
     *
     * @param x X-Coordinate
     * @param y Y-Coiordinate
     * @return Distance to Point object
     */
    public double distance(int x, int y){
        double distance = Math.sqrt((x-getX())*(x-getX()) + (y-getY())*(y-getY()));
        return distance;
    }
}
//    d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)