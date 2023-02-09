//To find out whether the given String is Palindrome or not.
package com.shreeji.firstjava;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String str="", word;
        word = input.next();
        char[] ch = word.toCharArray();
        for(int i=0; i<word.length(); i++){
            char c =  ch[i];
            str = c + str;
        }
        if(str.equals(word)){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("not");
        }
        System.out.println(str);
    }

}
