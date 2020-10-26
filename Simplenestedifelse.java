package com.company;

import java.util.Scanner;

public class Simplenestedifelse {
    public static void main(String args[])
    {
        byte x,y;
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextByte();
        if(x>0)
        {
            y=1;
            System.out.println("Y="+y);
        }
       else if(x==0)
        {
            y=0;
            System.out.println("Y="+y);
        }
        else if(x<0)
        {
            y=-1;
            System.out.println("Y="+y);
        }
    }
}
