package com.coboljunkie.umc.section_5.exercise_12;
/** This class checks if a cat is playing based on the season and temperature
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class PlayingCat {
    /** This method determines if a cat is playing based
     *
     * @param summer boolean to specify if its summer
     * @param temperature the temperature in celsius
     * @return true if the cat is playing
     * @since v.01
     */
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer && (temperature >= 25 && temperature <= 35)) {
            return true;
        } else if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else {
            return false;
        }
    }
}
