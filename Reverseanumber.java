package com.company;
import java.lang.Math;
import static java.lang.Math.pow;
public class Reverseanumber {
    public static void main(String args[])
    {
        int number=12345;
        int num=number;
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        num=0;
        while (number>0 && count>0)
        {
            int rem=number%10;
            num+= pow(10,count-1)*rem;
            number=number/10;
            count--;

        }
        System.out.println(num);
    }
}
