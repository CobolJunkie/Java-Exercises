package com.coboljunkie.umc.section_6.exercise_23;
/** This class checks if a number is equal to the sum of its proper positive divisors
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class PerfectNumber {
    /** This method checks if a number is equal to the sum of its proper positive divisors
     * @param number to check for "Perfection"
     * @return true if number is perfect
     * @since 0.1
     */
    public static boolean isPerfectNumber(int number){
        if(number<1) return false;
        int sum = 0;
        for(int i=1; i<number; i++){
            if(number%i==0) sum += i;
        }
        return sum==number;
    }
}