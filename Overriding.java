package com.company;

public class Overriding {
    public static void main(String args[])
    {
dog d=new dog();
d.run();
    }
}
class animal
{
    public void run()

    {
        System.out.println("animal is running");
    }
}
class dog extends animal
{
    @Override
    public void run() {
        super.run();
        System.out.println("dog is running");
    }
}

