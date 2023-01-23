package com.coboljunkie.mcu.section_5.exercise_01;
/** This class contains a method to evaluate an integer and output the results to console
 *
 * @author Coboljunkie
 * @author <a href="mailto:cj@coboljunkie.com">cj@coboljunkie.com</a>
 * @version 0.1
 **/

public class NumberChecker {
    /**
     * This method checks if a int number is positive,negative or zero and outputs the result to console
     * @param number    the int value to be evaluated
     * @since 0.1
     */
    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

}
