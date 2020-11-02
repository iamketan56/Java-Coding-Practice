package com.company;

import java.util.Scanner;

public class Twodemarray {
    public static void main(String args[]) {
        int myarray[][];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter the no of column");
        int col = scanner.nextInt();
        myarray = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                myarray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix is :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" " + myarray[i][j]);
            }
            System.out.println();
        }
        System.out.println("After some change");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    myarray[i][j] = 0;
                }
                if(i+j==2)
                {
                    myarray[i][j]=1;
                }
            }
        }
        System.out.println("Matrix is :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" " + myarray[i][j]);
            }
            System.out.println();
        }
    }
}
