package com.coboljunkie.umc.section_6.exercise_18;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int result = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                result += number % 10;
            }
            number /= 10;
        }
        return result;
    }
}