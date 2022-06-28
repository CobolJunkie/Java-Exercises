package com.coboljunkie.GFN.chess;

public abstract class Figur {
    String Farbe;
    String Name;
    int startX;
    int startY;
    int endX;
    int endY;

    public abstract void move(int startX, int startY, int endX,int endY);
}
