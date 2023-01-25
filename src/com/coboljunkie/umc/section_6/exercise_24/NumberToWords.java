package com.coboljunkie.umc.section_6.exercise_24;
/** This class converts a number to words and prints them out on the console
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class NumberToWords {
    /**
     * This method converts numbers to words and prints the to console in reverse order
     * @param number the number to be converted
     */
    public static void numberToWords(int number){
        if(number<0) System.out.print("Invalid Value");
        int count = getDigitCount(number);
        number = reverse(number);
        for(int i=0; i<count; i++){
            int digit = number%10;
            switch(digit){
                case 0:
                    System.out.print("Zero "); break;
                case 1:
                    System.out.print("One "); break;
                case 2:
                    System.out.print("Two "); break;
                case 3:
                    System.out.print("Three "); break;
                case 4:
                    System.out.print("Four "); break;
                case 5:
                    System.out.print("Five "); break;
                case 6:
                    System.out.print("Six "); break;
                case 7:
                    System.out.print("Seven "); break;
                case 8:
                    System.out.print("Eight "); break;
                case 9:
                    System.out.print("Nine "); break;
                default: break;
            }
            number /= 10;
        }
    }

    public static int reverse(int number){
        int num = (number<0) ? number*-1 : number;
        StringBuilder forwardSB = new StringBuilder(Integer.toString(num));
        int reverse = Integer.parseInt(forwardSB.reverse().toString());
        return (number<0) ? reverse*-1 : reverse;
    }

    public static int getDigitCount(int number){
        return (number<0) ? -1 : Integer.toString(number).length();
    }
}
