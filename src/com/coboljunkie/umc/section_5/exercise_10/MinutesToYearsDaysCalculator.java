package com.coboljunkie.umc.section_5.exercise_10;
/** This class converts minutes to Years and Days
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/

public class MinutesToYearsDaysCalculator {
    /** this method converts a given value of minutes to years and days respectively and prints the output to console
     *
     * @param minutes the amount of minutes to convert
     * @since 0.1
     */
    public static void printYearsAndDays(long minutes){
        if (minutes < 0)System.out.println("Invalid Value");
        else {

            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
          //  System.out.println(minutes +" min = "+ years +" y and "+(days + restDays)+" d");

        }

    }
}


