/**
 *    __                 _                     ___ _                          _            
 *   /__\ __ _ _ __   __| | ___  _ __ ___     / __\ |__   __ _ _ __ __ _  ___| |_ ___ _ __ 
 *  / \/// _` | '_ \ / _` |/ _ \| '_ ` _ \   / /  | '_ \ / _` | '__/ _` |/ __| __/ _ \ '__|
 * / _  \ (_| | | | | (_| | (_) | | | | | | / /___| | | | (_| | | | (_| | (__| ||  __/ |   
 * \/ \_/\__,_|_| |_|\__,_|\___/|_| |_| |_| \____/|_| |_|\__,_|_|  \__,_|\___|\__\___|_|   
 *
 *    ___                          _   _                                                   
 *   / _ \___ _ __   ___ _ __ __ _| |_(_) ___  _ __                                        
 *  / /_\/ _ \ '_ \ / _ \ '__/ _` | __| |/ _ \| '_ \                                       
 * / /_\\  __/ | | |  __/ | | (_| | |_| | (_) | | | |                                      
 * \____/\___|_| |_|\___|_|  \__,_|\__|_|\___/|_| |_|                                      
 *
 * Author:
 *
 */
package com.coboljunkie.randomcharacter;
import java.util.Random;
import java.util.ArrayList;

public class RandomCharacter {

    public static void main(String[] args) {
        ArrayList<Character> buchstaben = new ArrayList<Character>();



        int i;
        for(i = 10; i >= 1; i--)
        {
            Random random = new Random();
            char randomizedCharacter = (char) (random.nextInt(26) + 'a');
            buchstaben.add(randomizedCharacter);
        }


        StringBuilder builder = new StringBuilder(buchstaben.size());
        for(Character ch: buchstaben)
        {
            builder.append(ch);
        }

        System.out.println(builder.toString());

    }


}