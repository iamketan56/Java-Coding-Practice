package com.company;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] my_array = new int[size];
        for (int i = 0; i <size;i++)
        {
                my_array[i] = scanner.nextInt();
        }
        for(int i=0;i<size-1;i++)
        {
            int min=i;
            for(int j=i+1;j<size;j++) {
                if (my_array[min] > my_array[j]) {
                  min=j;
                }
                if(min!=i)
                {
                    int k;
                    k=my_array[i];
                    my_array[i]=my_array[min];
                    my_array[min]=k;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(my_array[i]);
        }
    }
}