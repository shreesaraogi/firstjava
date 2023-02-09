//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.shreeji.firstjava;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("Enter any operator: ");
        char op = input.next().charAt(0); //taking only a single character as an input charAt(0)
        if (op== '+'){
            int add= a+b;
            System.out.println("add " + add);
        }
        else if(op == '-'){
            int sub = a-b;
            System.out.println("sub " + sub);

        }

        else if(op == '*'){
            int mul = a*b;
            System.out.println("mul " + mul);
        }

        else if(op == '/'){
            int div = a/b;
            System.out.println("div " + div);
        }

    }

}
