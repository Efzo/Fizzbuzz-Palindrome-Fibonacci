package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // 1 1 2 3  5 8 13 .....fibonacci sequence
        int inputNumber;
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        sc.close();

        int currentNumber = 1;
        int lastNumber = 0;
        System.out.println(lastNumber);
        System.out.println(currentNumber);

        int numberIncrease;
        for (int i = 2; i < inputNumber; i++) {
            numberIncrease = lastNumber;
            lastNumber = currentNumber;
            currentNumber = numberIncrease + lastNumber;
            System.out.println(currentNumber);
        }

    }
}
