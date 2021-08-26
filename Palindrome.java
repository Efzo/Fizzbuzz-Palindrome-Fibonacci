package com.company;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter any word:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toLowerCase(); // convert input to lower case
        name = name.replace(" ", ""); // to remove spaces on the string

        String reversedName = "";

        for (int i = name.length()-1; i>=0; i-- ){
            reversedName += name.charAt(i);
            System.out.println(reversedName);
        }

        boolean palindrome = true;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != reversedName.charAt(i)){
               palindrome = false;
            }
        }
        palindrome = true;
        System.out.println("Palindrome!!!");

    }
}
