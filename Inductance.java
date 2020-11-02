package com.company;
import java.lang.Math;
import java.lang.Math;
import static java.lang.Math.sqrt;
public class Inductance {
    public static void main(String[] args) {
        int l=5,r=4;
         double c=0.01;
        while(c<=0.1)

        {
           double freaquancy= sqrt(1/(l*c)-r*r/(4*c*c));
           System.out.println("Variation of freq is:"+freaquancy);
           // System.out.println(c);
            c+=0.01;
        }
    }
}
