package com.coboljunkie.umc.section_6.exercise_21;
/** This class prints out all factors of a given number
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class printFactors {
    /** this method calculates all factors of a given parameter and prints them out on console
     *
     * @param number the number to derive factors from
     * @since 0.1
     */
    public static void printFactors(int number){
        int factor = 1;
        if(number < 1) {
            System.out.println("Invalid Value");
        }
        else{
            while (factor <= number){
                if(number%factor == 0) System.out.println(factor);
                factor++;
            }

        }
    }
}
