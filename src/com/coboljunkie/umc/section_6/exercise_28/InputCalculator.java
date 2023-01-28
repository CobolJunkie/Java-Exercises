package com.coboljunkie.umc.section_6.exercise_28;
import java.util.Scanner;
/** This class contains a method add numbers continuosly and output the sum after
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class InputCalculator {
    /** this method adds numbers continuosly and outputs the sum after
     *
     */
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
            while(scanner.hasNextInt())
            {
            sum += scanner.nextInt();
                count++;
            scanner.nextLine();
            }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        scanner.close();
    }
}