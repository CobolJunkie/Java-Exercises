/** Program for Drawing n out m of from a Lottery Pool
 * @author CobolJunkie 2022
 *
 */
package com.coboljunkie.gfn.lotto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

    public static void main(String[] args) {
        Ziehung.lottoziehung(49,6);									// calls method lottoziehung and passes the arguments
    }
}


class Ziehung {
    /**
     * Draws 6 numbers out of a set of 49
     *
     * @param balls - defines the <b>total</b> number of balls
     * @param drawn - defines the amount of balls per <b>drawing</b>
     */
    public static void lottoziehung(int balls,int drawn) {
        List<Integer> lottoKugeln = new ArrayList<Integer>();		// Creates an empty List
        for (int i = 1; i <= balls; i++) {							// Adds numbers 1-49 to list
            lottoKugeln.add(i);
        }
        Collections.shuffle(lottoKugeln);							// Shuffles contents of list
        List<Integer> result = lottoKugeln.subList(0, drawn);		// puts the first 6 numbers in a sublist

        System.out.println("The following numbers were drawn:");
        for (int element : result) {								//
            System.out.print(element + " ");						// Outputs list to console
        }


    }
}