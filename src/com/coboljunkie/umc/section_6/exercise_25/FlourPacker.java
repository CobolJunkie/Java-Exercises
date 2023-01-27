package com.coboljunkie.umc.section_6.exercise_25;
/** This class converts a number to words and prints them out on the console
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class FlourPacker {
    /**
     * This method checks if a demand of flour can be met with the number of specified bags
     * @param bigCount number of large bags a 5kg supplied
     * @param smallCount number of small bags a 1kg supplied
     * @param goal the demand of flour to be met
     * @return true if the demand can be met with the supply
     */
    public static boolean canPack(int bigCount,int smallCount, int goal){
        // check if any params are negative
        if (bigCount < 0 || smallCount <0 || goal <0) return false;
        //check if sum is greater than goal
        if (bigCount*5+smallCount < goal) return false;
        // check if leftover of goal is less than smallcount
        return (goal%5 <= smallCount);
    }
}
