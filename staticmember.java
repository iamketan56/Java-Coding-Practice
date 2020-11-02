package com.company;


public class staticmember {
   public static void main(String args[])
   {
       int a=math.square(5);
       System.out.println(a);
   }
}
class math{
    static int square(int a)
    {

        return a*a;
    }
}
