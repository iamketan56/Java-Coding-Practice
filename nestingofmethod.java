package com.company;

public class nestingofmethod {
    public static void main(String args[])
    {
        nesting nest=new nesting(40,53);
        nest.display();
    }
}
class nesting
{
    int a,b;
    nesting(int x,int y)
    {
        a=x;
        b=y;
    }
    int largest()
    {
        if(a>=b)
            return(a);
        else
        return b;
    }
    void display()
    {
        int large=largest();
        System.out.println("LARGEST IS:"+large);
    }
}