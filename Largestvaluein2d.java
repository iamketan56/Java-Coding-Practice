package com.company;
import java.util.Scanner;
public class Largestvaluein2d {
    public static void main(String args[]) {
        int myarray[][];
        int largest;
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
        int maxelement=myarray[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (myarray[i][j] >maxelement) {
                   maxelement=myarray[i][j];
                }
            }
        }
        System.out.println("Largest element is: "+maxelement);
    }
}