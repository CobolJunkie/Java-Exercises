package com.coboljunkie.umc.section_6.exercise_14;
/** This class contains a method to calculate the number of days in any given Month
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class NumberOfDaysInMonth {
    /** This method checks if a given year is a leap year
     *
     * @param year the year in int number format
     * @return true if it is a leap year
     */

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /** this method calculates the amount of days in a specific month
     *
     * @param month the month to calculate the days from
     * @param year the year this calculation happens in
     * @return the amount of days.
     */
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }else {
            switch (month) {
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else return 28;
                case 4: case 6: case 9: case 11:
                    return 30;
                default:
                    return 31;
            }
        }
    }
}



