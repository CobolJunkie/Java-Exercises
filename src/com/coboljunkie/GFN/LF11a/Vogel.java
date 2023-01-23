package com.coboljunkie.GFN.LF11a;

public class Vogel extends Tier{
    String federFarbBezeichnung;

    Vogel() {
        this(0,"unbekannt");
    }
    Vogel(double gewicht){
//        this.gewicht = gewicht;
//        this.federFarbBezeichnung = "unbekannt";
        this(gewicht,"unbekannt");

    }
    Vogel(double gewicht, String federFarbBezeichnung){
        this.gewicht = gewicht;
        this.federFarbBezeichnung = federFarbBezeichnung;
    }
}
