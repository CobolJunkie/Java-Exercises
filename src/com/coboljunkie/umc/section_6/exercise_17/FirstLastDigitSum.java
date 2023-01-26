package com.coboljunkie.umc.section_6.exercise_17;
/** This class contains a method to calculate the sum of the first and last digit of an int number
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class FirstLastDigitSum {
    /** This method calculates the sum of the firs tand last digit of an int number
     *
     * @param number the number to take the first and last digit from
     * @return the sum of the first and last digit
     * @since 0.1
     */
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return lastDigit + number;
    }
}