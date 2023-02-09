//Take name as input and print a greeting message for that particular name.
package com.shreeji.firstjava;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.print("Enter a name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next(); //string is a datatype in Java
        System.out.println("Hello, " + name); //+ can be used to add two strings, known as concatenation
    }
}
