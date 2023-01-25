package com.coboljunkie.umc.section_5.exercise_08;
/** This class checks the age using a passed argument
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/

public class TeenNumberChecker {
    /** This method checks its given parameters if one of the ages passed as an argument is in the "teen" range
     *
     * @param age1 first age to be checked
     * @param age2 second age to be checked
     * @param age3 third age to be checked
     * @return true if one of the parameters is in the teen age range
     */
    public static boolean hasTeen(int age1, int age2, int age3){
        return (age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19);

    }

    /** This method checks if a given age is considered to be in the teen range (13-19)
     *
     * @param age the age to be checked in int format
     * @return true if said age falls into the teen range
     */
    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }
}
