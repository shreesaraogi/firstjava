//To find Armstrong Number between two given number.
package com.shreeji.firstjava;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {

        int length, sum=0, num, x;
        System.out.println("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for (int i = a; i <= b; i++) {
            sum =0;
            length = (int) Math.log10(i) + 1;//logarithmic approach to finding the length of the number
            //System.out.println(length);
            int len = length;
            num = i;
            for(int j= 0; j<len; j++) {
                x = num%10;
                sum += (int) Math.pow(x, len);
                num = num/10;
            }
                if(i == sum){
                    System.out.println("armstrong" + sum);
                }
                 else{
                    System.out.println("no");
                }

        }

    }
}
