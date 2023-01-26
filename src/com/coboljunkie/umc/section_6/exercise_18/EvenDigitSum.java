package com.coboljunkie.umc.section_6.exercise_18;
/** This class contains a method to calculate sum of all even digits in a number
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class EvenDigitSum {
    /**
     * This method calculates the sum of all even digits in a number
     * @param number the number to sum the even digits of
     * @return the sum of all even digits
     */
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int result = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                result += number % 10;
            }
            number /= 10;
        }
        return result;
    }
}