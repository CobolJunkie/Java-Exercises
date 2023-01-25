package com.coboljunkie.umc.section_5.exercise_11;
/** This class compares three int values
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
class IntEqualityPrinter {
    /** This method compares three int values and outputs the result to the console
     *
     * @param a the first value to compare
     * @param b the second value to compare
     * @param c the thid value to compare
     */
    public static void printEqual(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Value");
        } else if (a == b && b == c){
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}