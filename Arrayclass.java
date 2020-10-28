package com.company;

public class Arrayclass {
    public static void main(String args[])
    {
        int data[]={2,4,1,3,5};
        int n=data.length;
        System.out.println("List is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(data[i]);
        }
        //sorting begin
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(data[j]>data[k])
                {
                    int temp=data[k];
                    data[k]=data[j];
                    data[j]=temp;
                }
            }
        }
        System.out.println("After Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(data[i]);
        }
    }
}
