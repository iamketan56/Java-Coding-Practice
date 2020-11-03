package com.company;
interface Area
{
    final static float pi=3.14f;
    float compute(float x,float y);
}
class Rect implements Area
{
    @Override
    public float compute(float x, float y) {
        return x*y;
    }
}
class circle implements Area
{

    @Override
    public float compute(float x, float y) {
        return pi*x*y;
    }
}
public class Multipleinheritance{
    public static void main(String[] args) {

   Rect r= new Rect();
   Area area = r;
        System.out.println(area.compute(2.5f,4.6f));
        circle c=new circle();
        area=c;
        System.out.println(area.compute(1f,4f));
    }
}
