package com.company;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no. upto which you want fibo series");
        int n=scanner.nextInt();
        int first=1;
        int second=1;
        int third=0;
        System.out.print(first+" ");
        System.out.print(second+" ");
        while(third<n) {
            third = first + second;
            first = second;
            second = third;
            if (third < n) {
                System.out.print(third + " ");
            }
        }
     /*   System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i=0;i<=n;i++)
        {

        }*/

    }
}
