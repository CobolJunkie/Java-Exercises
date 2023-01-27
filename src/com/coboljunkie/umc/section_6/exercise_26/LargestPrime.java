package com.coboljunkie.umc.section_6.exercise_26;
/** This class calculates the largest prime factor of a given number
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class LargestPrime {
    /**This method calculates the largest prime factor of the number passed in the parameter
     *
     * @param number the number to calculate the prime factor from
     * @return the largest prime factor
     */
    public static int getLargestPrime(int number) {
        if(number <= 1) return -1;
        for(int i = number-1; i >= 2; i--) {
            if(number % i == 0) {
                number = i;
            }
        }
        return number;
    }
}