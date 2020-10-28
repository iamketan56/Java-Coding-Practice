package com.company;
import java.lang.Math;
import java.util.Scanner;
import static java.lang.Math.cos;
import static java.lang.Math.sqrt;

public class Chaper5Question {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the angle");
        double x=scanner.nextDouble();
        x=Math.toRadians(x);
        System.out.println("Enter the value of a");
        int a=scanner.nextInt();
        System.out.println("Enter the value of b");
        int b=scanner.nextInt();
        double area;
        System.out.println(a*a);
        System.out.println(b*b);
        System.out.println(2*a*b);
        System.out.println(cos(x));
      area=sqrt(a*a+b*b-2*a*b*cos(x));
     System.out.println("Area is:"+area);

    }
}
