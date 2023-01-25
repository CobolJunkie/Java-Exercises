package com.coboljunkie.umc.section_6.exercise_22;
/** This class determines the greates common divisor of two numbers
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class GreatestCommonDivisor {
    /** This method determines the greatest common divisor out of two int numbers
     *
     * @param first the first number
     * @param second the second number
     * @return the greatest common divisor
     * @since 0.1
     */
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        while (first != second) {
            if (first > second) first -= second;
            else second -= first;
        }
        return first;
    }
}