package com.coboljunkie.umc.section_6.exercise_26;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number <= 1) return -1;
        for(int i = number-1; i >= 2; i--) {
            if(number % i == 0) {
                number = i;
            }
        }
        return number;
    }
}