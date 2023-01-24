package com.coboljunkie.umc.section_5.exercise_02;
/** This class contains methods to convert km/h to mp/h and print them to the console
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/

public class SpeedConverter {
    /** This Method converts km/h to mp/h
     *
     * @param kilometersPerHour speed in km/h as double
     * @return speed in mp/h
     * @since 0.1
     */
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return(-1);
        }
        return Math.round(kilometersPerHour * 0.622);
    }

    /** This method checks if the entered speed is positive ,calls the SpeedConverter method and prints the result
     *
     * @param kilometersPerHour speed in km/h as double
     * @since 0.1
     */
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
