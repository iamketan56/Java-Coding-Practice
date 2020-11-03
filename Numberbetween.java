package com.company;

public class Numberbetween {
    public static void main(String[] args) {
        int sum=0;
        int i=105;
        while(i<=196)
        {
            if(i%7==0)
            {
                sum=sum+i;
            }
            i=i+7;
        }
        System.out.println(sum);

    }
}
