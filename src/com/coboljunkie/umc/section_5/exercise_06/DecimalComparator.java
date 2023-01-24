package com.coboljunkie.umc.section_5.exercise_06;
/** This class contains a method to compare two given numbers
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class DecimalComparator {
    /** Method to compare two numbers up to three decimal places accuracy
     *
     * @param num1 first number to compare
     * @param num2 second number to compare
     * @return true if the numbers match
     */
        public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){
            return (int) (num1 * 1000) == (int) (num2 * 1000);
        }

}
