package com.coboljunkie.rot13;

public class Rot13 {
    public static void main(String[] args){
        String inputString = "Harry";

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if(c >= 'A'  && c <= 'M') c += 13;
            else if (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            System.out.print(c);
        }

    }

}


