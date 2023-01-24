package com.coboljunkie.umc.section_5.exercise_04;
/** This class contains a method to determine if one should wake up when a dog is barking
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class BarkingDog {
    /**
     *
     * @param barking boolean - determines if the dog is barking
     * @param hourOfDay int - time of day in hours (24h format)
     * @return true if it is necessary to wake up
     * @since 0.1
     */
    public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        else return false;
    }  }