package com.coboljunkie.umc.section_6.exercise_27;
/** This class contains a method to draw a pattern
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class DiagonalStar{
    /**This method draws a pattern
     *
     * @param number determines the size of the pattern drawn
     */
    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++)
            {
                for (int column=0; column<number; column++)
                {
                    if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}