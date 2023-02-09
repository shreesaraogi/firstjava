//Write a program to print whether a number is even or odd, also take input from the user.
package com.shreeji.firstjava;

import java.util.Scanner; //for input

public class First { //name of the public class is name of the program and always in caps
    public static void main(String[] args) { //psvm
        System.out.print("Enter a number: " ); //sout
        Scanner input = new Scanner(System.in); //Scanner "name of input variable" = new Scanner(through standard sys input)
        int num = input.nextInt(); //type of variable.name of variable = name of input variable.nextInt() function for taking integer as an input
        if(num%2==0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }
    }
}
