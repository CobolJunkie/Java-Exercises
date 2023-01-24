package com.coboljunkie.umc.section_5.exercise_03;
/** This class contains a method to convert Kilobyte to Megabyte and prints the results to the console
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/

public class MegaBytesConverter {
    /** this method converts KiloBytes to MegaBytes and prints the results to the console
     *
     * @param kiloBytes value of KiloBytes as int
     * @since 0.1
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
