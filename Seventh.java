//To calculate Fibonacci Series up to n numbers.
package com.shreeji.firstjava;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("This is the Fibonacci Series up to n terms:");
        System.out.println("0");
        System.out.println("1");
        int f1= 0; int f2= 1;
        for(int i= 0; i<n; i++){
            f2 = f2 + f1;
            f1 = f2 - f1;

            System.out.println(f2);
        }
    }
}
