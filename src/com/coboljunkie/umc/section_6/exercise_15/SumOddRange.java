package com.coboljunkie.umc.section_6.exercise_15;
/** This class contains methods to sum up odd values of a range of numbers
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class SumOddRange {
    /** This method determines if a given number is odd
     *
     * @param number the number to check
     * @return true if the number is odd
     */
    public static boolean isOdd(int number) {
        return (number % 2) > 0;
    }

    /** this method adds all the odd numbers within a given range and returns the result
     *
     * @param start the beginning of the number sequence
     * @param end the end of the number sequence
     * @return the sum of all odd numbers within that range
     */
    public static int sumOdd(int start, int end) {

        int sum = 0;

        if (start < 1 || end < start) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}