package com.coboljunkie.umc.section_5.exercise_07;
/** This class contains a method to compare a number to the sum of two other numbers
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class EqualSumChecker {
    /** This method compares the sum of two given int numbers to a third int number
     *
     * @param num1 first number to be summed up
     * @param num2 second number to tbe summed up
     * @param num3 number to compare the sum to
     * @return
     * since 0.1
     */
    public static boolean hasEqualSum (int num1, int num2,int num3){
        return (num1 + num2) == num3;

    }
}
