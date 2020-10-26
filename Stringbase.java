package com.company;

public class Stringbase {
    public static void main(String agrs[])
    {
        String str="ketan Sharma Dwivedi";
        String str1="ketan Sharma Dwivedi";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
       // System.out.println(str.replace('h','i'));
       // System.out.println(str.trim());
        System.out.println(str.equals(str1));
        System.out.println(str.substring(2));
        System.out.println(str.substring(6,12));
        System.out.println(str.indexOf('r'));
    }
}
