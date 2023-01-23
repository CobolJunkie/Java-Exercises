package com.coboljunkie.GFN.chess;

public class Main {

    enum Schachfeld {A1,A2,A3,A4}

    static Schachfeld s1 = Schachfeld.A4;



    public static void main(String[]args){
        System.out.println(s1);

        Springer springer = new Springer();
        springer.move(1, 1, 2, 3);

    }

}
