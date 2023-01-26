package com.coboljunkie.umc.section_6.exercise_16;
/** This class contains a method to check if a number is a palindrome
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class NumberPalindrome
{
    /** This method determines if a given number is a palindrome
     *
     * @param number the number to check
     * @return true if the number is a palindrome
     */
    public static boolean isPalindrome(int number)
    {
        if (number < 0)
        {
            number *= -1;
        }
        int stored = number;
        int reverse = 0;
        while (stored > 0)
        {
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            stored /= 10;
        }

        return number == reverse;

    }

}