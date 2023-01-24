package com.coboljunkie.umc.section_5.exercise_05;
/** This class contains a method to determine if the passed year is a leap year
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/

public class LeapYear {
    /** this method checks if a year is a leap year
     *
     * @param year year in int format
     * @return true if the passed year is a leap year
     * @since 0.1
     */
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) return false;
        if (year %4 == 0 && year %100 != 0 ) return true;
        return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
    }
}
