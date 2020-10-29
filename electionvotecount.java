package com.company;

import java.util.Scanner;

public class electionvotecount {
    public static void main(String args[])
    {
        int countfirst=0,countsecond=0,countthird=0,countfourth=0,countfive=0,spoilballot=0;
        Scanner scanner=new Scanner(System.in);
        int arr[][]=new int[4][4];
        //int c1[],c2[],c3[],c4[],c5[];

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                switch (arr[i][j])
                {
                    case 1:
                        countfirst++;
                        break;
                    case 2:
                        countsecond++;
                        break;
                        case 3:
                            countthird++;
                        break;
                    case 4:
                        countfourth++;
                        break;
                    case 5:
                        countfive++;
                        break;
                    default:
                        spoilballot++;
                }
            }
        }
        System.out.println("First candidate:"+countfirst);
        System.out.println("Second Candidate:"+countsecond);
        System.out.println("Third Candidate:"+countthird);
        System.out.println("Fourth Candidate:"+countfourth);
        System.out.println("Five Candidate:"+countfive);
        System.out.println("Spool Ballot"+spoilballot);
    }
}
