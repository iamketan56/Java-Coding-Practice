package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AnualExamination {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int exam[][] = new int[10][3];
        int score[] = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                exam[i][j] = scanner.nextInt();
                sum += exam[i][j];
            }
            score[i] = sum;
            sum=0;
        }
        int max = Arrays.stream(score).max().getAsInt();
        for(int i=0;i<10;i++)
        {
            System.out.println("Roll No:"+(i+1)+"->"+score[i]);
        }
    }
}

