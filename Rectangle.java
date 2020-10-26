package com.company;

import java.util.Scanner;

public class Rectangle {
    Scanner scanner=new Scanner(System.in);
    public  int length;
    public int breadth;
    public int area(int x,int y)
    {
        int res=x*y;
        return res;
    }
    public int perimeter(int x,int y)
    {
        int peri=2*(x+y);
        return peri;
    }
}
