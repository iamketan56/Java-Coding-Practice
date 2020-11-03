package com.company;
public class Mergingarray {
    public static void main(String args[]) {
        int a1[] = {2, 5, 6, 9};
        int a2[] = {1, 3, 7, 10};
        int j = 0, i = 0;
        int m=a1.length;
        int n=a2.length;
        int res[] = new int[m+n];
        for (int a = 0; a < m+n; ) {
            if (i < m && j < n) {
                if (a1[i] > a2[j]) {
                    res[a] = a2[j];
                    j++;
                }
                else
                {
                    res[a]=a1[i];

                }
                a++;
            }
            else if(i==m)
            {
                for(;a<8;)
                res[a]=a2[j];
                j++;
                a++;
            }
            else
            {
                for(;a<m+n;)
                {
                    res[a]=a1[i];
                    i++;
                    a++;
                }
            }
        }
        for(int f=0;f<m+n;f++)
        {
            System.out.println(res[f]);
        }
    }
}
