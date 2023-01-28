package com.coboljunkie.umc.section_6.exercise_19;
/** This class compares two int numbers for shared digits
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class SharedDigit {
    /** This method checks if two given int numbers share digits
     *
     * @param number1 the first number to compare
     * @param number2 the second number to compare
     * @return true if digits are shared
     */
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 >= 10 && number1 <= 99 && number2 >= 10 && number2 <= 99){
            return (number1/10==number2/10 || number1%10==number2%10 || number1/10==number2%10 || number1%10==number2/10);
        }
        return false;
    }
}