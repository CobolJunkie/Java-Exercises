package com.coboljunkie.gfn.chess;


public class Springer extends Figur {

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
        if			(x == 2 && y ==   1) valid = true;
            //	x+2,y-1
        else if 	(x == 2 && y ==  -1) valid = true;
            //  x-2,y+1
        else if		(x == -2 && y ==  1) valid = true;
            //	x-2,y-1
        else if 	(x == -2 && y == -1) valid = true;
            //	x+1,y+2
        else if 	(x ==  1 && y ==  2) valid = true;
            //	x+1,y-2
        else if 	(x ==  1 && y == -2) valid = true;
            //	x-1,y-2
        else if 	(x == -1 && y ==  2) valid = true;
            //	x-1,y+2
        else if 	(x == -1 && y == -2) valid = true;
        else valid = false;

        if (endX < 1 || endX > 8 || endY < 1 || endY > 8) valid = false;

        if (valid == true) {
            System.out.println("Gültiger Zug!");
        }
        else System.out.println("Ungültiger Zug!");
    }
}
