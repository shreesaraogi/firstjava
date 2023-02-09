//Take 2 numbers as input and print the largest number.
package com.shreeji.firstjava;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        System.out.println("Enter any two integers");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int i;
        i = Math.max(a, b); //or can be written as if, else statement or a>b?a:b;
        System.out.println(i);
    }
}
