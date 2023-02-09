//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.shreeji.firstjava;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        System.out.println("Enter the P, T, R respectively");
        Scanner input = new Scanner(System.in);
        int principal = input.nextInt();
        int time = input.nextInt();
        float rate = input.nextFloat();
        float si = principal * rate * time;
        System.out.println("The simple interest is: " + si);
    }
}
