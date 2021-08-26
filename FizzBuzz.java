package com.company;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
	int number;
	Scanner sc =  new Scanner(System.in);
	System.out.print("Please Enter a Number: ");
	number = sc.nextInt();
	 for (int i = 1;  i <= number; i++ ){
	    if (i % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }else if (i % 3 == 0){
            System.out.println("Fizz");
        }else if(i % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(i);
        }
    }

    }
}
