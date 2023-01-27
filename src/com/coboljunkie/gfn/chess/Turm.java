package com.coboljunkie.gfn.chess;

public class Turm extends Figur {

    /**
     * @param startX
     * @param startY
     * @param endX
     * @param endY
     */
    public void move(int startX, int startY, int endX,int endY) {

        int x =	endX - startX;
        int y = endY - startY;

        boolean valid = false;
        // possible moves:
        //  x+2,y+1
        if (( x >= 1 && x <= 7 ) && (y == 0)) valid = true;
        if (( y >= 1 && x <= 7 ) && (x == 0)) valid = true;

        if (endX < 1 || endX > 7 || endY < 1 || endY > 7) valid = false;

        if (valid == true) {
            System.out.println("Gültiger Zug!");
        }
        else System.out.println("Ungültiger Zug!");
    }
}
