package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String args[])
    {
        float mill_colthes_discount;
        float handloom_items_discount;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the price");
        short price=scanner.nextShort();
       byte input;
        if(price<100)
        {
            input =1;
        }
        else if(price>100 && price<=200) {
        input=2;
        }
        else if(price>200 && price<=300) {
            input=3;
        }
        else
            {
            input=4;
         }
        System.out.println("Discount");
            switch (input)
            {
                case 1:
                    mill_colthes_discount=0;
                    handloom_items_discount=5.0f;
                    System.out.println("Mill cloth :"+mill_colthes_discount);
                    System.out.println("Handloom item :"+handloom_items_discount);
                    break;
                case 2:
                    mill_colthes_discount=5.0f;
                    handloom_items_discount=7.5f;
                    System.out.println("Mill cloth :"+mill_colthes_discount);
                    System.out.println("Handloom item :"+handloom_items_discount);
                    break;
                case 3:
                    mill_colthes_discount=7.5f;
                    handloom_items_discount=10.0f;
                    System.out.println("Mill cloth :"+mill_colthes_discount);
                    System.out.println("Handloom item :"+handloom_items_discount);
                     break;
                default:
                    mill_colthes_discount=10.0f;
                    handloom_items_discount=15.0f;
                    System.out.println("Mill cloth :"+mill_colthes_discount);
                    System.out.println("Handloom item :"+handloom_items_discount);
                    break;
            }
        }

    }

