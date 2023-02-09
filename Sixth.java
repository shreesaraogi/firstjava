//Input currency in rupees and output in USD.
package com.shreeji.firstjava;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        System.out.println("Enter an amount in INR");
        Scanner input = new Scanner(System.in);
        long inr = input.nextLong();
        long usd = inr / 70;
        System.out.println("usd: " + usd);

    }
}
