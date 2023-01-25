package com.coboljunkie.umc.section_6.exercise_20;
/** This class compares the last digit of three given numbers
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class HasSameLastDigit {
    /** This method compares the last digit of three given numbers
     *
     * @param number1 the first number to compare
     * @param number2 the second number to compare
     * @param number3 the third number to compare
     * @return true if at least 2 numbers share the same digit
     */
    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if(isValid(number1) && isValid(number2) && isValid(number3)){
            return (number1%10==number2%10 || number1%10==number3%10 || number2%10==number3%10);
        }
        return false;
    }

    /** this method checks if a given parameter is within the valid range
     *
     * @param num the int to check for validity
     * @return true if number is between 10 and 1000
     */
    public static boolean isValid(int num){
        return (num>=10 && num<=1000);
    }
}