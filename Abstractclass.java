package com.company;

public class Abstractclass
{
    public static void main(String args[])
    {
        ani a=new dogi();
        a.eat();
        a.run();
    }
}
abstract  class ani {
    public void run()
    {
        System.out.println("running is best");
    }
    abstract public void eat();
}
class dogi extends ani{
    @Override
    public void eat()
    {
        System.out.println("dog is eating");
    }
}
/*
rules for abstract keyword
1.abstract class
*a class that is declared abstract
you can not create object of abstract
it may or may not contain abstract method
2.abstract method :
no method body you can not write code in abstract method
it is mandatory to override the abstract in child class
 */