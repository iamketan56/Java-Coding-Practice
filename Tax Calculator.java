package com.company;

import java.util.Scanner;

public class Assignment2 {
    String name[];
    long amount[];
    public static void main(String args[])
    {
        System.out.println("Tax Calculator App");
        System.out.println("-----WELCOME-----");
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter total person count:");
        count=scanner.nextInt();
        String name[]=new String[count];
        long amount[]=new long[count];
        int j=0;

        while(count!=0)
        {

            System.out.println("Enter name "+(j+1)+":");
            String input=scanner.next();
            name[j]=input;
            System.out.println("Enter " +input+"'s Annual Income");
            long rupees;
            rupees=scanner.nextLong();
            System.out.println();
            amount[j]=rupees;
            count--;
            j++;
        }

        System.out.println("Payable Tax is:");
        System.out.println("---------------");
        for (int k=0;k<j;k++)
        {
        calculatetax(name[k],amount[k]);
        }
    }

    private static void calculatetax(String s, long l) {

        double tax;
        if(l>=300000) {
            tax = l * 0.2;
            System.out.println(s + ":" + "$ " + tax);
        }
        else if(l>=100000 && l<300000)
        {
            tax=(l*0.1);
            System.out.println(s + ":" + "$ " + tax);
        }
        else
        {
            tax=0;
            System.out.println(s + ":" + "$ " + tax);
        }
    }
}
