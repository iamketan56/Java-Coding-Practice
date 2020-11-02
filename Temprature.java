//temperature in fahrenheit to celsius
package com.company;
import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
    double f=scanner.nextDouble();
    double c= (float) ((f-32)/1.8);
        System.out.println("temperature in celsius " +c+"'C");
    }
}
