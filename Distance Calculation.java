package com.company;

import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the intial speed");
        int u=scanner.nextInt();
        System.out.println("Enter the acc");
        int a=scanner.nextInt();
        System.out.println("Enter the time interval");
        float time=scanner.nextFloat();
        float distance;
        distance=u*time+(a*time*time)/2;
        System.out.println("Distance travel:"+distance);
    }
}
