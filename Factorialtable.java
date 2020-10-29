package com.company;

public class Factorialtable {
    public static void main(String args[])
    {
        short m=100;
        while (m>0)
        {
            System.out.print(m);
            if(m>1)
            {
                System.out.print("*");
            }
            m--;
        }
    }
}
