package com.company;
import java.util.ArrayList;
import java.util.Vector;
public class Vectorbasic {
    public static void main(String args[]) {
        ArrayList arr=new ArrayList();
        Vector<Integer>v = new Vector();
       // Vector v = new Vector();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        v.addAll(arr);
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());
    }
}
