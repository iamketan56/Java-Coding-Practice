//harmonic series.......
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int n;
    Scanner scanner=new Scanner(System.in);
    n=scanner.nextInt();
    for(int j=1;j<=n;j++) {
        System.out.print("1/" + j);
        if (j != n)
            System.out.print("+");
    }
    }
    }

